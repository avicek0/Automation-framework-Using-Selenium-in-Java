import drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage;
import pages.OTPPage;
import pages.SignUpPage;
import utils.frameworkProperties;

import java.lang.String;

public class Main {
    public static void main(String[] args)
    {
        frameworkProperties frameworkPRoperties = new frameworkProperties();
        DriverSingleton.getInstance(frameworkPRoperties.getProperty("browser"));
        WebDriver driver = DriverSingleton.getDriver();

        driver.get("https://hamrobazaar.com/");

        HomePage homePage = new HomePage();
        homePage.clickLogin();

        LoginPage loginPage = new LoginPage();
        loginPage.clickSignUP();

        SignUpPage signUpPage = new SignUpPage();
        signUpPage.signUp();

        OTPPage otpPage = new OTPPage();
        otpPage.throwRandomNumber();
        //otpPage.throwOTPError();


    }
}
