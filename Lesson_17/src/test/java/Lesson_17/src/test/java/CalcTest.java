import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.qameta.allure.Allure;
import io.qameta.allure.AllureId;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class CalcTest {
    private AndroidDriver<AndroidElement> driver;

    @BeforeTest
    public void setup() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung Galaxy S20+");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.sec.android.app.popupcalculator");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".Calculator");
        capabilities.setCapability(MobileCapabilityType.NO_RESET, true);

        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    }

    @Test
    public void additionTest() {
        WebDriverWait wait = new WebDriverWait(driver, 5);

        try {

            wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.Button[@content-desc='9']"))).click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.Button[@content-desc=\"Плюс\"]"))).click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.Button[@content-desc='3']"))).click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.Button[@content-desc=\"Равно\"]"))).click();

            AndroidElement resultElement = (AndroidElement) wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("com.sec.android.app.popupcalculator:id/calc_edt_formula")));


            String rawResult = resultElement.getAttribute("text");

            String cleanedResult = rawResult.replaceAll("[^0-9,]", "");

            cleanedResult = cleanedResult.replaceAll(",", ".");

            double resultValue = Double.parseDouble(cleanedResult);

            Assert.assertEquals(12.0, resultValue, "Expected result is incorrect");
        } catch (Exception e) {
            Assert.fail("Test failed: " + e.getMessage());
            Allure.addAttachment("Screenshot", new ByteArrayInputStream(driver.getScreenshotAs(OutputType.BYTES)));
        }
    }

    @Test
    public void subtractionTest() {
        WebDriverWait wait = new WebDriverWait(driver, 15);

        try {

            wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.Button[@content-desc='9']"))).click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.Button[@content-desc=\"Минус\"]"))).click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.Button[@content-desc='3']"))).click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.Button[@content-desc=\"Равно\"]"))).click();

            AndroidElement resultElement = (AndroidElement) wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("com.sec.android.app.popupcalculator:id/calc_edt_formula")));


            String rawResult = resultElement.getAttribute("text");

            String cleanedResult = rawResult.replaceAll("[^0-9,]", "");

            cleanedResult = cleanedResult.replaceAll(",", ".");

            double resultValue = Double.parseDouble(cleanedResult);

            Assert.assertEquals(6.0, resultValue, "Expected result is incorrect");
        } catch (Exception e) {
            Assert.fail("Test failed: " + e.getMessage());
            Allure.addAttachment("Screenshot", new ByteArrayInputStream(driver.getScreenshotAs(OutputType.BYTES)));

        }
    }

    @Test
    public void multiplicationTest() {
        WebDriverWait wait = new WebDriverWait(driver, 15);

        try {

            wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.Button[@content-desc='9']"))).click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.Button[@content-desc=\"Умножение\"]"))).click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.Button[@content-desc='3']"))).click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.Button[@content-desc=\"Равно\"]"))).click();

            AndroidElement resultElement = (AndroidElement) wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("com.sec.android.app.popupcalculator:id/calc_edt_formula")));


            String rawResult = resultElement.getAttribute("text");

            String cleanedResult = rawResult.replaceAll("[^0-9,]", "");

            cleanedResult = cleanedResult.replaceAll(",", ".");

            double resultValue = Double.parseDouble(cleanedResult);

            Assert.assertEquals(27.0, resultValue, "Expected result is incorrect");
        } catch (Exception e) {
            Assert.fail("Test failed: " + e.getMessage());
            Allure.addAttachment("Screenshot", new ByteArrayInputStream(driver.getScreenshotAs(OutputType.BYTES)));


        }
    }

    @Test
    public void divisionTest() {
        WebDriverWait wait = new WebDriverWait(driver, 15);

        try {

            wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.Button[@content-desc='9']"))).click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.Button[@content-desc=\"Деление\"]"))).click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.Button[@content-desc='3']"))).click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.Button[@content-desc=\"Равно\"]"))).click();

            AndroidElement resultElement = (AndroidElement) wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("com.sec.android.app.popupcalculator:id/calc_edt_formula")));


            String rawResult = resultElement.getAttribute("text");

            String cleanedResult = rawResult.replaceAll("[^0-9,]", "");

            cleanedResult = cleanedResult.replaceAll(",", ".");

            double resultValue = Double.parseDouble(cleanedResult);

            Assert.assertEquals(3.0, resultValue, "Expected result is incorrect");
        } catch (Exception e) {
            Assert.fail("Test failed: " + e.getMessage());
            Allure.addAttachment("Screenshot", new ByteArrayInputStream(driver.getScreenshotAs(OutputType.BYTES)));
        }
    }

    @Test
    public void zeroDivisionTest() {
        WebDriverWait wait = new WebDriverWait(driver, 15);

        try {

            wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.Button[@content-desc='9']"))).click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.Button[@content-desc=\"Деление\"]"))).click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.Button[@content-desc='0']"))).click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.Button[@content-desc=\"Равно\"]"))).click();

            AndroidElement resultElement = (AndroidElement) wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("com.sec.android.app.popupcalculator:id/snackbar_text")));

            String rawResult = resultElement.getAttribute("text");


            Assert.assertEquals("Нельзя делить на ноль.", rawResult, "Expected result is incorrect");
        } catch (Exception e) {
            Assert.fail("Test failed: " + e.getMessage());
            Allure.addAttachment("Screenshot", new ByteArrayInputStream(driver.getScreenshotAs(OutputType.BYTES)));
        }
    }
}