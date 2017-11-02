const express = require('express');
const stock = require('../controller/stock.controller');
const router = express.Router();


router.route('/')
   

	.get(stock.findStock)

router.route('/danger')
    .get(stock.findDanger);

router.route('/reorder')
    .get(stock.findReorder);
    

module.exports = router;

