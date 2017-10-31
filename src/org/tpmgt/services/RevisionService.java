package org.tpmgt.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tpmgt.controllers.StatusManager;
import org.tpmgt.data.interfaces.RevisionDao;
import org.tpmgt.data.mdao.DaoManager;
import org.tpmgt.exceptions.DataNotFoundException;
import org.tpmgt.exceptions.InsertNotSuccessfulException;
import org.tpmgt.filters.params.AuthMeta;
import org.tpmgt.model.dto.Arrears;
import org.tpmgt.model.dto.Model;
import org.tpmgt.model.dto.RevisionList;
import org.tpmgt.model.dto.RevisionOverviewDto;
import org.tpmgt.model.mappers.MorphiaToRevisionModelMapper;
import org.tpmgt.model.mappers.RevisionModelToMorphiaMapper;
import org.tpmgt.model.morphia.ArrearsModel;
import org.tpmgt.model.morphia.Revision;

/**
 * handler for revision related actions
 * @author Dinesh
 *
 */
public class RevisionService {
	private Logger logger = LoggerFactory.getLogger(RevisionService.class);

	/**
	 * create a revision document and save it
	 * @param model
	 * @return
	 */
	public boolean createRevision(Model dto, AuthMeta meta) {
		
		try{
			
		Revision modal = new RevisionModelToMorphiaMapper().revisionModelToMorphia(dto, meta, 0, 1);
		
		RevisionDao dao = DaoManager.getRevisionDao();
		dao.create(modal);
		
		logger.info("Succeccfull insert. Revision number: " + modal.getRevisionNumber());
		
		}
		catch (Exception e) {
			e.printStackTrace();
			logger.info("Can't insert revision. Some details are not found");
			throw new InsertNotSuccessfulException("Can't insert revision. Some details are not found.");
		}
		
		return true;
	
	}
	
	/**
	 * get revision for edit 
	 * @param revisionNumber
	 * @return
	 */
	public Model getRevisionForEdit(long revisionNumber) {
		RevisionDao dao = DaoManager.getRevisionDao();

		Model model = new MorphiaToRevisionModelMapper().morphiaToRevisionModel(dao.get(revisionNumber));

		if(model == null){
			logger.info("revision not found: " + revisionNumber);
			throw new DataNotFoundException("revision not found: " + revisionNumber);
		} 

		return model;
	}

	/**
	 * update revision
	 * @param revisionNumber
	 * @param dto
	 * @param meta
	 * @return
	 */
	public boolean updateRevision(long revisionNumber, Model dto, AuthMeta meta) {
		logger.info("update revision state");
		RevisionDao dao = DaoManager.getRevisionDao();
		Revision model = dao.get(revisionNumber);

		if(model == null){
			logger.info("revision not found: " + revisionNumber);
			throw new DataNotFoundException("no revision available for the requested number");
		}
		
		model = new RevisionModelToMorphiaMapper().revisionModelToMorphia(dto, meta, revisionNumber, 2);
		dao.create(model);
		
		return true;
	}
	

	/**
	 * update revision state
	 * @param revisionNumber
	 * @param isVerified
	 * @param meta
	 * @return
	 */
	public boolean updateRevisionState(long revisionNumber, boolean isVerified, AuthMeta meta) {
		
		logger.info("update revision state");
		RevisionDao dao = DaoManager.getRevisionDao();

		Revision modal = dao.get(revisionNumber);

		if(modal == null) throw new DataNotFoundException("no revision available for the requested number");

		int state = StatusManager.getNextStatus(modal.getStatus(), meta.getRole(), isVerified);
		
		if(state == modal.getStatus()) throw new InsertNotSuccessfulException("can't update state.");
		
		modal.setStatus(StatusManager.getNextStatus(modal.getStatus(), meta.getRole(), isVerified));
		
		dao.create(modal);
		
		logger.info("successfully updated state");
		
		return true;

	}

	/**
	 * get revision
	 * @param revisionNumber
	 * @return
	 */
	public Revision getRevision(long revisionNumber) {
		RevisionDao dao = DaoManager.getRevisionDao();

		logger.info("get revision");
		Revision modal = dao.get(revisionNumber);

		if(modal == null){
			logger.info("revision not found: " + revisionNumber);
			throw new DataNotFoundException("revision not found: " + revisionNumber);
		} 
		
		return modal;
	}
	
	/**
	 * get revision list
	 * @return
	 */
	public RevisionList getMinimalList() {
		List<Revision> modelList = DaoManager.getRevisionDao().minimalList();
		
		if(modelList == null || modelList.isEmpty()) throw new DataNotFoundException("no revisions found");
		
		RevisionList revisionList = new RevisionList();
		modelList.stream()
			.forEach(model -> {
				revisionList.getData().add(new RevisionOverviewDto(model.getRevisionNumber(), model.getPensionNumber()));
			});
		
		return revisionList;
	}
	
	/**
	 * add arrears
	 * @param revisionNumber
	 * @param dto
	 * @return
	 */
	public boolean addArrears(long revisionNumber, Arrears dto) {
		logger.info("add arrears");
		RevisionDao dao = DaoManager.getRevisionDao();
		Revision model = dao.get(revisionNumber);

		if(model == null){
			logger.info("revision not found: " + revisionNumber);
			throw new DataNotFoundException("no revision available for the requested number");
		}
		
		ArrearsModel arrears = new ArrearsModel();
		arrears.setArrears(dto.getArrears());
		arrears.setProcessDate(dto.getProcessDate());
		model.setArrears(arrears);
		dao.create(model);
		
		return true;

	}
	
	/**
	 * get arrears
	 * @param revisionNumber
	 * @return
	 */
	public Arrears getArrears(long revisionNumber) {
		RevisionDao dao = DaoManager.getRevisionDao();

		Revision modal = dao.get(revisionNumber);

		if(modal == null){
			logger.info("revision not found: " + revisionNumber);
			throw new DataNotFoundException("revision not found: " + revisionNumber);
		} 
		
		Arrears arrears = new Arrears();
		arrears.setArrears(modal.getArrears().getArrears());
		arrears.setProcessDate(modal.getArrears().getProcessDate());
		
		return arrears;
	}
}
