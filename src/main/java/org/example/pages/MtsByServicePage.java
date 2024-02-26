package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MtsByServicePage {
    private WebDriver driver;

    public MtsByServicePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHeaderText() {
        WebElement container = driver.findElement(By.className("main"));
        WebElement header = container.findElement(By.className("container-fluid"));
        return header.getText();
    }
}
