package guru.springframework.sfgpetclinic.model;

import lombok.Builder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@lombok.Setter
@lombok.Getter
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@Builder
@Entity
@Table(name = "types")
public class PetType extends BaseEntity {
    @Column(name = "name")
    private String name;

}
