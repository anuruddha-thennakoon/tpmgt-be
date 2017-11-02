const Batch = require('../models/batch.model');

function insertBatch(req, res) {
    const batch = new Batch({
        drugCategory: req.body.drugCategory,
        drugName: req.body.drugName,
        drugType: req.body.drugType,
        content: req.body.content,
        batchNumber: req.body.batchNumber,
        qty: req.body.qty,
        mfd: req.body.mfd,
        expd: req.body.expd,
    });

    batch.save()
        .then(savedBatch => res.json(savedBatch))
        .catch(e => next(e));
}

function viewBatch(req, res) {
    Batch.find().exec().then(batch => {
        res.json(batch);
    }).catch(err => {
        console.error(err);
        res.sendStatus(500);
    });
}

module.exports = { insertBatch, viewBatch }