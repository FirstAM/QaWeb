package HelpersAndActions.ActionHelpers;

import HelpersAndActions.BotHelpers.Bot;
import HelpersAndActions.Log.Logger;

import Pages.AutPage;
import org.openqa.selenium.WebDriver;


public class ActionsOnPage {

    private GoTo goTo;
    private Logger logger = Logger.getInstance();
    private Actions actions = new Actions();

    public ActionsOnPage(WebDriver wd){
        goTo = new GoTo(wd);
    }

    public void login(Bot bot) {
        actions.write(AutPage.LOGINFORM, bot.getlogin());
        actions.write(AutPage.PASSLOGINFORM, bot.getPass());
        actions.click(AutPage.AUTBUTTON, 1);
        actions.click(AutPage.SECONDBUTTON);
//        logger.log("Авторизовались под: " + bot.getlogin(), Logger.Level.INFO);
    }

//    public void assertScreenshot(String name){
//        Screenshot[] actualAndDiff = shooter.compareOrCreateScreenshot(name);
//
//        assertTrue("Images should equal",
//                areImagesEqual(actualAndDiff[0], actualAndDiff[1]));
//    }
}
