package udateaddress;

import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import vizsgaremek.AddressPage;
import vizsgaremek.UpdateAddressPage;


public class UpdateAddressTest extends BaseTest {

    private String mobile ="06203333333";

    @Test
    public void updateTest(){
        login.clickLogin();
        login.sendEmailAddress(email);
        login.sendPassword(password);
        login.clicksignInButton();
        AddressPage newDataEntry=new AddressPage(getDriver());
        newDataEntry.clickMyAddressesButton();
        UpdateAddressPage updateAddress=new UpdateAddressPage(getDriver());
        updateAddress.clickUpdate();
        updateAddress.sendNewMobilePhone(mobile);
        newDataEntry.clickSave();
        Assertions.assertEquals(mobile,updateAddress.newMobilePhone());

    }

}
