package com.anhtester.TinhTruTuong;

public class UseAbstractClass extends DemoAbstractClass {
   @Override
   public void enterEmail(String email) {
      System.out.println("Nhập email: " + email);
   }

   @Override
   public void enterPassword(String password) {
        System.out.println("Nhập password: " + password);
   }

   public void testLoginHRM(){
      enterEmail("admin@example.com"); //Khai báo nội dung lại
      enterPassword("123456");
      clickLoginButton(); //Gọi trực tiếp sử dụng
   }

   public static void main(String[] args) {
        UseAbstractClass useAbstractClass = new UseAbstractClass();
        useAbstractClass.testLoginHRM();
   }
}
