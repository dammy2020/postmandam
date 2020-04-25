package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logintest{

    private WebDriver driver;



    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.postman.com/");
        Thread.sleep(5000);

//1. maximize the window
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        driver.findElement(By.id("username")).sendKeys("akinloyedamilola");
        driver.findElement(By.id("password")).sendKeys("dami3228.");
        driver.findElement(By.id("loginbutton")).click();

    }

    public static void main(String args[]) throws InterruptedException {
        logintest test = new logintest();
        test.setUp();
    }

}
