package com.visualbi;

import org.fluentlenium.core.annotation.Page;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
 * Created by yogavb on 12/3/2017.
 */
public class HighChartsTest extends BaseTest {


    @Page
    HighChartsPage page;



    @Test
    public void testChartType() throws InterruptedException {

        goTo(VBIConfig.URL_PATH);
        //line
        page.setter1().click();

        page.textTextChartType().clear();
        page.textTextChartType().sendKeys("line");//sendKeys("line");
        page.DSXSetChartType.click();
        Thread.sleep(5000);

        page.textTextChartType().clear();
        page.textTextChartType().sendKeys("line");//sendKeys("line");
        page.DSXSetChartType.click();
        Thread.sleep(5000);
        String enteredtext1 = page.textTextChartType().getAttribute("value");
        Assert.assertTrue(page.lineChartType().isDisplayed());

        page.getter1().click();
        page.DSXGetChartType.click();
        Thread.sleep(5000);
        Assert.assertEquals(page.result().getText(), "DSXGetChartType : " + enteredtext1);

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
        Assert.assertEquals(page.result().getText(), "DSXGetChartType : " + enteredtext2);}
    @Test
        public void testTitleEnable () throws InterruptedException {

            goTo(VBIConfig.URL_PATH);

            // Enable = true

            page.setter1().click();
            page.textTitleEnable().clear();
            page.textTitleEnable().sendKeys("true");
            page.dsxSetTitleEnable().click();
            Thread.sleep(5000);
            String eneteredTitleEnable = page.textTitleEnable().getAttribute("value");

            page.textTitleText().clear();
            page.textTitleText().sendKeys("Chart");
            page.dsxSetTitleText().click();
            Thread.sleep(5000);
            String titletext = page.title().getText();
            Assert.assertEquals(titletext, page.textTitleText().getAttribute("value"));

            page.getter1().click();
            page.dsxGetTitleEnable().click();
            Thread.sleep(5000);
            assertTrue(page.result().getText().equalsIgnoreCase("DSXGetTitleEnable : " + eneteredTitleEnable));

            // Enable = false
            page.setter1().click();
            page.textTitleEnable().clear();
            page.textTitleEnable().sendKeys("false");
            page.dsxSetTitleEnable().click();
            Thread.sleep(5000);
            String eneteredTitleEnable2 = page.textTitleEnable().getAttribute("value");

            page.dsxSetTitleText().click();
            Thread.sleep(5000);
            String titletext2 = page.title().getText();
            Assert.assertEquals(titletext2, "");

            page.getter1().click();
            page.dsxGetTitleEnable().click();
            Thread.sleep(5000);
            assertTrue(page.result().getText().equalsIgnoreCase("DSXGetTitleEnable : " + eneteredTitleEnable2));

        }

        @Test()
        public void testTitleText () throws InterruptedException {

            goTo(VBIConfig.URL_PATH);
            page.setter1().click();
            page.textTitleText().clear();
            page.textTitleText().sendKeys("NewChartTitle");
            page.dsxSetTitleText().click();
            Thread.sleep(5000);
            String enteredtitle = page.textTitleText().getAttribute("value");
            Thread.sleep(5000);
            String titletext = page.title().getText();
            Assert.assertEquals(titletext, enteredtitle);

            page.getter1().click();
            page.dsxGetTitleText().click();
            Thread.sleep(5000);
            Assert.assertEquals(page.result().getText(), "DSXGetTitleText : " + titletext);
        }

