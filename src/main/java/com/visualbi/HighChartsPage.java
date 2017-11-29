package com.visualbi;

/**
 * Created by yogavb on 11/29/2017.
 */
import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.hook.wait.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

@Wait(timeout = 50, timeUnit = TimeUnit.SECONDS)
public class HighChartsPage extends FluentPage {

    //  getter

    @FindBy(id = "__filter0-text")
    protected WebElement Getter1;

    public WebElement getter1() {
        return Getter1;
    }

    //GetterButtons
    @FindBy(id = "BUTTON_1_button-content")
    protected WebElement DSXGetChartType;

    public WebElement dsxGetChartType() {
        return DSXGetChartType;
    }

    @FindBy(id = "BUTTON_2_button-content")
    protected WebElement DSXGetTitleEnable;

    public WebElement dsxGetTitleEnable() {
        return DSXGetTitleEnable;
    }

    @FindBy(id = "BUTTON_3_button-content")
    protected WebElement DSXGetTitleText;

    public WebElement dsxGetTitleText() {
        return DSXGetTitleText;
    }

    @FindBy(id = "BUTTON_4_button-content")
    protected WebElement DSXGetSubTitleEnable;

    public WebElement dsxGetSubTitleEnable() {
        return DSXGetSubTitleEnable;
    }

    @FindBy(id = "BUTTON_5_button-content")
    protected WebElement DSXGetSubTitleText;

    public WebElement dsxGetSubTitleText() {
        return DSXGetSubTitleText;
    }

    @FindBy(id = "BUTTON_6_button-content")
    protected WebElement DSXGetToolTipEnabled;

    public WebElement dsxGetToolTipEnabled() {
        return DSXGetToolTipEnabled;
    }

    @FindBy(id = "BUTTON_7_button-content")
    protected WebElement DSXGetToolTipNoOfDecimals;

    public WebElement dsxGetToolTipNoOfDecimals() {
        return DSXGetToolTipNoOfDecimals;
    }

    @FindBy(id = "BUTTON_8_button-content")
    protected WebElement DSXGetTooltipValuePrefix;

    public WebElement dsxGetTooltipValuePrefix() {
        return DSXGetTooltipValuePrefix;
    }

    @FindBy(id = "BUTTON_9_button-content")
    protected WebElement DSXGetTooltipValueSuffix;

    public WebElement dsxGetTooltipValueSuffix() {
        return DSXGetTooltipValueSuffix;
    }

    @FindBy(id = "BUTTON_10_button-content")
    protected WebElement DSXGetDataLabelEnabled;

    public WebElement dsxGetDataLabelEnabled() {
        return DSXGetDataLabelEnabled;
    }

    @FindBy(id = "BUTTON_11_button-content")
    protected WebElement DSXGetDataLabelPrefix;

    public WebElement dsxGetDataLabelPrefix() {
        return DSXGetDataLabelPrefix;
    }

    @FindBy(id = "BUTTON_12_button-content")
    protected WebElement DSXGetDataLabelSuffix;

    public WebElement dsxGetDataLabelSuffix() {
        return DSXGetDataLabelSuffix;
    }

    @FindBy(id = "BUTTON_13_button-content")
    protected WebElement DSXGetXAxisLabelEnabled;

    public WebElement dsxGetXAxisLabelEnabled() {
        return DSXGetXAxisLabelEnabled;
    }

    @FindBy(id = "BUTTON_14_button-content")
    protected WebElement DSXGetXAxisLabelPrefix;

    public WebElement dsxGetXAxisLabelPrefix() {
        return DSXGetXAxisLabelPrefix;
    }

    @FindBy(id = "BUTTON_15_button-content")
    protected WebElement DSXGetXAxisLabelSuffix;

    public WebElement dsxGetXAxisLabelSuffix() {
        return DSXGetXAxisLabelSuffix;
    }

    @FindBy(id = "BUTTON_16_button-content")
    protected WebElement DSXGetXAxisTitleEnabled;

    public WebElement dsxGetXAxisTitleEnabled() {
        return DSXGetXAxisTitleEnabled;
    }

    @FindBy(id = "BUTTON_17_button-content")
    protected WebElement DSXGetXAxisTitleText;

