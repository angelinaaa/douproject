package tests;

import locators.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import testbase.Testbase;


public class MainPageTest extends Testbase{
    MainPage mainPage = new MainPage();


    @Test(groups = {"dou_test"})
    public void MainPageTest() {
        Assert.assertTrue(elementsHelper.isElementClickable(mainPage.glavnaya, 5));
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(mainPage.glavnaya, 1), "Главная");

        Assert.assertTrue(elementsHelper.isElementClickable(mainPage.forum, 1));
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(mainPage.forum, 1), "Форум");

        Assert.assertTrue(elementsHelper.isElementClickable(mainPage.zarplaty, 1));
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(mainPage.zarplaty, 1), "Зарплаты");

        Assert.assertTrue(elementsHelper.isElementClickable(mainPage.lenta, 1));
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(mainPage.lenta, 1), "Лента");

        Assert.assertTrue(elementsHelper.isElementClickable(mainPage.rabota,1));
        Assert.assertTrue(elementsHelper.isElementClickable(mainPage.calendar,1));
        Assert.assertTrue(elementsHelper.isElementClickable(mainPage.summerSurvey,1));
    }
}
