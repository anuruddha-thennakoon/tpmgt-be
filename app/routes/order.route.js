const express = require('express');
const order = require('../controller/order.controller');
const router = express.Router();


router.route('/')
    .post(order.insertOrder)

.get(order.findOrder);
    
    
module.exports = router;    