    public WebElement dsxGetXAxisTitleText() {
        return DSXGetXAxisTitleText;
    }

    @FindBy(id = "BUTTON_18_button-content")
    protected WebElement DSXGetXAxisPlotBandEnabled;

    public WebElement dsxGetXAxisPlotBandEnabled() {
        return DSXGetXAxisPlotBandEnabled;
    }

    @FindBy(id = "BUTTON_19_button-content")
    protected WebElement DSXGetXAxisPlotBandFrom;

    public WebElement dsxGetXAxisPlotBandFrom() {
        return DSXGetXAxisPlotBandFrom;
    }

    @FindBy(id = "BUTTON_20_button-content")
    protected WebElement DSXGetXAxisPlotBandTo;

    public WebElement dsxGetXAxisPlotBandTo() {
        return DSXGetXAxisPlotBandTo;
    }

    @FindBy(id = "BUTTON_21_button-content")
    protected WebElement DSXGetXAxisPlotLineEnabled;

    public WebElement dsxGetXAxisPlotLineEnabled() {
        return DSXGetXAxisPlotLineEnabled;
    }

    @FindBy(id = "BUTTON_22_button-content")
    protected WebElement DSXGetXAxisPlotLineValue;

    public WebElement dsxGetXAxisPlotLineValue() {
        return DSXGetXAxisPlotLineValue;
    }

    @FindBy(id = "BUTTON_23_button-content")
    protected WebElement DSXGetYaxisMaximum;

    public WebElement dsxGetYaxisMaximum() {
        return DSXGetYaxisMaximum;
    }

    @FindBy(id = "BUTTON_24_button-content")
    protected WebElement DSXGetYaxisMinimum;

    public WebElement dsxGetYaxisMinimum() {
        return DSXGetYaxisMinimum;
    }

    @FindBy(id = "BUTTON_25_button-content")
    protected WebElement DSXGetYAxisLabelEnabled;

    public WebElement dsxGetYAxisLabelEnabled() {
        return DSXGetYAxisLabelEnabled;
    }

    @FindBy(id = "BUTTON_26_button-content")
    protected WebElement DSXGetYAxisLabelPrefix;

    public WebElement dsxGetYAxisLabelPrefix() {
        return DSXGetYAxisLabelPrefix;
    }

    @FindBy(id = "BUTTON_27_button-content")
    protected WebElement DSXGetYAxisLabelSuffix;

    public WebElement dsxGetYAxisLabelSuffix() {
        return DSXGetYAxisLabelSuffix;
    }

    @FindBy(id = "BUTTON_28_button-content")
    protected WebElement DSXGetYAxisTitleEnabled;

    public WebElement dsxGetYAxisTitleEnabled() {
        return DSXGetYAxisTitleEnabled;
    }

    @FindBy(id = "BUTTON_29_button-content")
    protected WebElement DSXGetYAxisTitleText;

    public WebElement dsxGetYAxisTitleText() {
        return DSXGetYAxisTitleText;
    }
    @FindBy(id = "BUTTON_30_button-content")
    protected WebElement DSXGetYAxisPlotBandEnabled;

    public WebElement dsxGetYAxisPlotBandEnabled() {
        return DSXGetYAxisPlotBandEnabled;
    }

    @FindBy(id = "BUTTON_31_button-content")
    protected WebElement DSXGetYAxisPlotBandFrom;

    public WebElement dsxGetYAxisPlotBandFrom() {
        return DSXGetYAxisPlotBandFrom;}

    @FindBy(id = "BUTTON_32_button-content")
    protected WebElement DSXGetYAxisPlotBandTo;

    public WebElement dsxGetYAxisPlotBandTo() {
        return DSXGetYAxisPlotBandTo;
    }

    @FindBy(id = "BUTTON_33_button-content")
    protected WebElement DSXGetYAxisPlotLineEnabled;

    public WebElement dsxGetYAxisPlotLineEnabled() {
        return DSXGetYAxisPlotLineEnabled;    }

    @FindBy(id = "BUTTON_34_button-content")
    protected WebElement DSXGetYAxisPlotLineValue;

