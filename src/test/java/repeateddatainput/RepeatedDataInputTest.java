package repeateddatainput;

import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import vizsgaremek.RepeatedDataInput;


public class RepeatedDataInputTest extends BaseTest {

    @Test
    public void repeatedDataInputTest(){
        login.clickLogin();
        login.sendEmailAddress(email);
        login.sendPassword(password);
        login.clicksignInButton();
        RepeatedDataInput repeatedDataInput=new RepeatedDataInput(driver);
        repeatedDataInput.clickMyWishlists();
        repeatedDataInput.SEND_NAME();
        Assertions.assertEquals("T-SHIRT",repeatedDataInput.contetsOfTheTable());

    }
}
