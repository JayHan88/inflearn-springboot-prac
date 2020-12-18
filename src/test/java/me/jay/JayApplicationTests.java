package me.jay;

import static org.assertj.core.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.TestPropertySource;

//@TestPropertySource(properties = "jay.name = jayPropertySoruce")
@TestPropertySource(locations = "classpath:/test.properties")
@SpringBootTest // (properties = "jay.name = jayProperty")
class JayApplicationTests {

	@Autowired
	Environment environment;

	@Test
	void contextLoads() {
		assertThat(environment.getProperty("jay.age")).isEqualTo("29");
	}

}
