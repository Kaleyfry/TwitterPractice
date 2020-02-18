package com.tts.TechTalentTwitter2.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.*;
import org.springframework.security.core.SpringSecurityCoreVersion;

@Configuration
public class ThymeleafConfiguration {
    @Bean
    public SpringSecurityCoreVersion springSecurityDialect(){
        return new SpringSecurityCoreVersion();
    }
}
