package HelpersAndActions.ActionHelpers;

import Pages.AutPage;
import org.openqa.selenium.WebDriver;

import java.util.Set;

import static com.codeborne.selenide.Selenide.open;

public class GoTo{
    private Actions actions = new Actions();
    private WebDriver wd;

    public GoTo(WebDriver wd){
        this.wd = wd;
    }

    public void login(){
        open("/");
        actions.click(AutPage.LOGIN);
    }

    public void lenta(){
        actions.click(AutPage.LENTA);
        actions.find(AutPage.LENTA_CHECK);
    }

    public void statistics(){
        actions.click(AutPage.STATISTICS);
        actions.find(AutPage.STATISTICS_CHECK);
    }

    public void questionaries(){
        actions.click(AutPage.QUESTIONARIES);
        actions.find(AutPage.QUESTIONARIES_CHECK);
    }

    public void locationQuestionaries(){
        questionaries();
        actions.click(AutPage.LOCATION_QUESTIONARIES);
    }

    public void  questionariesQuest(){
        questionaries();
        actions.click(AutPage.EDIT_QUESTIONARIES);
    }

    public void questionariesTask(){
        questionariesQuest();
        actions.click(AutPage.TASK);
    }

    public void questionariesAudit(){
        questionariesQuest();
        actions.click(AutPage.AUDIT);
    }

    public void questionariesSku(){
        questionariesQuest();
        actions.click(AutPage.SKU);
    }

    public void team(){
        actions.click(AutPage.TEAM);
        actions.find(AutPage.TEAM_CHECK);
    }

    public void locations(){
        actions.click(AutPage.LOCATIONS);
        actions.find(AutPage.LOCATIONS_CHECK);
    }

    public void location(){
        locations();
        actions.click(AutPage.LOCATION);
    }

    public void planograms(){
        actions.click(AutPage.PLANOGRAMS);
        actions.find(AutPage.PLANOGRAMS_CHECK);
    }

    public void apExports(){
        actions.click(AutPage.AP_EXPORTS);
        actions.find(AutPage.AP_EXPORTS_CHECK);
    }

    public void scorecard(){
        actions.click(AutPage.SCORECARD);
        actions.find(AutPage.SCORECARD_CHECK);
    }

    public void demoMode(){
        open("/");
        Set<String> oldWindowsSet = wd.getWindowHandles();
        actions.click(AutPage.DEMO_MODE_LOGIN);
        Set<String> newWindowsSet = wd.getWindowHandles();
        newWindowsSet.removeAll(oldWindowsSet);
        String newWindowHandle = newWindowsSet.iterator().next();
        wd.close();
        wd.switchTo().window(newWindowHandle);
    }
}