    public WebElement dsxGetYAxisPlotLineValue() {
        return DSXGetYAxisPlotLineValue;    }

    @FindBy(id = "BUTTON_35_button-content")
    protected WebElement DSXGetXAxisPlotBandColor;

    public WebElement dsxGetXAxisPlotBandColor() {
        return DSXGetXAxisPlotBandColor;    }

    @FindBy(id = "BUTTON_36_button-content")
    protected WebElement DSXGetXAxisPlotLineColor;

    public WebElement dsxGetXAxisPlotLineColor() {
        return DSXGetXAxisPlotLineColor;    }

    @FindBy(id = "BUTTON_37_button-content")
    protected WebElement DSXGetYAxisPlotBandColor;

    public WebElement dsxGetYAxisPlotBandColor() {
        return DSXGetYAxisPlotBandColor;    }

    @FindBy(id = "BUTTON_38_button-content")
    protected WebElement DSXGetYAxisPlotLineColor;

    public WebElement dsxGetYAxisPlotLineColor() {
        return DSXGetYAxisPlotLineColor;    }

    @FindBy(id = "BUTTON_39_button-content")
    protected WebElement DSXGetThousandSeparator;

    public WebElement dsxGetThousandSeparator() {
        return DSXGetThousandSeparator;    }


    @FindBy(id = "BUTTON_40_button-content")
    protected WebElement DSXGetDecimalSeparator;

    public WebElement dsxGetDecimalSeparator() {
        return DSXGetDecimalSeparator;    }


    @FindBy(id = "BUTTON_41_button-content")
    protected WebElement DSXGetDataLabelNoOfDecimals;

    public WebElement dsxGetDataLabelNoOfDecimals() {
        return DSXGetDataLabelNoOfDecimals;    }


    //result
    @FindBy(id = "TEXT_1_tf1")
    protected WebElement Result;

    public WebElement result() {
        return Result;
    }

    //next page

    @FindBy(id = "PAGEBOOK_2_tf1-arrowScrollRight")
    protected WebElement Navigate;

    public WebElement navigate() {
        return Navigate;
    }



    //setter
    @FindBy(id = "__filter1-text")
    protected WebElement Setter1;

    public WebElement setter1() {
        return Setter1;
    }

    //SetterText

    @FindBy(id = "INPUTFIELD_1_inputfield1-inner")
    protected WebElement TextChartType;

    public WebElement textTextChartType() {
        return TextChartType;
    }

    @FindBy(id = "INPUTFIELD_2_inputfield1-inner")
    protected WebElement TextTitleEnable;

    public WebElement textTitleEnable() {
        return TextTitleEnable;
    }

    @FindBy(id = "INPUTFIELD_3_inputfield1-inner")
    protected WebElement TextTitleText;

    public WebElement textTitleText() {
        return TextTitleText;
    }

    @FindBy(id = "INPUTFIELD_4_inputfield1-inner")
    protected WebElement TextSubTitleEnable;

    public WebElement textSubTitleEnable() {
        return TextSubTitleEnable;
    }


    @FindBy(id = "INPUTFIELD_5_inputfield1-inner")
    protected WebElement TextSubTitleText;

    public WebElement textSubTitleText() {
        return TextSubTitleText;
    }

    @FindBy(id = "INPUTFIELD_6_inputfield1-inner")
    protected WebElement TextToolTipEnabled;

    public WebElement textToolTipEnabled() {
        return TextToolTipEnabled;
    }


    @FindBy(id = "INPUTFIELD_7_inputfield1-inner")
    protected WebElement TextToolTipNoOfDecimals;

    public WebElement textToolTipNoOfDecimals() {
        return TextToolTipNoOfDecimals;
    }

    @FindBy(id = "INPUTFIELD_8_inputfield1-inner")
    protected WebElement TextTooltipValuePrefix;

    public WebElement textTooltipValuePrefix() {
        return TextTooltipValuePrefix;
    }

    @FindBy(id = "INPUTFIELD_9_inputfield1-inner")
    protected WebElement TextTooltipValueSuffix;

    public WebElement textTooltipValueSuffix() {
        return TextTooltipValueSuffix;
    }

