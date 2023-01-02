package day03_Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Review {


    /*
    1- Go to the "https://www.amazon.com"
    2- Search for "Nutella"

     */

    public static void main(String[] args) {

        // 1 step, Set options

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //1- Go to the "https://www.amazon.com"
        driver.get("https://www.amazon.com");

        //2- Search for "Nutella"

        //WebElement  amazonTextSearchBox  =driver.findElement(By.id("twotabsearchtextbox"));
        WebElement  amazonTextSearchBox  = driver.findElement(By.name("field-keywords"));

        amazonTextSearchBox.sendKeys("Nutella"+ Keys.ENTER);

        //amazonTextSearchBox.submit();  // instead of using submit method, we can use Keys.ENTER in sendKeys method

        driver.close();








    }


}
