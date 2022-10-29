package se331.rest.dao;

import java.util.Optional;

public interface DoctorDao {
    Integer getDoctorSize();
    Page<Doctor> getDoctors(Integer pageSize, Integer page);
    Doctor getDoctor(Long id);
    Doctor save(Doctor doctor);
    Optional<Doctor> findById(Long id);
    Page<Doctor> getDoctor(String name, Pageable page);
}
