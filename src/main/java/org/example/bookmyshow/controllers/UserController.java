package org.example.bookmyshow.controllers;

import org.example.bookmyshow.dtos.ResponseStatus;
import org.example.bookmyshow.dtos.SignUpRequestDto;
import org.example.bookmyshow.dtos.SignUpResponseDto;
import org.example.bookmyshow.models.User;
import org.example.bookmyshow.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    public SignUpResponseDto signUp(SignUpRequestDto signUpRequestDto)
    {
        SignUpResponseDto signUpResponseDto = new SignUpResponseDto();
        try {
            User user = userService.signUp(signUpRequestDto.getFirstName(), signUpRequestDto.getLastName(), signUpRequestDto.getEmail(), signUpRequestDto.getPassword());
            signUpResponseDto.setUserId(user.getId());
            signUpResponseDto.setResponseStatus(ResponseStatus.SUCCESS);
        }
        catch(Exception e)
        {
            signUpResponseDto.setResponseStatus(ResponseStatus.FAILURE);
        }
        return signUpResponseDto;
    }
}
