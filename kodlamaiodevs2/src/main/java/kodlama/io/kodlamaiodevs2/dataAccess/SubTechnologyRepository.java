package kodlama.io.kodlamaiodevs2.dataAccess;

import kodlama.io.kodlamaiodevs2.entities.SubTechnology;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubTechnologyRepository extends JpaRepository<SubTechnology, Integer> {

    SubTechnology getByName(String name);
}
