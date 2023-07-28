package com.example.recipemanagement.repo;

import com.example.recipemanagement.model.AuthenticationToken;
import com.example.recipemanagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface IAuthTokenRepo extends CrudRepository<AuthenticationToken,Long> {


    AuthenticationToken findFirstByTokenValue(String authTokenValue);

    AuthenticationToken findFirstByUser(User user);
}
