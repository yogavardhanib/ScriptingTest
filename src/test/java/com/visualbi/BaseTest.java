package com.visualbi;

/**
 * Created by yogavb on 11/29/2017.
 */
import org.fluentlenium.adapter.testng.FluentTestNg;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.testng.Assert.assertTrue;


public class BaseTest extends FluentTestNg {

    WebDriver driver;
    @Page
    HighChartsPage page;

    @Override
    public WebDriver newWebDriver() {
        System.setProperty("webdriver.chrome.driver", VBIConfig.CHROME_DRIVER);
        driver = new ChromeDriver();
        return driver;
    }

    public void nextpage()
    {
        ((JavascriptExecutor)driver).executeScript("$('#PAGEBOOK_2_tf1-arrowScrollRight').click();");
    }

    public void previouspage()
    {
        ((JavascriptExecutor)driver).executeScript("$('#PAGEBOOK_2_tf1-arrowScrollLeft').click();");
    }

  


    public void generatetooltip() {
        ((JavascriptExecutor) driver).executeScript("$('.highcharts-container').parent().highcharts().tooltip.refresh($('.highcharts-container').parent().highcharts().series[0].data[0]);");
    }


    @Test()
    public void testChartType() throws InterruptedException {

        goTo(VBIConfig.URL_PATH);
        page.setter1().click();

        //line
        page.textTextChartType().clear();
        page.textTextChartType().sendKeys("line");//sendKeys("line");
        page.DSXSetChartType.click();
        Thread.sleep(5000);
        String enteredtext1 = page.textTextChartType().getAttribute("value");
        Assert.assertTrue(page.lineChartType().isDisplayed());

        page.getter1().click();
        page.DSXGetChartType.click();
        Thread.sleep(5000);
        Assert.assertEquals(page.result().getText(),"DSXGetChartType : "+enteredtext1);

        //spline
        page.setter1().click();
        page.textTextChartType().clear();
        page.textTextChartType().sendKeys("spline");//sendKeys("line");
        page.DSXSetChartType.click();
                Thread.sleep(5000);
        String enteredtext2 = page.textTextChartType().getAttribute("value");
        Assert.assertTrue(page.splineChartType().isDisplayed());

        page.getter1().click();
        page.DSXGetChartType.click();
        Thread.sleep(5000);
        Assert.assertEquals(page.result().getText(),"DSXGetChartType : "+enteredtext2);

    }

    @Test()
    public void testTitleEnable() throws InterruptedException {

        goTo(VBIConfig.URL_PATH);

        // Enable = true

        page.setter1().click();
        page.textTitleEnable().clear();
        page.textTitleEnable().sendKeys("true");
        page.dsxSetTitleEnable().click();
        page.dsxSetTitleText().click();
        Thread.sleep(5000);
        String eneteredtext = page.textTitleEnable().getAttribute("value");
        String titletext = page.title().getText();

        Assert.assertEquals(titletext,page.textTitleText().getAttribute("value"));

        page.getter1().click();
        page.dsxGetTitleEnable().click();

        // Assert.assertEquals(page.result().getText(),"DSXGetTitleEnable : "+eneteredtext); // Ignore Case
        assertTrue(page.result().getText().equalsIgnoreCase("DSXGetTitleEnable : "+eneteredtext));



        // Enable = false
        page.setter1().click();
        page.textTitleEnable().clear();
        page.textTitleEnable().sendKeys("false");
        page.dsxSetTitleEnable().click();
        Thread.sleep(5000);

        Assert.assertEquals(titletext,"");

        page.getter1().click();
        page.dsxGetTitleEnable().click();
        Assert.assertEquals(page.result().getText(),"DSXGetTitleEnable : "+eneteredtext);


    }

    @Test()
    public void testTitleText() throws InterruptedException {

        goTo(VBIConfig.URL_PATH);
        page.setter1().click();
        page.textTitleText().clear();
        page.textTitleText().sendKeys("NewChartTitle");
        page.dsxSetTitleText().click();
        Thread.sleep(5000);
        String enteredtitle = page.textTitleText().getAttribute("value");
        Thread.sleep(5000);
        String titletext = page.title().getText();
        Assert.assertEquals(titletext,enteredtitle);

        page.getter1().click();
        page.dsxGetTitleText().click();

        Assert.assertEquals(page.result().getText(),"DSXGetTitleText : "+titletext);
    }

