package screens.product;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import screens.AbstractScreen;

import java.util.concurrent.TimeUnit;

public class CartScreen extends AbstractScreen {

    public CartScreen(AppiumDriver driver) {
        super(driver);
    }

    public String findProductName() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        MobileElement mobileElement = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.ListView/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.TextView");
        return mobileElement.getText();
    }
}
