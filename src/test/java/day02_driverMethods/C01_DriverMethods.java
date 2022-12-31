package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethods {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");

        // test If expected URL "https://www.amazon.com/" and actual URL are same

        String expectedUrl = "https://www.amazon.com";

        String actualUrl = driver.getCurrentUrl();

        if(expectedUrl.equals(actualUrl)){

            System.out.println("URL test PASSED");
        }else {
            System.out.println("URL test FAILED");
            System.out.println("Expected URL : "+expectedUrl);
            System.out.println("Actual   URL : "+actualUrl);

        }

        // test if the title contains "amazon" keyword.

        String expectedWord = "amazon";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedWord)){
            System.out.println("Title Tests PASSED");

        }else {
            System.out.println("Title Tests FAILED");
            System.out.println("Expected word is : " +expectedWord);
            System.out.println("Actual Title is : "+ actualTitle);
        }

        Thread.sleep(3000);
        driver.close();



    }
}