        @Test()
        public void testSubTitleEnable () throws InterruptedException {

            goTo(VBIConfig.URL_PATH);
            // Enable = true
            page.setter1().click();
            page.textSubTitleEnable().clear();
            page.textSubTitleEnable().sendKeys("true");
            page.dsxSetSubTitleEnable().click();
            Thread.sleep(5000);

            String eneteredSubTitleEnable1 = page.textSubTitleEnable().getAttribute("value");

            page.textSubTitleText().clear();
            page.textSubTitleText().sendKeys("Chart");
            page.dsxSetSubTitleText().click();
            Thread.sleep(5000);
            String subtitletext1 = page.subtitle().getText();
            Assert.assertEquals(subtitletext1, page.textSubTitleText().getAttribute("value"));

            page.getter1().click();
            page.dsxGetSubTitleEnable().click();
            Thread.sleep(5000);
            //  Assert.assertEquals(page.result().getText(),"DSXGetSubTitleEnable : " + eneteredSubTitleEnable1);
            Assert.assertTrue(page.result().getText().equalsIgnoreCase("DSXGetSubTitleEnable : " + eneteredSubTitleEnable1));


            // Enable = false
            page.setter1().click();
            page.textSubTitleEnable().clear();
            page.textSubTitleEnable().sendKeys("false");
            page.dsxSetSubTitleEnable().click();
            Thread.sleep(5000);
            String eneteredSubTitleEnable2 = page.textSubTitleEnable().getAttribute("value");

            page.dsxSetSubTitleText().click();
            Thread.sleep(5000);
            String subtitletext2 = page.subtitle().getText();
            Assert.assertEquals(subtitletext2, "");

            page.getter1().click();
            page.dsxGetSubTitleEnable().click();
            Thread.sleep(5000);
            assertTrue(page.result().getText().equalsIgnoreCase("DSXGetSubTitleEnable : " + eneteredSubTitleEnable2));
        }

    @Test
        public void testSubTitleText () throws InterruptedException {

            goTo(VBIConfig.URL_PATH);
            page.setter1().click();
            page.textSubTitleText().clear();
            page.textSubTitleText().sendKeys("ChartSubTitle");
            page.dsxSetSubTitleText().click();
            Thread.sleep(5000);
            String enteredsubtitle = page.textSubTitleText().getAttribute("value");
            Thread.sleep(5000);
            String subtitletext = page.subtitle().getText();
            Assert.assertEquals(subtitletext, enteredsubtitle);

            page.getter1().click();
            page.dsxGetSubTitleText().click();
            Thread.sleep(5000);
            Assert.assertEquals(page.result().getText(), "DSXGetSubTitleText : " + subtitletext);
        }

    @Test
        public void testToolTipEnabled () throws InterruptedException {

            goTo(VBIConfig.URL_PATH);
            page.setter1().click();
            // Enable = true
            page.textToolTipEnabled().clear();
            page.textToolTipEnabled().sendKeys("true");
            page.dsxSetToolTipEnabled().click();
            Thread.sleep(5000);
            String eneteredtext2 = page.textToolTipEnabled().getAttribute("value");
            generatetooltip();
            String tooltiptext = page.tooltipText().getText();
            System.out.println(tooltiptext);

            Assert.assertEquals(tooltiptext, "Africa\\Non Renewable:\n" +
                    "Number of Records 92");

            page.getter1().click();
            page.dsxGetToolTipEnabled().click();
            Thread.sleep(5000);
            //Assert.assertEquals(page.result().getText(),"DSXGetToolTipEnabled : " +eneteredtext2);
            Assert.assertTrue(page.result().getText().equalsIgnoreCase("DSXGetToolTipEnabled : " + eneteredtext2));

            // Enable = false
      /*  page.textToolTipEnabled().clear();
        page.textToolTipEnabled().sendKeys("false");
        page.dsxSetToolTipEnabled().click();
        Thread.sleep(5000);
        String eneteredtext = page.textToolTipEnabled().getText();
        generatetooltip();
        Assert.assertFalse(page.tooltipText().isDisplayed());


        page.getter1().click();
        page.dsxGetToolTipEnabled().click();
        Thread.sleep(5000);
        Assert.assertTrue(page.result().getText().equalsIgnoreCase("DSXGetTitleEnable : " + eneteredtext));*/
        }

