package com.project.Languages.controllers;

import java.util.List;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.Languages.services.LanguageService;
import com.project.Languages.models.Language;

@Controller
public class Languages {
    private final LanguageService languageService;
    public Languages(LanguageService languageService) {
        this.languageService = languageService;
    }

    @RequestMapping("/")
    public String index(){
        return "redirect:/languages";
    }

    @RequestMapping("/languages")
    public String languages(Model model, @ModelAttribute("language") Language language) {
        List<Language> languages = languageService.allLanguages();
        model.addAttribute("languages", languages);
        return "index";
    }

    @RequestMapping("/languages/{index}")
    public String showLanguages(Model model, @PathVariable("index") int index) {
        Language language = languageService.findLanguageByIndex(index);
        model.addAttribute("language", language);
        return "showLanguage";
    }

    @PostMapping("/languages/new")
    public String addLanguage(@Valid @ModelAttribute("language") Language language, BindingResult result) {
        if(result.hasErrors()) {
            return "index";
        } else {
            languageService.addLanguage(language);
            return "redirect:/languages";
        }
    }

    @RequestMapping("/languages/edit/{index}")
    public String editLanguage(@PathVariable("index") int index, Model model) {
        Language language = languageService.findLanguageByIndex(index);
        if (language != null){
            model.addAttribute("language", language);
            return "editLanguage";
        }else{
            return "redirect:/languages";
        }
    }

    @PostMapping("/languages/edit/{index}")
    public String updateLanguage(@PathVariable("index") int index, @Valid @ModelAttribute("language") Language language, BindingResult result) {
        if(result.hasErrors()) {
            return "editLanguage";
        } else {
            languageService.updateLanguage(index, language);
            return "redirect:/languages";
        }
    }

    @RequestMapping("/languages/delete/{index}")
    public String deleteLanguage(@PathVariable("index") int index) {
        languageService.deleteLanguage(index);
        return "redirect:/languages";
    }
}