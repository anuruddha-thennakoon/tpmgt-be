const mongoose = require ('mongoose');
const Schema = mongoose.Schema;

const newBatch = new Schema ({
    drugCategory: {
        type:String
    },
    drugName: {
        type: String
    },
    drugType :{
        type :String
    },
    content :{
        type :String
    },
    batchNumber :{
        type :Number
    },
    qty :{
        type :Number
    },
    mfd :{
        type :String
    },
    expd :{
        type :String
    }
});

const Batch = mongoose.model('batch', newBatch);

module.exports = Batch;