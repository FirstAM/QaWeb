package HelpersAndActions.ActionHelpers;

import HelpersAndActions.Log.Logger;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.impl.Modals;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;


public class Actions {
    private Logger logger = Logger.getInstance();

    public void click(String locator, int index) {
        find(locator, index).click();
        logger.log("Нажал на элемент с локатором: " + locator, Logger.Level.INFO);
    }

    public void click(String locator) {
       click(locator,  0 );
    }

    public void dclick(String locator, int index) {
        find(locator, index).doubleClick();
        logger.log("Дважды нажал на элемент с локатором: " + locator, Logger.Level.INFO);
    }

    public void dclick(String locator) {
        dclick(locator,  0 );
    }

    public void write(String locator, String input, int index ) {
        find(locator, index).sendKeys(input);
        logger.log("Ввел текст: " + input + " в элемент с локатором: " + locator, Logger.Level.INFO);
    }

    public void write(String locator, String input ) { write(locator, input, 0); }


    public SelenideElement find(String locator, int index) {
        logger.log("Ищу элемент с локатором: " + locator, Logger.Level.DEBUG);
        SelenideElement element = $$(locator).get(index);
        logger.log("Нашел элемент с локатором: " + locator, Logger.Level.DEBUG);
        return element;
    }

    public SelenideElement find(String locator) {
        return find(locator, 0);
    }


    public void hover(String locator,int index) {
        find(locator, index).hover();
        logger.log("Навел на элемент с локатором: " + locator, Logger.Level.INFO);
    }
    public void hover(String locator) { hover(locator, 0); }


    public void check(String locator){

    }



}
