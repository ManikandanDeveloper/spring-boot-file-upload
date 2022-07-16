package com.buckybond.fileuploaddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.buckybond.fileuploaddemo.storage.StorageProperties;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class FileuploaddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileuploaddemoApplication.class, args);
	}

}
