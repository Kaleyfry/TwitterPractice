package com.tts.TechTalentTwitter2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tts.TechTalentTwitter2.model.Tag;


@Repository
public interface TagRepository extends CrudRepository<Tag, Long>{
		Tag findByPhrase(String phrase);
		

	}
