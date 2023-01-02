package day03_Locaters;

import io.netty.util.internal.ThreadExecutorMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_LocateByTagName {

    public static void main(String[] args) throws InterruptedException {



        //1- Create a test class and set the relevant settings

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //2- Go to https://www.automationexercise.com/
        driver.get("https://www.automationexercise.com/");

        //3- Test that there are 147 links on the page.

        List<WebElement> webElementsWithTag_a =driver.findElements(By.tagName("a"));
        int linkNumber =webElementsWithTag_a.size();

        if (linkNumber==147){
            System.out.println("Link Number Test Passed");
        }else {
            System.out.println("Link Number Test Failed");
        }




        //4- Click on Products link
        //driver.findElement(By.linkText(" Products")).click();
        driver.findElement(By.partialLinkText("Products")).click();



        //5- Test that the special offer text appears

        WebElement saleText = driver.findElement(By.id("sale_image"));

        if (saleText.isDisplayed()){

            System.out.println("SaleText Test Passed");
        }else {
            System.out.println("SaleText Test Failed");
        }


        //6- Close the page

//        Thread.sleep(10000);
//        driver.close();

    }

}
