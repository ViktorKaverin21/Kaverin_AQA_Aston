import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.pages.MtsByHomePage;
import org.example.pages.MtsByPaymentPage;
import org.example.pages.MtsByServicePage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class MtsByTests {
    static WebDriver driver;

    @BeforeAll
    static void setup() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void open() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.mts.by/");

        WebElement applyCookies = driver.findElement(By.id("cookie-agree"));
        applyCookies.click();
    }

    @Test
    @DisplayName("Checking the block name")
    void test1() {
        MtsByHomePage homePage = new MtsByHomePage(driver);
        Assertions.assertEquals("Онлайн пополнение\nбез комиссии", homePage.getTitleName());
    }

    @Test
    @DisplayName("Checking for payment system logos")
    void test2() {
        MtsByHomePage homePage = new MtsByHomePage(driver);
        Assertions.assertNotEquals(0, homePage.getPaymentSystemLogosCount());
    }

    @Test
    @DisplayName("Checking the operation of the «More about the service» link")
    void test3() {
        MtsByHomePage homePage = new MtsByHomePage(driver);
        String linkHref = homePage.getMoreAboutServiceLinkHref();
        homePage.clickMoreAboutServiceLink();

        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.urlContains(linkHref));
        Assertions.assertEquals(linkHref, driver.getCurrentUrl());

        MtsByServicePage servicePage = new MtsByServicePage(driver);
        Assertions.assertFalse(servicePage.getHeaderText().isEmpty());
    }

    @Test
    @DisplayName("Checking the operation of the «Continue» button")
    void test4() {
        MtsByHomePage homePage = new MtsByHomePage(driver);
        homePage.enterPhoneNumber("297777777");
        homePage.enterPaymentSum("15");
        homePage.clickContinueButton();

        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".bepaid-iframe")));
        WebElement paidFrame = driver.findElement(By.cssSelector(".bepaid-iframe"));

        driver.switchTo().frame(paidFrame);

        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.className("card-page__card")));

        MtsByPaymentPage paymentPage = new MtsByPaymentPage(driver);
        Assertions.assertTrue(paymentPage.isPayButtonDisplayed());
    }

    @AfterEach
    void close() {
        driver.quit();
    }
}