    @FindBy(id = "INPUTFIELD_10_inputfield1-inner")
    protected WebElement TextExportedFileName;

    public WebElement textExportedFileName() {
        return TextExportedFileName;
    }


    @FindBy(id = "INPUTFIELD_11_inputfield1-inner")
    protected WebElement TextDataLabelEnabled;

    public WebElement textDataLabelEnabled() {
        return TextDataLabelEnabled;
    }

    @FindBy(id = "INPUTFIELD_12_inputfield1-inner")
    protected WebElement TextDataLabelPrefix;

    public WebElement textDataLabelPrefix() {
        return TextDataLabelPrefix;
    }

    @FindBy(id = "INPUTFIELD_13_inputfield1-inner")
    protected WebElement TextDataLabelSuffix;

    public WebElement textDataLabelSuffix() {
        return TextDataLabelSuffix;
    }


    @FindBy(id = "INPUTFIELD_14_inputfield1-inner")
    protected WebElement TextXAxisLabelEnabled;

    public WebElement textXAxisLabelEnabled() {
        return TextXAxisLabelEnabled;}

    @FindBy(id = "INPUTFIELD_15_inputfield1-inner")
    protected WebElement TextXAxisLabelPrefix;

    public WebElement textXAxisLabelPrefix() {
        return TextXAxisLabelPrefix;}

    @FindBy(id = "INPUTFIELD_16_inputfield1-inner")
    protected WebElement TextXAxisLabelSuffix;

    public WebElement textXAxisLabelSuffix() {
        return TextXAxisLabelSuffix;}

    @FindBy(id = "INPUTFIELD_17_inputfield1-inner")
    protected WebElement TextXAxisTitleEnabled;

    public WebElement textXAxisTitleEnabled() {
        return TextXAxisTitleEnabled;}

    @FindBy(id = "INPUTFIELD_18_inputfield1-inner")
    protected WebElement TextXAxisTitleText;

    public WebElement textXAxisTitleText() {
        return TextXAxisTitleText;
    }


    @FindBy(id = "INPUTFIELD_19_inputfield1-inner")
    protected WebElement TextXAxisPlotBandEnabled;

    public WebElement textXAxisPlotBandEnabled() {
        return TextXAxisPlotBandEnabled;
    }

    @FindBy(id = "INPUTFIELD_20_inputfield1-inner")
    protected WebElement TextXAxisPlotBandFrom;

    public WebElement textXAxisPlotBandFrom() {
        return TextXAxisPlotBandFrom;
    }

    @FindBy(id = "INPUTFIELD_21_inputfield1-inner")
    protected WebElement TextXAxisPlotBandTo;

    public WebElement textXAxisPlotBandTo() {
        return TextXAxisPlotBandTo;
    }

    @FindBy(id = "INPUTFIELD_22_inputfield1-inner")
    protected WebElement TextXAxisPlotLineEnabled;

    public WebElement textXAxisPlotLineEnabled() {
        return TextXAxisPlotLineEnabled;
    }

    @FindBy(id = "INPUTFIELD_23_inputfield1-inner")
    protected WebElement TextXAxisPlotLineValue;

    public WebElement textXAxisPlotLineValue() {
        return TextXAxisPlotLineValue;
    }


    @FindBy(id = "INPUTFIELD_24_inputfield1-inner")
    protected WebElement TextYAxisMaximum;

    public WebElement textYAxisMaximum() {
        return TextYAxisMaximum;
    }

    @FindBy(id = "INPUTFIELD_25_inputfield1-inner")
    protected WebElement TextYAxisMinimum;

    public WebElement textYAxisMinimum() {
        return TextYAxisMinimum;
    }


    @FindBy(id = "INPUTFIELD_26_inputfield1-inner")
    protected WebElement TextGroupingYaxisMaximum;

    public WebElement textGroupingYaxisMaximum() {
        return TextGroupingYaxisMaximum;
    }

    @FindBy(id = "INPUTFIELD_27_inputfield1-inner")
    protected WebElement TextGroupedYaxisMinimum;

    public WebElement textGroupedYaxisMinimum() {
        return TextGroupedYaxisMinimum;
    }

