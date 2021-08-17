package logout;

import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import vizsgaremek.LogoutPage;


public class LogoutTest extends BaseTest {

    @Test
    public void signoutTest(){
        login.clickLogin();
        login.sendEmailAddress(email);
        login.sendPassword(password);
        login.clicksignInButton();
        LogoutPage logout=new LogoutPage(getDriver());
        logout.clickSignOut();
        Assertions.assertEquals("Sign in",logout.signIn());
    }
}
