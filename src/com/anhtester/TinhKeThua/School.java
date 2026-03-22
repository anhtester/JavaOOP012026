package com.anhtester.TinhKeThua;

public class School extends Student {
   public School(String name, int age, String address, float height, float weight) {
      super(name, age, address, height, weight);
   }

   public void testGetInfoAll(){
      getWeight();
      getAddress();
      getInfo(); // Gọi phương thức của lớp (Person) thông qua lớp Student
   }
}