    @Test()
    public void testSubTitleEnable() {

        goTo(VBIConfig.URL_PATH);
        // Enable = false
        page.setter1().click();
        page.textSubTitleEnable().clear();
        page.textSubTitleEnable().sendKeys("false");
        String eneteredtext = page.textSubTitleEnable().getText();
        page.dsxSetSubTitleEnable().click();
        String subtitletext = page.title().getText();
        Assert.assertEquals(subtitletext,"");

        page.getter1().click();
        page.dsxGetSubTitleEnable().click();
        Assert.assertEquals(page.result().getText(),eneteredtext);

// Enable = true

        page.setter1().click();
        page.textSubTitleEnable().clear();
        page.textSubTitleEnable().sendKeys("true");
        String eneteredtext2 = page.textTitleEnable().getText();
        page.dsxSetTitleEnable().click();

        Assert.assertEquals(subtitletext,page.textSubTitleText().getText());

        page.getter1().click();
        page.dsxGetSubTitleEnable().click();

        Assert.assertEquals(page.result().getText(),eneteredtext2);
    }

    @Test()
    public void testSubTitleText() throws InterruptedException {

        goTo(VBIConfig.URL_PATH);
        page.setter1().click();
        page.textSubTitleText().clear();
        page.textTitleText().sendKeys("ChartSubTitle");
        page.dsxSetSubTitleText().click();
        Thread.sleep(5000);
        String enteredtitle = page.textSubTitleText().getAttribute("value");
        Thread.sleep(5000);
        String subtitletext = page.subtitle().getText();
        Assert.assertEquals(subtitletext,enteredtitle);

        page.getter1().click();
        page.dsxGetTitleText().click();

        Assert.assertEquals(page.result().getText(),"DSXGetTitleText : "+subtitletext);
    }

    @Test()
    public void testToolTipEnabled() throws InterruptedException {

        goTo(VBIConfig.URL_PATH);
        page.setter1().click();
        // Enable = false
        page.textToolTipEnabled().clear();
        page.textToolTipEnabled().sendKeys("false");

        String eneteredtext = page.textToolTipEnabled().getText();
        page.dsxSetToolTipEnabled().click();
        Thread.sleep(5000);
        generatetooltip();
        Assert.assertFalse(page.tooltipText().isDisplayed());


        page.getter1().click();
        page.dsxGetToolTipEnabled().click();
        Assert.assertEquals(page.result().getText(),eneteredtext);

        // Enable = true
        page.textToolTipEnabled().clear();
        page.textToolTipEnabled().sendKeys("true");
        page.dsxSetToolTipEnabled().click();
        Thread.sleep(5000);
        generatetooltip();
        String tooltiptext = page.tooltipText().getText();
        System.out.println(tooltiptext);

        Assert.assertEquals(tooltiptext,"Africa\\Non Renewable:\n" +
                "Number of Records 92");

        page.getter1().click();
        page.dsxGetToolTipEnabled().click();
        Thread.sleep(5000);
        Assert.assertEquals(page.result().getText(),eneteredtext);
    }
    @Test()
    public void testToolTipNoOfDecimals() throws InterruptedException {

        goTo(VBIConfig.URL_PATH);
        page.setter1().click();

        page.textToolTipNoOfDecimals().clear();
        page.textToolTipNoOfDecimals().sendKeys("5");
        page.dsxSetToolTipNoOfDecimals().click();
        Thread.sleep(5000);
        String entereddecimalvalue = page.textTooltipValuePrefix().getAttribute("value");
        generatetooltip();

        String tooltiptext = page.tooltipText().getText();
        System.out.println(tooltiptext);

        int integerPlaces = tooltiptext.indexOf('.');
        int decimalPlaces = tooltiptext.length() - integerPlaces - 1;

        System.out.println("decimalPlaces:\t" + decimalPlaces);
        Assert.assertEquals(decimalPlaces, entereddecimalvalue);
    }


