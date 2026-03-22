package com.anhtester.Contructor;

public class LoginTest {

   public static void main(String[] args) {

      LoginPage loginPage1 = new LoginPage(); //Khởi tạo đối tượng lớp (chiếm 1 vùng nhớ nhất định)
      loginPage1.loginCRM("admin@example.com", "123456");
      loginPage1.verifyLoginSuccess();

      System.out.println("----------------------------");

      LoginPage loginPage2 = new LoginPage();
      loginPage2.loginCRM("customer@example.com", "123");
      loginPage2.verifyLoginFailed();

   }

}
