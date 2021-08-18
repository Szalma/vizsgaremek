package registration;

import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import vizsgaremek.RegistrationPage;


public class RegistrationTest extends BaseTest {
    private String email="stefi2@gmail.com";
    private String firstname="Stefi";
    private String lastname="Stefi";
    private String pwd="ruhak";
    private String address="Eper utca";
    private String town="Szombathely";
    private int state=32;
    private int zip=96530;
    private String mobile="06305569455";


    @DisplayName("Tc1, Regisztráció")
    @Disabled
    @Test
    public void successfulRegistrationTest(){

        RegistrationPage registration=new RegistrationPage(getDriver());
        registration.clickLogin();
        registration.sendEmailAddress(email);
        registration.clickCreateAnAccount();
        registration.clickMrsRadioButton();
        registration.sendCustomerFirstname(firstname);
        registration.sendCustomerLastname(lastname);
        registration.sendPassword(pwd);
        registration.sendAddress(address);
        registration.sendCity(town);
        registration.selectState(state);
        registration.sendPostalCode(zip);
        registration.sendMobilePhone(mobile);
        registration.clickRegister();
        Assertions.assertEquals("Stefi Stefi", registration.name());
    }
}
