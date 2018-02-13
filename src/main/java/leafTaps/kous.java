package leafTaps;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class kous {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "a[href='https://github.com/anshooarora/extentreports-java/issues/1021']")
    @CacheLookup
    private WebElement 1021;

    @FindBy(css = "a[href='https://github.com/anshooarora/extentreports-java/issues/679']")
    @CacheLookup
    private WebElement 679;

    @FindBy(css = "a[href='https://github.com/anshooarora/extentreports-java/issues/680']")
    @CacheLookup
    private WebElement 680;

    @FindBy(css = "a[href='https://github.com/anshooarora/extentreports-java/issues/715']")
    @CacheLookup
    private WebElement 715;

    @FindBy(css = "a[href='https://github.com/anshooarora/extentreports-java/issues/726']")
    @CacheLookup
    private WebElement 726;

    @FindBy(css = "a[href='https://github.com/anshooarora/extentreports-java/issues/756']")
    @CacheLookup
    private WebElement 756;

    @FindBy(css = "a[href='https://github.com/anshooarora/extentreports-java/issues/758']")
    @CacheLookup
    private WebElement 791;

    @FindBy(css = "a[href='https://github.com/anshooarora/extentreports-java/issues/792']")
    @CacheLookup
    private WebElement 792;

    @FindBy(css = "a[href='https://github.com/anshooarora/extentreports-java/issues/794']")
    @CacheLookup
    private WebElement 794;

    @FindBy(css = "a[href='https://github.com/anshooarora/extentreports-java/issues/811']")
    @CacheLookup
    private WebElement 811;

    @FindBy(css = "a[href='https://github.com/anshooarora/extentreports-java/issues/815']")
    @CacheLookup
    private WebElement 815;

    @FindBy(css = "a[href='https://github.com/anshooarora/extentreports-java/issues/818']")
    @CacheLookup
    private WebElement 818;

    @FindBy(css = "a[href='https://github.com/anshooarora/extentreports-java/issues/819']")
    @CacheLookup
    private WebElement 819;

    @FindBy(css = "#rightCol ul:nth-of-type(14) li:nth-of-type(10) a")
    @CacheLookup
    private WebElement 820;

    @FindBy(css = "#rightCol ul:nth-of-type(14) li:nth-of-type(11) a")
    @CacheLookup
    private WebElement 823;

    @FindBy(css = "a[href='https://github.com/anshooarora/extentreports-java/issues/832']")
    @CacheLookup
    private WebElement 832;

    @FindBy(css = "a[href='https://github.com/anshooarora/extentreports-java/issues/835']")
    @CacheLookup
    private WebElement 835;

    @FindBy(css = "a[href='https://github.com/anshooarora/extentreports-java/issues/836']")
    @CacheLookup
    private WebElement 836;

    @FindBy(css = "a[href='https://github.com/anshooarora/extentreports-java/issues/837']")
    @CacheLookup
    private WebElement 837;

    @FindBy(css = "a[href='https://github.com/anshooarora/extentreports-java/issues/838']")
    @CacheLookup
    private WebElement 838;

    @FindBy(css = "a[href='https://github.com/anshooarora/extentreports-java/issues/840']")
    @CacheLookup
    private WebElement 840;

    @FindBy(css = "a[href='https://github.com/anshooarora/extentreports-java/issues/841']")
    @CacheLookup
    private WebElement 841;

    @FindBy(css = "a[href='https://github.com/anshooarora/extentreports-java/issues/853']")
    @CacheLookup
    private WebElement 853;

    @FindBy(css = "a[href='https://github.com/anshooarora/extentreports-java/issues/874']")
    @CacheLookup
    private WebElement 874;

    @FindBy(css = "a[href='https://github.com/anshooarora/extentreports-java/issues/883']")
    @CacheLookup
    private WebElement 883;

    @FindBy(css = "a[href='https://github.com/anshooarora/extentreports-java/issues/886']")
    @CacheLookup
    private WebElement 886;

    @FindBy(css = "a[href='https://github.com/anshooarora/extentreports-java/issues/926']")
    @CacheLookup
    private WebElement 926;

    @FindBy(css = "a[href='https://github.com/anshooarora/extentreports-java/issues/936']")
    @CacheLookup
    private WebElement 936;

    @FindBy(css = "a[href='https://github.com/anshooarora/extentreports-java/issues/939']")
    @CacheLookup
    private WebElement 939;

    @FindBy(css = "a[href='https://github.com/anshooarora/extentreports-java/issues/945']")
    @CacheLookup
    private WebElement 945;

    @FindBy(css = "a[href='https://github.com/anshooarora/extentreports-java/issues/947']")
    @CacheLookup
    private WebElement 947;

    @FindBy(css = "a[href='https://github.com/anshooarora/extentreports-java/issues/986']")
    @CacheLookup
    private WebElement 986;

    @FindBy(css = "a[href='https://github.com/anshooarora/extentreports-java/issues/989']")
    @CacheLookup
    private WebElement 989;

    @FindBy(css = "a[href='https://github.com/anshooarora/extentreports-java/issues/994']")
    @CacheLookup
    private WebElement 994;

    @FindBy(css = "a[href='https://github.com/anshooarora/extentreports-java/issues/999']")
    @CacheLookup
    private WebElement 999;

    @FindBy(css = "a[href='#add-system-info']")
    @CacheLookup
    private WebElement addingSystemInfo;

    @FindBy(css = "#rightCol ul:nth-of-type(6) li:nth-of-type(1) a")
    @CacheLookup
    private WebElement allowBase64Images1;

    @FindBy(css = "#rightCol ul:nth-of-type(11) li:nth-of-type(2) a:nth-of-type(2)")
    @CacheLookup
    private WebElement allowBase64Images2;

    @FindBy(css = "#rightCol ul:nth-of-type(14) li:nth-of-type(1) a:nth-of-type(2)")
    @CacheLookup
    private WebElement analysisstrategy;

    @FindBy(css = "#rightCol p:nth-of-type(39) a")
    @CacheLookup
    private WebElement analysisstrategyInExtenthtmlreporterFeatures;

    @FindBy(css = "#sidebar li:nth-of-type(5) ul.nav.hidden li:nth-of-type(4) a")
    @CacheLookup
    private WebElement appendToExistingReport1;

    @FindBy(css = "a[href='#htmlreporter-append-to-report']")
    @CacheLookup
    private WebElement appendToExistingReport2;

    @FindBy(css = "#sidebar li:nth-of-type(8) ul.nav.hidden li:nth-of-type(3) a")
    @CacheLookup
    private WebElement appendToExistingReport3;

    @FindBy(css = "a[href='#append-to-lastrun-report']")
    @CacheLookup
    private WebElement appendToLastRunReport;

    @FindBy(css = "a[href='#assign-author']")
    @CacheLookup
    private WebElement assignTestAuthors;

    @FindBy(css = "a[href='#assign-category']")
    @CacheLookup
    private WebElement assignTestCategories;

    @FindBy(css = "#rightCol table.table.table-bordered tbody tr:nth-of-type(11) td:nth-of-type(1) a")
    @CacheLookup
    private WebElement autolinkScreenshotsToReport;

    @FindBy(css = "#sidebar li:nth-of-type(7) ul.nav.hidden li:nth-of-type(3) a")
    @CacheLookup
    private WebElement automaticScreencaptureManagement;

    @FindBy(css = "#rightCol table.table.table-bordered tbody tr:nth-of-type(10) td:nth-of-type(1) a")
    @CacheLookup
    private WebElement autosaveScreenshotsRelativeToReport;

    @FindBy(css = "#sidebar li:nth-of-type(5) ul.nav.hidden li:nth-of-type(16) a")
    @CacheLookup
    private WebElement base64Screenshots;

    @FindBy(css = "a[href='#basic-usage']")
    @CacheLookup
    private WebElement basicUsage;

    @FindBy(css = "a[href='#basic-example']")
    @CacheLookup
    private WebElement basicUsageExample;

    @FindBy(css = "a[href='#markup-helpers-card']")
    @CacheLookup
    private WebElement card;

    @FindBy(css = "a[href='img/ClassAnalysisStrategy.html']")
    @CacheLookup
    private WebElement class;

    @FindBy(css = "a[href='../../../javadoc/index.html']")
    @CacheLookup
    private WebElement clickHere;

    @FindBy(css = "a[href='#markup-helpers-codeblock']")
    @CacheLookup
    private WebElement codeBlock;

    @FindBy(css = "a[href='https://github.com/anshooarora/extentreports-java/commit/a8cb542169f10c93e5f402db1993659f7e6dc641']")
    @CacheLookup
    private WebElement commit1;

    @FindBy(css = "a[href='https://github.com/anshooarora/extentreports-java/commit/19b34e5732b0f4ca0aa4ea7ba1db366bcec90985']")
    @CacheLookup
    private WebElement commit2;

    @FindBy(css = "a[href='#configuration']")
    @CacheLookup
    private WebElement configuration;

    @FindBy(css = "#rightCol table.table.table-bordered tbody tr:nth-of-type(9) td:nth-of-type(1) a")
    @CacheLookup
    private WebElement configureViewVisibility;

    @FindBy(css = "#sidebar li:nth-of-type(7) ul.nav.hidden li:nth-of-type(6) a")
    @CacheLookup
    private WebElement configuringAnalysisStrategy1;

    @FindBy(css = "a[href='#analysis-strategy-config']")
    @CacheLookup
    private WebElement configuringAnalysisStrategy2;

    @FindBy(css = "#sidebar li:nth-of-type(7) ul.nav.hidden li:nth-of-type(7) a")
    @CacheLookup
    private WebElement configuringViewVisibility;

    @FindBy(css = "a[href='#contributors']")
    @CacheLookup
    private WebElement contributors;

    @FindBy(css = "#rightCol table.table.table-bordered tbody tr:nth-of-type(12) td:nth-of-type(1) a")
    @CacheLookup
    private WebElement createCustomDashboardSections;

    @FindBy(css = "a[href='#create-bdd-tests']")
    @CacheLookup
    private WebElement creatingBddstyleTests;

    @FindBy(css = "a[href='#create-child-tests']")
    @CacheLookup
    private WebElement creatingChildTests;

    @FindBy(css = "#sidebar li:nth-of-type(7) ul.nav.hidden li:nth-of-type(8) a")
    @CacheLookup
    private WebElement creatingCustomDashboardSections;

    @FindBy(css = "a[href='#create-logs']")
    @CacheLookup
    private WebElement creatingLogEvents;

    @FindBy(css = "a[href='#create-standard-tests']")
    @CacheLookup
    private WebElement creatingTests;

    @FindBy(css = "#rightCol ul:nth-of-type(4) li:nth-of-type(1) a:nth-of-type(2)")
    @CacheLookup
    private WebElement demo1;

    @FindBy(css = "#rightCol ul:nth-of-type(10) li:nth-of-type(1) a:nth-of-type(2)")
    @CacheLookup
    private WebElement demo2;

    @FindBy(css = "a[href='https://github.com/email2vimalraj/CucumberExtentReporter/issues/60']")
    @CacheLookup
    private WebElement email2vimalrajcucumberextentreporter60;

    @FindBy(css = "a[href='#emailreporter-configuration']")
    @CacheLookup
    private WebElement emailreporter;

    @FindBy(css = "a[href='#examples']")
    @CacheLookup
    private WebElement examples;

    @FindBy(css = "a[href='#config-xml-community']")
    @CacheLookup
    private WebElement extentconfigXmlCommunity;

    @FindBy(css = "a[href='#config-xml-pro']")
    @CacheLookup
    private WebElement extentconfigXmlProfessional;

    @FindBy(css = "a[href='#append-to-htmlreporter']")
    @CacheLookup
    private WebElement extenthtmlreporter1;

    @FindBy(css = "a[href='#htmlreporter-configuration']")
    @CacheLookup
    private WebElement extenthtmlreporter2;

    @FindBy(css = "a[href='#htmlreporter-features']")
    @CacheLookup
    private WebElement extenthtmlreporterFeatures;

    @FindBy(css = "a[href='#html-reporter-shortcuts']")
    @CacheLookup
    private WebElement extenthtmlreporterShortcuts;

    @FindBy(css = "a[href='#extentlogger-configuration']")
    @CacheLookup
    private WebElement extentlogger;

    @FindBy(css = "a[href='#append-to-extentx']")
    @CacheLookup
    private WebElement extentxreporter;

    @FindBy(css = "a[href='#extentxreporter-configuration']")
    @CacheLookup
    private WebElement extentxreporterDeprecated;

    @FindBy(css = "a[href='#extentxreporter-features']")
    @CacheLookup
    private WebElement extentxreporterFeatures;

    @FindBy(css = "a[href='#markup-helpers-external-link']")
    @CacheLookup
    private WebElement externalLink;

    @FindBy(css = "a[href='#html-reporter-shortcuts-filters']")
    @CacheLookup
    private WebElement filters;

    @FindBy(css = "a[href='#get-projectid']")
    @CacheLookup
    private WebElement gettingProjectid;

    @FindBy(css = "a[href='#get-reportid']")
    @CacheLookup
    private WebElement gettingReportid;

    @FindBy(css = "#rightCol ul:nth-of-type(11) li:nth-of-type(1) a:nth-of-type(2)")
    @CacheLookup
    private WebElement gherkinDialect;

    @FindBy(css = "#sidebar li:nth-of-type(5) ul.nav.hidden li:nth-of-type(8) a")
    @CacheLookup
    private WebElement gherkinDialectSetting;

    @FindBy(css = "a[href='http://www.journaldev.com/2532/javamail-example-send-mail-in-java-smtp']")
    @CacheLookup
    private WebElement here1;

    @FindBy(css = "a[href='http://extentreports.com/about/license/']")
    @CacheLookup
    private WebElement here2;

    @FindBy(css = "a[href='#initialize-report']")
    @CacheLookup
    private WebElement initializingReport;

    @FindBy(css = "a[href='#insert-screencast']")
    @CacheLookup
    private WebElement insertScreencasts;

    @FindBy(css = "a[href='#insert-screenshots']")
    @CacheLookup
    private WebElement insertScreenshots;

    @FindBy(css = "a[href='#insert-custom-html']")
    @CacheLookup
    private WebElement insertingCustomHtml;

    @FindBy(css = "a[href='#javadoc']")
    @CacheLookup
    private WebElement javadoc;

    @FindBy(css = "#sidebar li:nth-of-type(10) a")
    @CacheLookup
    private WebElement klovreporterSettings;

    @FindBy(css = "a[href='#markup-helpers-label']")
    @CacheLookup
    private WebElement label;

    @FindBy(css = "a[href='#license']")
    @CacheLookup
    private WebElement license;

    @FindBy(css = "#rightCol ul:nth-of-type(1) li:nth-of-type(3) a")
    @CacheLookup
    private WebElement listenerEvent1;

    @FindBy(css = "#rightCol ul:nth-of-type(1) li:nth-of-type(4) a")
    @CacheLookup
    private WebElement listenerEvent2;

    @FindBy(css = "a[href='#logging-exceptions']")
    @CacheLookup
    private WebElement loggingExceptionss;

    @FindBy(css = "a[href='#markup-helpers']")
    @CacheLookup
    private WebElement markupHelpersFeatures;

    @FindBy(css = "a[href='#maven']")
    @CacheLookup
    private WebElement maven;

    @FindBy(css = "a[href='#markup-helpers-modal']")
    @CacheLookup
    private WebElement modal;

    @FindBy(css = "#rightCol table.table.table-bordered tbody tr:nth-of-type(8) td:nth-of-type(1) a")
    @CacheLookup
    private WebElement offlineReport;

    @FindBy(css = "a[href='#offline-report']")
    @CacheLookup
    private WebElement offlineReport1;

    @FindBy(css = "#sidebar li:nth-of-type(7) ul.nav.hidden li:nth-of-type(4) a")
    @CacheLookup
    private WebElement offlineReport2;

    private final String pageLoadedText = "If you fail to set the project, or set the project after this setting, ExtentXReporter will by default append to the last-run report, which may belong to another project";

    private final String pageUrl = "/docs/versions/3/java/#pro-vs-community";

    @FindBy(css = "a[href='#pro-vs-community']")
    @CacheLookup
    private WebElement proVsCommunityVersion;

    @FindBy(css = "a[href='#remove-tests']")
    @CacheLookup
    private WebElement removingTests;

    @FindBy(css = "a[href='https://github.com/cucumber/cucumber/blob/master/gherkin/java/src/main/resources/gherkin/gherkin-languages.json']")
    @CacheLookup
    private WebElement sameSource;

    @FindBy(css = "a[href='#html-reporter-shortcuts-scroll']")
    @CacheLookup
    private WebElement scroll;

    @FindBy(css = "a[href='#email-example']")
    @CacheLookup
    private WebElement sendingEmailUsingJavamailApi;

    @FindBy(css = "a[href='#setting-test-display-order']")
    @CacheLookup
    private WebElement settingTestdisplayorder;

    @FindBy(css = "#rightCol ul:nth-of-type(4) li:nth-of-type(1) a:nth-of-type(1)")
    @CacheLookup
    private WebElement settings1;

    @FindBy(css = "#rightCol ul:nth-of-type(10) li:nth-of-type(1) a:nth-of-type(1)")
    @CacheLookup
    private WebElement settings2;

    @FindBy(css = "a[href='#status-configuration']")
    @CacheLookup
    private WebElement statusHierarchyOverride;

    @FindBy(css = "a[href='img/SuiteAnalysisStrategy.html']")
    @CacheLookup
    private WebElement suite;

    @FindBy(css = "a[href='#markup-helpers-table']")
    @CacheLookup
    private WebElement table;

    @FindBy(css = "a[href='img/TestAnalysisStrategy.html']")
    @CacheLookup
    private WebElement test;

    @FindBy(css = "a[href='#testng-examples']")
    @CacheLookup
    private WebElement testngExample;

    @FindBy(css = "a[href='#testng-ireporter']")
    @CacheLookup
    private WebElement testngIreporter;

    @FindBy(css = "a[href='#testng-itestlistener']")
    @CacheLookup
    private WebElement testngItestlistener;

    @FindBy(css = "a[href='https://github.com/anshooarora/extentreports/graphs/contributors']")
    @CacheLookup
    private WebElement thisLink;

    @FindBy(css = "a[href='#extent-testng-report-builder']")
    @CacheLookup
    private WebElement usingExtenttestngreportbuilder;

    @FindBy(css = "a[href='/docs/versions/3/java/img/newsletter-template.png']")
    @CacheLookup
    private WebElement view;

    @FindBy(css = "a[href='#html-reporter-shortcuts-views']")
    @CacheLookup
    private WebElement views;

    @FindBy(css = "a[href='#whats-new-304']")
    @CacheLookup
    private WebElement whatsNewIn304;

    @FindBy(css = "a[href='#whats-new-pro-304']")
    @CacheLookup
    private WebElement whatsNewIn304Professional;

    @FindBy(css = "a[href='#whats-new-305']")
    @CacheLookup
    private WebElement whatsNewIn305;

    @FindBy(css = "a[href='#whats-new-pro-305']")
    @CacheLookup
    private WebElement whatsNewIn305Professional;

    @FindBy(css = "a[href='#whats-new-306']")
    @CacheLookup
    private WebElement whatsNewIn306;

    @FindBy(css = "a[href='#whats-new-307']")
    @CacheLookup
    private WebElement whatsNewIn307;

    @FindBy(css = "a[href='#whats-new-310']")
    @CacheLookup
    private WebElement whatsNewIn310;

    @FindBy(css = "a[href='#whats-new-pro']")
    @CacheLookup
    private WebElement whatsNewIn310Professional;

    @FindBy(css = "a[href='#whats-new-311']")
    @CacheLookup
    private WebElement whatsNewIn311;

    @FindBy(css = "a[href='#whats-new-312']")
    @CacheLookup
    private WebElement whatsNewIn312;

    @FindBy(css = "a[href='#whats-new']")
    @CacheLookup
    private WebElement whatsNewIn313;

    @FindBy(css = "a[href='#write-to-report']")
    @CacheLookup
    private WebElement writingToReport;

    public kous() {
    }

    public kous(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public kous(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public kous(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Adding System Info Link.
     *
     * @return the kous class instance.
     */
    public kous clickAddingSystemInfoLink() {
        addingSystemInfo.click();
        return this;
    }

    /**
     * Click on Allow Base64 Images Link.
     *
     * @return the kous class instance.
     */
    public kous clickAllowBase64Images1Link() {
        allowBase64Images1.click();
        return this;
    }

    /**
     * Click on Allow Base64 Images Link.
     *
     * @return the kous class instance.
     */
    public kous clickAllowBase64Images2Link() {
        allowBase64Images2.click();
        return this;
    }

    /**
     * Click on Analysisstrategy In Extenthtmlreporter Features Link.
     *
     * @return the kous class instance.
     */
    public kous clickAnalysisstrategyInExtenthtmlreporterFeaturesLink() {
        analysisstrategyInExtenthtmlreporterFeatures.click();
        return this;
    }

    /**
     * Click on Analysisstrategy Link.
     *
     * @return the kous class instance.
     */
    public kous clickAnalysisstrategyLink() {
        analysisstrategy.click();
        return this;
    }

    /**
     * Click on Append To Existing Report Link.
     *
     * @return the kous class instance.
     */
    public kous clickAppendToExistingReport1Link() {
        appendToExistingReport1.click();
        return this;
    }

    /**
     * Click on Append To Existing Report Link.
     *
     * @return the kous class instance.
     */
    public kous clickAppendToExistingReport2Link() {
        appendToExistingReport2.click();
        return this;
    }

    /**
     * Click on Append To Existing Report Link.
     *
     * @return the kous class instance.
     */
    public kous clickAppendToExistingReport3Link() {
        appendToExistingReport3.click();
        return this;
    }

    /**
     * Click on Append To Last Run Report Link.
     *
     * @return the kous class instance.
     */
    public kous clickAppendToLastRunReportLink() {
        appendToLastRunReport.click();
        return this;
    }

    /**
     * Click on Assign Test Authors Link.
     *
     * @return the kous class instance.
     */
    public kous clickAssignTestAuthorsLink() {
        assignTestAuthors.click();
        return this;
    }

    /**
     * Click on Assign Test Categories Link.
     *
     * @return the kous class instance.
     */
    public kous clickAssignTestCategoriesLink() {
        assignTestCategories.click();
        return this;
    }

    /**
     * Click on Autolink Screenshots To Report Link.
     *
     * @return the kous class instance.
     */
    public kous clickAutolinkScreenshotsToReportLink() {
        autolinkScreenshotsToReport.click();
        return this;
    }

    /**
     * Click on Automatic Screencapture Management Link.
     *
     * @return the kous class instance.
     */
    public kous clickAutomaticScreencaptureManagementLink() {
        automaticScreencaptureManagement.click();
        return this;
    }

    /**
     * Click on Autosave Screenshots Relative To Report Link.
     *
     * @return the kous class instance.
     */
    public kous clickAutosaveScreenshotsRelativeToReportLink() {
        autosaveScreenshotsRelativeToReport.click();
        return this;
    }

    /**
     * Click on Base64 Screenshots Link.
     *
     * @return the kous class instance.
     */
    public kous clickBase64ScreenshotsLink() {
        base64Screenshots.click();
        return this;
    }

    /**
     * Click on Basic Usage Example Link.
     *
     * @return the kous class instance.
     */
    public kous clickBasicUsageExampleLink() {
        basicUsageExample.click();
        return this;
    }

    /**
     * Click on Basic Usage Link.
     *
     * @return the kous class instance.
     */
    public kous clickBasicUsageLink() {
        basicUsage.click();
        return this;
    }

    /**
     * Click on Card Link.
     *
     * @return the kous class instance.
     */
    public kous clickCardLink() {
        card.click();
        return this;
    }

    /**
     * Click on Class Link.
     *
     * @return the kous class instance.
     */
    public kous clickClassLink() {
        class.click();
        return this;
    }

    /**
     * Click on Click Here Link.
     *
     * @return the kous class instance.
     */
    public kous clickClickHereLink() {
        clickHere.click();
        return this;
    }

    /**
     * Click on Code Block Link.
     *
     * @return the kous class instance.
     */
    public kous clickCodeBlockLink() {
        codeBlock.click();
        return this;
    }

    /**
     * Click on Commit Link.
     *
     * @return the kous class instance.
     */
    public kous clickCommit1Link() {
        commit1.click();
        return this;
    }

    /**
     * Click on Commit Link.
     *
     * @return the kous class instance.
     */
    public kous clickCommit2Link() {
        commit2.click();
        return this;
    }

    /**
     * Click on Configuration Link.
     *
     * @return the kous class instance.
     */
    public kous clickConfigurationLink() {
        configuration.click();
        return this;
    }

    /**
     * Click on Configure View Visibility Link.
     *
     * @return the kous class instance.
     */
    public kous clickConfigureViewVisibilityLink() {
        configureViewVisibility.click();
        return this;
    }

    /**
     * Click on Configuring Analysis Strategy Link.
     *
     * @return the kous class instance.
     */
    public kous clickConfiguringAnalysisStrategy1Link() {
        configuringAnalysisStrategy1.click();
        return this;
    }

    /**
     * Click on Configuring Analysis Strategy Link.
     *
     * @return the kous class instance.
     */
    public kous clickConfiguringAnalysisStrategy2Link() {
        configuringAnalysisStrategy2.click();
        return this;
    }

    /**
     * Click on Configuring View Visibility Link.
     *
     * @return the kous class instance.
     */
    public kous clickConfiguringViewVisibilityLink() {
        configuringViewVisibility.click();
        return this;
    }

    /**
     * Click on Contributors Link.
     *
     * @return the kous class instance.
     */
    public kous clickContributorsLink() {
        contributors.click();
        return this;
    }

    /**
     * Click on Create Custom Dashboard Sections Link.
     *
     * @return the kous class instance.
     */
    public kous clickCreateCustomDashboardSectionsLink() {
        createCustomDashboardSections.click();
        return this;
    }

    /**
     * Click on Creating Bddstyle Tests Link.
     *
     * @return the kous class instance.
     */
    public kous clickCreatingBddstyleTestsLink() {
        creatingBddstyleTests.click();
        return this;
    }

    /**
     * Click on Creating Child Tests Link.
     *
     * @return the kous class instance.
     */
    public kous clickCreatingChildTestsLink() {
        creatingChildTests.click();
        return this;
    }

    /**
     * Click on Creating Custom Dashboard Sections Link.
     *
     * @return the kous class instance.
     */
    public kous clickCreatingCustomDashboardSectionsLink() {
        creatingCustomDashboardSections.click();
        return this;
    }

    /**
     * Click on Creating Log Events Link.
     *
     * @return the kous class instance.
     */
    public kous clickCreatingLogEventsLink() {
        creatingLogEvents.click();
        return this;
    }

    /**
     * Click on Creating Tests Link.
     *
     * @return the kous class instance.
     */
    public kous clickCreatingTestsLink() {
        creatingTests.click();
        return this;
    }

    /**
     * Click on Demo Link.
     *
     * @return the kous class instance.
     */
    public kous clickDemo1Link() {
        demo1.click();
        return this;
    }

    /**
     * Click on Demo Link.
     *
     * @return the kous class instance.
     */
    public kous clickDemo2Link() {
        demo2.click();
        return this;
    }

    /**
     * Click on Email2vimalrajcucumberextentreporter60 Link.
     *
     * @return the kous class instance.
     */
    public kous clickEmail2vimalrajcucumberextentreporter60Link() {
        email2vimalrajcucumberextentreporter60.click();
        return this;
    }

    /**
     * Click on Emailreporter Link.
     *
     * @return the kous class instance.
     */
    public kous clickEmailreporterLink() {
        emailreporter.click();
        return this;
    }

    /**
     * Click on Examples Link.
     *
     * @return the kous class instance.
     */
    public kous clickExamplesLink() {
        examples.click();
        return this;
    }

    /**
     * Click on Extentconfig.xml Community Link.
     *
     * @return the kous class instance.
     */
    public kous clickExtentconfigXmlCommunityLink() {
        extentconfigXmlCommunity.click();
        return this;
    }

    /**
     * Click on Extentconfig.xml Professional Link.
     *
     * @return the kous class instance.
     */
    public kous clickExtentconfigXmlProfessionalLink() {
        extentconfigXmlProfessional.click();
        return this;
    }

    /**
     * Click on Extenthtmlreporter Link.
     *
     * @return the kous class instance.
     */
    public kous clickExtenthtmlreporter1Link() {
        extenthtmlreporter1.click();
        return this;
    }

    /**
     * Click on Extenthtmlreporter Link.
     *
     * @return the kous class instance.
     */
    public kous clickExtenthtmlreporter2Link() {
        extenthtmlreporter2.click();
        return this;
    }

    /**
     * Click on Extenthtmlreporter Features Link.
     *
     * @return the kous class instance.
     */
    public kous clickExtenthtmlreporterFeaturesLink() {
        extenthtmlreporterFeatures.click();
        return this;
    }

    /**
     * Click on Extenthtmlreporter Shortcuts Link.
     *
     * @return the kous class instance.
     */
    public kous clickExtenthtmlreporterShortcutsLink() {
        extenthtmlreporterShortcuts.click();
        return this;
    }

    /**
     * Click on Extentlogger Link.
     *
     * @return the kous class instance.
     */
    public kous clickExtentloggerLink() {
        extentlogger.click();
        return this;
    }

    /**
     * Click on Extentxreporter Deprecated Link.
     *
     * @return the kous class instance.
     */
    public kous clickExtentxreporterDeprecatedLink() {
        extentxreporterDeprecated.click();
        return this;
    }

    /**
     * Click on Extentxreporter Features Link.
     *
     * @return the kous class instance.
     */
    public kous clickExtentxreporterFeaturesLink() {
        extentxreporterFeatures.click();
        return this;
    }

    /**
     * Click on Extentxreporter Link.
     *
     * @return the kous class instance.
     */
    public kous clickExtentxreporterLink() {
        extentxreporter.click();
        return this;
    }

    /**
     * Click on External Link Link.
     *
     * @return the kous class instance.
     */
    public kous clickExternalLinkLink() {
        externalLink.click();
        return this;
    }

    /**
     * Click on Filters Link.
     *
     * @return the kous class instance.
     */
    public kous clickFiltersLink() {
        filters.click();
        return this;
    }

    /**
     * Click on Getting Projectid Link.
     *
     * @return the kous class instance.
     */
    public kous clickGettingProjectidLink() {
        gettingProjectid.click();
        return this;
    }

    /**
     * Click on Getting Reportid Link.
     *
     * @return the kous class instance.
     */
    public kous clickGettingReportidLink() {
        gettingReportid.click();
        return this;
    }

    /**
     * Click on Gherkin Dialect Link.
     *
     * @return the kous class instance.
     */
    public kous clickGherkinDialectLink() {
        gherkinDialect.click();
        return this;
    }

    /**
     * Click on Gherkin Dialect Setting Link.
     *
     * @return the kous class instance.
     */
    public kous clickGherkinDialectSettingLink() {
        gherkinDialectSetting.click();
        return this;
    }

    /**
     * Click on Here Link.
     *
     * @return the kous class instance.
     */
    public kous clickHere1Link() {
        here1.click();
        return this;
    }

    /**
     * Click on Here Link.
     *
     * @return the kous class instance.
     */
    public kous clickHere2Link() {
        here2.click();
        return this;
    }

    /**
     * Click on Initializing Report Link.
     *
     * @return the kous class instance.
     */
    public kous clickInitializingReportLink() {
        initializingReport.click();
        return this;
    }

    /**
     * Click on Insert Screencasts Link.
     *
     * @return the kous class instance.
     */
    public kous clickInsertScreencastsLink() {
        insertScreencasts.click();
        return this;
    }

    /**
     * Click on Insert Screenshots Link.
     *
     * @return the kous class instance.
     */
    public kous clickInsertScreenshotsLink() {
        insertScreenshots.click();
        return this;
    }

    /**
     * Click on Inserting Custom Html Link.
     *
     * @return the kous class instance.
     */
    public kous clickInsertingCustomHtmlLink() {
        insertingCustomHtml.click();
        return this;
    }

    /**
     * Click on Javadoc Link.
     *
     * @return the kous class instance.
     */
    public kous clickJavadocLink() {
        javadoc.click();
        return this;
    }

    /**
     * Click on Klovreporter Settings Link.
     *
     * @return the kous class instance.
     */
    public kous clickKlovreporterSettingsLink() {
        klovreporterSettings.click();
        return this;
    }

    /**
     * Click on Label Link.
     *
     * @return the kous class instance.
     */
    public kous clickLabelLink() {
        label.click();
        return this;
    }

    /**
     * Click on License Link.
     *
     * @return the kous class instance.
     */
    public kous clickLicenseLink() {
        license.click();
        return this;
    }

    /**
     * Click on 1021 Link.
     *
     * @return the kous class instance.
     */
    public kous clickLink1021() {
        1021.click();
        return this;
    }

    /**
     * Click on 679 Link.
     *
     * @return the kous class instance.
     */
    public kous clickLink679() {
        679.click();
        return this;
    }

    /**
     * Click on 680 Link.
     *
     * @return the kous class instance.
     */
    public kous clickLink680() {
        680.click();
        return this;
    }

    /**
     * Click on 715 Link.
     *
     * @return the kous class instance.
     */
    public kous clickLink715() {
        715.click();
        return this;
    }

    /**
     * Click on 726 Link.
     *
     * @return the kous class instance.
     */
    public kous clickLink726() {
        726.click();
        return this;
    }

    /**
     * Click on 756 Link.
     *
     * @return the kous class instance.
     */
    public kous clickLink756() {
        756.click();
        return this;
    }

    /**
     * Click on 791 Link.
     *
     * @return the kous class instance.
     */
    public kous clickLink791() {
        791.click();
        return this;
    }

    /**
     * Click on 792 Link.
     *
     * @return the kous class instance.
     */
    public kous clickLink792() {
        792.click();
        return this;
    }

    /**
     * Click on 794 Link.
     *
     * @return the kous class instance.
     */
    public kous clickLink794() {
        794.click();
        return this;
    }

    /**
     * Click on 811 Link.
     *
     * @return the kous class instance.
     */
    public kous clickLink811() {
        811.click();
        return this;
    }

    /**
     * Click on 815 Link.
     *
     * @return the kous class instance.
     */
    public kous clickLink815() {
        815.click();
        return this;
    }

    /**
     * Click on 818 Link.
     *
     * @return the kous class instance.
     */
    public kous clickLink818() {
        818.click();
        return this;
    }

    /**
     * Click on 819 Link.
     *
     * @return the kous class instance.
     */
    public kous clickLink819() {
        819.click();
        return this;
    }

    /**
     * Click on 820 Link.
     *
     * @return the kous class instance.
     */
    public kous clickLink820() {
        820.click();
        return this;
    }

    /**
     * Click on 823 Link.
     *
     * @return the kous class instance.
     */
    public kous clickLink823() {
        823.click();
        return this;
    }

    /**
     * Click on 832 Link.
     *
     * @return the kous class instance.
     */
    public kous clickLink832() {
        832.click();
        return this;
    }

    /**
     * Click on 835 Link.
     *
     * @return the kous class instance.
     */
    public kous clickLink835() {
        835.click();
        return this;
    }

    /**
     * Click on 836 Link.
     *
     * @return the kous class instance.
     */
    public kous clickLink836() {
        836.click();
        return this;
    }

    /**
     * Click on 837 Link.
     *
     * @return the kous class instance.
     */
    public kous clickLink837() {
        837.click();
        return this;
    }

    /**
     * Click on 838 Link.
     *
     * @return the kous class instance.
     */
    public kous clickLink838() {
        838.click();
        return this;
    }

    /**
     * Click on 840 Link.
     *
     * @return the kous class instance.
     */
    public kous clickLink840() {
        840.click();
        return this;
    }

    /**
     * Click on 841 Link.
     *
     * @return the kous class instance.
     */
    public kous clickLink841() {
        841.click();
        return this;
    }

    /**
     * Click on 853 Link.
     *
     * @return the kous class instance.
     */
    public kous clickLink853() {
        853.click();
        return this;
    }

    /**
     * Click on 874 Link.
     *
     * @return the kous class instance.
     */
    public kous clickLink874() {
        874.click();
        return this;
    }

    /**
     * Click on 883 Link.
     *
     * @return the kous class instance.
     */
    public kous clickLink883() {
        883.click();
        return this;
    }

    /**
     * Click on 886 Link.
     *
     * @return the kous class instance.
     */
    public kous clickLink886() {
        886.click();
        return this;
    }

    /**
     * Click on 926 Link.
     *
     * @return the kous class instance.
     */
    public kous clickLink926() {
        926.click();
        return this;
    }

    /**
     * Click on 936 Link.
     *
     * @return the kous class instance.
     */
    public kous clickLink936() {
        936.click();
        return this;
    }

    /**
     * Click on 939 Link.
     *
     * @return the kous class instance.
     */
    public kous clickLink939() {
        939.click();
        return this;
    }

    /**
     * Click on 945 Link.
     *
     * @return the kous class instance.
     */
    public kous clickLink945() {
        945.click();
        return this;
    }

    /**
     * Click on 947 Link.
     *
     * @return the kous class instance.
     */
    public kous clickLink947() {
        947.click();
        return this;
    }

    /**
     * Click on 986 Link.
     *
     * @return the kous class instance.
     */
    public kous clickLink986() {
        986.click();
        return this;
    }

    /**
     * Click on 989 Link.
     *
     * @return the kous class instance.
     */
    public kous clickLink989() {
        989.click();
        return this;
    }

    /**
     * Click on 994 Link.
     *
     * @return the kous class instance.
     */
    public kous clickLink994() {
        994.click();
        return this;
    }

    /**
     * Click on 999 Link.
     *
     * @return the kous class instance.
     */
    public kous clickLink999() {
        999.click();
        return this;
    }

    /**
     * Click on Listener Event Link.
     *
     * @return the kous class instance.
     */
    public kous clickListenerEvent1Link() {
        listenerEvent1.click();
        return this;
    }

    /**
     * Click on Listener Event Link.
     *
     * @return the kous class instance.
     */
    public kous clickListenerEvent2Link() {
        listenerEvent2.click();
        return this;
    }

    /**
     * Click on Logging Exceptionss Link.
     *
     * @return the kous class instance.
     */
    public kous clickLoggingExceptionssLink() {
        loggingExceptionss.click();
        return this;
    }

    /**
     * Click on Markup Helpers Features Link.
     *
     * @return the kous class instance.
     */
    public kous clickMarkupHelpersFeaturesLink() {
        markupHelpersFeatures.click();
        return this;
    }

    /**
     * Click on Maven Link.
     *
     * @return the kous class instance.
     */
    public kous clickMavenLink() {
        maven.click();
        return this;
    }

    /**
     * Click on Modal Link.
     *
     * @return the kous class instance.
     */
    public kous clickModalLink() {
        modal.click();
        return this;
    }

    /**
     * Click on Offline Report Link.
     *
     * @return the kous class instance.
     */
    public kous clickOfflineReport1Link() {
        offlineReport1.click();
        return this;
    }

    /**
     * Click on Offline Report Link.
     *
     * @return the kous class instance.
     */
    public kous clickOfflineReport2Link() {
        offlineReport2.click();
        return this;
    }

    /**
     * Click on Offline Report Link.
     *
     * @return the kous class instance.
     */
    public kous clickOfflineReportLink() {
        offlineReport.click();
        return this;
    }

    /**
     * Click on Pro Vs Community Version Link.
     *
     * @return the kous class instance.
     */
    public kous clickProVsCommunityVersionLink() {
        proVsCommunityVersion.click();
        return this;
    }

    /**
     * Click on Removing Tests Link.
     *
     * @return the kous class instance.
     */
    public kous clickRemovingTestsLink() {
        removingTests.click();
        return this;
    }

    /**
     * Click on Same Source Link.
     *
     * @return the kous class instance.
     */
    public kous clickSameSourceLink() {
        sameSource.click();
        return this;
    }

    /**
     * Click on Scroll Link.
     *
     * @return the kous class instance.
     */
    public kous clickScrollLink() {
        scroll.click();
        return this;
    }

    /**
     * Click on Sending Email Using Javamail Api Link.
     *
     * @return the kous class instance.
     */
    public kous clickSendingEmailUsingJavamailApiLink() {
        sendingEmailUsingJavamailApi.click();
        return this;
    }

    /**
     * Click on Setting Testdisplayorder Link.
     *
     * @return the kous class instance.
     */
    public kous clickSettingTestdisplayorderLink() {
        settingTestdisplayorder.click();
        return this;
    }

    /**
     * Click on Settings Link.
     *
     * @return the kous class instance.
     */
    public kous clickSettings1Link() {
        settings1.click();
        return this;
    }

    /**
     * Click on Settings Link.
     *
     * @return the kous class instance.
     */
    public kous clickSettings2Link() {
        settings2.click();
        return this;
    }

    /**
     * Click on Status Hierarchy Override Link.
     *
     * @return the kous class instance.
     */
    public kous clickStatusHierarchyOverrideLink() {
        statusHierarchyOverride.click();
        return this;
    }

    /**
     * Click on Suite Link.
     *
     * @return the kous class instance.
     */
    public kous clickSuiteLink() {
        suite.click();
        return this;
    }

    /**
     * Click on Table Link.
     *
     * @return the kous class instance.
     */
    public kous clickTableLink() {
        table.click();
        return this;
    }

    /**
     * Click on Test Link.
     *
     * @return the kous class instance.
     */
    public kous clickTestLink() {
        test.click();
        return this;
    }

    /**
     * Click on Testng Example Link.
     *
     * @return the kous class instance.
     */
    public kous clickTestngExampleLink() {
        testngExample.click();
        return this;
    }

    /**
     * Click on Testng Ireporter Link.
     *
     * @return the kous class instance.
     */
    public kous clickTestngIreporterLink() {
        testngIreporter.click();
        return this;
    }

    /**
     * Click on Testng Itestlistener Link.
     *
     * @return the kous class instance.
     */
    public kous clickTestngItestlistenerLink() {
        testngItestlistener.click();
        return this;
    }

    /**
     * Click on This Link Link.
     *
     * @return the kous class instance.
     */
    public kous clickThisLinkLink() {
        thisLink.click();
        return this;
    }

    /**
     * Click on Using Extenttestngreportbuilder Link.
     *
     * @return the kous class instance.
     */
    public kous clickUsingExtenttestngreportbuilderLink() {
        usingExtenttestngreportbuilder.click();
        return this;
    }

    /**
     * Click on View Link.
     *
     * @return the kous class instance.
     */
    public kous clickViewLink() {
        view.click();
        return this;
    }

    /**
     * Click on Views Link.
     *
     * @return the kous class instance.
     */
    public kous clickViewsLink() {
        views.click();
        return this;
    }

    /**
     * Click on Whats New In 3.0.4 Link.
     *
     * @return the kous class instance.
     */
    public kous clickWhatsNewIn304Link() {
        whatsNewIn304.click();
        return this;
    }

    /**
     * Click on Whats New In 3.0.4 Professional Link.
     *
     * @return the kous class instance.
     */
    public kous clickWhatsNewIn304ProfessionalLink() {
        whatsNewIn304Professional.click();
        return this;
    }

    /**
     * Click on Whats New In 3.0.5 Link.
     *
     * @return the kous class instance.
     */
    public kous clickWhatsNewIn305Link() {
        whatsNewIn305.click();
        return this;
    }

    /**
     * Click on Whats New In 3.0.5 Professional Link.
     *
     * @return the kous class instance.
     */
    public kous clickWhatsNewIn305ProfessionalLink() {
        whatsNewIn305Professional.click();
        return this;
    }

    /**
     * Click on Whats New In 3.0.6 Link.
     *
     * @return the kous class instance.
     */
    public kous clickWhatsNewIn306Link() {
        whatsNewIn306.click();
        return this;
    }

    /**
     * Click on Whats New In 3.0.7 Link.
     *
     * @return the kous class instance.
     */
    public kous clickWhatsNewIn307Link() {
        whatsNewIn307.click();
        return this;
    }

    /**
     * Click on Whats New In 3.1.0 Link.
     *
     * @return the kous class instance.
     */
    public kous clickWhatsNewIn310Link() {
        whatsNewIn310.click();
        return this;
    }

    /**
     * Click on Whats New In 3.1.0 Professional Link.
     *
     * @return the kous class instance.
     */
    public kous clickWhatsNewIn310ProfessionalLink() {
        whatsNewIn310Professional.click();
        return this;
    }

    /**
     * Click on Whats New In 3.1.1 Link.
     *
     * @return the kous class instance.
     */
    public kous clickWhatsNewIn311Link() {
        whatsNewIn311.click();
        return this;
    }

    /**
     * Click on Whats New In 3.1.2 Link.
     *
     * @return the kous class instance.
     */
    public kous clickWhatsNewIn312Link() {
        whatsNewIn312.click();
        return this;
    }

    /**
     * Click on Whats New In 3.1.3 Link.
     *
     * @return the kous class instance.
     */
    public kous clickWhatsNewIn313Link() {
        whatsNewIn313.click();
        return this;
    }

    /**
     * Click on Writing To Report Link.
     *
     * @return the kous class instance.
     */
    public kous clickWritingToReportLink() {
        writingToReport.click();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the kous class instance.
     */
    public kous verifyPageLoaded() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getPageSource().contains(pageLoadedText);
            }
        });
        return this;
    }

    /**
     * Verify that current page URL matches the expected URL.
     *
     * @return the kous class instance.
     */
    public kous verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
