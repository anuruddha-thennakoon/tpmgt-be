const Drug = require('../models/stock.model');

function insertDrug(req, res) {
    const drug = new Drug({
        drugName: req.body.drugName,
        drugType: req.body.drugType,
        drugCategory: req.body.drugCategory,
        quantity: req.body.quantity,
        remarks: req.body.remarks,
        drugPrice: req.body.price,
        dangerLevel: req.body.dangerLevel,
        reorderLevel: req.body.reorderLevel,
        dosage: req.body.dosage,
        frequency: req.body.frequency,
       
    });

    drug.save()
        .then(savedDrug => res.json(savedDrug))
        .catch(e => next(e));
}

function findDrugs(req, res) {
    Drug.find().exec().then(drugs => {
        res.json(drugs);
    }).catch(err => {
        console.error(err);
        res.sendStatus(500);
    });
}

module.exports = { insertDrug, findDrugs }