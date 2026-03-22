package com.anhtester.TinhKeThua;

import com.anhtester.TinhKeThua.LoginPage;

public class LoginTest {

   public static void main(String[] args) {

      LoginPage loginPage = new LoginPage("Chrome");
      loginPage.loginCRM("admin@example.com", "123456");
      loginPage.verifyLoginSuccess();
      loginPage.logout(); // Gọi hàm từ class cha BasePage
      loginPage.searchCommon("");
   }

}
