package se331.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import se331.rest.dao.DoctorDao;
import se331.rest.dao.PatientDao;
import se331.rest.entity.Doctor;

@Service
public class DoctorServiceImpl implements DoctorService {
    @Autowired
    DoctorDao doctorDao;
    @Autowired
    PatientDao patientDao;
    @Override
    public Integer getDoctorSize() {
        return doctorDao.getDoctorSize();
    }

    @Override
    public Page<Doctor> getDoctors(Integer pageSize, Integer page) {
        return doctorDao.getDoctors(pageSize, page);
    }

    @Override
    public Doctor getDoctor(Long id) {
        return doctorDao.getDoctor(id);
    }

    @Override
    public Doctor save(Doctor doctor) {

        return doctorDao.save(doctor);

    }

    @Override
    public Page<Doctor> getDoctors(String title, Pageable pageable) {
        return doctorDao.getDoctor(title,pageable);
    }
}
