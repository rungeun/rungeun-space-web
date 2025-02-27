package space.rungeun.rungeun_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controllor {

    @GetMapping("/")
    public String hello(Model model){
        model.addAttribute("username", "RunGeun");
        return "greetings";
    }
}
