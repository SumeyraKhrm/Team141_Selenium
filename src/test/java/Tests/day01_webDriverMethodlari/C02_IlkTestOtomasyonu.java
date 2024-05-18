package Tests.day01_webDriverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class C02_IlkTestOtomasyonu {

    public static void main(String[] args) throws InterruptedException {


        // gerekli ayarlari yapip

        System.setProperty("Webdriver.chrome.driver","resources/chromedriver");

        // testotomasyonu anasayfaya gidin

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.testotomasyonu.com");

        // testotomasyonu anasayfanin acildigini test etmek icin
        // acilan sayfanin url'inin "https://www.testotomasyonu.com/" oldugunu test edin !!!


        String expectedUrl ="https://testotomasyonu.com";
        String actualUrl = driver.getCurrentUrl();

          /*
            bir testi yapabilmek icin
            expected deger ile actual degeri karsilastiririz

            expected deger testcase yazilirken mantik olarak karsilasmayi bekledigimiz degerdir
            actual deger ise driver'in ulastigi degerdir
         */


        if (expectedUrl.equals(actualUrl)){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
            System.out.println("Expected url : " + expectedUrl);
            System.out.println("Actual url : " + actualUrl);
        }


        //Thread.sleep(5000);

        driver.quit();


        //Bu case raporlanmalı, test FAILED !!

    }
}
