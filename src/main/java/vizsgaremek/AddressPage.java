package vizsgaremek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AddressPage {

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
    private final By DELETE=By.xpath("//*[@class='last_item alternate_item box']/li[9]/a[2]/span");
    private final By TEXT=By.xpath("//*[@id=\"center_column\"]/div[1]/div");

    public AddressPage ( WebDriver diver){
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
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(NEW_ADDRESS_NAME)));
        return driver.findElement(NEW_ADDRESS_NAME).getText();
    }

    public void clickdelete(){
        driver.findElement(DELETE).click();
    }

    public void accept(){
        driver.switchTo().alert().accept();
    }

    public String remainingText(){
        return driver.findElement(TEXT).getText();
    }
}
