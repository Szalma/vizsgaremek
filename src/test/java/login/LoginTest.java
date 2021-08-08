package login;

import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import vizsgaremek.Login;

public class LoginTest extends BaseTest {

    Login login;

    @Test
    public void successLogin(){
        login=new Login(driver);
        login.clickLogin();
        login.sendEmailAddress(email);
        login.sendPassword(password);
        login.clicksignInButton();
        Assertions.assertEquals("Stefi Stefi", login.name());
    }

}
