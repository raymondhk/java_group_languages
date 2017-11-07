package com.project.Languages.services;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.project.Languages.models.Language;
import com.project.Languages.repositories.LanguageRepository;

@Service
public class LanguageService {
    private LanguageRepository languageRepository;
    public LanguageService(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    // private List<Language> languages = new ArrayList<>(Arrays.asList(
    //     new Language("Java", "James Gosling", "1.8"),
    //     new Language("Python", "Guido van Rossum", "3.6"),
    //     new Language("Javascript", "Brendan Eich", "1.9.5.23.247.2")
    // )); // used for previous assignment without database

    public List<Language> allLanguages() {
        return (List<Language>) languageRepository.findAll();
    }

    public void addLanguage(Language language) {
        languageRepository.save(language);
    }

    public Language findLanguageById(Long id) {
        return languageRepository.findOne(id);
    }
    
    public void updateLanguage(Language language) {
        languageRepository.save(language);
    }
    public void deleteLanguage(Long id) {
        languageRepository.delete(id);
    }
}