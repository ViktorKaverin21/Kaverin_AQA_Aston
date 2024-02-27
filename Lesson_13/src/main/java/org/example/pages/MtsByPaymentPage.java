package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MtsByPaymentPage {
    private WebDriver driver;

    public MtsByPaymentPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isPayButtonDisplayed() {
        WebElement buttonPay = driver.findElement(By.className("card-page__card"))
                .findElement(By.tagName("button"));
        return buttonPay.isDisplayed();
    }
}