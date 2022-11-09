package kodlama.io.rentacar.dataAccess.abstracts;

import kodlama.io.rentacar.entities.concretes.Brand;

import java.util.List;
public interface BrandRepository {
    List<Brand> getAll();
}
