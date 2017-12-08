'use strict';

const express = require('express');
const cors = require('cors');
const bodyParser = require('body-parser');
const mongoose = require('mongoose');
const config = require('./app/config/config');
const route = require('./app/routes/api');

//set up the express app
const app = express();

app.use(cors());

//plugin bluebird promise in mongoose
mongoose.Promise = global.Promise;

// connect to mongo db
const mongoUri = config.mongo.host;

mongoose.connect(mongoUri, { server: { socketOptions: { keepAlive: 1 } } }).then(result=>{
    console.log(`connected to database: ${mongoUri}`);
}).catch(error=>{
    console.log(`unable to connect to database: ${mongoUri}`);
});

mongoose.connection.on('error', () => {
    throw new Error(`unable to connect to database: ${mongoUri}`);
});

app.use(bodyParser.json());

//intialize route
app.use('/api', route);

//listen for request
app.listen(process.env.port || config.port, function () {
    console.log('Now listning for request on port 8000');
});
