package Encapsulation_exercise.ShoppingSpree;

import java.util.List;

public class Product {
   private String name;
   private double cost;

   Product(String name, double cost){
      this.setName(name);
      this.setCost(cost);

   }

   private void setName(String name) {
      if(name==null && name.trim().isEmpty()){
         throw new IllegalArgumentException("Name cannot be empty");
      }
      this.name = name;
   }

   public String getName() {
      return name;
   }

   private void setCost(double cost) {
      if(cost < 0){
         throw new IllegalArgumentException("Money cannot be negative");
      }
      this.cost = cost;
   }

   public double getCost() {
      return cost;
   }
}

