package newdatainput;

import base.BaseTest;
import org.junit.jupiter.api.*;
import vizsgaremek.AddressPage;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)



public class NewDataInputTest extends BaseTest {

    private String newAddress="Malna utca";
    private String newTown ="Keszthely";
    private int newState =4;
    private int newZip =44444;
    private String newMobile ="06208866456";
    private String referenceAdress="Eper utca";
    AddressPage newDataInput;

    @DisplayName("Tc6, Új adat bevitel")
    @Test
    @Order(1)
    public void successDataEntry(){
       newDataInput =new AddressPage(getDriver());
        login.clickLogin();
        login.sendEmailAddress(email);
        login.sendPassword(password);
        login.clicksignInButton();
        newDataInput.clickMyAddressesButton();
        newDataInput.clickAddANewAddress();
        newDataInput.sendNewAddress(newAddress);
        newDataInput.sendNewCity(newTown);
        newDataInput.selectNewState(newState);
        newDataInput.sendNewPostalCode(newZip);
        newDataInput.sendNewMobilePhone(newMobile);
        newDataInput.sendReferenceAddress(referenceAdress);
        newDataInput.clickSave();
        Assertions.assertEquals("EPER UTCA",newDataInput.addressName());

    }


    @DisplayName("Tc6, Adat törlése")
    @Test
    @Order(2)
    public void delete(){
        login.clickLogin();
        login.sendEmailAddress(email);
        login.sendPassword(password);
        login.clicksignInButton();
        newDataInput =new AddressPage(getDriver());
        newDataInput.clickMyAddressesButton();
        newDataInput.clickdelete();
        newDataInput.accept();
        Assertions.assertEquals("MY ADDRESS\n" +
                "Stefi Stefi\n" +
                "Eper utca\n" +
                "Szombathely, New York 96530\n" +
                "United States\n" +
                "06203333333\n" +
                "Update\n" +
                "Delete",newDataInput.remainingText() );
    }
}
