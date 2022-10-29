package se331.rest.entity;

import java.util.List;

public class DoctorDTO {
    Long id;
    String name;
    String surname;
    Integer age;
    UserDTO user;
    List<DoctorPatientDTO> patient;
}
