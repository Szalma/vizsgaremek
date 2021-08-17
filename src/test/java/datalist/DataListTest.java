package datalist;

import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import vizsgaremek.SitemapPage;

public class DataListTest extends BaseTest {

    private final String title="Home";

    @Test
    public void creatDataList(){
        SitemapPage datalist=new SitemapPage(getDriver());
        datalist.clickAboutUs();
        boolean result=datalist.creatDataList(title);
        Assertions.assertTrue(result);
    }
}
