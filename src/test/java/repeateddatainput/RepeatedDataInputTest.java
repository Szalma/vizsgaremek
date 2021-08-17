package repeateddatainput;

import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import vizsgaremek.MyWishlistPage;


public class RepeatedDataInputTest extends BaseTest {

    @Test
    public void repeatedDataInputTest(){
        login.clickLogin();
        login.sendEmailAddress(email);
        login.sendPassword(password);
        login.clicksignInButton();
        MyWishlistPage repeatedDataInput=new MyWishlistPage(getDriver());
        repeatedDataInput.clickMyWishlists();
        repeatedDataInput.SEND_NAME();
        Assertions.assertEquals("T-SHIRT",repeatedDataInput.contetsOfTheTable());

    }
}
