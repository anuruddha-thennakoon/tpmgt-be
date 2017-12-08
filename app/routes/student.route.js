const express = require('express');
const student = require('../controller/student.controller');
const router = express.Router();


router.route('/')

    .post(student.insertStudent)

    .get(student.findStudent)
    
router.route('/:id')

    .put(student.updateStudent)

    .delete(student.deleteStudent)

module.exports = router;