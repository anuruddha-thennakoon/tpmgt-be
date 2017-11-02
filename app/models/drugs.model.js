const mongoose = require ('mongoose');
const Schema = mongoose.Schema;

const newDrug = new Schema ({
    drugCategory: {
        type:String
    },
    drugName: {
        type: String
    },
    drugType :{
        type :String
    },
    remarks :{
        type :String
    },
    price :{
        type :String
    },
    dangerLevel :{
        type :String
    },
    reorderLevel :{
        type :String
    },
    dosage :{
        type :String
    },
    frequency :{
        type :String
    }
});

const Drug = mongoose.model('drug', newDrug);

module.exports = Drug;