package com.anhtester.TinhDongGoi;

public class CustomerTest {

   public static void main(String[] args) {

      BaseTest baseTest = new BaseTest("Edge", true, true);

      //baseTest.setDriver("ChromeDriver");

      System.out.println("Driver đang sử dụng: " + baseTest.getDriver());

   }

}
