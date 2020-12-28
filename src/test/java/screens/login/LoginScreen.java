package screens.login;


import datas.User;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import screens.AbstractScreen;

public class LoginScreen extends AbstractScreen {
    @AndroidFindBy(id = "etLoginEmail")
    private MobileElement emailTextField;

    @AndroidFindBy(id = "etLoginPassword")
    private MobileElement passwordTextField;

    @AndroidFindBy(id = "btnLoginLogin")
    private MobileElement loginButton;

    @AndroidFindBy(id = "alertTitle")
    private MobileElement alertTitle;

    @AndroidFindBy(id = "android:id/button1")
    private MobileElement alertButton;

    public LoginScreen(AppiumDriver driver) {
        super(driver);
    }

    public void enterEmailAndPasswordAndLogin(User user) {
        emailTextField.sendKeys(user.getEmail());
        passwordTextField.sendKeys(user.getPassword());
        loginButton.click();
        waitUntil(ExpectedConditions.visibilityOf(alertButton));
        alertButton.click();
    }
}
