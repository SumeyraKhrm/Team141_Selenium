package Tests.day04_locators_maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_RelativeLocators {
    public static void main(String[] args) {

           /*
            Relative locator selenium 4 ile tanitilan yeni bir ozellik..
            EGER
            bir webElement'i gordugumuz ve HTML kodlarina ulastigimiz halde
            locate'imiz calismiyor ve webElement'i kullanamiyorsak
            ve etrafinda kullanabildigimiz baska webElementler varsa

            bu webelementi ulastigimiz bir bilgisi ve
            etrafindaki kullanabildigimiz webElementler sayesinde kullanabiliriz

            WebElement abc = elementin id'si "idAbc" ve suResmin altinda
         */


        System.setProperty("Webdriver.chrome.driver","kurulumDosyalari/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));





    }


}
