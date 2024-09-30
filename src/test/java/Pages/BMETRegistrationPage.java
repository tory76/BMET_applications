package Pages;

import Utility.BaseData;
import Utility.CommonPageMethods;
import Utility.Random_data;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class BMETRegistrationPage {

    public static WebDriver driver;

   @FindBy(xpath = "//*[@id=\"admin-app\"]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/a")
    public WebElement bmetaRgsBtn;

    @FindBy(id = "kt_uppy_5_input_control")
    public WebElement UploadBtn;

    @FindBy(id = "issue_date")
    public WebElement IssuDate;
    @FindBy(xpath = "//*[@id=\"issue_month\"]")
    public WebElement Issumnth;

    @FindBy(id = "issue_year")
    public WebElement Issuyear;

    @FindBy(id = "full_name")
    public WebElement FName;
    @FindBy(id = "passport_number")
    public WebElement PassportNo;

    @FindBy(id = "mobile_number")
    public WebElement MobileNo;


    @FindBy(id = "expire_date")
    public WebElement ExpireDate;
    @FindBy(id = "expire_month")
    public WebElement ExpireMonth;

    @FindBy(id = "expire_year")
    public WebElement ExpireYear;

    @FindBy(id="male")
    public WebElement Gender;


    @FindBy(id = "birth_date")
    public WebElement dateofB;

    @FindBy(id = "birth_month")
    public WebElement dateofM;

    @FindBy(id = "birth_year")
    public WebElement dateofY;


    public BMETRegistrationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void BMETRegis()
    {
        bmetaRgsBtn.click();

    }

    public void uploadBtn() throws InterruptedException {

        UploadBtn.sendKeys("D:\\passport\\p1.jpeg");
    }

    public void passportNumber() {
        PassportNo.sendKeys(Random_data.passportNumber());
    }

    public void mobileNo() throws InterruptedException {
        Thread.sleep(3000);
        MobileNo.sendKeys(Random_data.phoneNumber());
    }

    public void fullName() throws InterruptedException {
        Thread.sleep(3000);
        FName.sendKeys(Random_data.fullName());
    }

    public void passportInfo() throws InterruptedException {

        IssuDate.click();
        Thread.sleep(2000);
        IssuDate.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        IssuDate.sendKeys(Keys.ENTER);

        Thread.sleep(2000);
        Issumnth.click();
        Thread.sleep(2000);
        Issumnth.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        Issumnth.sendKeys(Keys.ENTER);


        Thread.sleep(2000);
        Issuyear.click();
        Thread.sleep(2000);
        Issuyear.sendKeys(Keys.ARROW_DOWN);
        Issuyear.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        Issuyear.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        Issuyear.sendKeys(Keys.ENTER);



        Thread.sleep(2000);
        ExpireDate.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        ExpireDate.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        ExpireDate.sendKeys(Keys.ENTER);



        Thread.sleep(2000);
        ExpireMonth.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        ExpireMonth.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        ExpireMonth.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        ExpireMonth.sendKeys(Keys.ENTER);



        Thread.sleep(2000);
        ExpireYear.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        ExpireYear.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        ExpireYear.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        ExpireYear.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        ExpireYear.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        ExpireYear.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        ExpireYear.sendKeys(Keys.ENTER);


        Thread.sleep(2000);
        dateofB.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        dateofB.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        dateofB.sendKeys(Keys.ENTER);


        Thread.sleep(2000);
        dateofM.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        dateofM.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        dateofM.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        dateofM.sendKeys(Keys.ENTER);

        Thread.sleep(2000);
        dateofY.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        dateofY.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        dateofY.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        dateofY.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        dateofY.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        dateofY.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        dateofY.sendKeys(Keys.ENTER);

    }

    public void gender() throws InterruptedException {
        Thread.sleep(3000);
        Gender.click();
    }
}
