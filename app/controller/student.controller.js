const Student = require('../models/student.model');

//insert company
function insertStudent(req, res) {
    const student = new Student({
        studentName: req.body.studentName,
        faculty: req.body.faculty,
        nic:  req.body.nic,
        feildOfStudy:  req.body.feildOfStudy,
        year:  req.body.year,
        companyName:  req.body.companyName,
        extraCurricular:  req.body.extraCurricular,
        academic:  req.body.Academic,
        traineeRecords:  req.body.traineeRecords
    });
    student.save()
        .then(savedStudent => res.json(savedStudent))
        .catch(e => next(e));
}

//find companies
function findStudent(req, res) {
    Student.find().exec().then(students => {
        res.json(students);
    }).catch(err => {
        console.error(err);
        res.sendStatus(500);
    });
}

//update company
function updateStudent(req, res) {
    const student = new Student(req.body);
    student.update().then(() => {
        res.sendStatus(200);
    }).catch(err => {
        console.error(err);
        res.sendStatus(500);
    });
}

//delete company
function deleteStudent(req, res) {
    Student.remove({
        _id: req.params.id
    }).then(() => {
        res.sendStatus(200);
    }).catch(err => {
        console.error(err);
        res.sendStatus(500);
    });
}


module.exports = {
    insertStudent,
    updateStudent,
    findStudent,
    deleteStudent
}