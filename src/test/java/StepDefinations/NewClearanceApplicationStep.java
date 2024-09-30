package StepDefinations;

import Pages.NewClearanceApplicationPage;
import Utility.Hooks;
import Utility.SmartWait;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class NewClearanceApplicationStep {

    public WebDriver driver;

    NewClearanceApplicationPage newClearanceApplicationPage;

    SmartWait smartWait = new SmartWait();

    public NewClearanceApplicationStep () {

        this.driver = Hooks.getDriver();
        newClearanceApplicationPage = new NewClearanceApplicationPage(driver);

    }

    public void waitload()
    {

        new WebDriverWait(driver,40).until (
                webDriver -> ((JavascriptExecutor) webDriver).executeScript
                        ("return document.readyState").equals("complete"));
    }

    @When("user clicks on New Clearance Application button")
    public void user_clicks_New_Clearance_button ()throws Exception {

        newClearanceApplicationPage.NewClearanceBtn();
        waitload();
        Thread.sleep(2000);
    }

    @And("user clicks on Start new BMET Clearance Application")
    public void user_clicks_Start_New_Clearance_Application() throws Exception {

        newClearanceApplicationPage.StartNewApplication();
        waitload();
        Thread.sleep(1000);

    }

//    @And("user clicks on close button")
//    public void user_clicks_close_button () throws Exception {
//        newClearanceApplicationPage.Close();
//        Thread.sleep(1000);
//    }

    @And("user select country")
    public void user_select_country () throws Exception {

        newClearanceApplicationPage.select_Country();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @And("user select clearance type")
    public void user_select_clearance_type() throws Exception {

        newClearanceApplicationPage.select_clearance_type();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @And("user clicks on continue button")
    public void user_clicks_continue_button() throws Exception {

        newClearanceApplicationPage.clicks_continue_button();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @When("user clicks Pull from posted jobs")
    public void user_clicks_Pull_from_posted_jobs() throws Exception{

        newClearanceApplicationPage.click_Pull_from_posted_jobs();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @And("user select jobs")
    public void user_select_jobs() throws Exception {

        newClearanceApplicationPage.user_selects_posted_jobs();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @And("user click Add Candidate")
    public void user_click_Add_Candidate() throws Exception {

        newClearanceApplicationPage.click_Add_Candidate();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @And("user gives passport number")
    public void user_gives_passport_number() throws Exception {

        newClearanceApplicationPage.gives_passport_number();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @And("user gives Visa info")
    public void user_gives_Visa_info() throws Exception{

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", newClearanceApplicationPage.visaNumber);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        newClearanceApplicationPage.gives_Visa_info();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

//    @And("user upload visa document")
//    public void userUploadVisaDocument() throws Exception {
//
//        newClearanceApplicationPage.user_Upload_VisaDocument();
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//
//    }

    @And("user click submit candidate")
    public void click_submit_candidate() throws Exception {

        newClearanceApplicationPage.submit_candidate();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @And("user click next button")
    public void click_next_step() throws Exception {

        newClearanceApplicationPage.next_Step();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @And("user click next button two")
    public void click_next_button_two() throws Exception {

        newClearanceApplicationPage.next_Step_2();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    }

    @And("user click checkbox for payment")
    public void user_click_checkbox_for_payment() throws Exception {


        newClearanceApplicationPage.click_checkbox_for_payment();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

    }

    @And("user click Proceed to Payment button")
    public void user_click_Proceed_to_Payment_button() throws Exception {

        newClearanceApplicationPage.click_Proceed_to_Payment_button();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

    }

    @And("user click SBL button")
    public void user_click_SBL_button() throws Exception {

        newClearanceApplicationPage.click_SBL_button();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    }

    @And("user click Account button")
    public void user_click_Account_button () throws Exception {

        newClearanceApplicationPage.click_Account_button ();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

    }

    @And("user click Confirm button")
    public void user_click_Confirm_button() throws Exception {

        newClearanceApplicationPage.click_Confirm_button();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    }

    @And("user gives Account info")
    public void user_gives_Account_info() throws Exception {

        newClearanceApplicationPage.gives_Account_info();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    }

//    @And("user click Add Bulk candidate")
//    public void user_click_Add_Bulk_candidate () throws Exception {
//
//        newClearanceApplicationPage.click_Add_Bulk_candidate ();
//        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//    }

//    @And("user search specific passport number")
//    public void user_search_specific_passport_number() throws Exception {
//
//        newClearanceApplicationPage.search_specific_passport_number();
//        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//    }
//
//    @And("user can view candidate")
//    public void user_can_view_candidate () throws Exception {
//
//        newClearanceApplicationPage.can_view_candidate();
//        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//    }

//    @And("user again gives Visa info")
//    public void user_again_gives_Visa_info() throws Exception {
//
//        newClearanceApplicationPage.again_gives_Visa_info();
//        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//    }

//    @And("user click update button")
//    public void user_click_update_button () throws Exception {
//
//        newClearanceApplicationPage.click_update_button();
//        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//    }

//    @And("user click remove candidate btn")
//    public void user_click_remove_candidate_btn() throws Exception {
//
//        newClearanceApplicationPage.click_remove_candidate_btn();
//        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//    }



}


