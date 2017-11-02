const express = require('express');
const prescription = require('../controller/prescription.controller');
const router = express.Router();


router.route('/')
    .post(prescription.insertPrescription)

	.get(prescription.findPrescription);

router.route('/:id')
    .get(prescription.getPrescriptionItems)

router.route('/today')
    .get(prescription.findTodayPrescription);

router.route('/previous')
    .get(prescription.findPreviousPrescription);
    
router.route('/pending')
    .get(prescription.findPendingPrescription);

     
router.route('/dispensed')

    .get(prescription.findDispensedPrescriptionItems);
    
<<<<<<< HEAD
   


=======
>>>>>>> b376b97383667d45960504b7087d1e9ba7f129a2
module.exports = router;



