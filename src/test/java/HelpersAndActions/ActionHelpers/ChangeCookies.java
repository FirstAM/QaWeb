package HelpersAndActions.ActionHelpers;

import org.openqa.selenium.Cookie;
import support.TestLifeCycle;

public class ChangeCookies {
    static Cookie CK = new Cookie("secret", "IAmSuperSeleniumMaster", null, "/", null, false, false);

    private static void deleteCockie() {
        TestLifeCycle.wd.manage().deleteAllCookies();
    }

    public static void setCockie() {
        ChangeCookies.deleteCockie();
        TestLifeCycle.wd.manage().addCookie(CK);
    }


}
