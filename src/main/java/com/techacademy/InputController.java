package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class InputController {

    @GetMapping("/input")
    public String getinput() {
        return "input";
    }

    @RequestMapping("/output")
    public String confirm(@RequestParam("previous") String arg) {
        System.out.println("previous: " + arg);
        return "output";
    }
}