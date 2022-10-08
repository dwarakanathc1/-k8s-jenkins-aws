package com.jhooq.Jhooqk8s.ws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JhooqDockerDemoController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello - Jhooq-k8s i Have updated the message";
    }
    
    @GetMapping("/test")
    public String test() {
        return "This is auto commit from git to build genkins pipeline :0 check this again";
    }
}
