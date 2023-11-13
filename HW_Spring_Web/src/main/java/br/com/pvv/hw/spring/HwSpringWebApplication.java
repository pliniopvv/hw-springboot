package br.com.pvv.hw.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import br.com.pvv.hw.spring.uploadfiles.StorageProperties;
import br.com.pvv.hw.spring.uploadfiles.StorageService;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class HwSpringWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(HwSpringWebApplication.class, args);
	}
	
	@Bean
	CommandLineRunner init(StorageService storageService) {
		return (args) -> {
			storageService.deleteAll();
			storageService.init();
		};
	}

}
