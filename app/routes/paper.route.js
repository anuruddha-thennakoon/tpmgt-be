const express = require('express');
const paper = require('../controller/paper.controller');
const router = express.Router();


router.route('/')
    .post(paper.insertPaper)

    .get(paper.findPaper)

router.route('/:id')

    .put(paper.updatePaper)

    .delete(paper.deletePaper)

router.route('/:idb')

    .put(paper.updatePaper)

    .delete(paper.deletePaper)

module.exports = router;
