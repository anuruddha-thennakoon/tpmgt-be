'use strict';
const mongoose = require('mongoose');
const Schema = mongoose.Schema;

const newCompany = new Schema({
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
        type: String
    },
    email: {
        type: String
    },
    website: {
        type: String
    }
});

const Company = mongoose.model('Company', newCompany);

module.exports = Company;