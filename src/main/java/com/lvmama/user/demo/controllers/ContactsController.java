package com.lvmama.user.demo.controllers;

import com.lvmama.user.demo.model.Contacts;
import com.lvmama.user.demo.repository.ContactsResposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@RequestMapping("/contacts")
public class ContactsController {

    @Autowired
    ContactsResposity contRepo;

    @RequestMapping("/save")
    public String save(HttpServletRequest request){
        Map<String,String[]> parameterMap =  request.getParameterMap();
        Contacts contacts = new Contacts();
        contacts.setUid(new Integer(parameterMap.get("uid")[0]));
        contacts.setGender(new Integer(parameterMap.get("gender")[0]));
        contacts.setMobile(parameterMap.get("mobile")[0]);
        contacts.setUsername(parameterMap.get("username")[0]);
        contRepo.save(contacts);
        return contacts.toString();
    }

}
