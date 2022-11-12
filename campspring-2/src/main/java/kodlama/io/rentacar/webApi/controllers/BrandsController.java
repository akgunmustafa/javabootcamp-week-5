package kodlama.io.rentacar.webApi.controllers;

import kodlama.io.rentacar.business.abstracts.BrandService;
import kodlama.io.rentacar.business.requests.CreateBrandRequest;
import kodlama.io.rentacar.business.requests.DeleteBrandRequest;
import kodlama.io.rentacar.business.responses.GetAllBrandsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //annotation
@RequestMapping("api/brands")
public class BrandsController {
    private final BrandService brandService;
    @Autowired
    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }
    @GetMapping("/getall")
    public List<GetAllBrandsResponse> getAll(){
        //IoC
        return brandService.getAll();
    }
    @PostMapping("/add")
    public void add(CreateBrandRequest createBrandRequest){
        this.brandService.add(createBrandRequest);
    }
    @DeleteMapping("/delete")
    public void delete(DeleteBrandRequest deleteBrandRequest) throws Exception {
        this.brandService.delete(deleteBrandRequest);
    }
}

