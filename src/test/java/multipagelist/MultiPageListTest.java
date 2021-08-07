package multipagelist;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import vizsgaremek.MultiPageList;

public class MultiPageListTest extends BaseTest {

    @Test
    public void multiPageListTest() {
        login.clickLogin();
        login.sendEmailAddress(email);
        login.sendPassword(password);
        login.clicksignInButton();
        MultiPageList multiPageList=new MultiPageList(driver);
        multiPageList.clickWomen();
        multiPageList.scroll();
        multiPageList.clickTops();
        multiPageList.scroll2();
        multiPageList.clickTShirts();
        multiPageList.scroll2();
    }
}
