package pl.fakedatabase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class FakeDatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(FakeDatabaseApplication.class, args);
	}
}
