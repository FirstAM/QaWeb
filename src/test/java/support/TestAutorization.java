package support;

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
     Set<Cookie> allcookies = wd.manage().getCookies();
     System.out.println(allcookies);
//        System.out.println();
    }

}
