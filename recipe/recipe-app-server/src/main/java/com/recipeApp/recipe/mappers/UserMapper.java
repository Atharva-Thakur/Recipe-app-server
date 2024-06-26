package com.recipeApp.recipe.mappers;

import com.recipeApp.recipe.dto.UserDto;
import com.recipeApp.recipe.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;


@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toUserDto(User user);
}
