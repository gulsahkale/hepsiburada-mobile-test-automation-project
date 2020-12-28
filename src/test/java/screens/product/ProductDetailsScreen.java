package screens.product;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import screens.AbstractScreen;

public class ProductDetailsScreen extends AbstractScreen {

    @AndroidFindBy(id = "imagePager")
    private MobileElement imageSlider;

    @AndroidFindBy(id = "product_detail_add_to_cart")
    private MobileElement addToCartButton;

    @AndroidFindBy(id = "goBasketBtn")
    private MobileElement goToCartButton;

    @AndroidFindBy(id = "productName")
    private MobileElement productName;

    public ProductDetailsScreen(AppiumDriver driver) {
        super(driver);
    }

    public void openProductImagesScreen() {
        waitUntil(ExpectedConditions.visibilityOf(imageSlider));
        imageSlider.click();
    }

    public void addToCart() {
        addToCartButton.click();
    }

    public void openCartScreen() {
        waitUntil(ExpectedConditions.visibilityOf(goToCartButton));
        goToCartButton.click();
    }

    public String getProductName() {
        return productName.getText();
    }
}
