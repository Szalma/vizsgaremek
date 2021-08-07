package vizsgaremek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class NewDataInput {

    WebDriver driver;
    public final By MY_ADDRESSES =By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[3]/a/span");
    public final By ADD_A_NEW_ADDRESS=By.xpath("//*[@id=\"center_column\"]/div[2]/a/span");
    public final By ADDRESS1 =By.id("address1");
    public final By CITY =By.id("city");
    private final By STATE =By.id("id_state");
    private final By POSTAL_CODE =By.id("postcode");
    private final By MOBILE_PHONE =By.id("phone_mobile");
    private final By REFERENCE_ADDRESS =By.id("alias");
    private final By SAVE =By.xpath("//*[@id=\"submitAddress\"]/span");
    private final By NEW_ADDRESS_NAME =By.xpath("//*[@id=\"center_column\"]/div[1]/div/div[2]/ul/li[1]/h3");

    public NewDataInput ( WebDriver diver){
        this.driver=diver;
    }

    public void clickMyAddressesButton(){
        driver.findElement(MY_ADDRESSES).click();
    }

    public void clickAddANewAddress(){
        driver.findElement(ADD_A_NEW_ADDRESS).click();
    }

    public void sendNewAddress(String address){
        driver.findElement(ADDRESS1).sendKeys(address);
    }

    public void sendNewCity (String town){
        driver.findElement(CITY).sendKeys(town);
    }

    public void selectNewState(int st){
        Select select= new Select(driver.findElement(STATE));
        select.selectByValue(String.valueOf(st));
    }

    public void sendNewPostalCode(int zip){
        driver.findElement(POSTAL_CODE).sendKeys(String.valueOf(zip));
    }

    public void sendNewMobilePhone(String mobile){
        driver.findElement(MOBILE_PHONE).sendKeys(mobile);
    }

    public void sendReferenceAddress(String adress){
        driver.findElement(REFERENCE_ADDRESS).clear();
        driver.findElement(REFERENCE_ADDRESS).sendKeys(adress);
    }
    public void clickSave(){
        driver.findElement(SAVE).click();
    }

    public String addressName(){
        return driver.findElement(NEW_ADDRESS_NAME).getText();
    }
}
