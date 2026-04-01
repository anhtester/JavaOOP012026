package com.anhtester.TinhTruTuong;

public abstract class DemoAbstractClass {

   // Giống Interface - khi có dùng từ khoá abstract
   abstract public void enterEmail(String email);
   abstract public void enterPassword(String password);

   // Khác Interface
   public void clickLoginButton() {
      System.out.println("Click vào nút Login");
   }

}
