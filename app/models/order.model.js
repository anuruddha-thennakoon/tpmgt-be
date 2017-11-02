
const mongoose = require('mongoose');
const Schema = mongoose.Schema;

const newOrder = new Schema({
  
    receiverEmail: {
        type: String
    },
    supplierName: {
        type: String
    },
    drugName:{
        type: String
    },
    drugType: {
        type: String
    },
    

    orderQuantity:{
        type :Number
    
    },
     description :{
        type :String
    },
   date:{

       type:Date
   }



});

const Order = mongoose.model('order', newOrder);

module.exports = Order;