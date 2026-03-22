package com.anhtester.package1;

import com.anhtester.ObjectClass.LoginPage;
import com.anhtester.PhamViTruyCap.Computer;
import com.anhtester.PhamViTruyCap.Flower;

public class Information {
   public static void main(String[] args) {

      Flower flower = new Flower();
      //flower.getFlowerInfo(); //Không được do khác package

      Computer computer = new Computer();
      //computer.getComputerInfo();  //Không được do khác package NHƯNG không thông qua kế thừa

   }
}
