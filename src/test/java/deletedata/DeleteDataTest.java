package deletedata;

import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import vizsgaremek.DeleteData;

public class DeleteDataTest extends BaseTest {

    @Test
    public void deleteTest(){
        login.clickLogin();
        login.sendEmailAddress(email);
        login.sendPassword(password);
        login.clicksignInButton();
        DeleteData deleteData=new DeleteData(driver);
        deleteData.clickT_Shirts();
        deleteData.clickAddToCompare();
       Assertions.assertEquals("Add to Compare", deleteData.emptyCart());
    }
}