    @FindBy(id = "INPUTFIELD_28_inputfield1-inner")
    protected WebElement TextYAxisLabelEnabled;

    public WebElement textYAxisLabelEnabled() {
        return TextYAxisLabelEnabled;
    }

    @FindBy(id = "INPUTFIELD_29_inputfield1-inner")
    protected WebElement TextYAxisLabelPrefix;

    public WebElement textYAxisLabelPrefix() {
        return TextYAxisLabelPrefix;
    }

    @FindBy(id = "INPUTFIELD_30_inputfield1-inner")
    protected WebElement TextYAxisLabelSuffix;

    public WebElement textYAxisLabelSuffix() {
        return TextYAxisLabelSuffix;
    }

    @FindBy(id = "INPUTFIELD_31_inputfield1-inner")
    protected WebElement TextYAxisTitleEnabled;

    public WebElement textYAxisTitleEnabled() {
        return TextYAxisTitleEnabled;
    }

    @FindBy(id = "INPUTFIELD_32_inputfield1-inner")
    protected WebElement TextYAxisTitleText;

    public WebElement textYAxisTitleText() {
        return TextYAxisTitleText;
    }

    @FindBy(id = "INPUTFIELD_33_inputfield1-inner")
    protected WebElement TextYAxisPlotBandEnabled;

    public WebElement textYAxisPlotBandEnabled() {
        return TextYAxisPlotBandEnabled;
    }

    @FindBy(id = "INPUTFIELD_34_inputfield1-inner")
    protected WebElement TextYAxisPlotBandFrom;

    public WebElement textYAxisPlotBandFrom() {
        return TextYAxisPlotBandFrom;
    }

    @FindBy(id = "INPUTFIELD_35_inputfield1-inner")
    protected WebElement TextYAxisPlotBandTo;

    public WebElement textYAxisPlotBandTo() {
        return TextYAxisPlotBandTo;
    }

    @FindBy(id = "INPUTFIELD_36_inputfield1-inner")
    protected WebElement TextYAxisPlotLineEnabled;

    public WebElement textYAxisPlotLineEnabled() {
        return TextYAxisPlotLineEnabled;
    }

    @FindBy(id = "INPUTFIELD_37_inputfield1-inner")
    protected WebElement TextYAxisPlotLineValue;

    public WebElement textYAxisPlotLineValue() {
        return TextYAxisPlotLineValue;
    }

    @FindBy(id = "INPUTFIELD_38_inputfield1-inner")
    protected WebElement TextXAxisPlotBandColor;

    public WebElement textXAxisPlotBandColor() {
        return TextXAxisPlotBandColor;
    }

    @FindBy(id = "INPUTFIELD_39_inputfield1-inner")
    protected WebElement TextXAxisPlotLineColor;

    public WebElement textXAxisPlotLineColor() {
        return TextXAxisPlotLineColor;
    }


    @FindBy(id = "INPUTFIELD_40_inputfield1-inner")
    protected WebElement TextYAxisPlotBandColor;

    public WebElement textYAxisPlotBandColor() {
        return TextYAxisPlotBandColor;
    }

    @FindBy(id = "INPUTFIELD_41_inputfield1-inner")
    protected WebElement TextYAxisPlotLineColor;

    public WebElement textYAxisPlotLineColor() {
        return TextYAxisPlotLineColor;
    }

    @FindBy(id = "INPUTFIELD_42_inputfield1-inner")
    protected WebElement TextThousandSeparator;

    public WebElement textThousandSeparator() {
        return TextThousandSeparator;
    }

    @FindBy(id = "INPUTFIELD_43_inputfield1-inner")
    protected WebElement TextDecimalSeparator;

    public WebElement textDecimalSeparator() {
        return TextDecimalSeparator;
    }

    @FindBy(id = "INPUTFIELD_44_inputfield1-inner")
    protected WebElement TextDataLabelNoOfDecimals;

    public WebElement textDataLabelNoOfDecimals() {
        return TextDataLabelNoOfDecimals;
    }

    //component

    @FindBy(css = ".highcharts-title")
    protected WebElement ChartTitle;

    public WebElement title() {
        return ChartTitle;
    }

