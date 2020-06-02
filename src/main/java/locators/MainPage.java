package locators;

import org.openqa.selenium.By;

public class MainPage {
        public By glavnaya = By.xpath("/li[@class='m-hide']//a");
        public By forum = By.xpath("//header[@class='b-head']//li[3]//a[1]");
        public By lenta = By.xpath("//header[@class='b-head']//li[4]//a[1]");
        public By zarplaty = By.xpath("//header[@class='b-head']//li[5]//a[1]");
        public By rabota = By.xpath("//header[@class='b-head']//li[6]//a[1]");
        public By calendar = By.xpath("//li[@class='m-last']//a");
        public By summerSurvey = By.xpath("//li[@class='m-hide highlighted']//a[contains(text(),'DOU')]");
}
