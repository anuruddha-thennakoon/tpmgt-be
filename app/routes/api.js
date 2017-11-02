const express = require('express');
const router = express.Router();

const companyRoute = require('./company.route');


//your routers
router.use('/company', companyRoute);

module.exports = router;