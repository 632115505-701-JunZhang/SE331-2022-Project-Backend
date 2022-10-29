package se331.rest.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import se331.rest.security.entity.UserDTO;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PatientDTO {
    Long id;
    String name;
    String surname;
    String status;
    Integer age;
    String hometown;
    String doctor_comm;
    PatientDoctorDTO doctor;
    List<PatientVaccineDTO> vaccine;
    UserDTO user;
    List<String> imageUrls;

}
