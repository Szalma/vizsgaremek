package savetofile;

import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import vizsgaremek.SaveToFile;

public class SaveToFileTest extends BaseTest {

    @Test
    public void saveTest(){
        login.clickLogin();
        login.sendEmailAddress(email);
        login.sendPassword(password);
        login.clicksignInButton();
        SaveToFile saveToFile=new SaveToFile(driver);
        saveToFile.clickAboutUs();
        saveToFile.save();
        Assertions.assertEquals("We are a team of technology enthusiasts and our primary goal for this website and company is to give you a platform to practice Continuous Test Automation. We are a subsidiary of seleniumframework.com",saveToFile.contain());
    }
}
