package se331.rest.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import se331.rest.security.entity.User;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Doctor {
    @javax.persistence.Id
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

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
