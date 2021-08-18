package privacypolicy;

import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import vizsgaremek.PrivacyPolicyPage;

public class PrivacyPolicyTest extends BaseTest {


    @DisplayName("Tc3, Adatkezelési nyilatkozat kezelése és adat lementése")
    @Test
    public void privacyPolicyTest(){
        PrivacyPolicyPage privacyPolicy=new PrivacyPolicyPage(getDriver());
        privacyPolicy.clickTermsAndConditionsOfUse();
        privacyPolicy.saveToFile();
        Assertions.assertEquals(privacyPolicy.TermsAndConditionsOfUse(),privacyPolicy.text());
    }
}
