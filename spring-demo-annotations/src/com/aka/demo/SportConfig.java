package com.aka.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
//@ComponentScan("com.aka.demo")
@PropertySource("classpath:sport.properties")
public class SportConfig {

	// property source support for Spring 4.2 or lower
	// The following is only for v4.2 or lower
	// To provide support to read from the properties file and inject them in the literals
	/*@Bean
    public static PropertySourcesPlaceholderConfigurer
                    propertySourcesPlaceHolderConfigurer() {
        
        return new PropertySourcesPlaceholderConfigurer();
    }*/
	
	// define bean for sad fortune service
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
	
	// define the bean for swim coach and inject the sadfortune service
	
	
}
