package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class MtsByPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public MtsByPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void selectServicePaymentOptions() {
        WebElement selectButton = driver.findElement(By.className("select__header"));

        for (int i = 0; i < 4; i++) {
            selectButton.click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("select__list")));

            WebElement selectList = driver.findElement(By.className("select__list"));
            List<WebElement> listItems = selectList.findElements(By.tagName("li"));

            WebElement itemSelected = listItems.get(i);
            itemSelected.click();
        }
    }

    public void selectCommunicationService(String phoneValue, String sumValue) {
        WebElement phone = driver.findElement(By.id("connection-phone"));
        phone.click();
        phone.sendKeys(phoneValue);

        WebElement sum = driver.findElement(By.id("connection-sum"));
        sum.click();
        sum.sendKeys(sumValue);

        WebElement button = driver.findElement(By.xpath("//*[@id='pay-connection']/button"));
        button.click();
    }
}

