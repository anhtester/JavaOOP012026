package com.anhtester.TinhDongGoi;

public class BaseTest {
   private String driver;
   private boolean headless;
   private boolean report;

   public BaseTest() {
   }

   public BaseTest(String driver, boolean headless, boolean report) {
      this.driver = driver;
      this.headless = headless;
      this.report = report;
   }

   public BaseTest(String driver) {
      this.driver = driver;
   }

   public String getDriver() {
      return driver;
   }

   public void setDriver(String driver) {
      this.driver = driver;
   }

   public boolean isHeadless() {
      return headless;
   }

   public void setHeadless(boolean headless) {
      this.headless = headless;
   }

   public boolean isReport() {
      return report;
   }

   public void setReport(boolean report) {
      this.report = report;
   }

   //Khai báo thêm các hàm Private hoặc Public tuỳ nhu cầu sử dụng

   private boolean callAPIJira(String projectName, String id, String status){
      //Gọi API đến Jira để tạo mới một issue với projectName và id
      return true;
   }

   public void generateResult(String status){
      // Đưa thông tin của test case
      callAPIJira("CRM", "CR1001", "Passed");
   }

}