    @Test()
    public void testTooltipValuePrefix()throws InterruptedException {

        goTo(VBIConfig.URL_PATH);
        page.setter1().click();

        page.textToolTipEnabled().clear();
        page.textToolTipEnabled().sendKeys("true");
        page.dsxSetToolTipEnabled().click();
        Thread.sleep(5000);

        page.textTooltipValuePrefix().clear();
        page.textTooltipValuePrefix().sendKeys("$");
        page.dsxSetTooltipValuePrefix().click();
        Thread.sleep(5000);

        String enteredtext = page.textTooltipValuePrefix().getAttribute("value");
        generatetooltip();

        String tooltiptext = page.tooltipText().getText();
        System.out.println(tooltiptext);

        Assert.assertEquals(tooltiptext,"Africa\\Non Renewable:\n" +
                "Number of Records "+enteredtext+ " 92");


    }

    @Test()
    public void testTooltipValueSuffix() throws InterruptedException {

        goTo(VBIConfig.URL_PATH);
        page.setter1().click();

        page.textToolTipEnabled().clear();
        page.textToolTipEnabled().sendKeys("true");
        page.dsxSetToolTipEnabled().click();
        Thread.sleep(5000);

        page.textTooltipValueSuffix().clear();
        page.textTooltipValueSuffix().sendKeys("K");
        page.dsxSetTooltipValueSuffix().click();
        Thread.sleep(5000);

        String enteredtext = page.textTooltipValueSuffix().getAttribute("value");
        generatetooltip();

        String tooltiptext = page.tooltipText().getText();
        System.out.println(tooltiptext);

        Assert.assertEquals(tooltiptext,"Africa\\Non Renewable:\n" +
                "Number of Records 92 "+enteredtext);
    }

    @Test()
    public void testExportedFileName(){}


    @Test()
    public void testDataLabelEnabled(){
        goTo(VBIConfig.URL_PATH);
        // Enable = false
        page.setter1().click();
        nextpage();
        page.textDataLabelEnabled().clear();
        page.textDataLabelEnabled().sendKeys("false");
        String eneteredtext = page.textDataLabelEnabled().getText();
        page.dsxSetDataLabelEnabled().click();
        String datalabeltext = page.datalabelText().getText();
        Assert.assertEquals(datalabeltext,"");

        page.getter1().click();
        page.dsxGetDataLabelEnabled().click();

        Assert.assertEquals(page.result().getText(),eneteredtext);

// Enable = true

        page.setter1().click();
        page.textDataLabelEnabled().clear();
        page.textDataLabelEnabled().sendKeys("true");
        page.dsxSetDataLabelEnabled().click();

        Assert.assertEquals(datalabeltext,page.textDataLabelEnabled().getText());

        page.getter1().click();
        page.dsxGetDataLabelEnabled().click();

        Assert.assertEquals(page.result().getText(),eneteredtext);

    }
    @Test()
    public void testDataLabelPrefix() throws InterruptedException {

        goTo(VBIConfig.URL_PATH);
        page.setter1().click();
        Thread.sleep(5000);
        nextpage();
        Thread.sleep(5000);
        page.textDataLabelEnabled().clear();
        page.textDataLabelEnabled().sendKeys("true");
        page.dsxSetDataLabelEnabled().click();
        Thread.sleep(5000);
        String datalabel_text1 = page.datalabelText().getText();
        System.out.println(datalabel_text1);


        page.textDataLabelPrefix().clear();
        page.textDataLabelPrefix().sendKeys("$");
        String eneteredtext = page.textDataLabelPrefix().getAttribute("value");
        page.dsxSetDataLabelPrefix().click();
        Thread.sleep(5000);
        String datalabel_text2 = page.datalabelText().getText();
        Assert.assertEquals(datalabel_text2,eneteredtext+" "+datalabel_text1);

        page.getter1().click();
        page.dsxGetDataLabelPrefix().click();
        Thread.sleep(5000);
        Assert.assertEquals(page.result().getText(),eneteredtext);

    }
    @Test()
    public void testDataLabelSuffix() throws InterruptedException {

        goTo(VBIConfig.URL_PATH);
        page.setter1().click();
        Thread.sleep(5000);
        nextpage();
        Thread.sleep(5000);
        page.textDataLabelEnabled().clear();
        page.textDataLabelEnabled().sendKeys("true");
        page.dsxSetDataLabelEnabled().click();
        Thread.sleep(5000);

        String datalabel_text1 = page.datalabelText().getText();



        page.textDataLabelSuffix().clear();
        page.textDataLabelSuffix().sendKeys("K");
        String eneteredtext = page.textDataLabelPrefix().getAttribute("value");
        page.dsxSetDataLabelSuffix().click();
        Thread.sleep(5000);
        String datalabel_text2 = page.datalabelText().getText();
        Assert.assertEquals(datalabel_text2,datalabel_text1+" "+eneteredtext);

        page.getter1().click();
        page.dsxGetDataLabelSuffix().click();
        Thread.sleep(5000);
        Assert.assertEquals(page.result().getText(),eneteredtext);
    }

