const Paper = require('../models/paper.model');

//insert 
function insertPaper(req, res) {
    const Paper = new Paper({      
        paperTitle: req.body.paperTitle,
        uploadedDate: req.body.uploadedDate,
        attachment: req.body.attachment
    });
    Paper.save()
        .then(savedPaper => res.json(savedPaper))
        .catch(e => next(e));
}

//find 
function findPaper(req, res) {
    Paper.find().exec().then(papers => {
        res.json(papers);
    }).catch(err => {
        console.error(err);
        res.sendStatus(500);
    });
}

module.exports = {
    insertPaper,
    findPaper
}