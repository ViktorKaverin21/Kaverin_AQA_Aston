package org.example.config.locators;

import org.openqa.selenium.By;

public class HomeLocators {
    public static By firstProductCardLocator = By.xpath("(//article[contains(@class, 'product-card')])[1]");
    public static By secondProductCardLocator = By.xpath("(//article[contains(@class, 'product-card')])[2]");
    public static By thirdProductCardLocator = By.xpath("(//article[contains(@class, 'product-card')])[3]");

}