    @Test()
    public void testXAxisLabelEnabled() throws InterruptedException {

        goTo(VBIConfig.URL_PATH);
        // Enable = false
        page.setter1().click();
        nextpage();
        page.textXAxisLabelEnabled().clear();
        page.textXAxisLabelEnabled().sendKeys("false");
        String eneteredtext = page.textXAxisLabelEnabled().getText();
        page.dsxSetXAxisLabelEnabled().click();
        Thread.sleep(5000);
        String xaxislabel_text = page.xaxislabelText().getText();
        Assert.assertEquals(xaxislabel_text,"");

        page.getter1().click();
        page.dsxGetXAxisLabelEnabled().click();
        Thread.sleep(5000);
        Assert.assertEquals(page.result().getText(),eneteredtext);

// Enable = true

        page.setter1().click();
        page.textXAxisLabelEnabled().clear();
        page.textXAxisLabelEnabled().sendKeys("true");
        page.dsxSetXAxisLabelEnabled().click();
        Thread.sleep(5000);
        Assert.assertEquals(xaxislabel_text,"Africa\\Non Renewable");

        page.getter1().click();
        page.dsxGetXAxisLabelEnabled().click();

        Thread.sleep(5000);
        Assert.assertEquals(page.result().getText(),eneteredtext);
    }

    @Test()
    public void testXAxisLabelPrefix() throws InterruptedException {

        goTo(VBIConfig.URL_PATH);
        page.setter1().click();
        Thread.sleep(5000);
        nextpage();
        Thread.sleep(5000);
        page.textXAxisLabelEnabled().clear();
        page.textXAxisLabelEnabled().sendKeys("true");
        page.dsxSetXAxisLabelEnabled().click();
        Thread.sleep(5000);
        String xaxislabel_text1 = page.xaxislabelText().getText();
        System.out.println(xaxislabel_text1);


        page.textXAxisLabelPrefix().clear();
        page.textXAxisLabelPrefix().sendKeys("$");
        String eneteredtext = page.textXAxisLabelPrefix().getAttribute("value");
        page.dsxSetXAxisLabelPrefix().click();
        Thread.sleep(5000);
        String xaxislabel_text2 = page.xaxislabelText().getText();
        Assert.assertEquals(xaxislabel_text2,eneteredtext+" "+xaxislabel_text1);

        page.getter1().click();
        page.dsxGetXAxisLabelPrefix().click();
        Thread.sleep(5000);
        Assert.assertEquals(page.result().getText(),eneteredtext);
    }


    @Test()
    public void testXAxisLabelSuffix() throws InterruptedException {
        goTo(VBIConfig.URL_PATH);
        page.setter1().click();
        Thread.sleep(5000);
        nextpage();
        Thread.sleep(5000);
        page.textDataLabelEnabled().clear();
        page.textDataLabelEnabled().sendKeys("true");
        page.dsxSetDataLabelEnabled().click();
        Thread.sleep(5000);

        String datalabel_text1 = page.datalabelText().getText();



        page.textDataLabelSuffix().clear();
        page.textDataLabelSuffix().sendKeys("K");
        String eneteredtext = page.textDataLabelPrefix().getAttribute("value");
        page.dsxSetDataLabelSuffix().click();
        Thread.sleep(5000);
        String datalabel_text2 = page.datalabelText().getText();
        Assert.assertEquals(datalabel_text2,datalabel_text1+" "+eneteredtext);

        page.getter1().click();
        page.dsxGetDataLabelSuffix().click();
        Thread.sleep(5000);
        Assert.assertEquals(page.result().getText(),eneteredtext);

    }

