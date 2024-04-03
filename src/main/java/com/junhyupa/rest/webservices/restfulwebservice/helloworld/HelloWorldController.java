package com.junhyupa.rest.webservices.restfulwebservice.helloworld;


import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @RequestMapping(value="/hello-world", method = RequestMethod.GET)
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World");
    }

    @GetMapping("/hello-world/{name}")
    public HelloWorldBean helloWorldPathVariable (@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello World %s", name));
    }
}
