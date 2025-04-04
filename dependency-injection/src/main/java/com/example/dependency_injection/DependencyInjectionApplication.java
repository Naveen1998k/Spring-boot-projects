package com.example.dependency_injection;


import com.example.dependency_injection.bean.UserApp;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication   implements CommandLineRunner {

	@PostConstruct
	public void Show(){
		System.out.println("Hello from Dependency Injection Application");
		System.out.println("JDBC Connection is established");
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);
		UserApp app=context.getBean(UserApp.class);
		app.getUserFeeds();

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Dependency Injection Application is running...");
		System.out.println("CommandLineRunner executed.");
		// You can add any additional logic here if needed
		// For example, you can retrieve beans from the application context and use them

	}
}
