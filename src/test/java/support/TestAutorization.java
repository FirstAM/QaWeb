package support;

import HelpersAndActions.ActionHelpers.ChangeCookies;
import HelpersAndActions.BotHelpers.BotManager;
import org.junit.Test;
import org.openqa.selenium.Cookie;

import java.util.Set;

import static com.codeborne.selenide.Selenide.open;


public class TestAutorization extends TestLifeCycle {

    @Test
    public void Autorization() {
        open("/");
        actions.login(botManager.getBot(BotManager.TEST));
    }

    @Test
    public void Clieninfo() throws InterruptedException {
        ChangeCookies.setCockie();
        open("/");
        Thread.sleep(3000);
    }

}
