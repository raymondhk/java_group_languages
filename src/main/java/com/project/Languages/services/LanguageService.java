package com.project.Languages.services;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.project.Languages.models.Language;

@Service
public class LanguageService {
    private List<Language> languages = new ArrayList<>(Arrays.asList(
        new Language("Java", "James Gosling", "1.8"),
        new Language("Python", "Guido van Rossum", "3.6"),
        new Language("Javascript", "Brendan Eich", "1.9.5.23.247.2")
    ));
    public List<Language> allLanguages() {
        return languages;
    }
    public Language findLanguageByIndex(int index) {
        if(index < languages.size()) {
            return languages.get(index);
        } else {
            return null;
        }
    }
    public void addLanguage(Language language) {
        languages.add(language);
    }
    public void updateLanguage(int index, Language language) {
        if(index < languages.size()) {
            languages.set(index, language);
        }
    }
    public void deleteLanguage(int index) {
        if(index < languages.size()) {
            languages.remove(index);
        }
    }
}