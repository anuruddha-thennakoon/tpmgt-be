const Supplier = require('../models/supplier.model');

//load supplier and append to req

// function load(req,res,next,id){
//     Supplier.get(id)
//         .then((supplier) => {
//             req.supplier = supplier;
//             return next();
//         })
//         .catch(e => next(e));
// }

//insert supplier
function insertSupplier(req, res) {
    const supplier = new Supplier({
        companyName: req.body.companyName,
        description: req.body.description,
        address: req.body.address,
        contactPerson: req.body.contactPerson,
        contactNumber: req.body.contactNumber
    });
    supplier.save()
        .then(savedPrescription => res.json(savedPrescription))
        .catch(e => next(e));
}

//find suppliers
function findSupplier(req, res) {
    Supplier.find().exec().then(suppliers => {
        res.json(suppliers);
    }).catch(err => {
        console.error(err);
        res.sendStatus(500);
    });
}

//update supplier
function updateSupplier(req, res) {
    const supplier = new Supplier(req.body);
    supplier.update().then(() => {
        res.sendStatus(200);
    }).catch(err => {
        console.error(err);
        res.sendStatus(500);
    });
}

// function updateSupplier(req, res, next) {
//   var supplier = req.body;
//   console.log(supplier);
//   supplier.companyName = req.body.companyName;
//   supplier.description = req.body.description;
//   supplier.address = req.body.address;
//   supplier.contactPerson = req.body.contactPerson; 
//   supplier.contactNumber = req.body.contactNumber; 

//   supplier.update()
//         .then(savedPrescription => res.json(savedPrescription))
//         .catch(e => next(e));
// }

//delete supplier
function deleteSupplier(req, res) {
    Supplier.remove({_id:req.params.id}).then(() => {
        res.sendStatus(200);
    }).catch(err => {
        console.error(err);
        res.sendStatus(500);
    });
}


module.exports = { insertSupplier, findSupplier, updateSupplier, deleteSupplier}