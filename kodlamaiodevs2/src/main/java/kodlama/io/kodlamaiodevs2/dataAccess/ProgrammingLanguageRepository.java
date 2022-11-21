package kodlama.io.kodlamaiodevs2.dataAccess;

import kodlama.io.kodlamaiodevs2.entities.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage,Integer> {
    ProgrammingLanguage getByName(String name);
}
