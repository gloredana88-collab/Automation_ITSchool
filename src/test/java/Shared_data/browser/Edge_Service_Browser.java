package Shared_data.browser;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Edge_Service_Browser implements IBrowser_Services{
    private WebDriver driver;

    @Override
    public void openBrowser() {
        EdgeOptions options = (EdgeOptions) browserOptions();
        driver = new EdgeDriver(options);

    }

    @Override
    public Object browserOptions() {
        EdgeOptions options = new EdgeOptions();

        options.addArguments("start-maximized");
        options.addArguments("no-sandbox");
//        String cicd = System.getProperty("ci_cd");
//
//        if(Boolean.parseBoolean(cicd)){
//            options.addArguments("--headless");
//        }
        return options;
    }

    public WebDriver getDriver() {
        return driver;
    }
}




