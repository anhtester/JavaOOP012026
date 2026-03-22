package com.anhtester.TinhDongGoi;

public class ProjectTest {
   public static void main(String[] args) {

      BaseTest baseTest = new BaseTest();

      baseTest.setDriver("Edge");
      baseTest.setHeadless(true);
      baseTest.setReport(true);

      System.out.println("Driver đang sử dụng: " + baseTest.getDriver());
      System.out.println("Chế độ headless: " + baseTest.isHeadless());
      System.out.println("Báo cáo kết quả: " + baseTest.isReport());

   }
}
