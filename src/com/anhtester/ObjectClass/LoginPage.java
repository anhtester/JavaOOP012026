package com.anhtester.ObjectClass;

public class LoginPage {

   public void loginCRM(String email, String password) {
      System.out.println("Đăng nhập vào CRM với email: " + email + " và password: " + password);
   }

   public void verifyLoginSuccess() {
      System.out.println("Đăng nhập thành công!");
   }

   public void verifyLoginFailed() {
      System.out.println("Đăng nhập thất bại! Vui lòng kiểm tra lại email và password.");
   }

}
