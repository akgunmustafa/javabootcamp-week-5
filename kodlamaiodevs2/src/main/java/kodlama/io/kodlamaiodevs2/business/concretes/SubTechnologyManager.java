package kodlama.io.kodlamaiodevs2.business.concretes;

import kodlama.io.kodlamaiodevs2.business.abstracts.SubTechnologyService;
import kodlama.io.kodlamaiodevs2.business.constants.Messages;
import kodlama.io.kodlamaiodevs2.business.requests.subTechnology.CreateSubTechnolohyRequest;
import kodlama.io.kodlamaiodevs2.business.requests.subTechnology.DeleteSubTechnologyRequest;
import kodlama.io.kodlamaiodevs2.business.requests.subTechnology.GetByIdSubTechnologyRequest;
import kodlama.io.kodlamaiodevs2.business.requests.subTechnology.UpdateSubTechnologyRequest;
import kodlama.io.kodlamaiodevs2.business.responses.subTechnology.*;
import kodlama.io.kodlamaiodevs2.dataAccess.SubTechnologyRepository;
import kodlama.io.kodlamaiodevs2.entities.SubTechnology;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubTechnologyManager implements SubTechnologyService {


    private final SubTechnologyRepository subTechnologyRepository;
    private final ModelMapper modelMapper1;

    @Autowired
    public SubTechnologyManager(SubTechnologyRepository subTechnologyRepository,ModelMapper modelMapper) {
        this.modelMapper1=modelMapper;
        this.subTechnologyRepository=subTechnologyRepository;
    }

    @Override
    public CreateSubTechnologyResponse add(CreateSubTechnolohyRequest createSubTechnolohyRequest){
        SubTechnology subTechnology=modelMapper1.map(createSubTechnolohyRequest,
                SubTechnology.class);
        SubTechnology saveSubTechnologyResult=subTechnologyRepository.save(subTechnology);

        return modelMapper1.map(saveSubTechnologyResult, CreateSubTechnologyResponse.class);


    }

    @Override
    public UpdateSubTechnologyResponse update(UpdateSubTechnologyRequest updateSubTechnologyRequest)throws Exception {
        SubTechnology subTechnology=modelMapper1.map(updateSubTechnologyRequest,SubTechnology.class);
        nameCannotBeSame(updateSubTechnologyRequest.getName());
        SubTechnology saveSubTechnologyResult=subTechnologyRepository.save(subTechnology);
        return modelMapper1.map(saveSubTechnologyResult,UpdateSubTechnologyResponse.class);
    }

    @Override
    public DeleteSubTechnologyResponse delete(DeleteSubTechnologyRequest deleteSubTechnologyRequest) {
        SubTechnology getReferenceByIdSubTechnologyResult=subTechnologyRepository.getReferenceById(deleteSubTechnologyRequest.getId());
        subTechnologyRepository.delete(getReferenceByIdSubTechnologyResult);
        return modelMapper1.map(deleteSubTechnologyRequest,DeleteSubTechnologyResponse.class);
    }

    @Override
    public List<GetAllSubTechnologyResponse> getAll() {
        List<SubTechnology> findAllSubTechnologyResult=subTechnologyRepository.findAll();
        return modelMapper1.map(findAllSubTechnologyResult,new TypeToken<List<GetAllSubTechnologyResponse>>(){}.getType());

    }

    @Override
    public GetByIdSubTechnologyResponse getById(GetByIdSubTechnologyRequest getByIdSubTechnologyRequest) {
        SubTechnology getReferenceByIdSubTechnologyResult=subTechnologyRepository.getReferenceById(getByIdSubTechnologyRequest.getId());
        //GetByIdSubTechnologyResponse getByIdSubTechnologyResponse=modelMapper.map(getReferenceByIdSubTechnologyResult,
        //        GetByIdSubTechnologyResponse.class);

        return modelMapper1.map(getReferenceByIdSubTechnologyResult,GetByIdSubTechnologyResponse.class);
    }


    //Role for Exception
    private void nameCannotBeSame(String name)throws Exception{
        //SubTechnology getByNameSubTechnologyResult=subTechnologyRepository.getByName(name);
        //var result=getByNameSubTechnologyResult;

        var result= subTechnologyRepository.getByName(name);
        if (result!=null){
            throw new Exception(Messages.name_already_exist);
        }
    }
}