package pages.signUp;

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

//    @FindBy(xpath = "//input[@value=\"2\"]")
    @FindBy(xpath = "//span[@data-testid=\"qa-radio-button-label-text\" and text()='Perseorangan']")
    private WebElement radioBusinessType_1;


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

    public void verifyAlertErrorShown(){
        waitForElementVisible(alertError);
    }

}
