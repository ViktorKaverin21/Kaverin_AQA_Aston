package org.example.config.pages;

import org.example.config.BaseWebDriver;
import org.example.config.locators.HeaderLocators;
import org.openqa.selenium.WebDriver;

public class Header extends BasePage {

    public WebDriver driver = BaseWebDriver.getDriverInstance();

    public Header clickOnBasket() {
        driver.findElement(HeaderLocators.basketButtonLocator).click();
        return this;
    }

    public void waitBasketBubbleEqualsThree() {
        waitTextToBe(HeaderLocators.basketBubbleLocator, "3");
    }

}