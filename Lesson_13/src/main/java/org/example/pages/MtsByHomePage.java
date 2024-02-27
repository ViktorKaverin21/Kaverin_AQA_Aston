package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MtsByHomePage {
    private WebDriver driver;

    public MtsByHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitleName() {
        WebElement titleName = driver.findElement(By.className("pay__wrapper")).findElement(By.tagName("h2"));
        return titleName.getText();
    }

    public int getPaymentSystemLogosCount() {
        WebElement logos = driver.findElement(By.className("pay__partners")).findElement(By.tagName("ul"));
        List<WebElement> elements = logos.findElements(By.tagName("li"));
        return elements.size();
    }

    public String getMoreAboutServiceLinkHref() {
        WebElement link = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/a"));
        return link.getAttribute("href");
    }

    public void clickMoreAboutServiceLink() {
        WebElement link = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/a"));
        link.click();
    }

    public void enterPhoneNumber(String phoneNumber) {
        WebElement phone = driver.findElement(By.id("connection-phone"));
        phone.click();
        phone.sendKeys(phoneNumber);
    }

    public void enterPaymentSum(String paymentSum) {
        WebElement sum = driver.findElement(By.id("connection-sum"));
        sum.click();
        sum.sendKeys(paymentSum);
    }

    public void clickContinueButton() {
        WebElement button = driver.findElement(By.xpath("//*[@id=\"pay-connection\"]/button"));
        button.click();
    }
}
