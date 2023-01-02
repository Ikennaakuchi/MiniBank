package com.projects.MiniBank.controller;

import com.projects.MiniBank.dto.SignUpDto;
import com.projects.MiniBank.service.AppUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class AppUserController {
    private final AppUserService appUserService;

    @PostMapping("/sign-up")
    public ResponseEntity<String> signUp(@RequestBody SignUpDto signUpDto){
        appUserService.register(signUpDto);
        return new ResponseEntity<>("Sign up Successful", HttpStatus.OK);
    }
}
