package com.it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*定义controller*/
/*使用controller定义bean*/
@Controller
public class UserController {
    /*设置当前操作的访问路径*/
    @RequestMapping("/save")
    /*设置当前操作的返回值类型*/
    @ResponseBody
    public String save(){
        System.out.println("user save ...");
        return "{''module:springmvc'}";
    }
}
