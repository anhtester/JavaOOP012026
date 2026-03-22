package com.anhtester.PhamViTruyCap;

import java.util.Locale;

public class Employee {

   //Phạm vi truy cập private: Chỉ có thể truy cập trong class này

   private String name;
   private int age; //Call API từ nhà nước

   public Employee(String name, int age) {
      this.name = name;
      this.age = age;
   }

   public void getInfo() {
      System.out.println("Name: " + name.toUpperCase());
      System.out.println("Age: " + age);
   }

   public void displayGiaVang() {
      System.out.println("Giá vàng hôm nay là: " + age + " triệu đồng/lượng");
   }

}
