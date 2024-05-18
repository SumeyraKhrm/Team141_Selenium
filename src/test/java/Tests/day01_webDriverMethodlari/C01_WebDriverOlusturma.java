package Tests.day01_webDriverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_WebDriverOlusturma {

    public static void main(String[] args) throws InterruptedException {

         /*
                Biz web'de yapacagimiz tum testler icin webDriver objesine ihtiyac duyariz
                webDriver objesi bizim elimiz, gozumuz, klavyemiz ve mouse'muzdur
                dolayisiyla bir test yazacaksak  ONCE webDriver objesi olusturmaliyiz

                33.satirdaki kodu yazdigimizda
                Selenium esitligin saginda hangi constructor'i kullandi isek
                o browser'in bir kopyasini olusturur
                ve bizim kullanimimiza sunar

                olusturulan kopya browser'da
                chrome is being controlled by automated test software yazar

         */

        System.setProperty("Webdriver.chrome.driver","resources/chromedriver"); // bunun tanımlanması olmasada olur

          /*
            windows bilgisayarlarda / farkli olabilir, dosya yolunun sonunda da .exe olur
            Selenium 4 ile birlikte Selenium kendi webDriver'ini kodlarin icine koydu

            selenium4 sonrasinda yukarda 16.satirda yazdigimiz driver ayari OPSIYONEL hale geldi

            Eger calistigimiz sirket ozel bir webDriver kullanmamizi isterse
            bize kullanacagimiz webDriver'in kurulum dosyasini verirler
            biz de 25.satirda verilen webDriver'i tanimlariz

            Eger calistigimiz sirket webDriver secimini bize birakirsa
            veya Selenium'un kendi webDriver'ini kullan derlerse
            25.satiri HICCCCCC KULLANMAYIZ
         */

        WebDriver driver = new ChromeDriver();

        // testotomasyonu ana sayfaya gidin

        driver.get("https://testotomasyonu.com");

         /*
            bir web sayfasina gitmek istedigimizde
            webDriver.get("istenenUrl") kullanilir

            gitmek istedigimiz web sayfasinin url'inde
            www yazmasak da istenen sayfa acilir
            ANCAK https:// yazilmazsa istenen sayfa acilmaz

         */

        // 5 saniye beekleyin

        Thread.sleep(5000);

         /*
            Bu method Java'dan gelir
            ve kodlari yazilan milisaniye kadar bekletir

            Biz genelde bir testi ilk defa calistirmak istedigimizde
            adimlarin dogru olarak ilerledigini gormek icin aralara
            Thread.sleep(....); koyariz

            testin uzerinde calismamiz bittiginde
            artik testimiz sorunsuz calisiyor dedigimizde
            Thread.sleep(...);'leri silmeniz tavsiye olunur

         */


        // sayfayı kapatın

        driver.quit(); // mutlaka yazılmalı sekmelerin sürekli açık kalmaması için
        // driver.close();

        /*
            33.satirda
            WebDriver driver = new ChromeDriver(); yazdigimizda
            olusturulan webDriver objesini kapatir.

            driver.close(); da ayni islemi yapar
            ancak bazi yeni surumlerde
            driver.close(); calismayabiliyor, onun icin quit() tercih edilir

            Selenium'un kapatma islevini 2 farkli method'la yapma sebebi

            driver.close(); uzerinde calisilan tek bir browser'i kapatir

            driver.quit(); ise test sirasinda birden fazla browser acildi ise
                           actigi tum browser'lari kapatir

         */





    }
}
