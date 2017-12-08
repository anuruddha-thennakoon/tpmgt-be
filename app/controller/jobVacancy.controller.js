const JobVacancy = require('../models/jobVacancy.model');

//insert jobVacancy
function insertJobVacancy(req, res) {
    const jobVacancy = new JobVacancy({
        companyName: req.body.companyName,
        jobTitle: req.body.jobTitle,
        description: req.body.description,
        duration: req.body.duration,
        paidNonPaid: req.body.paidNonPaid
    });
    jobVacancy.save()
        .then(savedJobVacancy => res.json(savedJobVacancy))
        .catch(e => next(e));
}

//find companies
function findJobVacancy(req, res) {
    JobVacancy.find().exec().then(jobVacancies => {
        res.json(jobVacancies);
    }).catch(err => {
        console.error(err);
        res.sendStatus(500);
    });
}

//update jobVacancy
function updateJobVacancy(req, res) {
    const jobVacancy = new JobVacancy(req.body);
    jobVacancy.update().then(() => {
        res.sendStatus(200);
    }).catch(err => {
        console.error(err);
        res.sendStatus(500);
    });
}

//delete jobVacancy
function deleteJobVacancy(req, res) {
    JobVacancy.remove({
        _id: req.params.id
    }).then(() => {
        res.sendStatus(200);
    }).catch(err => {
        console.error(err);
        res.sendStatus(500);
    });
}


module.exports = {
    insertJobVacancy,
    findJobVacancy,
    updateJobVacancy,
    deleteJobVacancy
}