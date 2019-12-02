package HelpersAndActions.BotHelpers;

import HelpersAndActions.Log.Logger;
import java.util.HashMap;

public class BotManager {
    private Logger logger = Logger.getInstance();
    private HashMap<String, Bot> botList = new HashMap<>();
    private static BotManager instance;

    public static final String TEST = "test";


    private BotManager(){
        botList.put(TEST, new Bot("test", "test"));
    }

    public static synchronized BotManager getInstance() {
        if (instance == null) {
            instance = new BotManager();
        }
        return instance;
    }

    public Bot getBot(String key){
        Bot bot = botList.get(key);
        logger.log("Бот для теста: " + bot.getlogin(), Logger.Level.DEBUG);
        return bot;
    }
}
