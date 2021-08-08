package datalist;

import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import vizsgaremek.DataList;

public class DataListTest extends BaseTest {

    private final String title="Home";

    @Test
    public void creatDataList(){
        login.clickLogin();
        login.sendEmailAddress(email);
        login.sendPassword(password);
        login.clicksignInButton();
        DataList datalist=new DataList(driver);
        datalist.clickAboutUs();
        boolean result=datalist.creatDataList(title);
        Assertions.assertTrue(result);
    }
}
