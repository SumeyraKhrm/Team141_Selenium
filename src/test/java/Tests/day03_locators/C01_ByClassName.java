package Tests.day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_ByClassName {

    public static void main(String[] args) throws InterruptedException {

        //1- Bir test class’i olusturun ilgili ayarlari yapin
        //System.setProperty("Webdriver.chrome.driver","kurulumDosyalari/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //2- https://www.testotomasyonu.com/ adresine gidin
        driver.get("https://www.testotomasyonu.com");


        //3- arama kutusuna phone yazip aratin
        WebElement aramaKutusu = driver.findElement(By.id("global-search"));
        aramaKutusu.sendKeys("phone" + Keys.ENTER);


        //4- Category bolumunde 8 element oldugunu test edin
        List<WebElement> categoryElementleriList = driver.findElements(By.className("panel-list"));


        //5- Category isimlerini yazdirin

        //System.out.println(categoryElementleriList);
        // Liste WebElementler'den olusuyor ve biz webElement'leri direk yazdiramayiz
        // yazdirmak icin bir loop ile herbir webelementi ele alip, getText() ile
        // uzerindeki yaziyi konsolda yazdirabiliriz


        for (WebElement eachElement: categoryElementleriList
        ) {

            System.out.println(eachElement.getText());
        }



        // arama sonucunda bulunan elementlerin isimlerini yazdirin


        //List<WebElement> urunIsimElementleriList = driver.findElements(By.className("prod-title mb-3 "));
        //System.out.println(urunIsimElementleriList);

        // class attribute'unun degerinde karakterler arasinda space varsa  By.className() genelde hata verir
        // Yani class degerinde bosluk varsa kullanmamayi tercih ederiz !!!


        // 1)Driver, findElement( ) ile objeyi bulamazsa NoSuchElementException verir.

        // 2)findElements( ) birden fazla web element döndürebileceği için dönen elementleri
        //store etmek için bır list kullanılmalıdır.
        //Locator’a uyan hicbir webelement olmasa da exception olusmaz, bos bir list olusur.


        //6- Sayfayi kapatin
        Thread.sleep(3000);
        driver.quit();





    }
}
