package com.cv.cvbilder.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class cvController {
    
    @GetMapping("/text")
    public String getText(){
        return "this is demo text";
    }
}
