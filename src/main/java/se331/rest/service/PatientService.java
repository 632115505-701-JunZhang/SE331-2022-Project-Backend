package se331.rest.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import se331.rest.entity.Patients;
import se331.rest.security.entity.User;

import java.util.List;

public interface PatientService {
    Integer getPatientSize();
    Page<Patients> getPatients(Integer pageSize, Integer page);
    Patients getPatient(Long id);
    Patients save(Patients pat);
    Page<Patients> getPatients(String title, Pageable pageable);
    List<User> getAllUserVaccine();
}
