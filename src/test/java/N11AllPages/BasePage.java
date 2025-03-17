package N11AllPages;

import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver webDriver;
    protected String baseUrl = "https://m.n11.com/";

    public  BasePage(WebDriver driver){
        this.webDriver=driver;
    }

    public void navigateN11MainPage(){
        webDriver.get(baseUrl);
    }

    public String getTitleOfWebsite(){
        return webDriver.getTitle();
    }

    public String getPageSources(){
        return webDriver.getPageSource();
    }
}
