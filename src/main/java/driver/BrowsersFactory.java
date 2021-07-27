package driver;


import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.AbstractDriverOptions;

public enum BrowsersFactory {
    CHROME{

        public ChromeOptions getOptions() {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("−−incognito");
            chromeOptions.addArguments("--disable-infobars");
            chromeOptions.addArguments("--disable-notifications");
            //chromeOptions.setHeadless(configuration().headless());
            chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            return chromeOptions;
        }
        @Override
        public WebDriver createDriver() {
            WebDriverManager.getInstance(DriverManagerType.CHROME).setup();
            return new ChromeDriver(getOptions());

        }

    }, FIREFOX{


        public FirefoxOptions getOptions() {
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            firefoxOptions.addArguments();
            firefoxOptions.addArguments("--disable-infobars");
            firefoxOptions.addArguments("--disable-notifications");
            firefoxOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            //firefoxOptions.setHeadless(configuration().headless());
            return firefoxOptions;
        }
        @Override
        public WebDriver createDriver() {
            getOptions();
            WebDriverManager.getInstance(DriverManagerType.FIREFOX).setup();
            return new FirefoxDriver(getOptions());

        }
    };


    public abstract WebDriver createDriver();


}


