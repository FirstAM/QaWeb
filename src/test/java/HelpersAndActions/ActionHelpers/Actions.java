package HelpersAndActions.ActionHelpers;

import HelpersAndActions.Log.Logger;
import com.codeborne.selenide.SelenideElement;

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

    public void write(String locator, String input, int index ) {
//        find(locator, index).setValue(input);
        find(locator, index).sendKeys(input);
        logger.log("Ввел текст: " + input + " в элемент с локатором: " + locator, Logger.Level.INFO);
    }

    public void write(String locator, String input ) {
      write(locator, input, 0);
    }

    public SelenideElement find(String locator, int index) {
        logger.log("Ищу элемент с локатором: " + locator, Logger.Level.DEBUG);
        SelenideElement element = $$(locator).get(index);
        logger.log("Нашел элемент с локатором: " + locator, Logger.Level.DEBUG);
        return element;
    }

    public SelenideElement find(String locator) {
        return find(locator, 0);
    }







}
