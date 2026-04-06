package Springsecurity.example.Security.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/account")
@CrossOrigin
public class AccountController {

    @GetMapping("/my-account")
    public String getAccountDetails() {
        return "Here are the account details";
    }
}
