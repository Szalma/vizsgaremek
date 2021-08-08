package logout;

import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import vizsgaremek.Logout;


public class LogoutTest extends BaseTest {

    @Test
    public void signoutTest(){
        login.clickLogin();
        login.sendEmailAddress(email);
        login.sendPassword(password);
        login.clicksignInButton();
        Logout logout=new Logout(driver);
        logout.clickSignOut();
        Assertions.assertEquals("Sign in",logout.signIn());
    }
}
