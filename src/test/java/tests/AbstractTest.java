package tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import screens.Hepsiburada;

import java.net.MalformedURLException;
import java.net.URL;

public abstract class AbstractTest {
    private static final String APPIUM_SERVER_URL = "http://127.0.0.1:4723/wd/hub";
    protected Hepsiburada app;

    @Before
    public void setup() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 5X");
        capabilities.setCapability(MobileCapabilityType.UDID,"057cc2100405");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
        capabilities.setCapability(MobileCapabilityType.APPLICATION_NAME, "hepsiburada");
        capabilities.setCapability("appPackage","com.pozitron.hepsiburada");
        capabilities.setCapability("appActivity", "com.hepsiburada.ui.startup.SplashActivity");
        app = new Hepsiburada(new AndroidDriver(new URL(APPIUM_SERVER_URL), capabilities));
    }

    @After
    public void tearDown(){
        if(app != null)
            app.quit();
    }
}