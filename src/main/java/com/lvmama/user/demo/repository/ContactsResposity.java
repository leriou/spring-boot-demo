package com.lvmama.user.demo.repository;

import com.lvmama.user.demo.model.Contacts;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContactsResposity extends MongoRepository<Contacts,String>{

}
