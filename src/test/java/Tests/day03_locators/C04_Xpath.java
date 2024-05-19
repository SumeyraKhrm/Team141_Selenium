package Tests.day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_Xpath {

    public static void main(String[] args) throws InterruptedException {

        /*

        > Onceki 6 locator, HTML element olusturulurken developer’in yazdigi kodlara gore yapilir.
        Ayni sekilde HTML elementi bir link ise By.linkText( ) veya By.partialLinkText( )
        kullanabiliriz, link degilse kullanamayiz.
        > Xpath de HTML kodu kullanir ancak farkli kombinasyonlar kullanabildigi icin dinamiktir ve
        her webelement icin mutlaka bir xpath bulunabilir.

        2 cesit Xpath yazilabilir
        1.Absolute xpath (mutlak)  --cok kullanılan yontem degıldır --copy > copy Xpath diyebilirz
        2.Relative xpath (bağıl)   --//tagName[@attributeIsmi=‘attributeValue']

        (//input[@name='search'])[2]  -- index 2 diyince 2. ye gider
        önemli olan 1 of 1 olması
        tag ismi ya da attribute onemli degılse * yolur

        Bir HTML tag’inin arasina yeni bir tag acildiginda konum olarak bir tab icerden baslar.
        HTML tag’inin dusey hizasina bakarak parent-child-sibling iliskisi anlasilabilir.

        */

        System.setProperty("Webdriver.chrome.driver","kurulumDosyalari/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //1- https://testotomasyonu.com/addremove/ adresine gidin
        driver.get("https://www.testotomasyonu.com/addremove/");

        //2- Add Element butonuna basin
        //WebElement addButonu = driver.findElement(By.xpath("//button[@id='sub-btn']"));
        //addButonu.click();

        driver.findElement(By.xpath("//button[@id='sub-btn']")).click();

        //3- Remove butonu’nun gorunur oldugunu test edin
        WebElement removeButonu = driver.findElement(By.xpath("//button[@id='sub-btn']"));

        if(removeButonu.isDisplayed()){
            System.out.println("remove butonu gorunme testi PASSED");
        }else System.out.println("remove butonu gorunme testi FAILED");

        //4- Remove tusuna basin
        removeButonu.click();


        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin

        //WebElement addRemoveYaziElementi = driver.findElement(By.xpath("//h2"));

        WebElement addRemoveYaziElementi = driver.findElement(By.tagName("h2"));


        if(addRemoveYaziElementi.isDisplayed()){
            System.out.println("remove yazi gorunme testi PASSED");
        }else System.out.println("remove yazi gorunme testi FAILED");

        Thread.sleep(2000);
        driver.quit();




    }
}
