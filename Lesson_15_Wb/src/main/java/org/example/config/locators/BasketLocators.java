package org.example.config.locators;

import org.openqa.selenium.By;

public class BasketLocators {

    public static By totalSumLocator = By.cssSelector("[data-link~='totalPaymentFeeAmount']");
    public static By basketProductNameLocator = By.cssSelector(".good-info__good-name");
    public static By basketProductPriceLocator = By.cssSelector(".list-item__price-new");

}