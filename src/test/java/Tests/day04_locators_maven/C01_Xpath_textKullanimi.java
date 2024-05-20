package Tests.day04_locators_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Xpath_textKullanimi {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","kurulumDosyalari/chromeedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //1- https://testotomasyonu.com/addremove/ adresine gidin
        driver.get("https://testotomasyonu.com/addremove/");


        //2- Add Element butonuna basin
        driver.findElement(By.xpath("//button[text()='Add']")) //link olmadıgı için boyle
                .click();

        //3- Remove butonu’nun gorunur oldugunu test edin

        WebElement removeButtonu = driver.findElement(By.xpath("//button[text()='Remove']"));

        if(removeButtonu.isDisplayed()){
            System.out.println("Remove Button Test Passed");
        }else
            System.out.println("Remove Button Test Failed");


        //4- Remove tusuna basin
        removeButtonu.click();


        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin

        WebElement AddRemoveElements = driver.findElement(By.xpath("//h2[text()='Add/Remove Elements']"));

        if(AddRemoveElements.isDisplayed()){
            System.out.println("AddRemove Elements Test Passed");
        }else
            System.out.println("AddRemove Elements Test Failed");




        Thread.sleep(3000);
        driver.quit();






    }
}
