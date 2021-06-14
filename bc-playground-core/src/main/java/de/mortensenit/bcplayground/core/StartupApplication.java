package de.mortensenit.bcplayground.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @author frederik.mortensen
 *
 */
@SpringBootApplication(scanBasePackages = "de.mortensenit.bcplayground.core")
@EnableAutoConfiguration
//@ComponentScan(basePackages = "de.mortensenit")
public class StartupApplication {

	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(StartupApplication.class);
		logger.info("== Starting up bouncycastle playground ==");
		SpringApplication.run(StartupApplication.class, args);
	}

}
