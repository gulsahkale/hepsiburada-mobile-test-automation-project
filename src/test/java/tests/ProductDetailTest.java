package tests;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProductDetailTest extends AbstractTest {

    @Test
    public void addSuperOfferProductToCart() {
        app.homeScreen().openSuperOfferProductListScreen();
        app.superOfferProductListScreen().findProductAndOpenProductDetailsScreen();
        app.productDetailsScreen().openProductImagesScreen();
        app.productImagesScreen().swipeImage();
        app.productImagesScreen().returnBackToProductDetailsScreen();
        String productName = app.productDetailsScreen().getProductName();
        app.productDetailsScreen().addToCart();
        app.productDetailsScreen().openCartScreen();
        assertThat(app.cartScreen().findProductName(), is(productName));
    }
}
