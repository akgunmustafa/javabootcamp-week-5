package kodlama.io.kodlamaiodevs2.business.concretes;

import kodlama.io.kodlamaiodevs2.business.abstracts.ProgrammingLanguageService;
import kodlama.io.kodlamaiodevs2.business.constants.Messages;
import kodlama.io.kodlamaiodevs2.business.requests.programmingLanguage.*;
import kodlama.io.kodlamaiodevs2.business.responses.programmingLanguage.*;
import kodlama.io.kodlamaiodevs2.dataAccess.ProgrammingLanguageRepository;
import kodlama.io.kodlamaiodevs2.entities.ProgrammingLanguage;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {


    private final ProgrammingLanguageRepository programmingLanguageRepository;
    private final ModelMapper modelMapper1;

    @Autowired

    public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository,ModelMapper modelMapper) {
        this.programmingLanguageRepository = programmingLanguageRepository;
        this.modelMapper1 = modelMapper;
    }



    @Override
    public CreateProgrammingLanguageResponse add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) throws Exception{
        nameCannotBeSame(createProgrammingLanguageRequest.getName());
        ProgrammingLanguage programmingLanguage=modelMapper1.map(createProgrammingLanguageRequest,
                ProgrammingLanguage.class);
        ProgrammingLanguage saveProgrammingLanguageResult=programmingLanguageRepository.save(programmingLanguage);

        return modelMapper1.map(saveProgrammingLanguageResult, CreateProgrammingLanguageResponse.class);
    }

    @Override
    public UpdateProgrammingLanguageResponse update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest) throws Exception{
        nameCannotBeSame(updateProgrammingLanguageRequest.getName());
        ProgrammingLanguage programmingLanguage=modelMapper1.map(updateProgrammingLanguageRequest,ProgrammingLanguage.class);
        ProgrammingLanguage saveProgrammingLanguageResult=programmingLanguageRepository.save(programmingLanguage);

        return modelMapper1.map(saveProgrammingLanguageResult,UpdateProgrammingLanguageResponse.class);
    }

    @Override
    public DeleteProgrammingLanguageResponse delete(DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest) {
        ProgrammingLanguage getReferenceByIdProgrammingLanguageResult=programmingLanguageRepository.getReferenceById(deleteProgrammingLanguageRequest.getId());
        programmingLanguageRepository.delete(getReferenceByIdProgrammingLanguageResult);

        return modelMapper1.map(getReferenceByIdProgrammingLanguageResult,DeleteProgrammingLanguageResponse.class);
    }

    @Override
    public List<GetAllProgrammingLanguageResponse> getAll() {

        List<ProgrammingLanguage> findAllProgrammingLanguageResult=programmingLanguageRepository.findAll();
        return modelMapper1.map(findAllProgrammingLanguageResult,new TypeToken<List<GetAllProgrammingLanguageResponse
                >>(){}.getType());
    }

    @Override
    public GetByIdProgrammingLanguageResponse getById(GetByIdProgrammingLanguageRequest getByIdProgrammingLanguageRequest) {

        ProgrammingLanguage getReferenceByIdProgrammingLanguageResult=programmingLanguageRepository.getReferenceById(getByIdProgrammingLanguageRequest.getId());

        return modelMapper1.map(getReferenceByIdProgrammingLanguageResult,GetByIdProgrammingLanguageResponse.class);
    }

    private void nameCannotBeSame(String name) throws Exception{
        var result= programmingLanguageRepository.getByName(name);
        if (result!=null){
            throw new Exception(Messages.name_already_exist);
        }
    }
}
