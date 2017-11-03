const express = require('express');
const router = express.Router();

const companyRoute = require('./company.route');
const studentRoute = require('./student.route');
const jobVacancyRoute = require('./jobVacancy.route');

//your routers
router.use('/company', companyRoute);
router.use('/student', studentRoute);
router.use('/jobVacancy', jobVacancyRoute);

module.exports = router;