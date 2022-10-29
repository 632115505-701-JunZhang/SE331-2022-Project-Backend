package se331.rest.util;

import java.util.List;
import java.util.stream.Collectors;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import se331.rest.entity.*;

@Mapper(imports = Collectors.class)
public interface LabMapper {
    LabMapper INSTANCE = Mappers.getMapper(LabMapper.class);
    PatientDTO getPatientDto(Patients pat);
    List<PatientDTO> getPatientDto(List<Patients> pats);

    DoctorDTO getDoctorDto(Doctor doc);
    List<DoctorDTO> getDoctorDto(List<Doctor> docs);

    VaccineDTO getVaccineDto(Vaccine vac);
    List<VaccineDTO> getVaccineDto(List<Vaccine> vacs);
    List<UserDTO> getUserDTO(List<User> user);

    @Mapping(target = "authorities",
            expression = "java(doc.getUser().getAuthorities().stream().map(auth -> auth.getName().name()).collect(Collectors.toList()))")
    DoctorAuthDTO getDoctorAuthDTO(Doctor doc);


    @Mapping(target = "authorities",
            expression = "java(pat.getUser().getAuthorities().stream().map(auth -> auth.getName().name()).collect(Collectors.toList()))")
    PatientAuthDTO getPatientAuthDTO(Patients pat);
    UserDTO getUserDto(User user);
}
