package screens.home;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import screens.AbstractScreen;

public class HomeScreen extends AbstractScreen {

    @AndroidFindBy(id = "account_icon_frame")
    private MobileElement accountScreenButton;

    @AndroidFindBy(id = "close_button")
    private MobileElement closeAnimationButton;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().resourceIdMatches(\"com.pozitron.hepsiburada:id/dod_all\"))")
    private MobileElement seeAllSuperOffersButton;

    public HomeScreen(AppiumDriver driver) {
        super(driver);
    }

    public void openAccountScreen() {
        closeAnimation();
        accountScreenButton.click();
    }

    public void openSuperOfferProductListScreen() {
        closeAnimation();
        seeAllSuperOffersButton.click();
    }

    private void closeAnimation() {
        waitUntil(ExpectedConditions.visibilityOf(closeAnimationButton));
        closeAnimationButton.click();
    }
}
