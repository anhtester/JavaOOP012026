package com.anhtester.ObjectClass;

public class DemoAnnonymous {

   public static void main(String[] args) {

      new LoginPage().loginCRM("customer@example.com", "123");
      new LoginPage().verifyLoginFailed();

      LoginPage loginPage = new LoginPage();
      loginPage.loginCRM("customer@example.com", "123");
      loginPage.verifyLoginFailed();

   }

}
