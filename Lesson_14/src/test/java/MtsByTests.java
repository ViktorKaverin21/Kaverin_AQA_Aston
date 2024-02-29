import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.pages.CookieHandler;
import org.example.pages.MtsByPage;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MtsByTests {
    static WebDriver driver;

    @BeforeAll
    static void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterAll
    static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @BeforeEach
    void applyCookies() {
        driver.get("https://www.mts.by/");
        CookieHandler.applyCookies(driver);
    }

    @Test
    @DisplayName("Checking the labels in the blank fields of each service payment option")
    void test1() {
        MtsByPage mtsByPage = new MtsByPage(driver);
        mtsByPage.selectServicePaymentOptions();
    }

    @Test
    @DisplayName("Correctness check for the Communication services option")
    void test2() {
        MtsByPage mtsByPage = new MtsByPage(driver);
        mtsByPage.selectCommunicationService("297777777", "15");
    }
}

