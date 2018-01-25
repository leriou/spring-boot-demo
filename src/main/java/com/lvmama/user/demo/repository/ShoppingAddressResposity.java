package com.lvmama.user.demo.repository;

import com.lvmama.user.demo.model.ShoppingAddress;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ShoppingAddressResposity extends MongoRepository<ShoppingAddress,String>{
}
