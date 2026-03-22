package com.anhtester.TinhKeThua;

public class Student extends Person {

   private String address;
   private float weight;

   public Student(String name, int age, String address, float height, float weight) {
      super(name, age, height); //Gọi constructor của lớp cha (Person)
      this.address = address;
      this.weight = weight;
   }

   //2 hàm này của class Student
   public String getAddress() {
      return address;
   }

   public float getWeight() {
      return weight;
   }

   public void getInfo() {
      super.getInfo(); //Gọi phương thức của lớp cha (Person)

      System.out.println("Đây là class con Student !!");
//      System.out.println("Name: " + this.name);
//      System.out.println("Age: " + this.age);
//      System.out.println("Height: " + this.height);
      System.out.println("Weight: " + this.weight);
      System.out.println("Address: " + this.address);
   }

   public void testGetInfoOfStudent() {

      Person person = new Person("AnhTester", 30, 1.75f);
      person.getInfo();

      super.getInfo(); //Gọi phương thức của lớp cha (Person)
   }

   public void testTinhDiemTrungBinh() {

      Person person = new Person("AnhTester", 30, 1.75f);
      person.getInfo();

      getInfo(); //Gọi phương thức của lớp hiện tại (Student) sẽ ưu tiên hơn so với lớp cha (Person)
      super.getInfo(); //Gọi phương thức của lớp cha (Person)
   }

   public static void main(String[] args) {
      Student student = new Student("AnhTester", 30, "Ha Noi", 1.75f, 70.0f);
      student.getInfo();
   }

}