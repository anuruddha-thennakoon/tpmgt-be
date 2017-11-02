const express = require('express');
const file = require('../controller/fileupload.controller');
const router = express.Router();


router.route('/')
    .post(file.upload)
	
module.exports = router;