import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.example.config.pages.ProductPage.productNames;
import static org.example.config.pages.ProductPage.productPrices;

public class BasketTest extends BaseTest {

    @Test
    public void checkBasket() {
        homePage
                .clickOnFirstCardProduct();
        productPage
                .selectSizeIfExist()
                .saveProductName()
                .saveProductPriceWithoutWbWallet()
                .addToBasket()
                .returnToHomePage();
        homePage
                .clickOnSecondCardProduct();
        productPage
                .selectSizeIfExist()
                .saveProductName()
                .saveProductPriceWithoutWbWallet()
                .addToBasket()
                .returnToHomePage();
        homePage
                .clickOnThirdCardProduct();
        productPage
                .selectSizeIfExist()
                .saveProductName()
                .saveProductPriceWithoutWbWallet()
                .addToBasket()
                .waitBasketBubbleEqualsThree()
                .goToBasket();

        Assertions.assertThat(basketPage.getProductNames()).containsAll(productNames);
        Assertions.assertThat(basketPage.getProductPrices()).containsAll(productPrices);
        Assertions.assertThat(basketPage.getTotalSum()).isEqualTo(productPage.getSumOfProductPrices());
    }
}