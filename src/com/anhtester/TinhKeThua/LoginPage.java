package com.anhtester.TinhKeThua;

public class LoginPage extends BasePage {

   public LoginPage(String browser) {
      super(browser); //Đảm bảo cấu trúc của class BasePage được khởi tạo đúng cách

      System.out.println("Khởi tạo driver điều khiển trình duyệt: " + browser);
      if (browser.equalsIgnoreCase("chrome")) {
         System.out.println("Khởi tạo driver Chrome");
         //WebDriver driver = new ChromeDriver();
      } else if (browser.equalsIgnoreCase("firefox")) {
         System.out.println("Khởi tạo driver Firefox");
         //WebDriver driver = new FirefoxDriver();
      } else if (browser.equalsIgnoreCase("edge")) {
         System.out.println("Khởi tạo driver Edge");
         //WebDriver driver = new EdgeDriver();
      } else {
         System.out.println("Trình duyệt không được hỗ trợ! Vui lòng chọn Chrome, Firefox hoặc Edge.");
      }

      System.out.println("Navigate to URL: https://anhtester.com");

   }

   public void loginCRM(String email, String password) {
      System.out.println("Đăng nhập vào CRM với email: " + email + " và password: " + password);


      logout(); // Gọi hàm từ class cha BasePage
   }

   public void verifyLoginSuccess() {
      System.out.println("Đăng nhập thành công!");
   }

   public void verifyLoginFailed() {
      System.out.println("Đăng nhập thất bại! Vui lòng kiểm tra lại email và password.");
   }

}
