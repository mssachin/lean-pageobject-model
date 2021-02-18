package com.lean.pageobject.model.pageobjects;

import org.openqa.selenium.By;

public class OrderHistoryPage {
    public static final By FIRST_ITEM_IN_TABLE = By.xpath("//tr[@class='first_item ']");
    public static final By FIRST_ITEM_IN_TABLE_PRICE_COLUMN = By.xpath("//tr[@class='first_item ']/td[3]");

}
