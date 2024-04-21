package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LegoFlowerController {
    
    @GetMapping("/legoFlowers")
    public List<LegoFlower> greeting() {
        LegoFlower sunflower = new LegoFlower("sunflower", 200, "hard");
        LegoFlower tulip = new LegoFlower("tulip", 100, "medium");
        LegoFlower primrose = new LegoFlower("primrose", 50, "easy");

        return List.of(sunflower, tulip, primrose);
    }
}
