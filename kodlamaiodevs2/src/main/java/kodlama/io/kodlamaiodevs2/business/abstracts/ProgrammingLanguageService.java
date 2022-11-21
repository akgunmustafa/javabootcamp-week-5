package kodlama.io.kodlamaiodevs2.business.abstracts;

import kodlama.io.kodlamaiodevs2.business.requests.programmingLanguage.CreateProgrammingLanguageRequest;
import kodlama.io.kodlamaiodevs2.business.requests.programmingLanguage.DeleteProgrammingLanguageRequest;
import kodlama.io.kodlamaiodevs2.business.requests.programmingLanguage.GetByIdProgrammingLanguageRequest;
import kodlama.io.kodlamaiodevs2.business.requests.programmingLanguage.UpdateProgrammingLanguageRequest;
import kodlama.io.kodlamaiodevs2.business.responses.programmingLanguage.*;

import java.util.List;

public interface ProgrammingLanguageService {
    // add-delete-update
    CreateProgrammingLanguageResponse add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest)throws Exception;
    UpdateProgrammingLanguageResponse update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest)throws Exception;
    DeleteProgrammingLanguageResponse delete(DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest);

    List<GetAllProgrammingLanguageResponse> getAll();
    GetByIdProgrammingLanguageResponse getById(GetByIdProgrammingLanguageRequest getByIdProgrammingLanguageRequest);

}
