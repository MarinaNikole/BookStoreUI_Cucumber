package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;



public class RegisterPage {
    public SelenideElement registerPageHeader =$("[class='main-header']");
    public SelenideElement backToLoginButton = $(By.id("gotologin"));
    public SelenideElement registerButton =$(By.id("register"));
    public SelenideElement verifyRecaptchaMessage = $(By.id("name"));
    public SelenideElement registrationForm = $(By.id("userForm"));
    public SelenideElement firstNameInputField = $(By.id("firstname"));
    public SelenideElement lastNameInputField = $(By.id("lastname"));
    public SelenideElement userNameInputField = $(By.id("userName"));
    public SelenideElement passwordInputField = $(By.id("password"));
    public SelenideElement countryInputField = $(By.id("country"));
    public SelenideElement cityInputField = $(By.id("city"));
    public SelenideElement confirmPasswordInputField = $(By.id("confirmPassword"));
    public SelenideElement emailInputField = $(By.id("email"));


public void filInnRegistrationForm(String firstName, String lastName, String userName, String password){
    firstNameInputField.shouldBe(Condition.visible).setValue(firstName);
    lastNameInputField.shouldBe(Condition.visible).setValue(lastName);
    userNameInputField.shouldBe(Condition.visible).setValue(userName);
    passwordInputField.shouldBe(Condition.visible).setValue(password);

}

public void clickRegisterButton(){
    registerButton.scrollTo().shouldBe(Condition.visible).click();
}
    public void clickBackToLoginButton(){
        backToLoginButton.scrollTo().shouldBe(Condition.visible).click();
    }
}