    @FindBy(css = ".highcharts-title")
    protected WebElement ChartSubTitle;

    public WebElement subtitle() {
        return ChartSubTitle;
    }

    @FindBy(css = ".highcharts-series.highcharts-series-6.highcharts-line-series")
    protected WebElement LineChartType;

    public WebElement lineChartType() {
        return LineChartType;
    }

    @FindBy(css = ".highcharts-series.highcharts-series-5.highcharts-spline-series")
    protected WebElement SplineChartType;

    public WebElement splineChartType() {
        return SplineChartType;
    }

    @FindBy(css=".highcharts-tooltip span")
    protected WebElement ToolTipText;

    public WebElement tooltipText() {
        return ToolTipText;
    }

    @FindBy(css=".highcharts-data-labels.highcharts-series-0 .highcharts-data-label:nth-child(1) >text")
    protected WebElement DataLabelText;

    public WebElement datalabelText() {
        return DataLabelText;
    }

    @FindBy(css=".highcharts-axis-labels.highcharts-xaxis-labels >text:nth-child(1)")
    protected WebElement XaxisLabelText;

    public WebElement xaxislabelText() {
        return XaxisLabelText;
    }

    @FindBy(css=".highcharts-xaxis .highcharts-axis-title")
    protected WebElement XAxisTitle;

    public WebElement xaxisTitle() {
        return XAxisTitle;
    }

    @FindBy(css=".highcharts-axis-labels.highcharts-yaxis-labels >text:nth-child(1)")
    protected WebElement YAxisMinimum;

    public WebElement yaxisMinimum() {
        return YAxisMinimum;
    }

    @FindBy(css=".highcharts-axis-labels.highcharts-yaxis-labels >text:nth-child(2)")
    protected WebElement YAxisMaximum;

    public WebElement yaxisMaximum() {
        return YAxisMaximum;
    }

    @FindBy(css=".highcharts-plot-band")
    protected WebElement PlotBand;

    public WebElement plotband() {
        return PlotBand;
    }

    //SetterButtons

    @FindBy(id = "BUTTON_77_button-content")
    protected WebElement DSXSetChartType;

    public WebElement dsxSetChartType() {
        return DSXSetChartType;
    }

    @FindBy(id = "BUTTON_78_button-content")
    protected WebElement DSXSetTitleEnable;

    public WebElement dsxSetTitleEnable() {
        return DSXSetTitleEnable;
    }

    @FindBy(id = "BUTTON_79_button-content")
    protected WebElement DSXSetTitleText;

    public WebElement dsxSetTitleText() {
        return DSXSetTitleText;
    }

    @FindBy(id = "BUTTON_80_button-content")
    protected WebElement DSXSetSubTitleEnable;

    public WebElement dsxSetSubTitleEnable() {
        return DSXSetSubTitleEnable;
    }

    @FindBy(id = "BUTTON_81_button-content")
    protected WebElement DSXSetSubTitleText;

    public WebElement dsxSetSubTitleText() {
        return DSXSetSubTitleText;
    }

    @FindBy(id = "BUTTON_82_button-content")
    protected WebElement DSXSetToolTipEnabled;

    public WebElement dsxSetToolTipEnabled() {
        return DSXSetToolTipEnabled;
    }

    @FindBy(id = "BUTTON_83_button-content.sapMBtnContent")
    protected WebElement DSXSetToolTipNoOfDecimals;

    public WebElement dsxSetToolTipNoOfDecimals() {
        return DSXSetToolTipNoOfDecimals;
    }

    @FindBy(id = "BUTTON_84_button-content")
    protected WebElement DSXSetTooltipValuePrefix;

    public WebElement dsxSetTooltipValuePrefix() {
        return DSXSetTooltipValuePrefix;
    }

    @FindBy(id = "BUTTON_85_button-content")
    protected WebElement DSXSetTooltipValueSuffix;

    public WebElement dsxSetTooltipValueSuffix() {
        return DSXSetTooltipValueSuffix;
    }

    @FindBy(id = "BUTTON_86_button-content")
    protected WebElement DSXSetExportedFileName;

    public WebElement dsxSetExportedFileName() {
        return DSXSetExportedFileName;
    }

