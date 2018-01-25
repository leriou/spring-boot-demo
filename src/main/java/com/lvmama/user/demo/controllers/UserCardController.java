package com.lvmama.user.demo.controllers;

import com.lvmama.user.demo.model.User;
import com.lvmama.user.demo.model.UserCard;
import com.lvmama.user.demo.repository.UserCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/usercard")
public class UserCardController {

    @Autowired
    UserCardRepository cardRepo;

    @RequestMapping("/save")
    public String save(HttpServletRequest request){
        Map<String,String[]> parameterMap = request.getParameterMap();
        UserCard card = new UserCard();
        card.setId(new Integer(parameterMap.get("id")[0]));
        card.setUid(new Integer(parameterMap.get("uid")[0]));
        card.setCardnum(parameterMap.get("cardnum")[0]);
        card.setGender(new Integer(parameterMap.get("gender")[0]));
        card.setMobile(parameterMap.get("mobile")[0]);
        cardRepo.save(card);
        return card.toString();
    }

    @RequestMapping("/find")
    public List<UserCard> find() {
        return cardRepo.findAll();
    }
    @RequestMapping("/findByMobile")
    public String findByMobile(String mobile){
        return cardRepo.findByMobile(mobile).toString();
    }

}
