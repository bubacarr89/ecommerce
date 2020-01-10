package com.marjlow.ecommerce.services;

import com.marjlow.ecommerce.dto.UserRepository;
import com.marjlow.ecommerce.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserServices {
    private final UserRepository userRepo;

    @Autowired
    public UserServices(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    public User getCustomerInfo(String username) {
        return userRepo.findByUsername(username);

    }

    public String addCustomerInfo(User user) {
        String message = "success";
        try {
            userRepo.save(user);
        } catch (Exception e) {
            message = e.getMessage();
        }
        return message;
    }

    public String checkIfUserExist(String username, String password) {
        User user = userRepo.findByUsernameAndPassword(username, password);
        //User user = null;
        if(user == null) return "User does not exist";
        else {
            return "User exist";
        }
    }

    public String updateUserInfo(User user) {
        String message = "message";
        try{
            userRepo.save(user);
        }catch(Exception e) {
            message = e.getMessage();
        }
        return message;
    }
}
