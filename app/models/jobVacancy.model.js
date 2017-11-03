'use strict';
const mongoose = require('mongoose');
const Schema = mongoose.Schema;

const newJobVacancy = new Schema({
    companyName: {
        type: String
    },
    jobTitle: {
        type: String
    },
    description: {
        type: String
    },
    duration: {
        type: String
    },
    paidNonPaid: {
        type: String
    }
});

const JobVacancy = mongoose.model('Job', newJobVacancy);

module.exports = JobVacancy;