package registration;

import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import vizsgaremek.Registration;

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


    @Test
    public void successfulRegistrationTest(){

        Registration registration=new Registration(driver);
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
