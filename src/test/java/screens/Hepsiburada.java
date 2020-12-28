package screens;

import io.appium.java_client.AppiumDriver;
import screens.home.HomeScreen;
import screens.login.AccountScreen;
import screens.login.LoginScreen;
import screens.login.UserDetailsScreen;
import screens.product.CartScreen;
import screens.product.ProductDetailsScreen;
import screens.product.ProductImagesScreen;
import screens.product.SuperOfferProductListScreen;

public class Hepsiburada {
    private final AppiumDriver driver;

    public Hepsiburada(AppiumDriver driver) {
        this.driver = driver;
    }

    public HomeScreen homeScreen() {
        return new HomeScreen(driver);
    }

    public AccountScreen accountScreen() {
        return new AccountScreen(driver);
    }

    public LoginScreen loginScreen() {
        return new LoginScreen(driver);
    }

    public UserDetailsScreen userDetailsScreen() {
        return new UserDetailsScreen(driver);
    }

    public SuperOfferProductListScreen superOfferProductListScreen() {
        return new SuperOfferProductListScreen(driver);
    }

    public ProductDetailsScreen productDetailsScreen() {
        return new ProductDetailsScreen(driver);
    }

    public ProductImagesScreen productImagesScreen() {
        return new ProductImagesScreen(driver);
    }

    public CartScreen cartScreen() {
        return new CartScreen(driver);
    }

    public void quit() {
        driver.quit();
    }
}
