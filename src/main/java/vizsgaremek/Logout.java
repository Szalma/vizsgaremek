package vizsgaremek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout {

    WebDriver driver;
    private final By SIGN_OUT=By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a");
    private final By SIGN_IN=By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");

    public Logout(WebDriver driver){
        this.driver=driver;
    }

    public void clickSignOut(){
        driver.findElement(SIGN_OUT).click();
    }

    public String signIn(){
        return driver.findElement(SIGN_IN).getText();
    }
}
