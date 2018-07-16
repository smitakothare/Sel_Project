package tests;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.AppResources;

public class TestOne {
  WebDriver driver;


  @BeforeSuite
  public void setUp(){
    System.setProperty("webdriver.chrome.driver","/usr/local/google/home/kothare/Downloads"
        + "/chromedriver");
    driver = new ChromeDriver();
  }
  
  @BeforeTest
  public void LaunchURL(){

    driver.get("https://apptimize.com/");
    driver.manage().window().maximize();

  }


  @Test
  public void SignUp(){

    AppResources newAccount = new AppResources(driver);
    newAccount.TryForFree().click();

    newAccount.FirstName().sendKeys("Smita");
    newAccount.LastName().sendKeys("Kothare");
    newAccount.EmailID().sendKeys("app.ti.mize.test12345@gmail.com");
    newAccount.Company().sendKeys("Apptimize Candidate");
    newAccount.Password().sendKeys("Apptimize");
    newAccount.TAndC().click();
    newAccount.SignUp().click();

    WebDriverWait wait = new WebDriverWait(driver,30);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//input[@id='zet-app-name']")));


    newAccount.AppName().sendKeys("GoogleMaps");
    newAccount.Android().click();
    newAccount.AddApplication().click();


    newAccount.DownArrow().click();
    newAccount.SignOut().click();

  }
  
  @AfterTest
  public void CloseBrowser(){
    driver.quit();
  }



}
