package pl.fakedatabase.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class FakeDatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(FakeDatabaseApplication.class, args);
	}
}
