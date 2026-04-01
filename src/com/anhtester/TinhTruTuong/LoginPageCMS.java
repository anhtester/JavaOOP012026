package com.anhtester.TinhTruTuong;

public class LoginPageCMS implements LoginActions {

   @Override
   public void enterEmail(String email) {
      System.out.println("Nhập email: " + email);
   }

   @Override
   public void enterPassword(String password) {

   }

   @Override
   public void clickLoginButton() {

   }

   public void forgotPassword(String email) {
      System.out.println("Forgot password: " + email);
   }
}
