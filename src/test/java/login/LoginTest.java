package login;

import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import vizsgaremek.LoginPage;

public class LoginTest extends BaseTest {

    LoginPage login;

    @DisplayName("Tc2, Bejelentkezés")
    @Test
    public void successLogin(){
        login=new LoginPage(getDriver());
        login.clickLogin();
        login.sendEmailAddress(email);
        login.sendPassword(password);
        login.clicksignInButton();
        Assertions.assertEquals("Stefi Stefi", login.name());
    }

}