    @FindBy(id = "BUTTON_87_button-content")
    protected WebElement DSXSetDataLabelEnabled;

    public WebElement dsxSetDataLabelEnabled() {
        return DSXSetDataLabelEnabled;
    }

    @FindBy(id = "BUTTON_88_button-content")
    protected WebElement DSXSetDataLabelPrefix;

    public WebElement dsxSetDataLabelPrefix() {
        return DSXSetDataLabelPrefix;
    }

    @FindBy(id = "BUTTON_89_button-content")
    protected WebElement DSXSetDataLabelSuffix;

    public WebElement dsxSetDataLabelSuffix() {
        return DSXSetDataLabelSuffix;
    }

    @FindBy(id = "BUTTON_90_button-content")
    protected WebElement DSXSetXAxisLabelEnabled;
    public WebElement dsxSetXAxisLabelEnabled() {
        return DSXSetXAxisLabelEnabled;
    }
    @FindBy(id = "BUTTON_91_button-content")
    protected WebElement DSXSetXAxisLabelPrefix;
    public WebElement dsxSetXAxisLabelPrefix() {
        return DSXSetXAxisLabelPrefix;
    }
    @FindBy(id = "BUTTON_92_button-content")
    protected WebElement DSXSetXAxisLabelSuffix;
    public WebElement dsxSetXAxisLabelSuffix() {
        return DSXSetXAxisLabelSuffix;
    }
    @FindBy(id = "BUTTON_93_button-content")
    protected WebElement DSXSetXAxisTitleEnabled;

    public WebElement dsxSetXAxisTitleEnabled() {
        return DSXSetXAxisTitleEnabled;
    }

    @FindBy(id = "BUTTON_94_button-content")
    protected WebElement DSXSetXAxisTitleText;

    public WebElement dsxSetXAxisTitleText() {
        return DSXSetXAxisTitleText;
    }


    @FindBy(id = "BUTTON_95_button-content")
    protected WebElement DSXSetXAxisPlotBandEnabled;

    public WebElement dsxSetXAxisPlotBandEnabled() {
        return DSXSetXAxisPlotBandEnabled;
    }

    @FindBy(id = "BUTTON_96_button-content")
    protected WebElement DSXSetXAxisPlotBandFrom;

    public WebElement dsxSetXAxisPlotBandFrom() {
        return DSXSetXAxisPlotBandFrom;
    }

    @FindBy(id = "BUTTON_97_button-content")
    protected WebElement DSXSetXAxisPlotBandTo;

    public WebElement dsxSetXAxisPlotBandTo() {
        return DSXSetXAxisPlotBandTo;
    }

    @FindBy(id = "BUTTON_98_button-content")
    protected WebElement DSXSetXAxisPlotLineEnabled;

    public WebElement dsxSetXAxisPlotLineEnabled() {
        return DSXSetXAxisPlotLineEnabled;
    }

    @FindBy(id = "BUTTON_99_button-content")
    protected WebElement DSXSetXAxisPlotLineValue;

    public WebElement dsxSetXAxisPlotLineValue() {
        return DSXSetXAxisPlotLineValue;
    }


    @FindBy(id = "BUTTON_100_button-content")
    protected WebElement DSXSetYaxisMaximum;
    public WebElement dsxSetYaxisMaximum() {
        return DSXSetYaxisMaximum;
    }


    @FindBy(id = "BUTTON_101_button-content")
    protected WebElement DSXSetYaxisMinimum;
    public WebElement dsxSetYaxisMinimum() {
        return DSXSetYaxisMinimum;
    }


    @FindBy(id = "BUTTON_102_button-content")
    protected WebElement DSXSetGroupingYaxisMaximum;
    public WebElement dsxSetGroupingYaxisMaximum() {
        return DSXSetGroupingYaxisMaximum;
    }

    @FindBy(id = "BUTTON_103_button-content")
    protected WebElement DSXSetGroupedYaxisMinimum;
    public WebElement dsxSetGroupedYaxisMinimum() {
        return DSXSetGroupedYaxisMinimum;
    }

