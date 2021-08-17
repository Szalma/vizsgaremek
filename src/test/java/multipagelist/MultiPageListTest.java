package multipagelist;

import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import vizsgaremek.MultiPageListPage;

public class MultiPageListTest extends BaseTest {

    @Test
    public void multiPageListTest() {
        MultiPageListPage multiPageList=new MultiPageListPage(getDriver());
        multiPageList.clickWomen();
        multiPageList.scroll();
        multiPageList.clickTops();
        multiPageList.scroll2();
        multiPageList.clickTShirts();
        multiPageList.scroll2();
        Assertions.assertEquals("There is 1 product.",multiPageList.text());
    }
}
