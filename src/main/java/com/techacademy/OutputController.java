package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OutputController {

    @PostMapping("/output")
    public String postOutput(@RequestParam(name = "inputValue", required = false) String inputValue,
                             @RequestParam(name = "previous", required = false) String previousValue,
                             Model model) {
        if (inputValue != null) {
            model.addAttribute("previousValueMessage", previousValue);
            model.addAttribute("inputValue", inputValue);
        }
        return "output";
    }
}