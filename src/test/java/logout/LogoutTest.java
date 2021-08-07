package logout;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import vizsgaremek.Logout;


import static org.junit.Assert.assertEquals;

public class LogoutTest extends BaseTest {

    @Test
    public void signoutTest(){
        login.clickLogin();
        login.sendEmailAddress(email);
        login.sendPassword(password);
        login.clicksignInButton();
        Logout logout=new Logout(driver);
        logout.clickSignOut();
        assertEquals("Sign in",logout.signIn());
    }
}
