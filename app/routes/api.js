const express = require('express');
const router = express.Router();

const authRoute = require('./auth.route');
const userRoute = require('./user.route');
const presRoute = require('./prescription.route');
const itemRoute = require('./item.route');
const stockRoute = require('./stock.route');
const supplierRoute = require('./supplier.route');
<<<<<<< HEAD
const drugRoute = require('./drug.route');
const batchRoute = require('./batch.route');
const orderRoute = require('./order.route');
=======

 const orderRoute=require('./order.route');


 const drugRoute = require('./drug.route');
>>>>>>> 21f873347be87bb2a509be7ad90a0db0ad39bd72

//your routers
router.use('/authenticate', authRoute);
router.use('/users', userRoute);
router.use('/prescription', presRoute);
router.use('/item', itemRoute);
router.use('/drugs', drugRoute);
router.use('/stock',stockRoute);
router.use('/supplier', supplierRoute);
<<<<<<< HEAD
router.use('/batch', batchRoute);
router.use('/order', orderRoute);
=======
router.use('/order',orderRoute);

>>>>>>> 21f873347be87bb2a509be7ad90a0db0ad39bd72
module.exports = router;

