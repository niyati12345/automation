import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Register {

        protected static WebDriver driver;
        public static void main(String srgs[]) {
            System.setProperty("webdriver.chrome.driver", "src\\BrowserDriver\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();

            //open the brwser
            driver = new ChromeDriver();
            //maximise the browser window screen
            driver.manage().window().fullscreen();
            //set implicity wait for driver object
            driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
            //open the website
            driver.get("https://demo.nopcommerce.com/");
            //login
driver.findElement(By.xpath("//a[@href=\"/login?returnUrl=%2F\"]")).click();
driver.findElement(By.className("email")).sendKeys("niyatipatel141193@gmail.com");
driver.findElement(By.className("password")).sendKeys("niy12345");
driver.findElement(By.xpath("//input[@class=\"button-1 login-button\"]")).click();
//click on register button
          // driver.findElement(By.xpath("//a[@class='ico-register']")).click();
           //enter firstname
          // driver.findElement(By.id("FirstName")).sendKeys("niya");
            //enter last name
           // driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("patel");
           // driver.findElement(By.name("Email")).sendKeys("testtest@test1.com");
           // driver.findElement(By.name("Password")).sendKeys("niy123");
           // driver.findElement(By.xpath("//input[@data-val-equalto-other=\"*.Password\"]")).sendKeys("niy123");
            //driver.findElement(By.name("register-button")).click();
            //click on apple macbook
            driver.findElement(By.linkText("Apple MacBook Pro 13-inch")).click();
           // driver.findElement(By.xpath("//h2/a[@href=\"/electronics\"]")).click();
            //aend a email
            driver.findElement(By.xpath("//div[@class='email-a-friend']")).click();
            //friends email
            driver.findElement(By.className("friend-email")).sendKeys("niyati141193@gmail.com");
           //your email
            //input[@class="your-email"]
            //driver.findElement(By.xpath("//input[@class=\"your-email\"]")).;
            //message
            driver.findElement(By.xpath("//textarea[@placeholder='Enter personal message (optional).']")).sendKeys("hi");
            //send email
            driver.findElement(By.name("send-email")).click();
            driver.close();

        }
}
