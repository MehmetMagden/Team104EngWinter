package day01_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_driver_get {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        // The driver we wish to use in our project

        WebDriver driver = new ChromeDriver();
        // we have created driver object


        driver.get("https://www.amazon.com");
        // driver.get(url) takes browser to the url

        Thread.sleep(3000);


        /*

        We have installed Selenium jar files nad chrome driver to our project

        If I want to use different browser I need to download their drivers from the website and
        show them to the project( exp: line 10)

        Line 13: we have created an object from ChromeDriver() constructor.

        line 17 : we may delete www part but we can not delete https:// part


         */


        driver.close();






    }

}
