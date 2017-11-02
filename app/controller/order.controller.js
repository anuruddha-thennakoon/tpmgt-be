const Order = require('../models/order.model');
const Supplier=require('../models/supplier.model');


function insertOrder(req, res){
    const order = new Order({
        
        receiverEmail: req.body.receiverEmail,
        supplierName : req.body.supplierName,
        drugName:req.body.drugName,
        drugType:req.body.drugType,
        orderQuantity:req.body.orderQuantity,
        description:req.body.description,
        date:req.body.date,
       

    });

    order.save()
        .then(savedOrder => res.json(savedOrder))
        .catch(e => next(e));
}


function findOrder(req, res) {
       Order.find().exec().then(orders => {
            res.json(orders);
        }).catch(err => {
            console.error(err);
            res.sendStatus(500);
        });
    }





     module.exports = { insertOrder, findOrder}

