package com.anhtester.TinhTruTuong;

public interface BrowserFactory {
   void createBrowser();

   void createBrowser(String browserName);

   void closeBrowser();

   void setupWindowSize(String width, String height);
}
