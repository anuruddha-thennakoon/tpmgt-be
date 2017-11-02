
const mongoose = require('mongoose');
const Schema = mongoose.Schema;

const newStock = new Schema({
    drugName: {
        type: String
    },
    drugType: {
        type: String
    },
    drugCategory:{
        type: String
    },
    drugPrice: {
        type: Number
    },
    quantity: {
        type: Number
    },
    remarks :{
        type :String
    },
     dangerLevel :{
        type :Number
    },
    reorderLevel :{
        type :Number
    },
    dosage :{
        type :Number
    },
    frequency :{
        type :String
    }
});

const Stock = mongoose.model('stock', newStock);

module.exports = Stock;