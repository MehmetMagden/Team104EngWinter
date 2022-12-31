package day02_driverMethods;

import jdk.swing.interop.SwingInterOpUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_DriverMethods {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");

        // test that if page source code has "MEOW" keyword

        String pageSourceText = driver.getPageSource();
        String expectedWord =  "meaningful";


        if (pageSourceText.contains(expectedWord)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }

        //System.out.println(pageSourceText);

        driver.close();


    }

}
