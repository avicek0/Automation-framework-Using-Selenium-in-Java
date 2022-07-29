package pages;
import drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import sun.jvm.hotspot.utilities.Assert;

import java.util.Random;


public class OTPPage {

    private WebDriver driver;

    public OTPPage() {
        driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"hb__root\"]/div/main/div[2]/form/div/input[1]")
    private WebElement OTPField;

    @FindBy(xpath = "//*[@id=\"hb__root\"]/div/main/div[2]/form/div[2]/ul/li")
    private WebElement OTPNotification;

    public void throwRandomNumber() {

        Random rand = new Random(System.currentTimeMillis());
        int digit6 = rand.nextInt(999999) ;
        OTPField.sendKeys(Integer.toString(digit6));


    }

    //Seems like it runs only on JDK 8 or lower.
//    public void throwOTPError(){
//
//
//        boolean bool = OTPNotification.isDisplayed();
//        Assert.that(true, String.valueOf(bool));
//        System.out.println("Mobile OTP Verification Failed.");
//
//    }

}