    @Test()
    public void testToolTipNoOfDecimals() throws InterruptedException {

        goTo(VBIConfig.URL_PATH);
        page.setter1().click();

        page.textToolTipNoOfDecimals().clear();
        page.textToolTipNoOfDecimals().sendKeys("5");
        page.dsxSetToolTipNoOfDecimals().click();
        Thread.sleep(5000);
        String entereddecimal = page.textToolTipNoOfDecimals().getAttribute("value");
        int entereddecimalvalue = Integer.parseInt(entereddecimal);
        System.out.println("entereddecimal:\t" + entereddecimalvalue);
        generatetooltip();

        String tooltiptext = page.tooltipText().getText();
        System.out.println(tooltiptext);

        int integerPlaces = tooltiptext.indexOf('.');
        int decimalPlaces = tooltiptext.length() - integerPlaces - 1;


        System.out.println("decimalPlaces:\t" + decimalPlaces);
        Assert.assertEquals(decimalPlaces, entereddecimalvalue);
    }


        @Test()
        public void testTooltipValuePrefix () throws InterruptedException {

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

            Assert.assertEquals(tooltiptext, "Africa\\Non Renewable:\n" +
                    "Number of Records " + enteredtext + " 92");


        }

        @Test()
        public void testTooltipValueSuffix () throws InterruptedException {

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

            Assert.assertEquals(tooltiptext, "Africa\\Non Renewable:\n" +
                    "Number of Records 92 " + enteredtext);
        }

        @Test()
        public void testExportedFileName () {
        }


        @Test()
        public void testDataLabelEnabled () throws InterruptedException {
            goTo(VBIConfig.URL_PATH);

            // Enable = true

            page.setter1().click();
            Thread.sleep(5000);
            nextpage();
            Thread.sleep(5000);
            page.textDataLabelEnabled().clear();
            page.textDataLabelEnabled().sendKeys("true");
            page.dsxSetDataLabelEnabled().click();
            Thread.sleep(5000);
            String eneteredtext1 = page.textDataLabelEnabled().getAttribute("value");
            String datalabeltext = page.datalabelText().getText();
            Assert.assertEquals(datalabeltext, "92.00");

            page.getter1().click();
            page.dsxGetDataLabelEnabled().click();
            Thread.sleep(5000);
            // Assert.assertEquals(page.result().getText(),"DSXGetDataLabelEnabled : "+eneteredtext1);
            Assert.assertTrue(page.result().getText().equalsIgnoreCase("DSXGetDataLabelEnabled : " + eneteredtext1));


            // Enable = false
    /*    page.setter1().click();
        nextpage();
        page.textDataLabelEnabled().clear();
        page.textDataLabelEnabled().sendKeys("false");

        page.dsxSetDataLabelEnabled().click();
        Thread.sleep(5000);

        String eneteredtext = page.textDataLabelEnabled().getAttribute("value");
        String datalabeltext = page.datalabelText().getText();
        Assert.assertEquals(datalabeltext, "");

        page.getter1().click();
        page.dsxGetDataLabelEnabled().click();
        Thread.sleep(5000);
        Assert.assertEquals(page.result().getText(),"DSXGetDataLabelEnabled : "+eneteredtext);
       // Assert.assertTrue(page.result().getText().equalsIgnoreCase("DSXGetDataLabelEnabled : "+eneteredtext));*/


        }

        @Test()
        public void testDataLabelPrefix () throws InterruptedException {

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
            Assert.assertEquals(datalabel_text2, eneteredtext + " " + datalabel_text1);

            page.getter1().click();
            page.dsxGetDataLabelPrefix().click();
            Thread.sleep(5000);
            Assert.assertEquals(page.result().getText(), "DSXGetDataLabelPrefix : " + eneteredtext);

        }

        @Test()
        public void testDataLabelSuffix () throws InterruptedException {

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
            Assert.assertEquals(datalabel_text2, datalabel_text1 + " " + eneteredtext);

            page.getter1().click();
            page.dsxGetDataLabelSuffix().click();
            Thread.sleep(5000);
            Assert.assertEquals(page.result().getText(), "DSXGetDataLabelSuffix : " + eneteredtext);
        }

