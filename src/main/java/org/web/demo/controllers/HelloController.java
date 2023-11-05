package org.web.demo.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping("/getData")
    public String getMessage(){
        return "Esto es una ejemplo";
    }
    
}
