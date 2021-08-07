package vizsgaremek;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MultiPageList {
    WebDriver driver;
    private final By WOMEN=By.xpath("//*[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[1]/a");
    private final By TOPS=By.xpath("//*[@class='clearfix']/li[1]/div[1]/a[1]");
    private final By T_SHIRTS=By.xpath("//*[@id=\"subcategories\"]/ul/li[1]/div/a");

    public MultiPageList(WebDriver driver){
        this.driver=driver;
    }
    public void clickWomen(){
        driver.findElement(WOMEN).click();
    }
    public void scroll() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 1800)");
    }

    public void backwardsScroll(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-1800)");
    }

    public void clickTops(){
        driver.findElement(TOPS).click();
    }

    public void scroll2 (){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 900)");
    }
    public void clickTShirts(){
        driver.findElement(T_SHIRTS).click();
    }
}
