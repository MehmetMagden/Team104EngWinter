package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverNavigateMethods {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //driver.navigate().to("https://www.amazon.com");
        driver.get("https://www.amazon.com");  // there is no difference from navigate() method if we are using it at the first line

        Thread.sleep(3000);

        driver.navigate().to("https://www.wisequarter.com");

        Thread.sleep(3000);

        driver.navigate().back();

        Thread.sleep(3000);

        driver.navigate().forward();

        Thread.sleep(3000);

        driver.quit();


    }

}
