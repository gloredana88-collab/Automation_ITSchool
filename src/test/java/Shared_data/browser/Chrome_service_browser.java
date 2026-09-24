package Shared_data.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome_service_browser implements IBrowser_Services {


        private WebDriver driver;
        @Override
        public void openBrowser() {
            ChromeOptions options = (ChromeOptions) browserOptions();
            driver = new ChromeDriver(options);

        }

        @Override
        public Object browserOptions() {
            ChromeOptions options = new ChromeOptions();

            options.addArguments("start-maximized");
            options.addArguments("no-sandbox");
//            String cicd = System.getProperty("ci_cd");
//
//            if(Boolean.parseBoolean(cicd)){
//                options.addArguments("--headless");
//            }
            return options;
        }

        public WebDriver getDriver() {
            return driver;
        }
}
