package support;

import HelpersAndActions.ActionHelpers.ActionsOnPage;
import HelpersAndActions.ActionHelpers.GoTo;
import HelpersAndActions.BotHelpers.BotManager;
import HelpersAndActions.Log.Logger;
import com.codeborne.selenide.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import ru.qatools.properties.PropertyLoader;

import static com.codeborne.selenide.Selenide.clearBrowserCookies;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class TestLifeCycle{
    private MyConfig config = PropertyLoader.newInstance().populate(MyConfig.class);
    protected Logger logger = Logger.getInstance(config.getLogLevel());
    protected GoTo goTo;
    protected ActionsOnPage actions;
    static public WebDriver wd;
    protected BotManager botManager = BotManager.getInstance();

    @Rule
    public TestName name = new TestName();

    @Rule
    public TestResultAction testResultAction = new TestResultAction();

    @Before
    public void setUp() {
        Configuration.browser = config.getBrowser();
        Configuration.timeout = 20000;
        Configuration.baseUrl = config.getProtocol() + "://" + config.getUrl() + ":" + config.getPort();
        Configuration.browserSize = config.getBrowserSize();
        wd = getWebDriver();
        actions = new ActionsOnPage(wd);
        goTo = new GoTo(wd);
        logger.log("НАЧАЛО теста: " + name.getMethodName(), Logger.Level.INFO, Logger.Color.YELLOW);
    }

    @After
    public void finish() {
        logger.log("КОНЕЦ теста: " + name.getMethodName(), Logger.Level.INFO, Logger.Color.YELLOW);
        clearBrowserCookies();
    }

}
