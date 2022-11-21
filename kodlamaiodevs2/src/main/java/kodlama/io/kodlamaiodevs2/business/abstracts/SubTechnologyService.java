package kodlama.io.kodlamaiodevs2.business.abstracts;

import kodlama.io.kodlamaiodevs2.business.requests.subTechnology.CreateSubTechnolohyRequest;
import kodlama.io.kodlamaiodevs2.business.requests.subTechnology.DeleteSubTechnologyRequest;
import kodlama.io.kodlamaiodevs2.business.requests.subTechnology.GetByIdSubTechnologyRequest;
import kodlama.io.kodlamaiodevs2.business.requests.subTechnology.UpdateSubTechnologyRequest;
import kodlama.io.kodlamaiodevs2.business.responses.subTechnology.*;

import java.util.List;

public interface SubTechnologyService {
    // Operations
    CreateSubTechnologyResponse add(CreateSubTechnolohyRequest createSubTechnolohyRequest);
    UpdateSubTechnologyResponse update(UpdateSubTechnologyRequest updateSubTechnologyRequest)throws Exception;
    DeleteSubTechnologyResponse delete(DeleteSubTechnologyRequest deleteSubTechnologyRequest);
    // Methods
    List<GetAllSubTechnologyResponse> getAll();
    GetByIdSubTechnologyResponse getById(GetByIdSubTechnologyRequest getByIdSubTechnologyRequest);

}
