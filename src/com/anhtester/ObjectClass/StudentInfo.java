package com.anhtester.ObjectClass;

public class StudentInfo {
   public static void main(String[] args) {

      Student student1 = new Student(111, "Hồng", 25, "Nữ");
      student1.displayInfo();

      Student student2 = new Student(222, "Lan", 30, "Nữ");
      student2.displayInfo();

      Student student3 = new Student(333, "Tuấn", 27, "Nam");
      student3.displayInfo();
   }
}
