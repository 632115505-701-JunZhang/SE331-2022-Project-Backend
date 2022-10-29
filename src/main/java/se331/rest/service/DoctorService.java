package se331.rest.service;

public interface DoctorService {
    Integer getDoctorSize();
    Page<Doctor> getDoctors(Integer pageSize, Integer page);
    Doctor getDoctor(Long id);
    Doctor save(Doctor doctor);
    Page<Doctor> getDoctors(String title, Pageable pageable);
}
