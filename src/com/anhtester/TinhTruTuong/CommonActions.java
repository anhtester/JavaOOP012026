package com.anhtester.TinhTruTuong;

public interface CommonActions {
   void clickElement();
   void clickElement(String elementName);
   void setText(String text, String elementName);
   String getText(String element);
   void selectDropdown(String dropdownName, String option);
}
