package me.jay;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

	private Logger logger = LoggerFactory.getLogger(AppRunner.class);

	@Autowired
	JayProperties jayProperties;

	@Autowired
	private String
		hello;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		logger.debug("+++++++++++++++++++");
		logger.debug(hello);
		logger.debug(jayProperties.getName());
		logger.debug(jayProperties.getFullName());
		logger.debug("+++++++++++++++++++");

		System.out.println("======================");
		System.out.println(jayProperties.getName());
		System.out.println(jayProperties.getAge());
		System.out.println(jayProperties.getFullName());
		System.out.println(jayProperties.getSessionTimeout());
		System.out.println(hello);
		System.out.println("======================");
	}
}
