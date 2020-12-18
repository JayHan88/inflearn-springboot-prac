package me.jay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
//@EnableConfigurationProperties(JayProperties.class)
public class JayApplication {

	public static void main(String[] args) {
//		new SpringApplicationBuilder().sources(JayApplication.class).run(args);
//		new SpringApplication(JayApplication.class).run(args);
		SpringApplication app = new SpringApplication(JayApplication.class);
		app.setWebApplicationType(WebApplicationType.NONE);
//		app.addListeners(new SampleListener());
		app.run(args);
//		SpringApplication.run(JayApplication.class, args);
	}

}
