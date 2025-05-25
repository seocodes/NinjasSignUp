package com.seocodes.NinjasSignUp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {
    @GetMapping("/welcome")
    public String welcome(){
        return "This is my first message in this route!";
    }
}
