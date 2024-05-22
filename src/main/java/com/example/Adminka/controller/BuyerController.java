package com.example.Adminka.controller;



import com.example.popitka.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class BuyerController {
    @GetMapping("/get_all_userss")
    public List<User> getAllBuyers() {
        List <User> buyer = new ArrayList<>();
        User buyer1 = new User(1, "Ivan", 43254435);
        User buyer2 = new User(2, "Semen", 32432432);
        buyer.add(buyer1);
        buyer.add(buyer2);
        return buyer;
    }
}
