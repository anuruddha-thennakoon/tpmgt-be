
const mongoose = require('mongoose');
const Schema = mongoose.Schema;

const newItem = new Schema({
    prescriptionId: {
        type: Schema.Types.ObjectId,
        ref: 'Prescription'
    },
    drugName: {
        type: String
    },
    quantity:{
        type: Number
    },
    dose: {
        type: String
    },
    period: {
        type: String
    },
    frequency: {
        type: String
    }
});

const Item = mongoose.model('item', newItem);

module.exports = Item;