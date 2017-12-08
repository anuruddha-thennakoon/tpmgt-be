const express = require('express');
const jobVacancy = require('../controller/jobVacancy.controller');
const router = express.Router();


router.route('/')
    .post(jobVacancy.insertJobVacancy)

    .get(jobVacancy.findJobVacancy)
    
router.route('/:id')

    .put(jobVacancy.updateJobVacancy)

    .delete(jobVacancy.deleteJobVacancy)

module.exports = router;
