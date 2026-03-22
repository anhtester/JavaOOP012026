# ☕ Java OOP - Khóa học Selenium Java 01/2026 (Anh Tester)

Chào mừng các bạn đến với kho lưu trữ mã nguồn học Lập trình Hướng đối tượng (OOP) trong Java. Đây là dự án thực hành nằm trong lộ trình của **Khóa học Automation Testing với Selenium Java 01/2026** do **Anh Tester** hướng dẫn. 🚀

## 📚 Nội dung kiến thức

Dự án này bao gồm các package tương ứng với từng chủ đề cốt lõi của OOP trong Java, được thiết kế theo hướng áp dụng thực tế vào Automation Test (đặc biệt là mô hình Page Object Model):

- 📦 **`com.anhtester.ObjectClass`**: Tìm hiểu về Lớp (Class) và Đối tượng (Object) cơ bản.
- 📦 **`com.anhtester.Contructor`**: Cách khởi tạo đối tượng với Hàm tạo (Constructor), bao gồm constructor mặc định và có tham số.
- 📦 **`com.anhtester.PhamViTruyCap`**: Phân biệt và ứng dụng các phạm vi truy cập: `private`, `default`, `protected`, `public`.
- 📦 **`com.anhtester.TinhKeThua`**: Tính kế thừa (Inheritance) dùng từ khóa `extends` và `super`, ứng dụng vào việc xây dựng cấu trúc `BasePage` và `BaseTest`.
- 📦 **`com.anhtester.TinhDongGoi`**: Tính đóng gói (Encapsulation) bảo vệ dữ liệu bằng cách sử dụng `private` kết hợp với các hàm `getter/setter`.
- 📦 **`com.anhtester.TinhDaHinh`** *(Đang tiến hành/hoặc sắp cập nhật)*: Tính đa hình (Polymorphism) thông qua việc ghi đè (Overriding) và nạp chồng (Overloading) các phương thức.
- 📦 **`com.anhtester.TinhTruuTuong`** *(Đang tiến hành/hoặc sắp cập nhật)*: Tính trừu tượng (Abstraction) Ẩn đi chi tiết triển khai phía sau, thiết kế bộ quy chuẩn chung dựa trên **Abstract class** và **Interface**.

## 🎯 Ứng dụng vào Automation Testing

Các kiến thức này là nền tảng **bắt buộc phải nắm vững** để có thể xây dựng Automation Framework tốt nhất:
- Dùng **Class & Object** để thiết kế các Page class độc lập trong Page Object Model (POM).
- Dùng **Constructor** để truyền vào đối tượng `WebDriver` dùng chung cho các hàm trong Page.
- Dùng **Inheritance** (Kế thừa) để tạo các lớp cơ sở (BasePage/BaseTest) giúp khởi tạo browser dùng chung và giảm thiểu code trùng lặp.
- Dùng **Encapsulation** để che giấu các bộ định vị Web Elements (`By` locators) ở dạng `private` và cung cấp các hành động `public` gọi ra Test class.
- Dùng **Polymorphism** (Đa hình) để tùy chỉnh/nạp chồng các hàm tác động lên UI linh hoạt hơn (Ví dụ: `click()` và `click(int timeout)`).
- Dùng **Abstraction** (Trừu tượng) để định nghĩa các interface (giao diện) chứa các thao tác chuẩn mực với các Elements hay làm việc với WebDrivers.

## 🛠 Hướng dẫn cài đặt & Sử dụng

Để chạy cấu hình và xem các ví dụ trong dự án này, bạn cần:

1. **Cài đặt JDK**: Đảm bảo máy đã cài đầy đủ Java JDK (Khuyến nghị **JDK 17** hoặc mới nhất LTS).
2. **IDE**: Sử dụng **IntelliJ IDEA** (bản Community hoặc Ultimate đều được). Hoặc có thể dùng VSCode, Antigravity, Cursor...
3. **Clone Project**:
   ```bash
   git clone https://github.com/anhtester/JavaOOP012026.git
   ```
4. Mở folder `JavaOOP012026` bằng IntelliJ IDEA.
5. Mở từng file `*Test.java` (ví dụ: `LoginTest.java`, `Main.java`) và nhấn nút **Run** (biểu tượng ▶️ xanh lá cây) bên cạnh cấu trúc hàm `main` để xem kết quả xuất ra ở màn hình Console.

## 📞 Theo dõi & Liên hệ Anh Tester

Nếu có bất kỳ thắc mắc nào trong quá trình thực hành, mọi người đừng ngần ngại trao đổi nhé:
- 🌐 **Website**: [anhtester.com](https://anhtester.com)
- 📺 **YouTube**: [Anh Tester](https://www.youtube.com/c/AnhTester)
- 💬 **Fanpage**: [Anh Tester](https://www.facebook.com/anhtester)
- 👥 **Group Facebook**: [Cộng đồng Automation Testing Việt Nam](https://www.facebook.com/groups/automationtest)

---
*Chúc các bạn học tốt và sớm master Automation Test! Cố lên nhé!* ❤️
