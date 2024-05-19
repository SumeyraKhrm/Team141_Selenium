package Tests.day03_locators;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_ByLinkText {
    public static void main(String[] args) throws InterruptedException {

        //1- Bir test class’i olusturun ilgili ayarlari yapin
        // System.setProperty("Webdriver.chrome.driver","kurulumDosyalari/chromedriver");
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com");
        Thread.sleep(1000);


        // cookies kabul edin (cıkan reklamlar ..)
        //List<WebElement> cookiesKabulListe = driver.findElements(By.className("fc-button-label"));
        //cookiesKabulListe.get(0).click();
        Thread.sleep(1000);



        //3- Sayfada 147 adet link bulundugunu test edin.
        List<WebElement> LinkElementleriList = driver.findElements(By.tagName("a"));  //a yazınca linkler cıkıyor

        System.out.println(LinkElementleriList.size());

        int expectedLinkSayisi = 147;
        int actualLinkSayisi = LinkElementleriList.size();

        if(expectedLinkSayisi == actualLinkSayisi){
            System.out.println("Link sayısı Test Passed");
        }else
            System.out.println("Link sayısı Test Failed");


        //4- Products linkine tiklayin

        //WebElement productLinkElementi = driver.findElement(By.linkText(" Products"));
        // bunu bulamadigi icin partialLinkText() kullanıyoruz ( boşluktan dolayı bulamıyor bazen)

        WebElement productLinkElementi = driver.findElement(By.partialLinkText("Products"));
        productLinkElementi.click(); // tıkla demek



        //5- special offer yazisinin gorundugunu test edin
        WebElement specialOfferYaziElement = driver.findElement(By.id("sale_image"));
        if (specialOfferYaziElement.isDisplayed()){
            System.out.println("special offer yazi testi PASSED");
        }else
            System.out.println("special offer yazi testi FAILED");



        Thread.sleep(5000);
        driver.quit();



    }
}
