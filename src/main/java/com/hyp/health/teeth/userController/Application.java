package com.hyp.health.teeth.userController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hyp.health.teeth.service.HelloService;

@Controller
@RequestMapping("/user")
public class Application {
	
	@Autowired
	private HelloService helloService;

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "user index";
    }
    
    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
    	helloService.sayHello();
        return "user hello!";
    }
}