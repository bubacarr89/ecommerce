package com.marjlow.ecommerce.controllers;

import com.marjlow.ecommerce.services.ProductFeedbackServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductFeedbackController {
    @Autowired
    private ProductFeedbackServices feedbackServices;

    @PostMapping("/add_feedback")
    public @ResponseBody String addFeedback(@RequestParam String username, @RequestParam String  name,
                                            @RequestParam String feedback, @RequestParam String productStar) {
        String message = feedbackServices.addProductFeedback(username, name, feedback, productStar);
        if(message.equals("success")) return "Your feedback is successfully added";
        else {
            return "The feedback is not added, please try again... Please contact the administrator " +
                    "if the problem persists";
        }

    }
}
