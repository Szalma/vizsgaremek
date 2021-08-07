package deletedata;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import vizsgaremek.DeleteData;

import static org.junit.Assert.assertEquals;

public class DeleteDataTest extends BaseTest {

    @Test
    public void deleteTest(){
        login.clickLogin();
        login.sendEmailAddress(email);
        login.sendPassword(password);
        login.clicksignInButton();
        DeleteData deleteData=new DeleteData(driver);
        deleteData.clickT_Shirts();
        deleteData.clickAddToCart();
        deleteData.clickProcedToCheckout();
        deleteData.clickDelete();
        assertEquals("Your shopping cart is empty.", deleteData.emptyCart());
    }
}
