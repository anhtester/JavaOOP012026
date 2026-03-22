package com.anhtester.TinhKeThua;

public class Person {

   public String name;
   public int age;
   public float height;

   public Person(String name, int age, float height) {
      this.name = name;
      this.age = age;
      this.height = height;
   }

   public void getInfo() {
      System.out.println("Đây là class cha Person !!");
      System.out.println("Name:" + this.name);
      System.out.println("Age:" + this.age);
      System.out.println("Height:" + this.height);
   }
}