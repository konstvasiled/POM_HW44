package core;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.safari.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.htmlunit.*;
import java.util.concurrent.TimeUnit;
import java.util.logging.*;

class Functionality {
    WebDriver driver;
     void startDriver(String browser, String url) {
         switch (browser.toLowerCase()) {
             case "chrome": {Logger.getLogger("").setLevel(Level.OFF);
                 if (System.getProperty("os.name").toUpperCase().contains("MAC")) {System.setProperty("webdriver.chrome.driver", "resources/webdriver/mac/chromedriver");}
                 else if (System.getProperty("os.name").toUpperCase().contains("WINDOWS")) {System.setProperty("webdriver.chrome.driver", "resources/webdriver/pc/chromedriver.exe");}
                 else throw new IllegalArgumentException("Unknown OS");
                 System.setProperty("webdriver.chrome.silentOutput", "true");
                 ChromeOptions setoption = new ChromeOptions();
                 setoption.addArguments("disable-infobars");
                 setoption.addArguments("--disable-notifications");
                 setoption.addArguments("--disable-annotations");
                 if (System.getProperty("os.name").toUpperCase().contains("MAC")) setoption.addArguments("--start-fullscreen");
                 else if (System.getProperty("os.name").toUpperCase().contains("WINDOWS")) setoption.addArguments("--start-maximized");
                 else throw new IllegalArgumentException("Unknown OS");
                 driver = new ChromeDriver(setoption);
                 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                 driver.get(url); break;}

             case "htmlunit": {
                 Logger.getLogger("").setLevel(Level.OFF);
                 driver = new HtmlUnitDriver();
                 ((HtmlUnitDriver) driver).setJavascriptEnabled(true);
                 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                 driver.manage().window().maximize();
                 driver.get(url); break;}

             case "firefox": {Logger.getLogger("").setLevel(Level.OFF);
                 if (System.getProperty("os.name").toUpperCase().contains("MAC")) System.setProperty("webdriver.gecko.driver", "resources/webdriver/mac/geckodriver.sh");
                 else if (System.getProperty("os.name").toUpperCase().contains("WINDOWS")) System.setProperty("webdriver.gecko.driver","resources/webdriver/mac/geckodriver.exe");
                 else throw new IllegalArgumentException("Unknown OS");
                 driver = new FirefoxDriver();
                 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                 driver.manage().window().maximize();
                 driver.get(url); break;}

             case "safari": {Logger.getLogger("").setLevel(Level.OFF);
                 driver = new SafariDriver();
                 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                 driver.manage().window().maximize();
                 driver.get(url); break;}

             default: throw new IllegalArgumentException("Unknown driver token"); }}
    void quit() {driver.quit();}
    void changeURI(String url) { driver.get(url);}
    String captureURL() { String url = driver.getCurrentUrl(); return url;}
}
