package privacypolicy;

import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import vizsgaremek.PrivacyPolicy;

public class PrivacyPolicyTest extends BaseTest {

    @Test
    public void privacyPolicyTest(){
        login.clickLogin();
        login.sendEmailAddress(email);
        login.sendPassword(password);
        login.clicksignInButton();
        PrivacyPolicy privacyPolicyTest=new PrivacyPolicy(driver);
        privacyPolicyTest.clickTermsAndConditionsOfUse();
        Assertions.assertEquals("TERMS AND CONDITIONS OF USE",privacyPolicyTest.text());
    }
}
