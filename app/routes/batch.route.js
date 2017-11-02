const express = require('express');
const drug = require('../controller/batch.controller');
const router = express.Router();


router.route('/')
    .post(drug.insertBatch)

    .get(drug.viewBatch);
	
module.exports = router;