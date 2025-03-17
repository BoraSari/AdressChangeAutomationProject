package N11AllPages;

import com.sun.jdi.request.ExceptionRequest;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class N11MainPage extends BasePage{
    Select select;
    WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(30));


    private final By addressSelectingSection = By.cssSelector("div>span[class='menuLink pin']");
    private final By selectingCitySection = By.id("cities");
    private final By selectingDistrict = By.id("districts");
    private final By confirmButton = By.xpath("//div/button[@aria-label='Onayla']");
    private final By advantageMessageForLocationChange = By.xpath("//*[@id=\"app\"]/div[3]/div[1]/div/div/div[2]/div[2]/div[2]/div/div[1]/p/span[2]");
    private final By locationControl = By.cssSelector("span[class='menuLink pin']");



    public N11MainPage(WebDriver driver){
        super(driver);
    }


    public void openLocationEnterSection(){
        webDriver.findElement(addressSelectingSection).click();
    }


    public void selectCity(){
        WebElement city = webDriver.findElement(selectingCitySection);
        select = new Select(city);
        select.selectByVisibleText("İstanbul");
    }

    public void selectDistrict(){
        WebElement district = webDriver.findElement(selectingDistrict);
        select = new Select(district);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if(district.isDisplayed()){
            wait.until(ExpectedConditions.visibilityOfElementLocated(selectingDistrict));
            select.selectByVisibleText("Avcılar");
        }
    }

    public void  clickConfirmButton(){
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
       WebElement confirmBtn = webDriver.findElement(confirmButton);
       wait.until(ExpectedConditions.presenceOfElementLocated(confirmButton));
        js.executeScript("arguments[0].click();",confirmBtn);
       try {
           js.executeScript("arguments[0].click();",confirmBtn);
       }catch (Exception e){
           System.out.println("Test failed");
       }



    }

    public WebElement getAdvantageMessageElement(){
        WebElement message = webDriver.findElement(advantageMessageForLocationChange);
        return message;
    }

    public String getAdvantageMessageElementText(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(advantageMessageForLocationChange));
        return webDriver.findElement(advantageMessageForLocationChange).getText();

    }

    public WebElement checkNewLocationChange(){
        WebElement newLocation = webDriver.findElement(locationControl);
        return newLocation;
    }





}
