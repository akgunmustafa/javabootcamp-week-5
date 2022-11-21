package kodlama.io.kodlamaiodevs2.entities;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Table
@Data
@Entity

public class ProgrammingLanguage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "programmingLanguage")
    private List<SubTechnology> subsTechnologies;

}
