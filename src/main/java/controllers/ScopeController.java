package controllers;

import domain.HelloMessageGenerator;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/scopes")
public class ScopeController {

    @Resource(name = "helloMessageGenerator1")
    HelloMessageGenerator helloMessageGenerator;

    @GetMapping("/request")
    public String getRequestScopeMessage(final Model model){
        model.addAttribute("previousMessage",helloMessageGenerator.getMessage());
        helloMessageGenerator.setMessage("Good morning");
        model.addAttribute("currentMessage",helloMessageGenerator.getMessage());
        return "Request Scope";
    }

}
