package vizsgaremek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PrivacyPolicy {
    WebDriver driver;
    private final By TERMS_AND_CONDITIONS_OF_USE=By.xpath("//*[@class='footer-block col-xs-12 col-sm-2']//li[6]/a");
    private final By TEXT=By.xpath("//*[@id=\"center_column\"]/div/h1");

    public PrivacyPolicy(WebDriver driver){
        this.driver=driver;
    }

    public void clickTermsAndConditionsOfUse(){
        driver.findElement(TERMS_AND_CONDITIONS_OF_USE).click();
    }

    public String text(){
        return driver.findElement(TEXT).getText();
    }
}