    @FindBy(id = "BUTTON_104_button-content")
    protected WebElement DSXSetYAxisLabelEnabled;
    public WebElement dsxSetYAxisLabelEnabled() {
        return DSXSetYAxisLabelEnabled;
    }

    @FindBy(id = "BUTTON_105_button-content")
    protected WebElement DSXSetYAxisLabelPrefix;
    public WebElement dsxSetYAxisLabelPrefix() {
        return DSXSetYAxisLabelPrefix;
    }

    @FindBy(id = "BUTTON_106_button-content")
    protected WebElement DSXSetYAxisLabelSuffix;
    public WebElement dsxSetYAxisLabelSuffix() {
        return DSXSetYAxisLabelSuffix;
    }

    @FindBy(id = "BUTTON_107_button-content")
    protected WebElement DSXSetYAxisTitleEnabled;
    public WebElement dsxSetYAxisTitleEnabled() {
        return DSXSetYAxisTitleEnabled;
    }

    @FindBy(id = "BUTTON_108_button-content")
    protected WebElement DSXSetYAxisTitleText;
    public WebElement dsxSetYAxisTitleText() {
        return DSXSetYAxisTitleText;
    }

    @FindBy(id = "BUTTON_109_button-content")
    protected WebElement DSXSetYAxisPlotBandEnabled;
    public WebElement dsxSetYAxisPlotBandEnabled() {
        return DSXSetYAxisPlotBandEnabled;
    }

    @FindBy(id = "BUTTON_110_button-content")
    protected WebElement DSXSetYAxisPlotBandFrom;
    public WebElement dsxSetYAxisPlotBandFrom() {
        return DSXSetYAxisPlotBandFrom;
    }

    @FindBy(id = "BUTTON_111_button-content")
    protected WebElement DSXSetYAxisPlotBandTo;
    public WebElement dsxSetYAxisPlotBandTo() {
        return DSXSetYAxisPlotBandTo;
    }

    @FindBy(id = "BUTTON_112_button-content")
    protected WebElement DSXSetYAxisPlotLineEnabled;
    public WebElement dsxSetYAxisPlotLineEnabled() {
        return DSXSetYAxisPlotLineEnabled;
    }

    @FindBy(id = "BUTTON_113_button-content")
    protected WebElement DSXSetYAxisPlotLineValue;
    public WebElement dsxSetYAxisPlotLineValue() {
        return DSXSetYAxisPlotLineValue;
    }

    @FindBy(id = "BUTTON_114_button-content")
    protected WebElement DSXSetXAxisPlotBandColor;
    public WebElement dsxSetXAxisPlotBandColor() {
        return DSXSetXAxisPlotBandColor;
    }

    @FindBy(id = "BUTTON_115_button-content")
    protected WebElement DSXSetXAxisPlotLineColor;
    public WebElement dsxSetXAxisPlotLineColor() {
        return DSXSetXAxisPlotLineColor;
    }

    @FindBy(id = "BUTTON_116_button-content")
    protected WebElement DSXSetYAxisPlotBandColor;
    public WebElement dsxSetYAxisPlotBandColor() {
        return DSXSetYAxisPlotBandColor;
    }

    @FindBy(id = "BUTTON_117_button-content")
    protected WebElement DSXSetYAxisPlotLineColor;
    public WebElement dsxSetYAxisPlotLineColor() {
        return DSXSetYAxisPlotLineColor;
    }


    @FindBy(id = "BUTTON_118_button-content")
    protected WebElement DSXSetThousandSeparator;
    public WebElement dsxSetThousandSeparator() {
        return DSXSetThousandSeparator;
    }


    @FindBy(id = "BUTTON_119_button-content")
    protected WebElement DSXSetDecimalSeparator;
    public WebElement dsxSetDecimalSeparator() {
        return DSXSetDecimalSeparator;
    }


    @FindBy(id = "BUTTON_120_button-content")
    protected WebElement DSXSetDataLabelNoOfDecimals;
    public WebElement dsxSetDataLabelNoOfDecimals() {
        return DSXSetDataLabelNoOfDecimals;
    }

    //other

    @FindBy(css=".highcharts-container")
    protected WebElement highchartsContainer;
    public WebElement Container(){
        return highchartsContainer;}





}