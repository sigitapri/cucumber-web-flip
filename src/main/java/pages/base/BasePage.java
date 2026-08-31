package pages.base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;

public class BasePage {
    public static WebDriver driver;

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickCenter(WebElement e) {
        Actions actions = new Actions(driver);
        int elementX = e.getLocation().getX() + e.getSize().getWidth() / 2;
        int elementY = e.getLocation().getY() + e.getSize().getHeight() / 2;
        actions.moveToElement(e, elementX, elementY).perform();
        e.click();
    }

    public void click(WebElement e) {
        this.waitForElementVisible(e);
        e.click();
    }

    public void clickByAction(WebElement e) {
        Actions action = new Actions(driver);
        action.moveToElement(e).click().build().perform();
    }

    public void clickByJsExecutor(WebElement e) {
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", new Object[]{e});
    }

    public void doubleClick(WebElement e) {
        this.waitForElementVisible(e);
        this.waitForElementClickable(e);
        (new Actions(driver)).doubleClick(e).perform();
    }

    public void clickByCoordinate(WebElement e) {
        int a = e.getLocation().getX();
        int b = e.getLocation().getY();
        System.out.println("location X : " + a);
        System.out.println("location Y : " + b);
        Actions actions = new Actions(driver);
        actions.moveByOffset(a, b).click().build().perform();
    }

    public void zoomInOut(String zoomLevel) {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("document.body.style.zoom='" + zoomLevel + "'", new Object[0]);
    }

    public void waitForElementVisible(WebElement e) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30L));
        wait.until(ExpectedConditions.visibilityOf(e));
    }

    public void waitForElementClickable(WebElement e) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30L));
        wait.until(ExpectedConditions.elementToBeClickable(e));
    }

    public void getCoordinate(WebElement e) {
        Point location = e.getLocation();
        int x = location.getX();
        int y = location.getY();
        System.out.println("coordinate X =" + x + "coordinate Y =" + y);
    }


    public static HashMap<String,String> value = new HashMap<>();


}
