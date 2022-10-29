package se331.rest.repository;

import java.util.List;

public interface DoctorRepository {
    List<Doctor> findAll();
    Page<Doctor> findByNameIgnoreCaseContaining(String name, Pageable page);
}
