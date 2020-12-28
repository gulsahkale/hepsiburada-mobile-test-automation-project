package screens.login;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import screens.AbstractScreen;

public class AccountScreen extends AbstractScreen {

    @AndroidFindBy(id = "llUserAccountLogin")
    private MobileElement signInButton;

    @AndroidFindBy(id = "tvUserAccountUsername")
    private MobileElement fullName;

    public AccountScreen(AppiumDriver driver) {
        super(driver);
    }

    public void clickSignInButton() {
        signInButton.click();
    }

    public void openUserDetailsScreen() {
        fullName.click();
    }

    public boolean isLoggedIn() {
        return fullName.isDisplayed();
    }
}
