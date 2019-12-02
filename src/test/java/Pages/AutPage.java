package Pages;

public interface AutPage {

    //Login page
    String LOGINFORM = "#loginInput";
    String PASSLOGINFORM = "#passwordInput";
    String AUTBUTTON = ".btn.btn-primary";

    String SECONDBUTTON = "img[src='sign.png']";



//Landing
    String LOGIN = ".login-form";
    String DEMO_MODE_SECTION = ".demo-mode-section-autotest";
    String DEMO_MODE_LOGIN = ".demo-mode-web-autotest";

//demomode
    String DEMO_MODE_SUPERVISOR_LOGIN = ".demo-supervisor-login-autotest";
    String DEMO_MODE_TEAMLEAD_LOGIN = ".demo-teamlead-login-autotest";

//auth
    String EMAIL = "input.email";
    String PASSWORD = "input.password";
    String SUCCESS = ".btn-success";

//menu
    String LENTA = "#lenta_link";
    String STATISTICS = "#qlik_statistics_link";
    String QUESTIONARIES = "#questionaries_link";
    String TEAM = "#team_link";
    String LOCATIONS = "#locations_link";
    String PLANOGRAMS = "#planogram_bundles_link";
    String AP_EXPORTS = "#ap_exports_link";
    String SCORECARD = "#scorecard_exports_link";

//lenta
    String LENTA_CHECK = "div.page_title[value='Лента']";

//STATISTICS
    String STATISTICS_CHECK = "div.page_title[value='Статистика']";

//QUESTIONARIES
    String QUESTIONARIES_CHECK = "div.page_title[value='Опросники']";
    String EDIT_QUESTIONARIES = ".edit_questionary";
    String LOCATION_QUESTIONARIES = ".autotest-location-questionaries";
    String TASK = ".task-autotest";
    String AUDIT = ".audit-autotest";
    String SKU = ".sku-autotest";

//TEAM
    String TEAM_CHECK = "div.page_title[value='Команда. Маршруты, календарь']";

//LOCATIONS
    String LOCATIONS_CHECK = "div.page_title[value='Список торговых точек']";
    String LOCATION = ".location-autotest";

//PLANOGRAMS
    String PLANOGRAMS_CHECK = ".autotest-planogram-bundles";

//AP_EXPORTS
    String AP_EXPORTS_CHECK = "div.page_title[value='Экспорт АП']";

//SCORECARD
    String SCORECARD_CHECK = "div.page_title[value='Экспорт Scorecard']";
}
