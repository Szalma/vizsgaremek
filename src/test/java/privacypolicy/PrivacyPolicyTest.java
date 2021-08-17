package privacypolicy;

import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import vizsgaremek.PrivacyPolicyPage;

public class PrivacyPolicyTest extends BaseTest {


    @Test
    public void privacyPolicyTest(){
        PrivacyPolicyPage privacyPolicy=new PrivacyPolicyPage(getDriver());
        privacyPolicy.clickTermsAndConditionsOfUse();
        privacyPolicy.saveToFile();
        Assertions.assertEquals(privacyPolicy.TermsAndConditionsOfUse(),privacyPolicy.text());
    }
}
