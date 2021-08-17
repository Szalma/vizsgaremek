package vizsgaremek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {
    public WebDriver driver;
    private final By LOGIN=By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");
    private final By EMAIL_ADDRESS =By.id("email_create");
    private final By CREATE_AN_ACCOUNT =By.xpath("//*[@id=\"SubmitCreate\"]/span");
    private final By MRS_RADIO_BUTTON =By.id("id_gender2");
    private final By CUSTOMER_FIRSNAME =By.id("customer_firstname");
    private final By CUSTOMER_LASTNAME =By.id("customer_lastname");
    private final By PASSWORD =By.id("passwd");
    // private final By firstname=By.id("firstname");
    //private final By lastname=By.id("lastname");
    private final By ADDRESS1 =By.id("address1");
    private final By CITY =By.id("city");
    private final By STATE =By.id("id_state");
    private final By POSTAL_CODE =By.id("postcode");
    private final By MOBILE_PHONE =By.id("phone_mobile");
    private final By REGISTER =By.xpath("//*[@id=\"submitAccount\"]/span");
    private final By ACCOUNT_NAME =By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span");

    public RegistrationPage ( WebDriver driver){
        this.driver=driver;
    }

    public void clickLogin(){
        driver.findElement(LOGIN).click();
    }

    public void sendEmailAddress(String email){
        driver.findElement(EMAIL_ADDRESS).sendKeys(email);
    }

    public void clickCreateAnAccount(){
        driver.findElement(CREATE_AN_ACCOUNT).click();
    }

    public void clickMrsRadioButton(){
        driver.findElement(MRS_RADIO_BUTTON).click();
    }

    public void sendCustomerFirstname(String firstname){
        driver.findElement(CUSTOMER_FIRSNAME).sendKeys(firstname);
    }

    public void sendCustomerLastname(String lastname){
        driver.findElement(CUSTOMER_LASTNAME).sendKeys(lastname);
    }

    public void sendPassword(String pwd){
        driver.findElement(PASSWORD).sendKeys(pwd);
    }

    public void sendAddress(String address){
        driver.findElement(ADDRESS1).sendKeys(address);
    }

    public void sendCity (String town){
        driver.findElement(CITY).sendKeys(town);
    }

    public void selectState(int st){
        Select select= new Select(driver.findElement(STATE));
        select.selectByValue(String.valueOf(st));
    }

    public void sendPostalCode(int zip){
        driver.findElement(POSTAL_CODE).sendKeys(String.valueOf(zip));
    }

    public void sendMobilePhone(String mobile){
        driver.findElement(MOBILE_PHONE).sendKeys(mobile);
    }

    public void clickRegister(){
        driver.findElement(REGISTER).click();
    }

    public String name(){
        return driver.findElement(ACCOUNT_NAME).getText();
    }
}

