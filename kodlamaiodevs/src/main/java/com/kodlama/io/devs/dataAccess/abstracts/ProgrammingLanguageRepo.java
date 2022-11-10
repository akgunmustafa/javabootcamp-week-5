package com.kodlama.io.devs.dataAccess.abstracts;

import com.kodlama.io.devs.entities.concretes.ProgrammingLanguage;

import java.util.List;
//import java.util.function.Predicate;

public interface ProgrammingLanguageRepo {

    void add(ProgrammingLanguage programmingLanguage);
    void update(ProgrammingLanguage programmingLanguage);
    void delete(ProgrammingLanguage programmingLanguage);

    ProgrammingLanguage getById(int id);
    ProgrammingLanguage getByName(String name);

    List<ProgrammingLanguage> getAll();
    //List<ProgrammingLanguage> getAll(Predicate<? super ProgrammingLanguage> filter);
}
