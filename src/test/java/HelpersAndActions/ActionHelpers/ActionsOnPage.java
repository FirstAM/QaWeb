package HelpersAndActions.ActionHelpers;

import HelpersAndActions.BotHelpers.Bot;
import HelpersAndActions.Log.Logger;

import Pages.AutPage;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.WebDriver;


public class ActionsOnPage {

    private GoTo goTo;
    private Logger logger = Logger.getInstance();
    private Actions actions = new Actions();

    public ActionsOnPage(WebDriver wd){
        goTo = new GoTo(wd);
    }

    public void login(Bot bot) {
        actions.dclick(AutPage.LOGINFORM);
        actions.write(AutPage.LOGINFORM, bot.getlogin());
        actions.dclick(AutPage.PASSLOGINFORM);
        actions.write(AutPage.PASSLOGINFORM, bot.getPass());
        actions.hover(AutPage.AUTBUTTON, 1);
        actions.find(AutPage.SECONDBUTTON);
        actions.click(AutPage.SECONDBUTTON);
        Selenide.confirm();
        Selenide.confirm();
        actions.find(AutPage.AVATAR);

        logger.log("Авторизовались под: " + bot.getlogin(), Logger.Level.INFO);
    }

//    public void assertScreenshot(String name){
//        Screenshot[] actualAndDiff = shooter.compareOrCreateScreenshot(name);
//
//        assertTrue("Images should equal",
//                areImagesEqual(actualAndDiff[0], actualAndDiff[1]));
//    }
}
