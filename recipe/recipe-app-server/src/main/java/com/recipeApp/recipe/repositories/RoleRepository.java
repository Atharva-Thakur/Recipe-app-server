package com.recipeApp.recipe.repositories;

import java.util.Optional;

import com.recipeApp.recipe.entities.ERole;
import com.recipeApp.recipe.entities.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<Role, String> {
  Optional<Role> findByName(ERole name);
}
