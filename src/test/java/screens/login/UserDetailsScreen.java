package screens.login;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import screens.AbstractScreen;

public class UserDetailsScreen extends AbstractScreen {

    @AndroidFindBy(id = "etUserFirstName")
    private MobileElement firstNameInput;

    @AndroidFindBy(id = "btnOkSend")
    private MobileElement updateButton;

    @AndroidFindBy(id = "android:id/message")
    private MobileElement successMessage;

    @AndroidFindBy(id = "android:id/button1")
    private MobileElement alertButton;

    @AndroidFindBy(id = "iv_toolbar_user_account_menu")
    private MobileElement accountButton;

    public UserDetailsScreen(AppiumDriver driver) {
        super(driver);
    }

    public void changeFirstName(String newFirstName) {
        firstNameInput.clear();
        firstNameInput.setValue(newFirstName);
        updateButton.click();
        waitUntil(ExpectedConditions.visibilityOf(alertButton));
        alertButton.click();
    }

    public void openAccountScreen() {
        accountButton.click();
    }

    public String getFirstName() {
        return firstNameInput.getText();
    }
}
