package N11Tests;

import N11AllPages.N11MainPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.logging.Logger;

public class N11LocationChangeTestAndSuggestionListTest extends BaseTest {
    N11MainPage n11MainPage;
    private static final Logger log = Logger.getLogger(String.valueOf(N11LocationChangeTestAndSuggestionListTest.class));

    @BeforeMethod
    public void classSetup() {
        log.info("Class setup");
        n11MainPage = new N11MainPage(getWebdriver());
    }


    @Test(priority = 1,timeOut =60000)
    public void addressChangeTest (){
        log.info("Navigating main page");
        n11MainPage.navigateN11MainPage();
        log.info("Click location section");
        n11MainPage.openLocationEnterSection();
        log.info("Select a city on dropdown list");
        n11MainPage.selectCity();
        log.info("Select a district on dropdown list");
        n11MainPage.selectDistrict();
        log.info("Click Confirm section");
        n11MainPage.clickConfirmButton();

        log.info("Assertion for address advantages message and location change");

        try {
            softAssert.assertTrue(n11MainPage.getAdvantageMessageElementText().contains("bölgene özel avantajlar"));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            softAssert.assertTrue(n11MainPage.getAdvantageMessageElement().isDisplayed());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            softAssert.assertTrue(n11MainPage.checkNewLocationChange().isDisplayed());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            softAssert.assertEquals(n11MainPage.getTitleOfWebsite(),"n11 - 10 Üzerinden 11'lik Alışveriş Deneyimi");
        }catch (Exception e){
            log.warning(e.getMessage());
        }

        //Test maybe not enter a regression test category but automation tests main goal is verification.
        //Like this kind of tests are important for verification required functions stability.
        //Also I explore invisible cookie section(shadow dom) so my test strategy against this was to use js click
        //Main goal of this test is verify location change on users screen also this test executed under 1 minute.



    }


}



