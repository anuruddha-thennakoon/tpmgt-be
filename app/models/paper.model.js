'use strict';
const mongoose = require('mongoose');
const Schema = mongoose.Schema;

const newPaper = new Schema({
    paperTitle: {
        type: String
    },
    uploadedDate: {
        type: String
    },
    attachment: {
        type: String
    }
});

const Paper = mongoose.model('Paper', newPaper);

module.exports = Paper;