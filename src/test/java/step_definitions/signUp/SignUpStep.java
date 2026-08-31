package step_definitions.signUp;

import com.github.javafaker.Faker;
import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.signUp.SignUpPage;

import java.io.IOException;

public class SignUpStep {

    Faker faker = new Faker();

    String fakeFirstName = faker.name().firstName();

    String fakeLastName = faker.name().lastName();

    String fullName = fakeFirstName + fakeLastName;

    String fakeEmail = faker.internet().emailAddress();

    WebDriver driver;
    public SignUpStep() throws IOException {
        super();
        this.driver= Hooks.driver;
    }

    @Given("User login page")
    public void userLoginPage() {
        SignUpPage signUpPage = new SignUpPage(driver);
    }

    @When("User click sign up")
    public void userClickSignUp() {
        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.clickLinkDaftar();
    }

    @And("User input full name")
    public void userInputFullName() {
        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.inputFullName(fullName);
        System.out.println("Full Name is: " + fullName);
    }


    @And("User input email")
    public void userInputEmail() {
        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.inputEmail(fakeEmail);
        System.out.println("Your Email is: " + fakeEmail);
    }

    @And("User input nomor hp")
    public void userInputNomorHp() {
        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.inputNomorHP("3331133311");
    }

    @And("User select business type")
    public void userSelectBusinessType() {
        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.selectBusinessType_1();
    }

    @And("User input password")
    public void userInputPassword() {
        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.inputKtSandi("Uhuy123!");

    }

    @And("User input business name")
    public void userInputBusinessName() {
        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.inputNamaBisnis("Warung Rahmad OKE");
    }

    @And("User input business ID")
    public void userInputBusinessID() {
        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.inputBisnisID(fakeFirstName + "_OKE");
    }

    @And("User click button create account")
    public void userClickButtonCreateAccount() {
        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.clickButtonBuatAkun();
    }

    @Then("Verify register account success")
    public void verifyRegisterAccountSuccess() {
        SignUpPage signUpPage = new SignUpPage(driver);
        Assert.assertEquals(fakeEmail, signUpPage.verifyRegisterSuccess());
        System.out.println("Email faker: " + fakeEmail);
        System.out.println("Email registered success: " + signUpPage.verifyRegisterSuccess());
    }

    @And("User input registered email")
    public void userInputRegisteredEmail() {
        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.inputEmail("nakia.cormier@gmail.com");
    }

    @Then("Verify register account failed")
    public void verifyRegisterAccountFailed() {
        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.verifyAlertErrorShown();
    }
}
