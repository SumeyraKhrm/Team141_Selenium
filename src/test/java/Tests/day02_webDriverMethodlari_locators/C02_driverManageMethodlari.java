package Tests.day02_webDriverMethodlari_locators;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.text.TabExpander;
import java.time.Duration;

public class C02_driverManageMethodlari {
    public static void main(String[] args) throws InterruptedException {


         /*
            JavaScript frondend kısmı için kullanılır, mesela her hareketli tasarım için kullanılır.

            Bir web sayfasi ne kadar cok data barindirirsa
            server'dan o datalarin client tarafina yollanmasi o kadar uzun surecektir

            bizim istedigimiz webelementlerin sayfaya yuklenmesi zaman alacaktir
            bu gecikmelerde kodumuzun dinamik olarak beklemesini saglamak icin
            implicitlyWait tanimlariz

            implicitlyWait icerisine yazdigimiz 10 saniye maximim bekleme suresidir
            Eger 10 sn'den once sayfa yuklenir veya aranan webelement bulunursa
            kodlar calismaya devam eder
            Eger 10 saniye bekledigimiz halde sayfa acilmaz veya aradigimiz webelement bulunamazsa
            exception firlatip, calismayi durdurur
         */


        System.setProperty("Webdriver.chrome.driver","resources/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // dinamik bekleme
        // süre tanımlanırken sayafanın açılma süresi baz alınır, ve test sürecinide fazla uzatmamalıdır


        System.out.println("Maximize konum : "+driver.manage().window().getPosition());
        System.out.println("Maximize size : "+driver.manage().window().getSize());


        Thread.sleep(4000);
        driver.manage().window().fullscreen();
        System.out.println("Full screen konum : "+driver.manage().window().getPosition());
        System.out.println("Full screen size : "+driver.manage().window().getSize());


        Thread.sleep(2000);
        driver.manage().window().minimize();
        System.out.println("Minimize konum : "+driver.manage().window().getPosition());
        System.out.println("Minimize size : "+driver.manage().window().getSize());



        // browser'in baslangic noktasini 300,300
        // boyutunu da 500,500 yapin

        driver.manage().window().setPosition(new Point(300,300));
        driver.manage().window().setSize(new Dimension(500,500));
        Thread.sleep(5000);


        System.out.println("Ozel olcu icin konum : "+driver.manage().window().getPosition());
        System.out.println("Ozel olcu icin size : "+driver.manage().window().getSize());
        Thread.sleep(5000);


        driver.quit();







    }
}