        @Test()
        public void testXAxisLabelEnabled () throws InterruptedException {

            goTo(VBIConfig.URL_PATH);
            page.setter1().click();
            Thread.sleep(5000);
            nextpage();
            Thread.sleep(5000);
// Enable = true

            page.textXAxisLabelEnabled().clear();
            page.textXAxisLabelEnabled().sendKeys("true");
            page.dsxSetXAxisLabelEnabled().click();
            Thread.sleep(5000);
            String eneteredtext1 = page.textXAxisLabelEnabled().getAttribute("value");
            String xaxislabel_text1 = page.xaxislabelText().getText();
            Assert.assertEquals(xaxislabel_text1, "Africa\\Non Renewable");

            page.getter1().click();
                        page.dsxGetXAxisLabelEnabled().click();

            Thread.sleep(5000);
            Assert.assertTrue(page.result().getText().equalsIgnoreCase("DSXGetXAxisLabelEnabled : " + eneteredtext1));
          //  Assert.assertEquals(page.result().getText(),"DSXGetXAxisLabelEnabled : " + eneteredtext1);
            // Enable = false
            page.setter1().click();
            Thread.sleep(5000);
            nextpage();

            Thread.sleep(5000);
            page.textXAxisLabelEnabled().clear();
            page.textXAxisLabelEnabled().sendKeys("false");

            page.dsxSetXAxisLabelEnabled().click();
            Thread.sleep(5000);
            String eneteredtext2 = page.textXAxisLabelEnabled().getAttribute("value");
            String xaxislabel_text2 = page.xaxislabelText().getText();
            Assert.assertEquals(xaxislabel_text2, "");

            page.getter1().click();
            page.dsxGetXAxisLabelEnabled().click();
            Thread.sleep(5000);
            Assert.assertTrue(page.result().getText().equalsIgnoreCase("DSXGetXAxisLabelEnabled : " + eneteredtext2));

        }

        @Test()
        public void testXAxisLabelPrefix () throws InterruptedException {

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
            Assert.assertEquals(xaxislabel_text2, eneteredtext + xaxislabel_text1);

            page.getter1().click();
            page.dsxGetXAxisLabelPrefix().click();
            Thread.sleep(5000);
            Assert.assertEquals(page.result().getText(), eneteredtext);
        }


        @Test()
        public void testXAxisLabelSuffix () throws InterruptedException {
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
            Assert.assertEquals(datalabel_text2, datalabel_text1 + " " + eneteredtext);

            page.getter1().click();
            page.dsxGetDataLabelSuffix().click();
            Thread.sleep(5000);
            Assert.assertEquals(page.result().getText(), eneteredtext);

        }

        @Test()
        public void testXAxisTitleEnabled () throws InterruptedException {

            goTo(VBIConfig.URL_PATH);
// Enable = true
            page.setter1().click();
            Thread.sleep(5000);
            nextpage();
            Thread.sleep(5000);
            page.textXAxisTitleEnabled().clear();
            page.textXAxisTitleEnabled().sendKeys("true");
            String eneteredtext1 = page.textXAxisTitleEnabled().getAttribute("value");
            page.dsxSetXAxisTitleEnabled().click();
            Thread.sleep(5000);
            String xaxistitletext = page.xaxisTitle().getText();
            Assert.assertEquals(xaxistitletext, page.textXAxisTitleEnabled().getText());

            page.getter1().click();
            page.dsxGetXAxisTitleEnabled().click();
            Thread.sleep(5000);
            Assert.assertEquals(page.result().getText(), "DSXGetXAxisTitleEnabled :" + eneteredtext1);

            // Enable = false
            page.setter1().click();
            Thread.sleep(5000);
            nextpage();
            Thread.sleep(5000);
            page.textXAxisTitleEnabled().clear();
            page.textXAxisTitleEnabled().sendKeys("false");
            String eneteredtext2 = page.textXAxisTitleEnabled().getAttribute("value");
            page.dsxSetXAxisTitleEnabled().click();
            Thread.sleep(5000);
            Assert.assertEquals(xaxistitletext, "");

            page.getter1().click();
            page.dsxGetXAxisTitleEnabled().click();
            Thread.sleep(5000);
            Assert.assertEquals(page.result().getText(), "DSXGetXAxisTitleEnabled :" + eneteredtext2);




        }

