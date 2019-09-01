import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test {
    protected static WebDriver driver;
    public static void main(String []args){
   System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver_win32\\chromedriver.exe");

   //open the brwser
    driver = new ChromeDriver();
    //maximise the browser window screen
    driver.manage().window().fullscreen();
    //set implicity wait for driver object
    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    //open the website
     driver.get("https://demo.nopcommerce.com/");

//click on register button
  driver.findElement(By.xpath("//a[@class='ico-register']")).click();
  //enter firstname
       driver.findElement(By.id("FirstName")).sendKeys("niyati");
       //enter last name
        driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("patel");
        driver.findElement(By.name("Email")).sendKeys("testtest@test12345678.com");

       driver.close();



    }
}