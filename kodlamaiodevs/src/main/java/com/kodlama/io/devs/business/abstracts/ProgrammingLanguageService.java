package com.kodlama.io.devs.business.abstracts;

import com.kodlama.io.devs.entities.concretes.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageService {
    String add(ProgrammingLanguage programmingLanguage);
    String update(ProgrammingLanguage programmingLanguage);
    String delete(ProgrammingLanguage programmingLanguage);
    ProgrammingLanguage get(int id);
    List<ProgrammingLanguage> getAll();
}
