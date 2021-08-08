package vizsgaremek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RepeatedDataInput {

    WebDriver driver;
    private final By MY_WISHLISTS = By.xpath("//*[@id=\"center_column\"]/div/div[2]/ul/li/a/span");
    private final By NAME = By.id("name");
    private final By SAVE=By.xpath("//*[@id=\"submitWishlist\"]/span");
    private final By CONTETS_OF_THE_TABLE=By.xpath("//*[@class='table table-bordered']//td[1]/a");

    public RepeatedDataInput ( WebDriver driver ) {
        this.driver = driver;
    }

    public void clickMyWishlists () {
        driver.findElement(MY_WISHLISTS).click();
    }

    public void SEND_NAME(){
        for (int i = 0; i <4 ; i++) {
            try {
                File file = new File("RepeatedData.txt");
                Scanner scanner = new Scanner(file);
                while (scanner.hasNextLine()) {
                    String data = scanner.nextLine();
                    driver.findElement(NAME).sendKeys(data + "");
                    driver.findElement(SAVE).click();
                }
                scanner.close();
            } catch (
                    FileNotFoundException e) {
                e.printStackTrace();
            }
        }
}

        public String contetsOfTheTable(){
           return driver.findElement(CONTETS_OF_THE_TABLE).getText();
        }
}
