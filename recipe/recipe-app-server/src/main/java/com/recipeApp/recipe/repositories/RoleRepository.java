package com.recipeApp.recipe.repositories;

import com.recipeApp.recipe.models.ERole;
import com.recipeApp.recipe.models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role,String> {
    Optional<Role> findByName(ERole name);
}
