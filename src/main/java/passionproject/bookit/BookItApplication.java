package passionproject.bookit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookItApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookItApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(){
		return args -> System.out.println("CommandLineRunner running in the dataLoader class...");
	}
}

