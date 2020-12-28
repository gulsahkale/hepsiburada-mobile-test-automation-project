package screens.product;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import screens.AbstractScreen;

import java.time.Duration;

public class ProductImagesScreen extends AbstractScreen {

    @AndroidFindBy(id = "imagePager")
    private MobileElement imageSlider;

    public ProductImagesScreen(AppiumDriver driver) {
        super(driver);
    }

    public void swipeImage() {
        waitUntil(ExpectedConditions.visibilityOf(imageSlider));
        Dimension size = driver.manage().window().getSize();
        int startX = (int) (size.width * 0.90);
        int endX = (int) (size.width * 0.10);
        new TouchAction(driver)
                .press(PointOption.point(startX, imageSlider.getCenter().getY()))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
                .moveTo(PointOption.point(endX, imageSlider.getCenter().getY()))
                .release()
                .perform();
    }

    public void returnBackToProductDetailsScreen() {
        driver.navigate().back();
    }
}
