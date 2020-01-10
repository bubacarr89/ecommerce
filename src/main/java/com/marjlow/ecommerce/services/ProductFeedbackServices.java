package com.marjlow.ecommerce.services;

import com.marjlow.ecommerce.dto.ProductFeedbackRepository;
import com.marjlow.ecommerce.models.Product;
import com.marjlow.ecommerce.models.ProductFeedback;
import com.marjlow.ecommerce.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ProductFeedbackServices {
    private ProductFeedbackRepository feedbackRepo;
    private UserServices userServices;
    private ProductServices productServices;

    @Autowired
    public ProductFeedbackServices(ProductFeedbackRepository feedbackRepo, UserServices userServices,
                                   ProductServices productServices) {
        this.feedbackRepo = feedbackRepo;
        this.productServices = productServices;
        this.userServices = userServices;
    }

    public String addProductFeedback(String username, String productName, String feedback, String productStar ) {
        String message = "success";
        try {
            User user = userServices.getCustomerInfo(username);
            Product product = productServices.findProduct(productName);
            ProductFeedback productFeedback = new ProductFeedback();
            productFeedback.setCustomer(user);
            productFeedback.setFeedback(feedback);
            productFeedback.setProduct(product);
            productFeedback.setFeedbackSentiment(productStar);

            feedbackRepo.save(productFeedback);
        } catch (Exception e) {
            message = e.getMessage();
        }
        return message;
    }

}
