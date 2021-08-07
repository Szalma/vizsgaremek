package newdatainput;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import vizsgaremek.NewDataInput;

import static org.junit.Assert.assertEquals;

public class NewDataInputTest extends BaseTest {

    private String newAddress="Malna utca";
    private String newTown ="Keszthely";
    private int newState =4;
    private int newZip =44444;
    private String newMobile ="06208866456";
    private String referenceAdress="Eper utca";

    @Test
    public void successDataEntry(){
        login.clickLogin();
        login.sendEmailAddress(email);
        login.sendPassword(password);
        login.clicksignInButton();
        NewDataInput newDataInput=new NewDataInput(driver);
        newDataInput.clickMyAddressesButton();
        newDataInput.clickAddANewAddress();
        newDataInput.sendNewAddress(newAddress);
        newDataInput.sendNewCity(newTown);
        newDataInput.selectNewState(newState);
        newDataInput.sendNewPostalCode(newZip);
        newDataInput.sendNewMobilePhone(newMobile);
        newDataInput.sendReferenceAddress(referenceAdress);
        newDataInput.clickSave();
        assertEquals("EPER UTCA",newDataInput.addressName());
    }
}