    @Test()
    public void testXAxisTitleEnabled(){

        goTo(VBIConfig.URL_PATH);
        // Enable = false
        page.setter1().click();
        nextpage();
        page.textXAxisTitleEnabled().clear();
        page.textXAxisTitleEnabled().sendKeys("false");
        String eneteredtext = page.textDataLabelEnabled().getText();
        page.dsxSetXAxisTitleEnabled().click();
        String xaxistitletext = page.xaxisTitle().getText();
        Assert.assertEquals(xaxistitletext,"");

        page.getter1().click();
        page.dsxGetXAxisTitleEnabled().click();

        Assert.assertEquals(page.result().getText(),eneteredtext);

// Enable = true


        page.textDataLabelEnabled().clear();
        page.textDataLabelEnabled().sendKeys("true");
        page.dsxSetDataLabelEnabled().click();

        Assert.assertEquals(xaxistitletext,page.textDataLabelEnabled().getText());

        page.getter1().click();
        page.dsxGetDataLabelEnabled().click();

        Assert.assertEquals(page.result().getText(),eneteredtext);
    }

    @Test()
    public void testXAxisTitleText() throws InterruptedException {

        goTo(VBIConfig.URL_PATH);
        page.setter1().click();
        nextpage();

        Thread.sleep(5000);
        page.textXAxisTitleEnabled().clear();
        page.textXAxisTitleEnabled().sendKeys("true");

        page.textXAxisTitleText().clear();
        page.textXAxisTitleText().sendKeys("X-Axis Title");
        page.dsxSetXAxisTitleText().click();
        Thread.sleep(5000);
        String enteredtitle = page.textXAxisTitleText().getAttribute("value");
        Thread.sleep(5000);
        String xaixistitletext = page.xaxisTitle().getText();
        Assert.assertEquals(xaixistitletext,enteredtitle);

        page.getter1().click();
        page.dsxGetTitleText().click();

        Assert.assertEquals(page.result().getText(),"DSXGetTitleText : "+xaixistitletext);
    }


    @Test()
    public void testXAxisPlotBand() throws InterruptedException {

        goTo(VBIConfig.URL_PATH);
        // Enable = true
        page.setter1().click();
        nextpage();
        page.textXAxisPlotBandEnabled().clear();
        page.textXAxisPlotBandEnabled().sendKeys("true");
        page.dsxSetXAxisPlotBandEnabled().click();
        Thread.sleep(5000);

        page.textXAxisPlotBandFrom().clear();
        page.textXAxisPlotBandFrom().sendKeys("2");
        page.dsxSetXAxisPlotBandFrom().click();
        Thread.sleep(5000);
        nextpage();
        page.textXAxisPlotBandTo().clear();
        page.textXAxisPlotBandTo().sendKeys("5");
        page.dsxSetXAxisPlotBandTo().click();
        Thread.sleep(5000);


        Assert.assertTrue(page.plotband().isDisplayed());

        // Enable = false

        previouspage();
        page.textXAxisPlotBandEnabled().clear();
        page.textXAxisPlotBandEnabled().sendKeys("false");
        page.dsxSetXAxisPlotBandEnabled().click();
        Thread.sleep(5000);

        page.textXAxisPlotBandFrom().clear();
        page.textXAxisPlotBandFrom().sendKeys("2");
        page.dsxSetXAxisPlotBandFrom().click();
        Thread.sleep(5000);
        nextpage();
        page.textXAxisPlotBandTo().clear();
        page.textXAxisPlotBandTo().sendKeys("5");
        page.dsxSetXAxisPlotBandTo().click();
        Thread.sleep(5000);


        Assert.assertFalse(page.plotband().isDisplayed());


       /* page.getter1().click();
        page.dsxGetXAxisPlotBandEnabled().click();*/

    }

