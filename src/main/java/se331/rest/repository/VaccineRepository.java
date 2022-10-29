package se331.rest.repository;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VaccinePatientDTO {
    Long id;
    String name;
    String surname;
    Integer age;
    String hometown;
    String doctor_comm;
}
