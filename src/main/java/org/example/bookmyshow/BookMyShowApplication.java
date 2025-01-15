package org.example.bookmyshow;

import org.example.bookmyshow.controllers.UserController;
import org.example.bookmyshow.dtos.SignUpRequestDto;
import org.example.bookmyshow.dtos.SignUpResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookMyShowApplication implements CommandLineRunner {

    @Autowired
    private UserController userController;

    public static void main(String[] args) {

        SpringApplication.run(BookMyShowApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        SignUpRequestDto signUpRequestDto = new SignUpRequestDto();
        signUpRequestDto.setFirstName("John");
        signUpRequestDto.setLastName("Doe");
        signUpRequestDto.setEmail("john.doe@gmail.com");
        signUpRequestDto.setPassword("password");
        SignUpResponseDto signUpResponseDto = userController.signUp(signUpRequestDto);
        System.out.println(signUpResponseDto.getResponseStatus());
        System.out.println(signUpResponseDto.getUserId());

    }
}
