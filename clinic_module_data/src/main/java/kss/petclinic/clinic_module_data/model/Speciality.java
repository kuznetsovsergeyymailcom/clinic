package kss.petclinic.clinic_module_data.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "specialties")
public class Speciality extends BaseEntity {

    @Column(name = "description")
    private String description;
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "specialities")
    private Set<Vet> vets = new HashSet<>();

}
