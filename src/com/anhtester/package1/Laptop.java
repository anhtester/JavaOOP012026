package com.anhtester.package1;

import com.anhtester.PhamViTruyCap.Computer;

public class Laptop extends Computer {

   public static void main(String[] args) {
      Laptop laptop = new Laptop();
      laptop.getComputerInfo(); //Được do kế thừa từ Computer
   }

}
