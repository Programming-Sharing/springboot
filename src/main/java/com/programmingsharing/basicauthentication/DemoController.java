package com.programmingsharing.basicauthentication;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "protected")
public class DemoController {

    @GetMapping("demo")
    public String demo(){
        return "Welcome to Basic Authentication demo";
    }
}
