package pages.signUp;

import io.cucumber.java.ja.然し;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class SignUpPage extends BasePage {

    @FindBy(xpath = "//a[@data-qaid=\"qa-new-user-link\"]")
    private WebElement linkDaftar;

    @FindBy(xpath = "//input[@name=\"name\"]")
    private WebElement fieldFullName;

    @FindBy(xpath = "//input[@name=\"email\"]")
    private WebElement fieldEmail;

    @FindBy(xpath = "//input[@name=\"phone_number\"]")
    private WebElement fieldNomorHP;

    @FindBy(xpath = "//span[@data-testid=\"qa-radio-button-label-text\" and text()='Perseorangan']")
    private WebElement radioBusinessType_1;

    @FindBy(xpath = "//span[@data-testid=\"qa-radio-button-label-text\" and text()='Badan Usaha']")
    private WebElement radioBusinessType_2;

    @FindBy(xpath = "//span[@data-testid='qa-radio-button-label-text' and @disabled and text()='Perseorangan']")
    private WebElement radioBusinessType_1Disable;

    @FindBy(xpath = "//span[@data-testid='qa-radio-button-label-text' and @disabled and text()='Badan Usaha']")
    private WebElement radioBusinessType_2Disable;

    @FindBy(xpath = "//input[@name=\"company_id\"]")
    private WebElement fieldBusinessID;

    @FindBy(xpath = "//input[@name=\"password\"]")
    private WebElement fieldKtSandi;

    @FindBy(xpath = "//input[@name=\"company_name\"]")
    private WebElement fieldNamaBisnis;

    @FindBy(xpath = "//input[@name=\"company_id\"]")
    private WebElement fieldBisnisID;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    private WebElement buttonBuatAkun;

    @FindBy(xpath = "//img[@src=\"/static-bigflip/media/ilus-verif-email.f32bf65a.png\"]")
    private WebElement imgRegisterSuccess;

    @FindBy(xpath = "//b[@data-qaid=\"qa-email-verification-user-email\"]")
    private WebElement userEmail;

    @FindBy(xpath = "//div[@data-testid=\"qa-alert\"]")
    private WebElement alertError;

    @FindBy(xpath = "//div[@data-qaid=\"qa-password-error\"]")
    private WebElement messagePasswordLessThan8Char;

    @FindBy(xpath = "//div[@data-qaid=\"qa-ffb-id-error\"]")
    private WebElement messageIDMoreThan15Char;

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public void clickLinkDaftar(){
        waitForElementVisible(linkDaftar);
        click(linkDaftar);
    }

    public void inputFullName(String text){
        waitForElementVisible(fieldFullName);
        fieldFullName.sendKeys(text);
    }

    public void inputEmail(String text){
        waitForElementVisible(fieldEmail);
        fieldEmail.sendKeys(text);
    }

    public void inputNomorHP(String text){
        waitForElementVisible(fieldNomorHP);
        fieldNomorHP.sendKeys(text);
    }

    public void selectBusinessType_1(){
        waitForElementVisible(radioBusinessType_1);
        click(radioBusinessType_1);
    }

    public void radioBusinessTypeDisable(){
        waitForElementVisible(radioBusinessType_1Disable);
        waitForElementVisible(radioBusinessType_2Disable);
    }

    public void selectBusinessType_2(){
        waitForElementVisible(radioBusinessType_2);
        click(radioBusinessType_2);
    }

    public void inputBusines_ID(String text){
        waitForElementVisible(fieldBusinessID);
        fieldBusinessID.sendKeys(text);
    }

    public void inputKtSandi(String text){
        waitForElementVisible(fieldKtSandi);
        fieldKtSandi.sendKeys(text);
    }
    
    public void inputNamaBisnis(String text){
        waitForElementVisible(fieldNamaBisnis);
        fieldNamaBisnis.sendKeys(text);
    }

    public void inputBisnisID(String text){
        waitForElementVisible(fieldBisnisID);
        fieldBusinessID.clear();
        fieldBisnisID.sendKeys(text);
    }
    
    public void clickButtonBuatAkun(){
        waitForElementVisible(buttonBuatAkun);
        click(buttonBuatAkun);
    }

    public String verifyRegisterSuccess(){
        waitForElementVisible(imgRegisterSuccess);
        return userEmail.getText();
    }

    public String verifyAlertErrorShown(){
        waitForElementVisible(alertError);
        return alertError.getText();
    }

    public void verifyMessagePasswordLessThan8Char(){
        waitForElementVisible(messagePasswordLessThan8Char);
    }

    public String verifyMessageIDMoreThan15Char(){
        waitForElementVisible(messageIDMoreThan15Char);
        return messageIDMoreThan15Char.getText();
    }

}
