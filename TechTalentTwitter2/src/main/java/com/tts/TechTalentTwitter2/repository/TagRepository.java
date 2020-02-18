package com.tts.TechTalentTwitter2.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tts.TechTalentTwitter2.model.Tag;
import com.tts.TechTalentTwitter2.model.Tweet;
import com.tts.TechTalentTwitter2.model.User;

@Repository
public interface TagRepository extends CrudRepository<Tag, Long>{
		Tag findByPhrase(String phrase);
		

	}
