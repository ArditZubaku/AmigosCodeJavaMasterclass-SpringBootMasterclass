package com.example.demo.auth;

import java.util.Optional;

public interface IApplicationUserDAO {

    Optional<ApplicationUser> selectApplicationUserByUsername(String username);

}
