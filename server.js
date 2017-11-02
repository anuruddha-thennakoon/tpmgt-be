'use strict';

const express = require('express');
const cors = require('cors');
const bodyParser = require('body-parser');
const mongoose = require('mongoose');
const config = require('./app/config/config');
const route = require('./app/routes/api');

var jwt = require('jsonwebtoken'); // used to create, sign, and verify tokens

//set up the express app
const app = express();

app.use(cors());

//plugin bluebird promise in mongoose
mongoose.Promise = global.Promise;

// connect to mongo db
const mongoUri = config.mongo.host;

mongoose.connect(mongoUri, { server: { socketOptions: { keepAlive: 1 } } });
mongoose.connection.on('error', () => {
    throw new Error(`unable to connect to database: ${mongoUri}`);
});

app.use(bodyParser.json());

/*app.use(function (req, res, next) {

    console.log(req.url);
    if (req.url == '/api/authenticate') {
        next();
    } else {
        // check header or url parameters or post parameters for token
        var token = req.body.token || req.param('token') || req.headers['x-access-token'];

        // decode token
        if (token) {

            // verifies secret and checks exp
            jwt.verify(token, app.get('superSecret'), function (decoded, err) {
                console.log('Decoder ->' + req.decoded);
                if (err) {
                    return res.json({ success: false, message: 'Failed to authenticate token.' });
                } else {
                    // if everything is good, save to request for use in other routes
                    req.decoded = decoded;
                    console.log(req.decoded);
                    next();
                }
            });

        } else {

            // if there is no token
            // return an error
            return res.status(403).send({
                success: false,
                message: 'No token provided.'
            });

        }
    }
});*/


//intialize route
app.use('/api', route);

//listen for request
app.listen(process.env.port || config.port, function () {
    console.log('Now listning for request');
});
