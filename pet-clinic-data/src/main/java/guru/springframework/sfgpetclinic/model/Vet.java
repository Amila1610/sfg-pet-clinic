package guru.springframework.sfgpetclinic.model;

import lombok.Builder;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@lombok.Setter
@lombok.Getter
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@Builder
@Entity
@Table(name="vets")
public class Vet extends Person {
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "vet_specialities", joinColumns = @JoinColumn(name = "vet_id"),
            inverseJoinColumns = @JoinColumn(name = "speciality_id"))
    private Set<Speciality> specialities= new HashSet<>();

}
