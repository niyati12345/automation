import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class OrangeHrm {
    protected static WebDriver driver;

    public static void main(String srgs[]) {
        System.setProperty("webdriver.chrome.driver", "src\\BrowserDriver\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com/");
        //enter user name
        driver.findElement(By.name("txtUsername")).sendKeys("admin");
        // enter password
        //driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
driver.findElement(By.name("txtPassword")).sendKeys("admin123");
        //login
        driver.findElement(By.id("btnLogin")).click();
        //click on welcome admin
        driver.findElement(By.xpath("//a[@id=\"welcome\" and @class=\"panelTrigger\"]")).click();
       // click on logout
       //driver.findElement(By.xpath("//a[@href=\"/index.php/auth/logout\"]")).click();
        driver.findElement(By.linkText("Logout")).click();
        driver.close();
    }
}