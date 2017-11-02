'use strict';
const mongoose = require('mongoose');
const Schema = mongoose.Schema;

const newSupplier = new Schema({
    companyName: {
        type: String
    },
    description: {
        type: String
    },
    address: {
        type: String
    },
    contactPerson: {
        type: String
    },
    contactNumber: {
        type: Number
    }

});

const Supplier = mongoose.model('Supplier', newSupplier);

module.exports = Supplier;