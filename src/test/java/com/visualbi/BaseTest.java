package com.visualbi;

/**
 * Created by yogavb on 11/29/2017.
 */

import org.fluentlenium.adapter.testng.FluentTestNg;
import org.fluentlenium.core.annotation.Page;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.fluentlenium.core.domain.FluentList;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.logging.Level;

import static org.assertj.core.api.Assertions.assertThat;
import static org.testng.Assert.assertTrue;


public class BaseTest extends FluentTestNg {

    WebDriver driver;

    @Override
    public WebDriver newWebDriver() {
        if(VBIConfig.browserstackEnvironment.equalsIgnoreCase("ie")){
            System.setProperty("webdriver.ie.driver", VBIConfig.IE_DRIVER);
            DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
            LoggingPreferences logPrefs = new LoggingPreferences();
            logPrefs.enable(LogType.BROWSER, Level.ALL);
            capabilities.setCapability(CapabilityType.LOGGING_PREFS, logPrefs);
            return new InternetExplorerDriver(capabilities);
        }
        else {
            System.setProperty("webdriver.chrome.driver", VBIConfig.CHROME_DRIVER);
            driver = new ChromeDriver();
            return driver;
        }
    }



    public void nextpage() {
        ((JavascriptExecutor) driver).executeScript("$('#PAGEBOOK_2_tf1-arrowScrollRight').click();");
    }

    /*public void navigate(){
        (JavascriptExecutor) driver).executeScript("$('function navi() {var nav = document.getElementByCSS(".sapMCrslControls.sapMCrslBulleted.sapMCrslBottomOffset >span:nth-child(2)")"

               nav.add(class = sapMCrslActive))
                };
    }*/

    public void previouspage() {
        ((JavascriptExecutor) driver).executeScript("$('#PAGEBOOK_2_tf1-arrowScrollLeft').click();");
    }


    public void generatetooltip() {
        ((JavascriptExecutor) driver).executeScript("$('.highcharts-container').parent().highcharts().tooltip.refresh($('.highcharts-container').parent().highcharts().series[0].data[0]);");
    }


  /*  @Test()
    public void test1() throws InterruptedException {



          *//*  Iterator<WebElement> itr1 = page.S_page3_Text().iterator();
            while(itr1.hasNext()) {
                itr1.next().clear();
                itr1.next().sendKeys("a");
                Thread.sleep(5000);*//*


       *//* $("#PAGE_1_tf1 .sapMBtn").stream().forEach((Page1_Buttons) -> {
            System.out.println(Page1_Buttons.text());
        });*//*

    }*/}