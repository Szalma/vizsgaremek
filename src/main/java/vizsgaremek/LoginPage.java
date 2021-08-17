package vizsgaremek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    private final By LOGIN=By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");
    private final By EMAIL_ADDRESS =By.id("email");
    private final By PASSWORD =By.id("passwd");
    private final By SIGN_IN_BUTTON =By.xpath("//*[@id=\"SubmitLogin\"]/span");
    private final By ACCOUNT_NAME =By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span");


    public LoginPage ( WebDriver driver){
        this.driver=driver;
    }

    public void clickLogin(){
        driver.findElement(LOGIN).click();
    }

    public void sendEmailAddress(String email){
        driver.findElement(EMAIL_ADDRESS).sendKeys(email);
    }

    public void sendPassword(String pwd){
        driver.findElement(PASSWORD).sendKeys(pwd);
    }

    public void clicksignInButton(){
        driver.findElement(SIGN_IN_BUTTON).click();
    }

    public String name(){
        return driver.findElement(ACCOUNT_NAME).getText();
    }

}
