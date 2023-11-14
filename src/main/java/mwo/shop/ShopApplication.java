package mwo.shop;

import mwo.shop.config.VersionHolder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

import java.util.Properties;

@SpringBootApplication
public class ShopApplication {
	private static final Logger logger = LoggerFactory.getLogger(ShopApplication.class);

	@Value("${application.version}")
	private String version1;
	public static void main(String[] args) {
		Properties properties = new Properties();
		String version = properties.getProperty("buildNumber");

		System.out.println("Current application version: " + version);

		ApplicationContext context = SpringApplication.run(ShopApplication.class, args);

		VersionHolder versionHolder = context.getBean(VersionHolder.class);
		System.out.println("Version from VersionHolder: " + versionHolder.getVersion());

		System.out.println("Application started successfully.11111111111111111111111111111111111111111");
	}

//	@Override
//	public void run(String... args) {
//		Properties properties = new Properties();
//		String version = properties.getProperty("buildNumber");
//		logger.info("Current application version: {}", version);
//		logger.info("Application started successfully.1234567890!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//	}


}
