package vizsgaremek;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DeleteData {

    WebDriver driver;
    private final By T_SHIRTS=By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a");
    private final By IN_STOCK=By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/span/span");
    private final By ADD_TO_COMPARE=By.xpath("//*[@class='add_to_compare']");
    private final By ADD_TO_COMPARE_CHECKED=By.xpath("//*[@class='add_to_compare checked']");

    private final By CART_IS_EMPTY=By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a");
    private final By Proba=By.xpath("//*[@class='shopping_cart']/a");
    private final By shirt=By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a");

    public DeleteData(WebDriver driver){
        this.driver=driver;
    }

    public void clickT_Shirts(){
        driver.findElement(T_SHIRTS).click();
    }

    public void clickAddToCompare(){
        Actions actionProvider = new Actions(driver);
        actionProvider.moveToElement(driver.findElement(IN_STOCK)).build().perform();
        driver.findElement(ADD_TO_COMPARE).click();
    }

    public void clickAgainAddToCompare(){
        Actions actionProvider = new Actions(driver);
        actionProvider.moveToElement(driver.findElement(IN_STOCK)).build().perform();
        driver.findElement(ADD_TO_COMPARE_CHECKED).click();
    }



    public String emptyCart(){

        return driver.findElement(ADD_TO_COMPARE_CHECKED).getText();
    }
}
