package com.lvmama.user.demo.repository;

import com.lvmama.user.demo.model.UserCard;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserCardRepository extends MongoRepository<UserCard,String> {
    UserCard findByMobile(String mobile);
}
