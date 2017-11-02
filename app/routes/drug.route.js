const express = require('express');
const drug = require('../controller/drug.controller');
const router = express.Router();


router.route('/')
    .post(drug.insertDrug)

    .get(drug.findDrugs);
	
module.exports = router;