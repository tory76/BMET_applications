package StepDefinations;

import Pages.BMETRegistrationPage;
import Pages.Settings_Page;
import Utility.Hooks;
import Utility.SmartWait;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.text.StringEscapeUtils;
import org.junit.Assert;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BMETRegistrationStep {

    public WebDriver driver;

    BMETRegistrationPage bmetRegistrationPage;
    SmartWait smartWait = new SmartWait();

    public BMETRegistrationStep() {
        this.driver = Hooks.getDriver();
        bmetRegistrationPage = new BMETRegistrationPage (driver);
    }
    public void waitload() {
        new WebDriverWait(driver, 40).until(
                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
    }

    @When("user clicks on BMET button")
    public void user_clicks_on_BMET_button() throws Exception {
        bmetRegistrationPage.BMETRegis();
        waitload();
        Thread.sleep(2000);
    }

    @And("user upload passport")
    public void user_upload_passport() throws Exception {

        Thread.sleep(2000);
        bmetRegistrationPage.uploadBtn();
        waitload();

    }

    @And("user inputs passport number")
    public void user_inputs_passport_number()  {
        bmetRegistrationPage.passportNumber();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @And("user inputs mobile number")
    public void user_inputs_mobile_number() throws InterruptedException {
        bmetRegistrationPage.mobileNo();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }


    @And("user inputs full name")
    public void user_inputs_full_name() throws InterruptedException {
        bmetRegistrationPage.fullName();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }


    @And("user inputs passport information")
    public void user_inputs_passport_information() throws InterruptedException {
        bmetRegistrationPage.passportInfo();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @And("user select gender")
    public void user_select_hisher_gender() throws InterruptedException {
        bmetRegistrationPage.gender();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


}
