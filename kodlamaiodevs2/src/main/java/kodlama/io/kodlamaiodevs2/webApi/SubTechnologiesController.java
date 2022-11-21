package kodlama.io.kodlamaiodevs2.webApi;

import kodlama.io.kodlamaiodevs2.business.abstracts.SubTechnologyService;
import kodlama.io.kodlamaiodevs2.business.requests.subTechnology.CreateSubTechnolohyRequest;
import kodlama.io.kodlamaiodevs2.business.requests.subTechnology.DeleteSubTechnologyRequest;
import kodlama.io.kodlamaiodevs2.business.requests.subTechnology.GetByIdSubTechnologyRequest;
import kodlama.io.kodlamaiodevs2.business.requests.subTechnology.UpdateSubTechnologyRequest;
import kodlama.io.kodlamaiodevs2.business.responses.subTechnology.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sts")
public class SubTechnologiesController {
    private final SubTechnologyService subTechnologyService;

    @Autowired
    public SubTechnologiesController (SubTechnologyService subTechnologyService){
        this.subTechnologyService=subTechnologyService;
    }

    @PostMapping("add")
    public CreateSubTechnologyResponse add(CreateSubTechnolohyRequest createSubTechnolohyRequest){
        return subTechnologyService.add(createSubTechnolohyRequest);
    }
    @PutMapping("update")
    public UpdateSubTechnologyResponse update(UpdateSubTechnologyRequest updateSubTechnologyRequest)throws Exception{
        return subTechnologyService.update(updateSubTechnologyRequest);
    }
    @DeleteMapping("delete")
    public DeleteSubTechnologyResponse delete(DeleteSubTechnologyRequest deleteSubTechnologyRequest){
        return subTechnologyService.delete(deleteSubTechnologyRequest);
    }

    @GetMapping("getall")
    public List<GetAllSubTechnologyResponse> getAll(){
        return subTechnologyService.getAll();
    }

    @GetMapping("getbyid")
    public GetByIdSubTechnologyResponse getbyid(GetByIdSubTechnologyRequest getByIdSubTechnologyRequest){
        return subTechnologyService.getById(getByIdSubTechnologyRequest);
    }


}
