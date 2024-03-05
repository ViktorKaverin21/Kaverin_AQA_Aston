import org.example.config.BaseWebDriver;
import org.example.config.ConfigurationProperties;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import org.example.config.pages.BasketPage;
import org.example.config.pages.HomePage;
import org.example.config.pages.ProductPage;

abstract class BaseTest {

    static {
        BaseWebDriver.initDriver();
    }

    protected HomePage homePage = new HomePage();
    protected ProductPage productPage = new ProductPage();
    protected BasketPage basketPage = new BasketPage();

    @BeforeClass
    public static void setUp() {
        BaseWebDriver.getDriverInstance().get(ConfigurationProperties.getWildberriesHomePage());
    }

    @AfterClass
    public static void tearDown() {
        BaseWebDriver.closeDriverInstance();
    }
}