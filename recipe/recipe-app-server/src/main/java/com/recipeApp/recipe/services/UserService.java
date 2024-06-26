package com.recipeApp.recipe.services;

import com.recipeApp.recipe.dto.CredentialsDto;
import com.recipeApp.recipe.entities.User;
import com.recipeApp.recipe.exceptions.AppException;
import com.recipeApp.recipe.mappers.UserMapper;
import com.recipeApp.recipe.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import com.recipeApp.recipe.dto.UserDto;

import java.nio.CharBuffer;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
//    private final PasswordEncoder passwordEncoder;
    private final UserMapper userMapper;

    public UserDto login(CredentialsDto credentialsDto){
        User user = userRepository.findByLogin(credentialsDto.login()).orElseThrow(()-> new AppException("Unknown user", HttpStatus.NOT_FOUND));
//        if (passwordEncoder.matches(CharBuffer.wrap(credentialsDto.password()), user.getPassword())) {
//            return userMapper.toUserDto(user);
//        }
        throw new AppException("Invalid password", HttpStatus.BAD_REQUEST);
    }
}
