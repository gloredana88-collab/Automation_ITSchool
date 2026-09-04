package Shared_data.browser;

import org.openqa.selenium.WebDriver;

public class Browser_Factory {

    public WebDriver getBrowserFactory(){
        String browser = System.getProperty("browser");

        switch (browser){
            case Browser_Type.Browser_Chrome:
                Chrome_service_browser chromeServiceBrowser = new Chrome_service_browser();
                chromeServiceBrowser.openBrowser();
                System.out.println("Acum ruleaza pe " + browser);
                return chromeServiceBrowser.getDriver();


            case Browser_Type.Browser_Edge:

        }
        return null;
    }
}
