'use strict';
const mongoose = require('mongoose');
const Schema = mongoose.Schema;

const newStudent = new Schema({
    studentName: {
        type: String
    },
    faculty: {
        type: String
    },
    nic: {
        type: String
    },
    feildOfStudy: {
        type: String
    },
    year: {
        type: Number
    },
    companyName: {
        type: String
    },
    extraCurricular: {
        type: String
    },
    academic: {
        type: String
    },
    traineeRecords: {
        type: String
    }
});

const Student = mongoose.model('Student', newStudent);

module.exports = Student;