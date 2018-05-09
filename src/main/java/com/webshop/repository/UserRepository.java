package com.webshop.repository;

import com.webshop.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByNick(String nick);
    User findByEmail(String email);
}
