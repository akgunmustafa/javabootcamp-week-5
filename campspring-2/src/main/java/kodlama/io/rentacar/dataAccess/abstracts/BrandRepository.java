package kodlama.io.rentacar.dataAccess.abstracts;

import kodlama.io.rentacar.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

//import java.util.List;
public interface BrandRepository extends JpaRepository<Brand,Integer> {
    Brand getBrandById(Integer id);


}
