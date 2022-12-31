package day02_driverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        Thread.sleep(1000);

        // lets  maximize it and learn a few info
        driver.manage().window().maximize();
        System.out.println("maximize sizes : "+ driver.manage().window().getSize());
        System.out.println("maximized position : "+ driver.manage().window().getPosition());

        Thread.sleep(1000);

        // Let's make it fullscreen and learn a few info
        driver.manage().window().fullscreen();
        System.out.println("fullscreen sizes : "+ driver.manage().window().getSize());
        System.out.println("fullscreen position : "+driver.manage().window().getPosition());

        // let's change size and positions

        Thread.sleep(3000);
        driver.manage().window().setPosition(new Point(100,100));
        driver.manage().window().setSize(new Dimension(300,300));


        Thread.sleep(3000);
        driver.close();


    }


}
