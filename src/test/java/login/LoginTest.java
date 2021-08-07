package login;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import vizsgaremek.Login;
import static org.junit.Assert.assertEquals;

public class LoginTest extends BaseTest {

    Login login;

    @Test
    public void successLogin(){
        login=new Login(driver);
        login.clickLogin();
        login.sendEmailAddress(email);
        login.sendPassword(password);
        login.clicksignInButton();
        assertEquals("Stefi Stefi", login.name());
    }

}
