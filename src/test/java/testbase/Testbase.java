package testbase;

import helpers.ElementsHelper;
import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;



public class Testbase {

        public  static WebDriver driver;
        public static ElementsHelper elementsHelper;
        public String testUrl = ("https://dou.ua/");

       // @BeforeGroups(alwaysRun = true,groups = {"dou_test"})
        @Parameters("browser")
        public void setUp( Browsers browser) {
            switch (browser) {
                case CHROME:
                    ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
                    driver = new ChromeDriver();
                    break;
                default:
                    throw new RuntimeException("Invalid specified browser:" + browser + ",expected one of 'CHROME', 'FIREFOX', 'OPERA'");
            }
            elementsHelper = new ElementsHelper(driver);
            driver.get(testUrl);
            driver.manage().window().maximize();
        }

       // @AfterGroups(alwaysRun = true,groups = {"dou_test"})
        public void AfterTests() {

            driver.quit();
        }
    }


