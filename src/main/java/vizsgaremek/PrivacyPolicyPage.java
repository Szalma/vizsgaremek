package vizsgaremek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PrivacyPolicyPage {
    WebDriver driver;
    private final By TERMS_AND_CONDITIONS_OF_USE=By.xpath("//*[@class='footer-block col-xs-12 col-sm-2']//li[6]/a");
    protected final By TEXT=By.xpath("//*[@id=\"center_column\"]/div/h1");

    public PrivacyPolicyPage ( WebDriver driver){
        this.driver=driver;
    }

    public void clickTermsAndConditionsOfUse(){
        driver.findElement(TERMS_AND_CONDITIONS_OF_USE).click();
    }

    public void saveToFile(){
        try {
            FileWriter fileWriter=new FileWriter("PrivacyPolicy.txt");
            fileWriter.append(driver.findElement(TEXT).getText());
            fileWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public String text(){
        String data="";
        try {
            File file=new File("PrivacyPolicy.txt");
            Scanner scanner=new Scanner(file);
            while (scanner.hasNextLine()){
                data=scanner.nextLine();
            }
            scanner.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return data;


    }

    public String TermsAndConditionsOfUse(){
       return driver.findElement(TEXT).getText();
    }

}
