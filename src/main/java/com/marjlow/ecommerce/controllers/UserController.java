package com.marjlow.ecommerce.controllers;

import com.marjlow.ecommerce.models.User;
import com.marjlow.ecommerce.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    private UserServices userServices;

    @Autowired
    public UserController(UserServices userServices) {
        this.userServices = userServices;
    }

    @GetMapping("/profile")
    public @ResponseBody User getUserInfo(@RequestParam String username) {
         return userServices.getCustomerInfo(username);
    }

    @PostMapping("/signup")
    public @ResponseBody String addUserCustomer(@RequestBody User user) {
        String message = userServices.addCustomerInfo(user);
        if(message.equals("success")) return "your account is successfully created";
        else {
            return "Your account creation is not complete, please try again... Please contact the administrator " +
                    "if the problem persists";
        }
    }

    @GetMapping("/signin")
    public @ResponseBody String SignInUser(@RequestParam String username, @RequestParam String password) {
        String message = userServices.checkIfUserExist(username, password);
        if(message.equals("User does not exist")) return "Your account is not created... Please create an account";
        else {
            return "success";
        }
    }

    @PutMapping("/update_user_info")
    public @ResponseBody String updateUserAccountInfo(@RequestBody User user) {
        String message = userServices.updateUserInfo(user);
        if(message.equals("success")) return "Your Information is successfully updated";
        else {
            return "Your account is not updated is not complete, please try again... Please contact the administrator " +
                    "if the problem persists";
        }
    }

}
