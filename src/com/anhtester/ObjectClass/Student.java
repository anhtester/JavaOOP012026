package com.anhtester.ObjectClass;

public class Student {

   int id;
   String name;
   int age;
   String gender;

   public Student(int id, String name, int age, String gender) {
      this.id = id;
      this.name = name;
      this.age = age;
      this.gender = gender;
   }

   public void displayInfo() {
      System.out.println("ID: " + id);
      System.out.println("Name: " + name);
      System.out.println("Age: " + age);
      System.out.println("Gender: " + gender);
   }

}
