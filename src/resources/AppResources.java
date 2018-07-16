package resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppResources {
  WebDriver driver;

  public AppResources(WebDriver driver) {
    this.driver = driver;
  }

  public WebElement TryForFree() {
    return driver.findElement(By.xpath("//a[@class='btn navbar__btn-register']"));
  }

  public WebElement FirstName() {
    return driver.findElement(By.xpath(".//*[@id='fname']"));
  }

  public WebElement LastName() {
    return driver.findElement(By.xpath(".//*[@id='lname']"));
  }

  public WebElement EmailID() {
    return driver.findElement(By.xpath(".//*[@id='email']"));
  }

  public WebElement Company() {
    return driver.findElement(By.xpath(".//*[@id='company']"));
  }

  public WebElement Password() {
    return driver.findElement(By.xpath(".//*[@id='password']"));
  }

  public WebElement TAndC() {
    return driver.findElement(By.xpath(".//*[@id='eula']"));
  }

  public WebElement SignUp() {
    return driver.findElement(By.xpath(".//*[@id='submit']"));
  }




  public WebElement AppName() {
    return driver.findElement(By.xpath(".//input[@id='zet-app-name']"));
  }

  public WebElement Android() {
    return driver.findElement(By.xpath("//li[@id='zet-icon-android']"));
  }

  public WebElement AddApplication() {
    return driver.findElement(By.xpath("//button[@id='zet-create-app']"));
  }




  public WebElement DownArrow() {
    return driver.findElement(By.xpath("//li[@class='navbar-last ng-isolate-scope']//"
        + "span[@class='ng-binding']"));
  }

  public WebElement SignOut() {
    return driver.findElement(By.xpath("//a[@id='zet-navbar-signout']"));
  }

}
