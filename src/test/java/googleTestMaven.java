import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class googleTestMaven {


    @Test
    public void googleFirstTest(){

         //System.setProperty("webdriver.chrome.driver","chromedriver.exe");
         //C:\Users\miner\OneDrive\Escritorio\jselenium\seleniumVscode\demo\chromedriver.exe
    //WebDriver driver = new ChromeDriver();
    //driver.get("www.google.com");
    //thread.sleep(3000); 

        
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.google.com");

        Assert.assertEquals(driver.getTitle(), "Google");

        driver.quit();
    }

    
}
