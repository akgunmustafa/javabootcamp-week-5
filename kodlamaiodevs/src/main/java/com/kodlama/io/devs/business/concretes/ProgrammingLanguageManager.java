package com.kodlama.io.devs.business.concretes;

import com.kodlama.io.devs.business.abstracts.ProgrammingLanguageService;
import com.kodlama.io.devs.dataAccess.abstracts.ProgrammingLanguageRepo;
import com.kodlama.io.devs.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {
    ProgrammingLanguageRepo programmingLanguageRepo;
    private void cannotRepeat(String name) throws Exception{
        ProgrammingLanguage programmingLanguage=programmingLanguageRepo.getByName(name);
        if (programmingLanguage!=null){
            throw new Exception("Programlama dili zaten kayıtlı");
        }
    }
    private void nameCannotBeEmpty(ProgrammingLanguage programmingLanguage)throws Exception{
        if (programmingLanguage.getName().isEmpty()){
            throw new Exception("Program ismi boş geçilemez");
        }
    }
    @Autowired
    public ProgrammingLanguageManager(ProgrammingLanguageRepo programmingLanguageRepo){
        this.programmingLanguageRepo=programmingLanguageRepo;
    }

    @Override
    public String add(ProgrammingLanguage programmingLanguage) {
        try{
            cannotRepeat(programmingLanguage.getName());
            nameCannotBeEmpty(programmingLanguage);
        }catch (Exception e){
            return e.getMessage();
        }
        programmingLanguageRepo.add(programmingLanguage);
        return "Başarıyla eklendi";
    }

    @Override
    public String update(ProgrammingLanguage programmingLanguage) {
        try{
            cannotRepeat(programmingLanguage.getName());
            nameCannotBeEmpty(programmingLanguage);
        }catch (Exception e){
            return e.getMessage();
        }
        programmingLanguageRepo.update(programmingLanguage);
        return "Başarıyla güncellendi";
    }

    @Override
    public String delete(ProgrammingLanguage programmingLanguage) {
        programmingLanguageRepo.delete(programmingLanguage);
        return "Başarıyla Silindi";
    }

    @Override
    public ProgrammingLanguage get(int id) {
        return programmingLanguageRepo.getById(id);
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguageRepo.getAll();
    }
}
