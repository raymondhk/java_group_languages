package com.project.Languages.repositories;

import com.project.Languages.models.Language;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository 												
public interface LanguageRepository extends CrudRepository<Language,Long>{
	List<Language> findAll();
}
