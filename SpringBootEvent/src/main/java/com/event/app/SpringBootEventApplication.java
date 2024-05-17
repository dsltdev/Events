package com.event.app;

import com.event.app.Publisher.UserPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootEventApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEventApplication.class, args);
	}



//siempre y cuando sean del mismo tipo de evento no hay problema con la cantidad de eventos
@Bean
	CommandLineRunner init(UserPublisher userPublisher){
		return args -> {
			userPublisher.publishUserRegisterEvent("Sara","5678",(byte) 28 );
			userPublisher.publishUserValidateEvent("Sara",false);
		};
	}
}
