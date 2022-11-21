package kodlama.io.kodlamaiodevs2.webApi;

import kodlama.io.kodlamaiodevs2.business.abstracts.ProgrammingLanguageService;
import kodlama.io.kodlamaiodevs2.business.requests.programmingLanguage.CreateProgrammingLanguageRequest;
import kodlama.io.kodlamaiodevs2.business.requests.programmingLanguage.DeleteProgrammingLanguageRequest;
import kodlama.io.kodlamaiodevs2.business.requests.programmingLanguage.GetByIdProgrammingLanguageRequest;
import kodlama.io.kodlamaiodevs2.business.requests.programmingLanguage.UpdateProgrammingLanguageRequest;
import kodlama.io.kodlamaiodevs2.business.responses.programmingLanguage.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;
import java.util.List;

@RestController
@RequestMapping("/api/plc")
public class ProgrammingLanguagesControllers {
    private final ProgrammingLanguageService programmingLanguageService;


    @Autowired
    public  ProgrammingLanguagesControllers(ProgrammingLanguageService programmingLanguageService){
        this.programmingLanguageService=programmingLanguageService;
    }

    @PostMapping("add")
    public CreateProgrammingLanguageResponse add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) throws Exception {
        return programmingLanguageService.add(createProgrammingLanguageRequest);
    }
    @PutMapping("update")
    public UpdateProgrammingLanguageResponse update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest) throws Exception{
        return programmingLanguageService.update(updateProgrammingLanguageRequest);
    }
    @DeleteMapping("delete")
    public DeleteProgrammingLanguageResponse delete(DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest){
        return programmingLanguageService.delete(deleteProgrammingLanguageRequest);
    }
    @GetMapping("getall")
    public List<GetAllProgrammingLanguageResponse> getAll(){
        return programmingLanguageService.getAll();
    }
    @GetMapping("getbyid")
    public GetByIdProgrammingLanguageResponse getById(GetByIdProgrammingLanguageRequest getByIdProgrammingLanguageRequest){
        return programmingLanguageService.getById(getByIdProgrammingLanguageRequest);
    }

}
