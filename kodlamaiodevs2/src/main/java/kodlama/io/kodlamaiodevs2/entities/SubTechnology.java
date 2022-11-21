package kodlama.io.kodlamaiodevs2.entities;

import lombok.Data;

import javax.persistence.*;

@Table(name = "sub_technologies")
@Data
@Entity
public class SubTechnology {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "programming_language_id")
    private ProgrammingLanguage programmingLanguage;
}
