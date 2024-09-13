package com.security.Role.Based.Security.controller;

//import com.security.Role.Based.Security.entity.User;
//import com.security.Role.Based.Security.service.UserService;
import com.security.Role.Based.Security.entity.Users;
import com.security.Role.Based.Security.service.MyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private MyUserService myUserService;

    @PostMapping("/register/user")
    public ResponseEntity<Users> createUser (@RequestBody Users user){
        return new ResponseEntity<>(myUserService.saveUser(user), HttpStatus.OK);
    }

    @GetMapping("/home")
    public String home(){
        return "Home";
    }

    @GetMapping("/admin/home")
    public String admin(){
        return "Home Admin";
    }

    @GetMapping("/user/home")
    public String user(){
        return "Home User";
    }
}
