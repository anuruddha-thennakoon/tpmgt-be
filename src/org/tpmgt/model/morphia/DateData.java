package org.tpmgt.model.morphia;

import java.util.Date;

import org.mongodb.morphia.annotations.Property;

/**
 * used as the base data model for Date data items
 * 
 * @author Anuruddha
 *
 */
public class DateData {
	
	@Property(value = "old") private Date oldValue;
	@Property(value = "new") private Date newValue;
	
	public DateData() {}

	public DateData(Date oldValue, Date newValue) {
		super();
		this.oldValue = oldValue;
		this.newValue = newValue;
	}

	public Date getOldValue() {
		return oldValue;
	}

	public void setOldValue(Date oldValue) {
		this.oldValue = oldValue;
	}

	public Date getNewValue() {
		return newValue;
	}

	public void setNewValue(Date newValue) {
		this.newValue = newValue;
	}
	
}
