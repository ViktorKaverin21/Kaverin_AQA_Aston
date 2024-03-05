package org.example.config.pages;

import static org.example.config.locators.HomeLocators.*;

public class HomePage extends BasePage {

    public HomePage clickOnFirstCardProduct() {
        waitVisibilityOfElement(driver.findElement(firstProductCardLocator)).click();
        return this;
    }

    public HomePage clickOnSecondCardProduct() {
        driver.findElement(secondProductCardLocator).click();
        return this;
    }

    public HomePage clickOnThirdCardProduct() {
        driver.findElement(thirdProductCardLocator).click();
        return this;
    }
}