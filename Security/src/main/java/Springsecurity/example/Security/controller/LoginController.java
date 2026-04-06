package Springsecurity.example.Security.controller;

import Springsecurity.example.Security.Repository.UserRepo;
import Springsecurity.example.Security.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
@CrossOrigin
public class LoginController {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepo userRepo;

    @PostMapping("/register")
    public ResponseEntity<String> registeruser(@RequestBody User user) {
        ResponseEntity response = null;
        try {
            String hashpassword = passwordEncoder.encode(user.getPassword());
            user.setPassword(hashpassword);
            User savedUser = userRepo.save(user);
            if (savedUser.getId()>0){
                response = ResponseEntity
                        .status(HttpStatus.CREATED)
                        .body("Given user Details are Sucessfully Registered");
            }

        }catch (Exception ex){
            response = ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("An Exception occured due to " + ex.getMessage());
        }

        return response;


    }
}
