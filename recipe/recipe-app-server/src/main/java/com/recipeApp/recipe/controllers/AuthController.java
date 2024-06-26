package com.recipeApp.recipe.controllers;

import com.recipeApp.recipe.dto.CredentialsDto;
import com.recipeApp.recipe.dto.SignUpDto;
import com.recipeApp.recipe.dto.UserDto;
import com.recipeApp.recipe.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    private UserService userService;
    @PostMapping("/login")
    public ResponseEntity<UserDto> login(@RequestBody CredentialsDto credentialsDto) {
        UserDto user = userService.login(credentialsDto);
        return ResponseEntity.ok(user);
    }

}
