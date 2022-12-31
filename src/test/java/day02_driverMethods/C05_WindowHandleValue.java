package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_WindowHandleValue {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // every tap in a browser has a different value, we use these values to jump between taps
        System.out.println(driver.getWindowHandle());

        driver= new ChromeDriver();

        System.out.println(driver.getWindowHandle());


        Thread.sleep(5000);
        driver.close();

    }


}