    @Test()
    public void testXAxisPlotLine(){}

    @Test()
    public void testYAxisMinMax() throws InterruptedException {

        page.textYAxisMaximum().clear();
        page.textYAxisMaximum().sendKeys("5");
        page.dsxSetYaxisMaximum().click();
        Thread.sleep(5000);
        String eneteredYaxisMax = page.textYAxisMaximum().getText();

        page.textYAxisMinimum().clear();
        page.textYAxisMinimum().sendKeys("4");
        page.dsxSetYaxisMinimum().click();
        Thread.sleep(5000);

        String eneteredYaxisMin = page.textYAxisMaximum().getText();

        Assert.assertEquals(page.yaxisMinimum().getText(),eneteredYaxisMax);
        Assert.assertEquals(page.yaxisMaximum().getText(),eneteredYaxisMin);

        page.getter1().click();
        page.dsxGetYaxisMaximum().click();
        Thread.sleep(5000);
        Assert.assertEquals(page.result().getText(),eneteredYaxisMax);

        page.dsxGetYaxisMinimum().click();
        Thread.sleep(5000);
        Assert.assertEquals(page.result().getText(),eneteredYaxisMin);

    }


    @Test()
    public void testGroupingYaxisMinMax() throws InterruptedException {}




    @Test()
    public void testYAxisLabelEnabled() throws InterruptedException {

        goTo(VBIConfig.URL_PATH);
        // Enable = false
        page.setter1().click();
        nextpage();
        page.textXAxisLabelEnabled().clear();
        page.textXAxisLabelEnabled().sendKeys("false");
        String eneteredtext = page.textXAxisLabelEnabled().getText();
        page.dsxSetXAxisLabelEnabled().click();
        Thread.sleep(5000);
        String xaxislabel_text = page.xaxislabelText().getText();
        Assert.assertEquals(xaxislabel_text,"");

        page.getter1().click();
        page.dsxGetXAxisLabelEnabled().click();
        Thread.sleep(5000);
        Assert.assertEquals(page.result().getText(),eneteredtext);

// Enable = true

        page.setter1().click();
        page.textXAxisLabelEnabled().clear();
        page.textXAxisLabelEnabled().sendKeys("true");
        page.dsxSetXAxisLabelEnabled().click();
        Thread.sleep(5000);
        Assert.assertEquals(xaxislabel_text,"Africa\\Non Renewable");

        page.getter1().click();
        page.dsxGetXAxisLabelEnabled().click();

        Thread.sleep(5000);
        Assert.assertEquals(page.result().getText(),eneteredtext);
    }

    @Test()
    public void testYAxisLabelPrefix() throws InterruptedException {

        goTo(VBIConfig.URL_PATH);
        page.setter1().click();
        Thread.sleep(5000);
        nextpage();
        Thread.sleep(5000);
        page.textXAxisLabelEnabled().clear();
        page.textXAxisLabelEnabled().sendKeys("true");
        page.dsxSetXAxisLabelEnabled().click();
        Thread.sleep(5000);
        String xaxislabel_text1 = page.xaxislabelText().getText();
        System.out.println(xaxislabel_text1);


        page.textXAxisLabelPrefix().clear();
        page.textXAxisLabelPrefix().sendKeys("$");
        String eneteredtext = page.textXAxisLabelPrefix().getAttribute("value");
        page.dsxSetXAxisLabelPrefix().click();
        Thread.sleep(5000);
        String xaxislabel_text2 = page.xaxislabelText().getText();
        Assert.assertEquals(xaxislabel_text2,eneteredtext+" "+xaxislabel_text1);

        page.getter1().click();
        page.dsxGetXAxisLabelPrefix().click();
        Thread.sleep(5000);
        Assert.assertEquals(page.result().getText(),eneteredtext);
    }


