'use strict';
const mongoose = require('mongoose');
const Schema = mongoose.Schema;

const newPrescription = new Schema({
    patientName: {
        type: String
    },
    prescribedDate: {
         type: String, default: Date.now 
    },
    dispensedDate: {
         type: Date 
    },
    status: {
        type: String, default:"false"
    },
    doctorName :{
        type: String
    },
    items:[{
        type: Schema.Types.ObjectId,
        ref: 'Item'
    }]
});

const Prescription = mongoose.model('prescription', newPrescription);

module.exports = Prescription;
