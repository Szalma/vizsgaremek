package vizsgaremek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeleteData {

    WebDriver driver;
    private final By T_SHIRTS=By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a");
    private final By IN_STOCK=By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/span/span");
    private final By ADD_TO_CART=By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span");
    private final By PROCEED_TO_CHECKOUT=By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span");
    private final By DELETE=By.xpath("//*[@id=\"cart_summary\"]//td[7]");
    private final By CART_IS_EMPTY=By.xpath("//*[@class='alert alert-warning']");

    public DeleteData(WebDriver driver){
        this.driver=driver;
    }

    public void clickT_Shirts(){
        driver.findElement(T_SHIRTS).click();
    }

    public void clickAddToCart(){
        Actions actionProvider = new Actions(driver);
        actionProvider.moveToElement(driver.findElement(IN_STOCK)).build().perform();
        driver.findElement(ADD_TO_CART).click();
    }

    public void clickProcedToCheckout(){
        driver.findElement(PROCEED_TO_CHECKOUT).click();
    }

    public void clickDelete(){
        driver.findElement(DELETE).click();
    }

    public String emptyCart(){
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(CART_IS_EMPTY));
        return driver.findElement(CART_IS_EMPTY).getText();
    }
}
