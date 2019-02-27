package com.training.rest.webservices.springmicroservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/hello-world")
    // @RequestMapping(method = RequestMethod.GET, path = "/hello-world")
    public String getHelloWorld() {
        return "Hello World.";
    }


    // Returning a Bean
    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean getHelloWorldBean() {
        return new HelloWorldBean("Hello World!!!");
    }

    // Using path variables
    @GetMapping(path = "/hello-world-bean/{name}")
    public HelloWorldBean getHelloWorldBean(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }
}
