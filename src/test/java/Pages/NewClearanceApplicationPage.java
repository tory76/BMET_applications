package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewClearanceApplicationPage {

    public static WebDriver driver;

    @FindBy(xpath ="(//p[@class='ml-2'])[3]")
    public WebElement NewClearanceBtn;

    @FindBy(className="new_bmet_clearance_btn")
    public WebElement startNewApplication;

//    @FindBy(xpath = "//button[@class='btn btn-secondary']")
//    public WebElement close;

    @FindBy(id ="select2-countryId-container")
    public WebElement country;

    @FindBy(xpath ="//*[@id=\"kt_body\"]/span/span/span[1]/input")
    public WebElement searchCountry;
    @FindBy(xpath ="//select[@class='form-control']")
    public WebElement clearanceType;

    @FindBy(id ="select2-countryId-result-7pmn-194")
    public WebElement Type;



    @FindBy(xpath ="//button[contains(@class,'btn px-5')]")
    public WebElement continuebtn;

    @FindBy(xpath ="//*[@id=\"job_details\"]/div/div[1]/div/div")
    public WebElement PullfromPostedJobs;

    @FindBy(xpath ="(//input[@type='checkbox'])[2]")
    public WebElement selectJob;

    @FindBy(xpath ="//button[contains(@class,'btn px-5')]")
    public WebElement clickAddjob;

    @FindBy(xpath ="(//button[contains(@class,'btn btn-success')])[2]")
    public WebElement ClickAddcandidate;

    @FindBy (id ="PassportNumber" )
    public WebElement passportNumber;

    @FindBy(xpath ="//button[text()=' Search']")
    public WebElement searchCandidate;

    @FindBy(xpath ="//a[@class='add-another-doc']/following-sibling::button[1]")
    public WebElement submit;

    //here  is the issue of ok button
    @FindBy(xpath ="//button[@class='btn btn-default']")
    public WebElement ok;

    @FindBy(xpath ="/html/body/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div/div[8]/div[1]/div/div[2]/div[3]/div[4]/div/div[1]/div/div/div[1]/div[1]/input")
    public WebElement visaNumber;


   
    @FindBy(xpath ="//*[@id=\"newAddCandidate\"]/div[1]/div/div[2]/div[3]/div[4]/div/div[1]/div/div/div[1]/div[2]/div/div[1]/div/select")
    public WebElement issuDate;


    @FindBy(xpath ="//*[@id=\"newAddCandidate\"]/div[1]/div/div[2]/div[3]/div[4]/div/div[1]/div/div/div[1]/div[2]/div/div[2]/div/select")
    public WebElement issuMonth;


    @FindBy(xpath ="//*[@id=\"newAddCandidate\"]/div[1]/div/div[2]/div[3]/div[4]/div/div[1]/div/div/div[1]/div[2]/div/div[3]/div/select")
    public WebElement issuYear;

    @FindBy(xpath ="//*[@id=\"newAddCandidate\"]/div[1]/div/div[2]/div[3]/div[4]/div/div[1]/div/div/div[2]/div[2]/div/div[1]/div/select")
    public WebElement expiryDate;

    @FindBy(xpath ="//*[@id=\"newAddCandidate\"]/div[1]/div/div[2]/div[3]/div[4]/div/div[1]/div/div/div[2]/div[2]/div/div[2]/div/select")
    public WebElement ExpiryMonth;

    @FindBy(xpath ="//*[@id=\"newAddCandidate\"]/div[1]/div/div[2]/div[3]/div[4]/div/div[1]/div/div/div[2]/div[2]/div/div[3]/div/select")
    public WebElement ExpiryYear;

    @FindBy(xpath ="//*[@id=\"newAddCandidate\"]/div[1]/div/div[2]/div[3]/div[4]/div/div[1]/div/div/div[1]/div[3]/input")
    public WebElement AttestationRefno;

    @FindBy(xpath ="//*[@id=\"newAddCandidate\"]/div[1]/div/div[2]/div[3]/div[4]/div/div[1]/div/div/div[2]/div[3]/div/div[1]/div/select")
    public WebElement AttestationDate;

    @FindBy(xpath ="//*[@id=\"newAddCandidate\"]/div[1]/div/div[2]/div[3]/div[4]/div/div[1]/div/div/div[2]/div[3]/div/div[2]/div/select")
    public WebElement AttestationMonth;

    @FindBy(xpath ="//*[@id=\"newAddCandidate\"]/div[1]/div/div[2]/div[3]/div[4]/div/div[1]/div/div/div[2]/div[3]/div/div[3]/div/select")
    public WebElement AttestationYear;

    @FindBy(xpath ="/html/body/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div/div[7]/div[1]/div/div[2]/div/div[4]/div/div[2]/div/div/div/button")
    public WebElement uploadVisaDoc;


    @FindBy(xpath ="//*[@id=\"candidateView\"]/div[1]/div/div[3]/div/div[3]/a")
    public WebElement nextCandidate;



   @FindBy(xpath ="//*[@id=\"draft_candidate\"]/div[1]/div[1]/div[1]/div[2]/div/div/div[1]/a")
   public WebElement addBulkCandidate;

   @FindBy(xpath ="//*[@id=\"addBulkCandidateModal\"]/div/div/div[2]/div[1]/div[2]/div/input")
   public WebElement enterPassportNumber;

   @FindBy(xpath ="//*[@id=\"addBulkCandidateModal\"]/div/div/div[2]/div[1]/div[1]/div/select")
   public WebElement selectJobforBulk;

   @FindBy(xpath ="//*[@id=\"addBulkCandidateModal\"]/div/div/div[2]/div[1]/div[3]/div/button")
   public WebElement searchBulkCandidate;

   @FindBy(xpath = "//*[@id=\"addBulkCandidateModal\"]/div/div/div[2]/div[3]/div/div/div/div[1]/div/button")
   public WebElement pullMissingData;

    //*[@id="addBulkCandidateModal"]/div/div/div[2]/div[2]/table/thead/tr/th[1]/input
    //*[@id="addBulkCandidateModal"]/div/div/div[2]/div[3]/div/div/div/div[1]/div/button
    //*[@id="addBulkCandidateModal"]/div/div/div[2]/div[3]/div/div/div/div[1]/div/button


   @FindBy(xpath = "//*[@id=\"pullBmetDataModal\"]/div/div/div/div[2]/div/div/div/button[2]")
   public WebElement confirmforpulldata;

    @FindBy(xpath ="//*[@id=\"addBulkCandidateModal\"]/div/div/div[2]/div[2]/table/thead/tr/th[1]/input")
   public WebElement checkBoxforMultiCandidate;

//    //*[@id="kt_body"]
//    (//th[@class='text-center']//input)[2]
//    //*[@id="addBulkCandidateModal"]/div/div/div[2]/div[2]/table/thead/tr/th[1]/input

   @FindBy(xpath ="//*[@id=\"addBulkCandidateModal\"]/div/div/div[3]/button")
   public WebElement addCandidates;

    //*[@id="addBulkCandidateModal"]/div/div/div[3]/button

   @FindBy(xpath = "//*[@id=\"draft_candidate\"]/div[1]/div[1]/div[2]/div[1]/div/input")
   public WebElement searchPassport;

   @FindBy(xpath = "//*[@id=\"draft_candidate\"]/div[1]/div[4]/table/tbody/tr[1]/td[12]/div/button/img")
   public WebElement actionbtn;

   @FindBy(xpath ="//*[@id=\"draft_candidate\"]/div[1]/div[4]/table/tbody/tr[1]/td[12]/div/div/span/a[1]")
   public WebElement viewClearanceCandidate;
    //*[@id="draft_candidate"]/div[1]/div[4]/table/tbody/tr[1]/td[12]/div/div/span/a[1]
    //*[@id="kt_body"]
    //*[@id="draft_candidate"]/div[1]/div[4]/table/tbody/tr[3]/td[12]/div/div/span/a[1]
    //*[@id="draft_candidate"]/div[1]/div[4]/table/tbody/tr[1]/td[12]/div/div/span/a[1]
//    /html/body/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div/div[4]/div[1]/div[4]/table/tbody/tr[1]/td[12]/div/div/span/a[1]
   @FindBy(xpath = "//*[@id=\"draft_candidate\"]/div[1]/div[4]/table/tbody/tr[1]/td[12]/div/div/span/a[2]")
   public WebElement addVisaoptn;

   @FindBy(xpath ="//*[@id=\"addVisaModal\"]/div/div/div[2]/div[3]/input")
   public WebElement visaNumModal;

   @FindBy(xpath ="//*[@id=\"addVisaModal\"]/div/div/div[2]/div[4]/div[1]/div[1]/select")
   public WebElement visaIssudatemodal;

   @FindBy(xpath ="//*[@id=\"addVisaModal\"]/div/div/div[2]/div[4]/div[1]/div[2]/select")
   public WebElement visaIssumnthmodal;

   @FindBy(xpath ="//*[@id=\"addVisaModal\"]/div/div/div[2]/div[4]/div[1]/div[3]/select")
   public WebElement visaIssuyearmodal;

   @FindBy(xpath ="//*[@id=\"addVisaModal\"]/div/div/div[2]/div[5]/div[1]/div[1]/select")
   public WebElement visaExpiredatemodal;

   @FindBy(xpath ="//*[@id=\"addVisaModal\"]/div/div/div[2]/div[5]/div[1]/div[2]/select")
   public WebElement visaExpiremnthmodal;

   @FindBy(xpath="//*[@id=\"addVisaModal\"]/div/div/div[2]/div[5]/div[1]/div[3]/select")
   public WebElement visaExpireyearmodal;

   @FindBy(xpath="//*[@id=\"addVisaModal\"]/div/div/div[2]/div[8]/input")
   public WebElement sponsorIDmodal;

   @FindBy(xpath ="//*[@id=\"addVisaModal\"]/div/div/div[2]/div[13]/input")
   public WebElement attestationRefNomodal;

   @FindBy(xpath="//*[@id=\"addVisaModal\"]/div/div/div[2]/div[14]/div[1]/div[1]/div/select")
   public WebElement attestationRefdatemodal;

   @FindBy(xpath ="//*[@id=\"addVisaModal\"]/div/div/div[2]/div[14]/div[1]/div[2]/div/select")
   public WebElement attestationRefmnthmodal;

    @FindBy(xpath ="//*[@id=\"addVisaModal\"]/div/div/div[2]/div[14]/div[1]/div[3]/div/select")
    public WebElement attestationRefyearmodal;

   @FindBy(xpath ="//*[@id=\"addVisaModal\"]/div/div/div[2]/div[15]/a")
   public WebElement choosefileVisaDoc;
    //*[@id="addVisaModal"]/div/div/div[2]/div[15]/a
    //html/body/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div/div[4]/div[2]
   @FindBy(xpath = "//*[@id=\"addVisaModal\"]/div/div/div[2]/div[16]/button[2]")
   public WebElement addVisainfo;

   @FindBy(xpath = "//*[@id=\"kt_body\"]/div[7]/div[2]/div/div/div/div/div/div/div/div[4]/button")
   public WebElement okforVisainfo;


   @FindBy(xpath="//*[@id=\"candidateView\"]/div[1]/div/div[2]/div/div[4]/div/div[1]/div/div/div/button")
   public WebElement uploadVisadocViewModal;

    //button[@class='btn_view']
    //*[@id="candidateView"]/div[1]/div/div[3]/div/div[2]/button

   @FindBy(xpath ="//button[@class='btn btn-default']")
   public WebElement okforVisadocupload;

    //*[@id="kt_body"]/div[6]/div[2]/div/div/div/div/div/div/div/div[4]/button
   //html/body/div[6]/div[2]/div/div/div/div/div/div/div/div[4]/button
   @FindBy(xpath ="//*[@id=\"candidateView\"]/div[1]/div/div[3]/div/div[2]/button")
   public WebElement updatebtn;

    @FindBy(xpath ="//button[text()=' Next']")
    public WebElement nextStep;

    @FindBy(xpath ="(//button[text()=' Next'])[2]")
    public WebElement nextStep_2;

    @FindBy(xpath ="//div[@id='payment']/div[1]/div[3]/div[1]/label[1]/span[1]")
    public WebElement checkboxPayment;

    @FindBy(xpath ="//a[@data-target='#bmetClearancePay']")
    public WebElement ProcedtoPayment;

    @FindBy(xpath ="//img[@src='/public/img/sonali _01.png']")
    public WebElement sblbtn;

    @FindBy (id ="//button[@id='btn']")
    public WebElement accountbtn;

    @FindBy(xpath ="//button[text()='Confirm']")
    public WebElement confirmbtn;

    @FindBy(id ="PayAccountNo")
    public WebElement accountNum;

    @FindBy (id ="PayAccountName")
    public WebElement accountName;

    @FindBy (id ="PayMobile")
    public WebElement mobileNum;

    @FindBy(xpath = "//button[@id='btn']")
    public WebElement accountNextbtn;

    @FindBy(xpath ="(//button[@id='btn'])[2]")
    public WebElement exitbtn;

    @FindBy(id ="OTPVal")
    public WebElement otpVal;

    @FindBy(id ="btnConfirm")
    public WebElement confirmPayment;

   @FindBy(xpath ="//*[@id=\"payment\"]/div[1]/div[4]/button")
   public WebElement rmoveCandidate;

    public NewClearanceApplicationPage (WebDriver driver) { PageFactory.initElements(driver, this);
    }
    public void NewClearanceBtn() throws InterruptedException {

        NewClearanceBtn.click();
        Thread.sleep(1000);
    }

    public void StartNewApplication() throws InterruptedException {

        startNewApplication.click();
        Thread.sleep(1000);
    }

//    public void Close() {
//
//      close.click();
//    }

    public void select_Country() throws InterruptedException{

            country.click();
            Thread.sleep(1000);
            searchCountry.sendKeys("Singapore");
            Thread.sleep(1000);
            searchCountry.sendKeys(Keys.ARROW_DOWN);
            Thread.sleep(1000);
            searchCountry.sendKeys(Keys.ENTER);
            Thread.sleep(1000);
//        country.sendKeys(Keys.ARROW_DOWN);
//        country.sendKeys(Keys.ARROW_DOWN);
//        country.sendKeys(Keys.ARROW_DOWN);
//        country.sendKeys(Keys.ARROW_DOWN);
//        country.sendKeys(Keys.ARROW_DOWN);
//        country.sendKeys(Keys.ENTER);


//             searchCountry.sendKeys("Oman");
//             Thread.sleep(1000);
//



    }

    public void select_clearance_type() throws InterruptedException {

        Thread.sleep(2000);
        clearanceType.click();
        Thread.sleep(2000);
        clearanceType.sendKeys("Individual (1-24)");
        Thread.sleep(2000);
        clearanceType.sendKeys(Keys.ENTER);

    }

    public void clicks_continue_button() {

        continuebtn.click();
    }

    public void click_Pull_from_posted_jobs() throws InterruptedException {

        PullfromPostedJobs.click();
        Thread.sleep(1000);
    }

    public void user_selects_posted_jobs() throws InterruptedException{


         Thread.sleep(1000);
         selectJob.click();
         Thread.sleep(1000);
         clickAddjob.click();
    }

    public void click_Add_Candidate() throws InterruptedException {

        Thread.sleep(1000);
        ClickAddcandidate.click();
    }

    public void gives_passport_number() throws InterruptedException {


        Thread.sleep(1000);
        passportNumber.click();
        Thread.sleep(2000);
        passportNumber.sendKeys("H42305753");
        Thread.sleep(2000);
        searchCandidate.click();


    }

    public void gives_Visa_info() throws InterruptedException {

        Thread.sleep(2000);
        visaNumber.sendKeys("M1115833");
        Thread.sleep(5000);
        issuDate.click();
        Thread.sleep(2000);
        issuDate.sendKeys("15");
        Thread.sleep(2000);
        issuDate.sendKeys(Keys.ENTER);

        Thread.sleep(2000);
        issuMonth.click();
        Thread.sleep(2000);
        issuMonth.sendKeys("Feb");
        Thread.sleep(2000);
        issuMonth.sendKeys(Keys.ENTER);


        Thread.sleep(5000);
        issuYear.click();
        Thread.sleep(5000);
        issuYear.sendKeys("2022");
        Thread.sleep(5000);
        issuYear.sendKeys(Keys.ENTER);


        Thread.sleep(2000);
        expiryDate.click();
        Thread.sleep(2000);
        expiryDate.sendKeys("7");
        Thread.sleep(2000);
        expiryDate.sendKeys(Keys.ENTER);

        Thread.sleep(2000);
        ExpiryMonth.click();
        Thread.sleep(2000);
        ExpiryMonth.sendKeys("Aug");
        Thread.sleep(2000);
        ExpiryMonth.sendKeys(Keys.ENTER);


        Thread.sleep(2000);
        ExpiryYear.click();
        Thread.sleep(2000);
        ExpiryYear.sendKeys("2025");
        Thread.sleep(2000);
        ExpiryYear.sendKeys(Keys.ENTER);


           Thread.sleep(2000);
           AttestationRefno.sendKeys("5676586");
            Thread.sleep(2000);
            AttestationDate.click();
            Thread.sleep(2000);
            AttestationDate.sendKeys("6");
            Thread.sleep(2000);
            AttestationDate.sendKeys(Keys.ENTER);
            Thread.sleep(2000);
            AttestationMonth.click();
            Thread.sleep(2000);
            AttestationMonth.sendKeys("March");
            Thread.sleep(2000);
            AttestationMonth.sendKeys(Keys.ENTER);
            Thread.sleep(2000);
            AttestationYear.click();
            Thread.sleep(2000);
            AttestationYear.sendKeys("2023");


           Thread.sleep(2000);
           uploadVisaDoc.sendKeys("File\\pdo_enrollment_card_A20504310.pdf");
       // uploadVisaDoc.click();



    }




    public void submit_candidate() throws InterruptedException{

        Thread.sleep(2000);
        submit.click();
        Thread.sleep(2000);
        ok.click();

    }

//    public void click_Add_Bulk_candidate() throws InterruptedException{
//
//        Thread.sleep(2000);
//        addBulkCandidate.click();
//        Thread.sleep(2000);
//        enterPassportNumber.sendKeys("A00281244,A00281252");
//        Thread.sleep(3000);
//        selectJobforBulk.click();
//        Thread.sleep(2000);
//        selectJobforBulk.sendKeys(Keys.ARROW_DOWN);
//        Thread.sleep(2000);
//        selectJobforBulk.sendKeys(Keys.ENTER);
//        System.out.println("0");
//        Thread.sleep(2000);
//        searchBulkCandidate.click();
//        System.out.println("1");
//        Thread.sleep(3000);
//
//        pullMissingData.click();
//        System.out.println("2");
//        Thread.sleep(2000);
//        confirmforpulldata.click();
//        System.out.println("3");
//        Thread.sleep(3000);
//        checkBoxforMultiCandidate.click();
//        System.out.println("4");
//        Thread.sleep(2000);
//        addCandidates.click();
//        System.out.println("5");
//
//
//    }


//    public void search_specific_passport_number() throws InterruptedException{
//
//        Thread.sleep(2000);
//        searchPassport.sendKeys("H79309759");
//
//
//    }

//    public void can_view_candidate() throws InterruptedException {
//
//        Thread.sleep(2000);
//        actionbtn.click();
//        Thread.sleep(2000);
//        viewClearanceCandidate.click();
//        System.out.println("View");
//        Thread.sleep(2000);
//
//
//        Thread.sleep(3000);
//           uploadVisaDoc.sendKeys("File\\pdo_enrollment_card_A20504310.pdf");
//
//        Thread.sleep(5000);
//           System.out.println("nnnnnnn");
//        // uploadVisaDoc.click();
////        uploadVisadocViewModal.sendKeys("C:\\Users\\meherin.amir\\pdo_enrollment_card_A20504310.pdf");
////        String a;
////        a=uploadVisadocViewModal.getText();
////        System.out.println(a);
//
////        WebDriverWait wait = new WebDriverWait(driver,20);
////        WebElement clickableXyz = wait.until(ExpectedConditions.elementToBeClickable(uploadVisadocViewModal));
////        clickableXyz.sendKeys("C:\\Users\\meherin.amir\\pdo_enrollment_card_A20504310.pdf");
//
//    }

//    public void click_update_button() throws InterruptedException {
//
//        Thread.sleep(2000);
//        updatebtn.click();
//        System.out.println("update");
//        Thread.sleep(2000);
//        okforVisadocupload.click();
//        System.out.println("okupdate");
//    }

    public void next_Step() throws InterruptedException{

        Thread.sleep(2000);
        nextStep.click();
    }

    public void next_Step_2() throws InterruptedException{

        Thread.sleep(2000);
        nextStep_2.click();
    }

//    public void click_remove_candidate_btn() throws InterruptedException {
//
//        Thread.sleep((2000));
//        rmoveCandidate.click();
//    }

    public void click_checkbox_for_payment() throws InterruptedException {

        Thread.sleep(2000);
        checkboxPayment.click();
    }

    public void click_Proceed_to_Payment_button() throws InterruptedException{

        Thread.sleep(2000);
        ProcedtoPayment.click();

    }



    public void click_SBL_button() throws InterruptedException  {

        Thread.sleep(2000);
        sblbtn.click();

    }

    public void click_Account_button() throws InterruptedException {

        Thread.sleep(2000);
        accountbtn.click();

    }

    public void click_Confirm_button() throws InterruptedException{

        Thread.sleep(2000);
        confirmbtn.click();
    }

    public void gives_Account_info() throws InterruptedException {


        Thread.sleep(2000);
        accountNum.sendKeys("1234567891011");
        Thread.sleep(2000);
        accountName.sendKeys("test");
        Thread.sleep(2000);
        mobileNum.sendKeys("11111111111");
        Thread.sleep(2000);
        accountNextbtn.click();
//        Thread.sleep(2000);
//        exitbtn.click();
        Thread.sleep(2000);
        otpVal.sendKeys("123456");
        Thread.sleep(2000);
        confirmPayment.click();
    }



}

