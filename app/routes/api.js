const express = require('express');
const router = express.Router();

const companyRoute = require('./company.route');
const studentRoute = require('./student.route');
const jobVacancyRoute = require('./jobVacancy.route');
const paperRoute = require('./paper.route');


//your routers
router.use('/company', companyRoute);
router.use('/student', studentRoute);
router.use('/jobVacancy', jobVacancyRoute);
router.use('/paper', paperRoute);

module.exports = router;