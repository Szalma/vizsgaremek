package vizsgaremek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.*;
import java.util.Scanner;

public class SaveToFile {
    WebDriver driver;
    private final By ABOUT_US=By.xpath("//*[@id=\"block_various_links_footer\"]/ul/li[7]/a");
    private final By TEXT=By.xpath("//*[@id=\"center_column\"]/div/div/div[1]/div/p[1]");

    public SaveToFile(WebDriver driver){
        this.driver=driver;
    }

    public void clickAboutUs(){
        driver.findElement(ABOUT_US).click();
    }

    public void save(){
        try {
            FileWriter fileWriter=new FileWriter("SaveToFile.txt");
            fileWriter.append(driver.findElement(TEXT).getText());
            fileWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public String contain(){
        String data="";
        try {
            File file=new File("SaveToFile.txt");
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
}
