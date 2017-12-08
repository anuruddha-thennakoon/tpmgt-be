const Company = require('../models/company.model');

//insert company
function insertCompany(req, res) {
    const company = new Company({
        companyName: req.body.companyName,
        description: req.body.description,
        address: req.body.address,
        contactPerson: req.body.contactPerson,
        contactNumber: req.body.contactNumber
    });
    company.save()
        .then(savedCompany => res.json(savedCompany))
        .catch(e => next(e));
}

//find companies
function findCompany(req, res) {
    Company.find().exec().then(companies => {
        res.json(companies);
    }).catch(err => {
        console.error(err);
        res.sendStatus(500);
    });
}

//update company
function updateCompany(req, res) {
    const company = new Company(req.body);
    company.update().then(() => {
        res.sendStatus(200);
    }).catch(err => {
        console.error(err);
        res.sendStatus(500);
    });
}

//delete company
function deleteCompany(req, res) {
    Company.remove({
        _id: req.params.id
    }).then(() => {
        res.sendStatus(200);
    }).catch(err => {
        console.error(err);
        res.sendStatus(500);
    });
}


module.exports = {
    insertCompany,
    findCompany,
    updateCompany,
    deleteCompany
}