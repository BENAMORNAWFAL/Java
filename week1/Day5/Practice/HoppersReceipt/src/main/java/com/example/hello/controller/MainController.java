package com.example.hello.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class MainController {
	// class definition and imports here...
    @RequestMapping("/")
    public String index(Model model) {
        
        String name = "Nawfal Benamor";
        String itemName = "Copper wire";
        double price = 5.25;
        String description = "Metal strips, also an illustration of nanoseconds.";
        String vendor = "Little Things Corner Store";
    
    	model.addAttribute("name",name);
    	model.addAttribute("itemName",itemName);
    	model.addAttribute("price",price);
    	model.addAttribute("description",description);
    	model.addAttribute("vendor",vendor);
    
        return "index.jsp";
    }
    
    

}
