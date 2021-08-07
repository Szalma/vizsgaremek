package repeateddatainput;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import vizsgaremek.RepeatedDataInput;

import static org.junit.Assert.assertEquals;

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
        assertEquals("T-SHIRT 0 0 2021-08-04 View",repeatedDataInput.contetsOfTheTable());

    }
}
