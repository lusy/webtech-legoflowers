package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LegoFlowerController {
    
    @GetMapping("/noLegoFlowers")
    public ResponseEntity<List<LegoFlower>> notFound() {
        LegoFlower sunflower = new LegoFlower("sunflower", 200, "hard");
        LegoFlower tulip = new LegoFlower("tulip", 100, "medium");
        LegoFlower primrose = new LegoFlower("primrose", 50, "easy");

        return ResponseEntity.notFound().build();
    }

    @GetMapping("/legoFlowers")
    public ResponseEntity<List<LegoFlower>> listFlowers() {
        LegoFlower sunflower = new LegoFlower("sunflower", 200, "hard");
        LegoFlower tulip = new LegoFlower("tulip", 100, "medium");
        LegoFlower primrose = new LegoFlower("primrose", 50, "easy");

        return ResponseEntity.ok(List.of(sunflower, tulip, primrose));
    }
}
