package screens.product;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import screens.AbstractScreen;

import java.util.List;

public class SuperOfferProductListScreen extends AbstractScreen {

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().resourceIdMatches(\"com.pozitron.hepsiburada:id/pi_product_list_item_image\"))")
    private MobileElement sliderPagination;

    public SuperOfferProductListScreen(AppiumDriver driver) {
        super(driver);
    }

    public void findProductAndOpenProductDetailsScreen() {
        if (sliderPagination.isDisplayed()) {
            List<MobileElement> imageContainers = driver.findElements(By.id("rl_product_list_item_image"));
            imageContainers.forEach(container -> {
                List<MobileElement> sliderPagination = container.findElements(By.id("pi_product_list_item_image"));
                if (sliderPagination.size() > 0) {
                    MobileElement productImage = container.findElement(By.className("android.widget.ImageView"));
                    productImage.click();
                }
            });
        }
    }
}
