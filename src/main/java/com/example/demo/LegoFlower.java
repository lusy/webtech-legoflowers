package com.example.demo;

public class LegoFlower {
    private String name;
    private int numPieces;
    private String difficulty;
    private boolean available;

   public LegoFlower(String name, int numPieces, String difficulty) {
     this.name = name;
     this.numPieces = numPieces;
     this.difficulty = difficulty;
     this.available = true;
   }

   public String getName() {
     return this.name;
   }

   public int getNumPieces() {
     return this.numPieces;
   }

   public String getDifficulty() {
     return this.difficulty;
   }

   public boolean isAvailable() {
     return this.available;
   }
    
}
