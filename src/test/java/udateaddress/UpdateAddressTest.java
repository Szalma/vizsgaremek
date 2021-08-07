package udateaddress;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import vizsgaremek.NewDataInput;
import vizsgaremek.UpdateAddress;

import static org.junit.Assert.assertEquals;

public class UpdateAddressTest extends BaseTest {

    private String address="Eper utca";
    private String mobile ="06203333333";

    @Test
    public void updateTest(){
        login.clickLogin();
        login.sendEmailAddress(email);
        login.sendPassword(password);
        login.clicksignInButton();
        NewDataInput newDataEntry=new NewDataInput(driver);
        newDataEntry.clickMyAddressesButton();
        UpdateAddress updateAddress=new UpdateAddress(driver);
        updateAddress.clickUpdate();
        updateAddress.sendNewAddress(address);
        updateAddress.sendNewMobilePhone(mobile);
        newDataEntry.clickSave();
        assertEquals(mobile,updateAddress.newMobilePhone());

    }

}
