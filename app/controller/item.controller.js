const Item = require('../models/item.model');
const PrescriptionModel = require('../models/prescription.model');

function insertItem(req, res) {
    let item = new Item({
        drugName: req.body.drugName,
        quantity: req.body.quantity,
        dose: req.body.dose,
        period: req.body.period,
        frequency: req.body.frequency
    });
    const id = req.params.id;
    item.prescriptionId = id;
    item.save()
        .then(ItemDb => {
            return PrescriptionModel.findByIdAndUpdate(id, {
                $push: { "items": ItemDb._id }
            })
        })
        .then(() => {
            return PrescriptionModel.findById(id).populate('items').exec();
        }).then(presDb => {
            res.json(presDb);
        }).catch(err => {
            console.error(err);
            res.sendStatus(500);
        });
}

// Router.post('/:id/comments', (req, res) => {
//     let comment = new CommentModel(req.body);
//     const driverId = req.params.id;
//     comment.driver = driverId;
//     comment.save().then(commentDb => {
//         return DriverModel.findByIdAndUpdate(driverId, { $push: { "comments": commentDb._id } })
//     }).then(() => {
//         return DriverModel.findById(driverId).populate('comments').exec();
//     }).then(driverDb => {
//         res.json(driverDb);
//     }).catch(err => {
//         console.error(err);
//         res.sendStatus(500);
//     });
// });

//find item
function findItem(req, res) {
    Item.find().exec().then(item => {
        res.json(item);
    }).catch(err => {
        console.error(err);
        res.sendStatus(500);
    });
}

//remove item
function removeItem(req, res) {
    Item.remove(req.params.id).then(() => {
        res.sendStatus(200);
    }).catch(err => {
        console.error(err);
        res.sendStatus(500);
    });
}

module.exports = { insertItem, findItem, removeItem }

