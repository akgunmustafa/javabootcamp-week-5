package com.kodlama.io.devs.dataAccess.concretes;

import com.kodlama.io.devs.dataAccess.abstracts.ProgrammingLanguageRepo;
import com.kodlama.io.devs.entities.concretes.ProgrammingLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
//import java.util.function.Predicate;

@Repository
public class InMemoryProgrammingLanguage implements ProgrammingLanguageRepo {
    List<ProgrammingLanguage> programmingLanguages;

    @Override
    public void add(ProgrammingLanguage programmingLanguage) {
        programmingLanguages= new ArrayList<>();
        programmingLanguages.add(programmingLanguage);
    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage) {
        ProgrammingLanguage programmingLanguage2 = getById(programmingLanguage.getId());
        if (programmingLanguage2 == null) {
            programmingLanguage2.setName(programmingLanguage.getName());
        }
    }

    @Override
    public void delete(ProgrammingLanguage programmingLanguage) {
        programmingLanguages.remove(programmingLanguage);
    }

    @Override
    public ProgrammingLanguage getById(int id) {
        for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
            if (programmingLanguage.getId() == id) {
                return programmingLanguage;
            }
        }
        return null;
    }

    @Override
    public ProgrammingLanguage getByName(String name) {
        for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
            if (programmingLanguage.getName().equals(name)) {
                return programmingLanguage;
            }
        }
        return null;
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguages;
    }
    /*
    @Override
    public List<ProgrammingLanguage> getAll(Predicate<? super ProgrammingLanguage> filter) {
        return this.programmingLanguages.stream().filter(filter).toList();
    }
    */
}
