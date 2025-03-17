package N11Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class BaseTest {

    protected static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    SoftAssert softAssert = new SoftAssert();

    public WebDriver getWebdriver(){
        return driver.get();
    }


    @BeforeClass
    @Parameters({"browser"})
    public void setup(String browser) {
        switch(browser.toLowerCase()){
            case "google":
                driver.set(new ChromeDriver());
                break;
            case  "firefox":
                driver.set(new FirefoxDriver());
                break;
            default:Exception  RuntimeException;
        }

        getWebdriver().manage().window().maximize();
        getWebdriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        getWebdriver().manage().deleteAllCookies();
    }

    @AfterClass
    public void tearDown() {
        if(getWebdriver()!=null){
            getWebdriver().quit();
        }
        softAssert.assertAll("All test sare asserted.");
    }

}

