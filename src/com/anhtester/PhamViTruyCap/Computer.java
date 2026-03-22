package com.anhtester.PhamViTruyCap;

public class Computer {

   protected String ramName = "DDR5";
   protected String chipName = "Intel Ultra 9";

   protected void getComputerInfo(){
      System.out.println("RAM: " + ramName);
      System.out.println("Chip: " + chipName);
   }

}
