package pages;

import drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SignUpPage {
    private WebDriver driver;

    public SignUpPage(){
        this.driver = DriverSingleton.getDriver();

        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//*[@id=\"hb__root\"]/div/div[3]/div[2]/div[2]/form/div[1]/input")
    private WebElement fullNameField;

    @FindBy(xpath = "//*[@id=\"hb__root\"]/div/div[3]/div[2]/div[2]/form/div[2]/div/input")
    private WebElement phoneNumberField;

    @FindBy(xpath = "//*[@id=\"hb__root\"]/div/div[3]/div[2]/div[2]/form/div[3]/input")
    private WebElement passwordField;

    @FindBy(xpath = "//*[@id=\"hb__root\"]/div/div[3]/div[2]/div[2]/form/div[4]/label")
    private WebElement termsPolicyField;

    @FindBy(xpath = "//*[@id=\"hb__root\"]/div/div[3]/div[2]/div[2]/form/div[5]/button")
    private WebElement signUpButton;

    public void signUp(){
        fullNameField.sendKeys("Chrome Face".toString());
        phoneNumberField.sendKeys("9860675312".toString());
        passwordField.sendKeys("Don't know1".toString());
        termsPolicyField.click();
        signUpButton.click();
    }





}

