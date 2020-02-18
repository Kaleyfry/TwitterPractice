package com.tts.TechTalentTwitter2.model;

import java.util.List;

import com.tts.TechTalentTwitter2.model.Tag;
import com.tts.TechTalentTwitter2.model.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TweetDisplay {
    private User user;
	
    private String message;
	
	private String date;
	
    private List<Tag> tags;
}