package org.example.backendproject.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HomeController {
    @RequestMapping("/")
    String home() {
        return "Hello TestValue";
    }

//    @RequestMapping("/")
//    String home() {
//        return "Hello World!";
//    }
}





