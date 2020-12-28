package tests;

import datas.User;
import org.junit.Test;
import utils.Utils;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LoginTest extends AbstractTest {

    @Test
    public void loginWithValidCredentialsAndUpdateFirstName() {
        app.homeScreen().openAccountScreen();
        app.accountScreen().clickSignInButton();
        app.loginScreen().enterEmailAndPasswordAndLogin(User.VALID_CREDENTIALS);
        assertThat(app.accountScreen().isLoggedIn(), is(true));
        app.accountScreen().openUserDetailsScreen();
        String newFirstName = Utils.generateRandomString(7);
        app.userDetailsScreen().changeFirstName(newFirstName);
        app.userDetailsScreen().openAccountScreen();
        app.accountScreen().openUserDetailsScreen();
        assertThat(app.userDetailsScreen().getFirstName(), is(newFirstName));
    }
}