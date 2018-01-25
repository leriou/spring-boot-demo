package com.lvmama.user.demo.repository;

import com.lvmama.user.demo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String>{
    User findByUsername(String username);
}
