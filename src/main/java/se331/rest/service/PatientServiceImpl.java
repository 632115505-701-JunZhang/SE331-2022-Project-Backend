package se331.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import se331.rest.dao.DoctorDao;
import se331.rest.dao.PatientDao;
import se331.rest.dao.UserDao;
import se331.rest.dao.VaccineDao;
import se331.rest.entity.Doctor;
import se331.rest.entity.Patients;
import se331.rest.security.entity.User;
import java.util.List;

@Service
public class PatientServiceImpl implements PatientService{
    @Autowired
    PatientDao patientDao;
    @Autowired
    DoctorDao doctorDao;
    @Autowired
    UserDao userDao;
    @Autowired
    VaccineDao vaccineDao;
    @Override
    public Integer getPatientSize() {
        return patientDao.getPatientSize();
    }

    @Override
    public Page<Patients> getPatients(Integer pageSize, Integer page) {
        return patientDao.getPatients(pageSize, page);
    }

    @Override
    public Patients getPatient(Long id) {
        return patientDao.getPatient(id);
    }

    @Override
    public Patients save(Patients pat) {
        Doctor doc = doctorDao.findById(pat.getDoctor().getId()).orElse(null);
        pat.setDoctor(doc);
        doc.getPatient().add(pat);
        return patientDao.save(pat);
    }

    @Override
    public Page<Patients> getPatients(String title, Pageable pageable) {
        return patientDao.getPatient(title,pageable);
    }

    @Override
    public List<User> getAllUserVaccine() {
        return userDao.getUser(Pageable.unpaged()).getContent();
    }
}
