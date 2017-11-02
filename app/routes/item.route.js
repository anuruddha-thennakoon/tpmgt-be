const express = require('express');
const item = require('../controller/item.controller');
const router = express.Router();


router.route('/')

	.get(item.findItem);

router.route('/:id')
    .delete(item.removeItem)

    .post(item.insertItem)
    
module.exports = router;



