const express = require('express');
const company = require('../controller/company.controller');
const router = express.Router();


router.route('/')
    .post(company.insertCompany)

    .get(company.findCompany)
    
router.route('/:id')

    .put(company.updateCompany)

    .delete(company.deleteCompany)

module.exports = router;
