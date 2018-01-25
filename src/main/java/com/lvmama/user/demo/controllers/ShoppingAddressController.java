package com.lvmama.user.demo.controllers;

import com.lvmama.user.demo.model.ShoppingAddress;
import com.lvmama.user.demo.repository.ShoppingAddressResposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;
@RestController
@RequestMapping("/sa")
public class ShoppingAddressController {

    @Autowired
    ShoppingAddressResposity saRepo;

    @RequestMapping("/save")
    public String save(HttpServletRequest request){
        Map<String,String[]> parameterMap = request.getParameterMap();
        ShoppingAddress sa = new ShoppingAddress();
        sa.setUid(new Integer(parameterMap.get("uid")[0]));
        sa.setMobile(parameterMap.get("mobile")[0]);
        sa.setName(parameterMap.get("name")[0]);
        saRepo.save(sa);
        return sa.toString();
    }
}