    @Test()
    public void testYAxisLabelSuffix() throws InterruptedException {
        goTo(VBIConfig.URL_PATH);
        page.setter1().click();
        Thread.sleep(5000);
        nextpage();
        Thread.sleep(5000);
        page.textDataLabelEnabled().clear();
        page.textDataLabelEnabled().sendKeys("true");
        page.dsxSetDataLabelEnabled().click();
        Thread.sleep(5000);

        String datalabel_text1 = page.datalabelText().getText();



        page.textDataLabelSuffix().clear();
        page.textDataLabelSuffix().sendKeys("K");
        String eneteredtext = page.textDataLabelPrefix().getAttribute("value");
        page.dsxSetDataLabelSuffix().click();
        Thread.sleep(5000);
        String datalabel_text2 = page.datalabelText().getText();
        Assert.assertEquals(datalabel_text2,datalabel_text1+" "+eneteredtext);

        page.getter1().click();
        page.dsxGetDataLabelSuffix().click();
        Thread.sleep(5000);
        Assert.assertEquals(page.result().getText(),eneteredtext);

    }

    @Test()
    public void testYAxisTitleEnabled(){

        goTo(VBIConfig.URL_PATH);
        // Enable = false
        page.setter1().click();
        nextpage();
        page.textXAxisTitleEnabled().clear();
        page.textXAxisTitleEnabled().sendKeys("false");
        String eneteredtext = page.textDataLabelEnabled().getText();
        page.dsxSetXAxisTitleEnabled().click();
        String xaxistitletext = page.xaxisTitle().getText();
        Assert.assertEquals(xaxistitletext,"");

        page.getter1().click();
        page.dsxGetXAxisTitleEnabled().click();

        Assert.assertEquals(page.result().getText(),eneteredtext);

// Enable = true


        page.textDataLabelEnabled().clear();
        page.textDataLabelEnabled().sendKeys("true");
        page.dsxSetDataLabelEnabled().click();

        Assert.assertEquals(xaxistitletext,page.textDataLabelEnabled().getText());

        page.getter1().click();
        page.dsxGetDataLabelEnabled().click();

        Assert.assertEquals(page.result().getText(),eneteredtext);
    }

    @Test()
    public void testYAxisTitleText() throws InterruptedException {

        goTo(VBIConfig.URL_PATH);
        page.setter1().click();
        nextpage();

        Thread.sleep(5000);
        page.textXAxisTitleEnabled().clear();
        page.textXAxisTitleEnabled().sendKeys("true");

        page.textXAxisTitleText().clear();
        page.textXAxisTitleText().sendKeys("X-Axis Title");
        page.dsxSetXAxisTitleText().click();
        Thread.sleep(5000);
        String enteredtitle = page.textXAxisTitleText().getAttribute("value");
        Thread.sleep(5000);
        String xaixistitletext = page.xaxisTitle().getText();
        Assert.assertEquals(xaixistitletext,enteredtitle);

        page.getter1().click();
        page.dsxGetTitleText().click();

        Assert.assertEquals(page.result().getText(),"DSXGetTitleText : "+xaixistitletext);}


    @Test()
    public void testYAxisPlotBand(){



    }

    @Test()
    public void testYAxisPlotLine(){}

    @Test()
    public void testThousandSeparator(){}

    @Test()
    public void testDecimalSeparator(){}

    @Test()
    public void testDataLabelNoOfDecimals() throws InterruptedException {

        goTo(VBIConfig.URL_PATH);
        //setter
        page.setter1().click();
        page.textDataLabelNoOfDecimals().clear();
        page.textDataLabelNoOfDecimals().sendKeys("5");
        page.dsxSetDataLabelNoOfDecimals().click();
        Thread.sleep(5000);

        String entereddecimal = page.textDataLabelNoOfDecimals().getAttribute("value");

        String datalabeltext = page.datalabelText().getText();
        int integerPlaces = datalabeltext.indexOf('.');
        int decimalPlaces = datalabeltext.length() - integerPlaces - 1;
        System.out.println("decimalPlaces:\t" + decimalPlaces);
        Assert.assertEquals(decimalPlaces, entereddecimal);

        //getter
        page.getter1().click();
        page.dsxGetDataLabelNoOfDecimals().click();
        Thread.sleep(5000);
        String Result_Text = page.result().getText();
        System.out.println(Result_Text);
        Assert.assertEquals(Result_Text,"DSXGetDataLabelNoOfDecimals : " + decimalPlaces);
    }

}

