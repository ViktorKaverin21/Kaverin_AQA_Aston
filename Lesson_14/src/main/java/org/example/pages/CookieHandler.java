package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CookieHandler {
    public static void applyCookies(WebDriver driver) {
        WebElement applyCookies = driver.findElement(By.xpath("//*[@id=\"cookie-agree\"]"));
        applyCookies.click();
    }
}

