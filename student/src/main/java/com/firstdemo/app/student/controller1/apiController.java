package com.firstdemo.app.student.controller1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class apiController {
    @GetMapping("/avinashsingh")

    public String getMessage(){
        return "apple";
    }
}

