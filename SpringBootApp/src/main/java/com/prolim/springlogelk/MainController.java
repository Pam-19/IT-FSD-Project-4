package com.prolim.springlogelk;


import lombok.extern.slf4j.Slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@Slf4j
public class MainController {
	
	Logger log=LoggerFactory.getLogger(MainController.class);
	
    @GetMapping("/")
    public String WelcomeScreen(){
    	
        LocalDateTime localDateTime = LocalDateTime.now();
        log.info("Home page was rendered at " + localDateTime);
        return "Hello, This is my home page";
    }

    @GetMapping("/logs")
    public String Logs(){
        LocalDateTime localDateTime = LocalDateTime.now();
        log.info("Log page was rendered at" + localDateTime);
        return "This is the log page";
    }

    @GetMapping("/warning")
    public String Warning(){
        LocalDateTime localDateTime = LocalDateTime.now();
        log.warn("Warning page was rendered at " + localDateTime);
        return "This is the warning page";
    }

    @GetMapping("/err")
    public String Error(){
        LocalDateTime localDateTime = LocalDateTime.now();
        log.error("Error Page was rendered at " + localDateTime);
        return "This is the error page";
    }

}
