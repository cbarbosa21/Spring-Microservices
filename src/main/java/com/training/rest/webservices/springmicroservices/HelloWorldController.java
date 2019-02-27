package com.training.rest.webservices.springmicroservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

     @GetMapping(path = "/hello-world")
//    @RequestMapping(method = RequestMethod.GET, path = "/hello-world")
    public String getHelloWorld() {
        return "Woooo!";
    }
}
