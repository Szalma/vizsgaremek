package vizsgaremek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UpdateAddress {

    WebDriver driver;
    private final By UPDATE =By.xpath("//*[@id=\"center_column\"]/div[1]/div/div[1]/ul/li[9]/a[1]");
    private final By UPDATE_ADDRESS =By.id("address1");
    private final By UPDATE_MOBILE_PHONE =By.id("phone_mobile");
    private final By REFERENCE_ADDRESS =By.id("alias");
    private final By SAVE =By.xpath("//*[@id=\"submitAddress\"]/span");
    private final By NEW_ADDRESS_NAME =By.xpath("//*[@id=\"center_column\"]/div[1]/div/div[2]/ul/li[1]/h3");
    private final By NEW_MOBILE =By.xpath("//*[@id=\"center_column\"]/div[1]/div/div/ul/li[8]/span");

    public UpdateAddress(WebDriver driver){
        this.driver=driver;
    }

    public void clickUpdate(){
        driver.findElement(UPDATE).click();
    }

    public void sendNewAddress(String address){
        driver.findElement(UPDATE_ADDRESS).clear();
        driver.findElement(UPDATE_ADDRESS).sendKeys(address);
    }

    public void sendNewMobilePhone(String mobile){
        driver.findElement(UPDATE_MOBILE_PHONE).clear();
        driver.findElement(UPDATE_MOBILE_PHONE).sendKeys(mobile);
    }
    public void sendReferenceAddress(String adress){
        driver.findElement(REFERENCE_ADDRESS).clear();
        driver.findElement(REFERENCE_ADDRESS).sendKeys(adress);
    }

    public String addressName(){
        return driver.findElement(NEW_ADDRESS_NAME).getText();
    }

    public String newMobilePhone(){
        return driver.findElement(NEW_MOBILE).getText().toUpperCase();
    }
}
