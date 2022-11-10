package com.kodlama.io.devs.webApi.controllers;

import com.kodlama.io.devs.business.abstracts.ProgrammingLanguageService;
import com.kodlama.io.devs.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class ProgrammingLanguagesController {
    private final ProgrammingLanguageService programmingLanguageService;
    @PostMapping("add")
    public String add(@RequestBody ProgrammingLanguage programmingLanguage){
        return programmingLanguageService.add(programmingLanguage);
    }
    @Autowired
    public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
        this.programmingLanguageService = programmingLanguageService;
    }

    @PutMapping("update")
    public String update(@RequestBody ProgrammingLanguage programmingLanguage){
        return programmingLanguageService.update(programmingLanguage);
    }
    @DeleteMapping("delete")
    public String delete(@RequestBody ProgrammingLanguage programmingLanguage){
        return programmingLanguageService.delete(programmingLanguage);
    }
    @GetMapping("showAll")
    public List<ProgrammingLanguage> getAll(){
        return programmingLanguageService.getAll();
    }
    //@GetMapping("/{id}")
    //public ProgrammingLanguage getById(@PathVariable("id")int id){
    //    return programmingLanguageService.get(id);
    //}
}