        @Test()
        public void testXAxisTitleText () throws InterruptedException {

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
            Assert.assertEquals(xaixistitletext, enteredtitle);

            page.getter1().click();
            page.dsxGetTitleText().click();

            Assert.assertEquals(page.result().getText(), "DSXGetTitleText : " + xaixistitletext);
        }


        @Test()
        public void testXAxisPlotBand () throws InterruptedException {

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

    @Test
        public void testXAxisPlotLine () throws InterruptedException {

        goTo(VBIConfig.URL_PATH);
        // Enable = true
        page.setter1().click();
        nextpage();
        page.textXAxisPlotLineEnabled().clear();
        page.textXAxisPlotLineEnabled().sendKeys("true");
        page.dsxSetXAxisPlotLineEnabled().click();
        Thread.sleep(5000);

        page.textXAxisPlotLineValue().clear();
        page.textXAxisPlotLineValue().sendKeys("5");
        page.textXAxisPlotLineValue().click();
        Thread.sleep(5000);
        Assert.assertTrue(page.plotline().isDisplayed());

        // Enable = false

        page.setter1().click();
        nextpage();
        page.textXAxisPlotLineEnabled().clear();
        page.textXAxisPlotLineEnabled().sendKeys("true");
        page.dsxSetXAxisPlotLineEnabled().click();
        Thread.sleep(5000);

        page.textXAxisPlotLineValue().clear();
        page.textXAxisPlotLineValue().sendKeys("5");
        page.textXAxisPlotLineValue().click();
        Thread.sleep(5000);
        Assert.assertFalse(page.plotline().isDisplayed());
        }

    @Test
        public void testYAxisMinMax () throws InterruptedException {

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

            Assert.assertEquals(page.yaxisMinimum().getText(), eneteredYaxisMax);
            Assert.assertEquals(page.yaxisMaximum().getText(), eneteredYaxisMin);

            page.getter1().click();
            page.dsxGetYaxisMaximum().click();
            Thread.sleep(5000);
            Assert.assertEquals(page.result().getText(), eneteredYaxisMax);

            page.dsxGetYaxisMinimum().click();
            Thread.sleep(5000);
            Assert.assertEquals(page.result().getText(), eneteredYaxisMin);

        }


    @Test
        public void testGroupingYaxisMinMax () throws InterruptedException {
        }


    @Test
        public void testYAxisLabelEnabled () throws InterruptedException {

            goTo(VBIConfig.URL_PATH);
            // Enable = false
            page.setter1().click();
            nextpage();
            page.textYAxisLabelEnabled().clear();
            page.textYAxisLabelEnabled().sendKeys("false");
            String eneteredtext = page.textYAxisLabelEnabled().getAttribute("value");
            page.dsxSetYAxisLabelEnabled().click();
            Thread.sleep(5000);
            String yaxislabel_text = page.xaxislabelText().getText();
            Assert.assertEquals(yaxislabel_text, "");

            page.getter1().click();
            page.dsxGetYAxisLabelEnabled().click();
            Thread.sleep(5000);
            Assert.assertEquals(page.result().getText(), eneteredtext);

// Enable = true

            page.setter1().click();
            page.textXAxisLabelEnabled().clear();
            page.textXAxisLabelEnabled().sendKeys("true");
            page.dsxSetXAxisLabelEnabled().click();
            Thread.sleep(5000);
            Assert.assertEquals(yaxislabel_text, "0");

            page.getter1().click();
            page.dsxGetXAxisLabelEnabled().click();

            Thread.sleep(5000);
            Assert.assertEquals(page.result().getText(), eneteredtext);
        }

    @Test
        public void testYAxisLabelPrefix () throws InterruptedException {

            goTo(VBIConfig.URL_PATH);
            page.setter1().click();
            Thread.sleep(5000);
            nextpage();
            Thread.sleep(5000);
            page.textYAxisLabelEnabled().clear();
            page.textYAxisLabelEnabled().sendKeys("true");
            page.dsxSetYAxisLabelEnabled().click();
            Thread.sleep(5000);
            String yaxislabel_text1 = page.yaxislabelText().getText();
            System.out.println(yaxislabel_text1);


            page.textYAxisLabelPrefix().clear();
            page.textYAxisLabelPrefix().sendKeys("$");
            String eneteredtext = page.textYAxisLabelPrefix().getAttribute("value");
            page.dsxSetYAxisLabelPrefix().click();
            Thread.sleep(5000);
            String xaxislabel_text2 = page.yaxislabelText().getText();
            Assert.assertEquals(xaxislabel_text2, eneteredtext + " " + yaxislabel_text1);

            page.getter1().click();
            page.dsxGetYAxisLabelPrefix().click();
            Thread.sleep(5000);
            Assert.assertEquals(page.result().getText(), eneteredtext);
        }


    @Test
        public void testYAxisLabelSuffix () throws InterruptedException {
            goTo(VBIConfig.URL_PATH);
            page.setter1().click();
            Thread.sleep(5000);
            nextpage();
            Thread.sleep(5000);
            page.textYAxisLabelEnabled().clear();
            page.textYAxisLabelEnabled().sendKeys("true");
            page.dsxSetYAxisLabelEnabled().click();
            Thread.sleep(5000);

            String datalabel_text1 = page.datalabelText().getText();


            page.textYAxisLabelSuffix().clear();
            page.textYAxisLabelSuffix().sendKeys("K");
            String eneteredtext = page.textYAxisLabelSuffix().getAttribute("value");
            page.dsxSetYAxisLabelSuffix().click();
            Thread.sleep(5000);
            String datalabel_text2 = page.datalabelText().getText();
            Assert.assertEquals(datalabel_text2, datalabel_text1 + " " + eneteredtext);

            page.getter1().click();
            page.dsxGetYAxisLabelSuffix().click();
            Thread.sleep(5000);
            Assert.assertEquals(page.result().getText(), eneteredtext);

        }

    @Test
        public void testYAxisTitleEnabled () {

            goTo(VBIConfig.URL_PATH);
            // Enable = false
            page.setter1().click();
            nextpage();
            page.textYAxisTitleEnabled().clear();
            page.textYAxisTitleEnabled().sendKeys("false");
            String eneteredtext = page.textYAxisTitleEnabled().getAttribute("value");
            page.dsxSetYAxisTitleEnabled().click();
            String yaxistitletext = page.xaxisTitle().getText();
            Assert.assertEquals(yaxistitletext, "");

            page.getter1().click();
            page.dsxGetYAxisTitleEnabled().click();

            Assert.assertEquals(page.result().getText(), eneteredtext);

// Enable = true


            page.textDataLabelEnabled().clear();
            page.textDataLabelEnabled().sendKeys("true");
            page.dsxSetDataLabelEnabled().click();

            Assert.assertEquals(yaxistitletext, page.textDataLabelEnabled().getText());

            page.getter1().click();
            page.dsxGetDataLabelEnabled().click();

            Assert.assertEquals(page.result().getText(), eneteredtext);
        }

    @Test
        public void testYAxisTitleText () throws InterruptedException {

            goTo(VBIConfig.URL_PATH);
            page.setter1().click();
            nextpage();

            Thread.sleep(5000);
            page.textYAxisTitleEnabled().clear();
            page.textYAxisTitleEnabled().sendKeys("true");

            page.textYAxisTitleText().clear();
            page.textYAxisTitleText().sendKeys("X-Axis Title");
            page.dsxSetYAxisTitleText().click();
            Thread.sleep(5000);
            String enteredtitle = page.textYAxisTitleText().getAttribute("value");
            Thread.sleep(5000);
            String xaixistitletext = page.xaxisTitle().getText();
            Assert.assertEquals(xaixistitletext, enteredtitle);

            page.getter1().click();
            page.dsxGetTitleText().click();

            Assert.assertEquals(page.result().getText(), "DSXGetTitleText : " + xaixistitletext);
        }
    @Test

        public void testYAxisPlotBand () throws InterruptedException{

        goTo(VBIConfig.URL_PATH);
        // Enable = true
        page.setter1().click();
        nextpage();
        page.textYAxisPlotBandEnabled().clear();
        page.textYAxisPlotBandEnabled().sendKeys("true");
        page.dsxSetYAxisPlotBandEnabled().click();
        Thread.sleep(5000);

        page.textYAxisPlotBandFrom().clear();
        page.textYAxisPlotBandFrom().sendKeys("2");
        page.dsxSetYAxisPlotBandFrom().click();
        Thread.sleep(5000);
        nextpage();
        page.textYAxisPlotBandTo().clear();
        page.textYAxisPlotBandTo().sendKeys("5");
        page.dsxSetYAxisPlotBandTo().click();
        Thread.sleep(5000);


        Assert.assertTrue(page.plotband().isDisplayed());

        // Enable = false

        previouspage();
        page.textYAxisPlotBandEnabled().clear();
        page.textYAxisPlotBandEnabled().sendKeys("false");
        page.dsxSetYAxisPlotBandEnabled().click();
        Thread.sleep(5000);

        page.textYAxisPlotBandFrom().clear();
        page.textYAxisPlotBandFrom().sendKeys("2");
        page.dsxSetYAxisPlotBandFrom().click();
        Thread.sleep(5000);
        nextpage();
        page.textYAxisPlotBandTo().clear();
        page.textYAxisPlotBandTo().sendKeys("5");
        page.dsxSetYAxisPlotBandTo().click();
        Thread.sleep(5000);


        Assert.assertFalse(page.plotband().isDisplayed());
        }

    @Test
        public void testYAxisPlotLine () throws InterruptedException{
        goTo(VBIConfig.URL_PATH);
        // Enable = true
        page.setter1().click();
        nextpage();
        page.textYAxisPlotLineEnabled().clear();
        page.textYAxisPlotLineEnabled().sendKeys("true");
        page.dsxSetYAxisPlotLineEnabled().click();
        Thread.sleep(5000);

        page.textYAxisPlotLineValue().clear();
        page.textYAxisPlotLineValue().sendKeys("5");
        page.textYAxisPlotLineValue().click();
        Thread.sleep(5000);
        Assert.assertTrue(page.plotline().isDisplayed());

        // Enable = false

        page.setter1().click();
        nextpage();
        page.textYAxisPlotLineEnabled().clear();
        page.textYAxisPlotLineEnabled().sendKeys("true");
        page.dsxSetYAxisPlotLineEnabled().click();
        Thread.sleep(5000);

        page.textYAxisPlotLineValue().clear();
        page.textYAxisPlotLineValue().sendKeys("5");
        page.textYAxisPlotLineValue().click();
        Thread.sleep(5000);
        Assert.assertFalse(page.plotline().isDisplayed());
        }

    @Test
        public void testThousandSeparator () throws InterruptedException{

        }

    @Test
        public void testDecimalSeparator () throws InterruptedException{
        }

    @Test
        public void testDataLabelNoOfDecimals () throws InterruptedException {

            goTo(VBIConfig.URL_PATH);
            //setter
            page.setter1().click();
            page.textDataLabelNoOfDecimals().clear();
            page.textDataLabelNoOfDecimals().sendKeys("5");
            page.dsxSetDataLabelNoOfDecimals().click();
            Thread.sleep(5000);

            String entereddecimal = page.textDataLabelNoOfDecimals().getAttribute("value");
        int entereddecimalvalue = Integer.parseInt(entereddecimal);
            String datalabeltext = page.datalabelText().getText();
            int integerPlaces = datalabeltext.indexOf('.');
            int decimalPlaces = datalabeltext.length() - integerPlaces - 1;
            System.out.println("decimalPlaces:\t" + decimalPlaces);
            Assert.assertEquals(decimalPlaces, entereddecimalvalue);

            //getter
            page.getter1().click();
            page.dsxGetDataLabelNoOfDecimals().click();
            Thread.sleep(5000);
            String Result_Text = page.result().getText();
            System.out.println(Result_Text);
            Assert.assertEquals(Result_Text, "DSXGetDataLabelNoOfDecimals : " + decimalPlaces);
        }

    }
