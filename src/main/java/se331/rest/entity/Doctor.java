package se331.rest.entity;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Exclude
    Long id;
    String name;
    String surname;
    Integer age;
    @OneToMany(mappedBy = "doctor")
    @Builder.Default
    List<Patients> patient = new ArrayList<>();
    @ElementCollection
    List<String> docImageUrl;
    @OneToOne
    User user;
}
