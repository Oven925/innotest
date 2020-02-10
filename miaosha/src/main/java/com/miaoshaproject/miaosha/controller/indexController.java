package com.miaoshaproject.miaosha.controller;


import com.miaoshaproject.miaosha.dao.UserDOMapper;
import com.miaoshaproject.miaosha.dataobject.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class indexController {

    @Autowired
    private UserDOMapper userDOMapper;

    @RequestMapping("/hello")
    public String hello(){
        UserDO userDO = userDOMapper.selectByPrimaryKey(1);
        if(userDO == null){
            return "用户对象不存在！";
        }else{
            return userDO.getName();
        }
    }
}
