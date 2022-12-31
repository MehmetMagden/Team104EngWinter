package day02_driverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C07_DriverfindElementMethod {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");

        // We found a unique statement for the webelement to show it to our driver
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));



        // by using webelement "searchbox" I wrote Nutella on the seachbox
        searchBox.sendKeys("Nutella");
        // by using sebelement I pressed enter
        searchBox.submit();

        driver.close();


    }



}
