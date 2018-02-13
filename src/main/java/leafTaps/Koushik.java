package leafTaps;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Koushik {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "a[href='android-tutorial']")
    @CacheLookup
    private WebElement android;

    @FindBy(css = "a[href='https://javatpoint.blogspot.com']")
    @CacheLookup
    private WebElement blogPage;

    @FindBy(css = "a[href='https://www.charactercountee.com']")
    @CacheLookup
    private WebElement charactercounteeCom;

    @FindBy(name = "code")
    @CacheLookup
    private WebElement classSendattachmentPublicStaticVoid;

    @FindBy(css = "a[href='comment.jsp']")
    @CacheLookup
    private WebElement comment;

    @FindBy(css = "a[href='https://www.javatpoint.com/contact-us']")
    @CacheLookup
    private WebElement contactUs;

    @FindBy(css = "#smoothmenu1 ul li:nth-of-type(2) a")
    @CacheLookup
    private WebElement coreJava;

    @FindBy(css = "a[href='example-of-deleting-email-using-java-mail-api']")
    @CacheLookup
    private WebElement deletingEmail;

    @FindBy(css = "a[href='design-patterns-in-java']")
    @CacheLookup
    private WebElement designPattern;

    @FindBy(css = "a[href='https://www.sssit.org']")
    @CacheLookup
    private WebElement developedBySssItPvtLtd;

    @FindBy(css = "a[href='src/mail/mailactivation.zip']")
    @CacheLookup
    private WebElement downloadTheseJarFiles;

    @FindBy(css = "a[href='src/mail/sendattachment.zip']")
    @CacheLookup
    private WebElement downloadThisExampleToSendEmail;

    @FindBy(name = "q")
    @CacheLookup
    private WebElement exampleOfSendingAttachmentWithEmail1;

    @FindBy(css = "#container div:nth-of-type(2) div:nth-of-type(1) span:nth-of-type(1) input[type='image']")
    @CacheLookup
    private WebElement exampleOfSendingAttachmentWithEmail2;

    @FindBy(name = "q")
    @CacheLookup
    private WebElement exampleOfSendingAttachmentWithEmail3;

    @FindBy(css = "a[title='Facebook']")
    @CacheLookup
    private WebElement facebook;

    @FindBy(css = "a[href='https://www.facebook.com/javatpoint']")
    @CacheLookup
    private WebElement facebookPage;

    @FindBy(css = "a[href='forum']")
    @CacheLookup
    private WebElement forum;

    @FindBy(css = "a[href='example-of-forwarding-email-using-java-mail-api']")
    @CacheLookup
    private WebElement forwardingEmail;

    @FindBy(css = "a[href='https://www.javatpoint.com/framework7-tutorial']")
    @CacheLookup
    private WebElement framework7;

    @FindBy(css = "a[href='https://plus.google.com/u/0/+javatpoint']")
    @CacheLookup
    private WebElement googlePage;

    @FindBy(css = "a[title='Google+']")
    @CacheLookup
    private WebElement googlePlus;

    @FindBy(css = "a[href='hibernate-tutorial']")
    @CacheLookup
    private WebElement hibernate;

    @FindBy(css = "a[href='https://www.hindi100.com']")
    @CacheLookup
    private WebElement hindi100Com;

    @FindBy(css = "a[href='http://www.hindi-typing.com']")
    @CacheLookup
    private WebElement hinditypingCom;

    @FindBy(css = "a[href='http://www.javatpoint.com']")
    @CacheLookup
    private WebElement home;

    @FindBy(css = "a[href='corejava-interview-questions']")
    @CacheLookup
    private WebElement interviewQ;

    @FindBy(css = "#menu div:nth-of-type(2) a:nth-of-type(1)")
    @CacheLookup
    private WebElement javaMailIntroduction;

    @FindBy(css = "#footer footer:nth-of-type(1) div:nth-of-type(2) a:nth-of-type(1)")
    @CacheLookup
    private WebElement javatpointCom;

    @FindBy(css = "#container div:nth-of-type(1) table tbody tr:nth-of-type(2) td div:nth-of-type(1) a")
    @CacheLookup
    private WebElement javatpointLogo1;

    @FindBy(css = "#container div:nth-of-type(2) div:nth-of-type(1) span:nth-of-type(2) a")
    @CacheLookup
    private WebElement javatpointLogo2;

    @FindBy(css = "a[href='https://www.jobandplacement.com']")
    @CacheLookup
    private WebElement jobandplacementCom;

    @FindBy(css = "a[href='jsp-tutorial']")
    @CacheLookup
    private WebElement jsp;

    @FindBy(css = "a[href='c-programming-language-tutorial']")
    @CacheLookup
    private WebElement learnCTutorial1;

    @FindBy(css = "a[href='cpp-tutorial']")
    @CacheLookup
    private WebElement learnCTutorial2;

    @FindBy(css = "a[href='c-sharp-tutorial']")
    @CacheLookup
    private WebElement learnCTutorial3;

    @FindBy(css = "a[href='css-tutorial']")
    @CacheLookup
    private WebElement learnCssTutorial;

    @FindBy(css = "a[href='html-tutorial']")
    @CacheLookup
    private WebElement learnHtmlTutorial;

    @FindBy(css = "#footer footer:nth-of-type(1) div:nth-of-type(1) a:nth-of-type(1)")
    @CacheLookup
    private WebElement learnJavaTutorial;

    @FindBy(css = "a[href='javascript-tutorial']")
    @CacheLookup
    private WebElement learnJavascriptTutorial;

    @FindBy(css = "a[href='jquery-tutorial']")
    @CacheLookup
    private WebElement learnJqueryTutorial;

    @FindBy(css = "a[href='php-tutorial']")
    @CacheLookup
    private WebElement learnPhpTutorial;

    @FindBy(css = "#footer footer:nth-of-type(1) div:nth-of-type(1) a:nth-of-type(10)")
    @CacheLookup
    private WebElement learnSpringTutorial;

    @FindBy(css = "a[href='https://www.lyricsia.com']")
    @CacheLookup
    private WebElement lyricsiaCom;

    @FindBy(css = "a.selected")
    @CacheLookup
    private WebElement mailApi;

    @FindBy(css = "#bottomnext a:nth-of-type(2)")
    @CacheLookup
    private WebElement next1;

    @FindBy(css = "#bottomnextup a:nth-of-type(1)")
    @CacheLookup
    private WebElement next;

    @FindBy(css = "a[href='https://www.javatpoint.com/software-installation-on-centos']")
    @CacheLookup
    private WebElement onCentos;

    @FindBy(css = "a[href='https://www.javatpoint.com/software-installation-on-mac']")
    @CacheLookup
    private WebElement onMac;

    private final String pageLoadedText = "For better understanding of this example, learn the steps of sending email using JavaMail API first";

    private final String pageUrl = "/example-of-sending-attachment-with-email-using-java-mail-api";

    @FindBy(css = "a[href='https://www.javatpoint.com/phalcon-tutorial']")
    @CacheLookup
    private WebElement phalcon;

    @FindBy(css = "a[title='Pinterest']")
    @CacheLookup
    private WebElement pinterest;

    @FindBy(css = "#bottomnextup a:nth-of-type(2)")
    @CacheLookup
    private WebElement prev1;

    @FindBy(css = "#bottomnext a:nth-of-type(1)")
    @CacheLookup
    private WebElement prev;

    @FindBy(css = "a[href='https://www.javatpoint.com/privacy-policy']")
    @CacheLookup
    private WebElement privacyPolicy;

    @FindBy(css = "a[href='free-java-projects']")
    @CacheLookup
    private WebElement projects;

    @FindBy(css = "a[href='examaccess']")
    @CacheLookup
    private WebElement quiz;

    @FindBy(css = "a[href='https://www.quoteperson.com']")
    @CacheLookup
    private WebElement quotepersonCom;

    @FindBy(css = "#menu div:nth-of-type(2) a:nth-of-type(6)")
    @CacheLookup
    private WebElement receivingAttachment;

    @FindBy(css = "#city table tbody tr td div:nth-of-type(4) span:nth-of-type(2) a")
    @CacheLookup
    private WebElement receivingAttachmentWithEmailUsingJava;

    @FindBy(css = "#menu div:nth-of-type(2) a:nth-of-type(4)")
    @CacheLookup
    private WebElement receivingEmail;

    @FindBy(css = "a[href='https://feeds.feedburner.com/javatpointsonoo']")
    @CacheLookup
    private WebElement rssFeed;

    @FindBy(css = "a[href='example-of-sending-attachment-with-email-using-java-mail-api']")
    @CacheLookup
    private WebElement sendingAttachment;

    @FindBy(css = "a[href='example-of-sending-email-using-java-mail-api']")
    @CacheLookup
    private WebElement sendingEmail;

    @FindBy(css = "a[href='example-of-sending-email-using-java-mail-api-through-gmail-server']")
    @CacheLookup
    private WebElement sendingEmailByGmail;

    @FindBy(css = "a[href='example-of-sending-html-content-with-email-using-java-mail-api']")
    @CacheLookup
    private WebElement sendingHtml;

    @FindBy(css = "a[href='servlet-tutorial']")
    @CacheLookup
    private WebElement servlet;

    @FindBy(css = "a[href='http://www.shayaree.com']")
    @CacheLookup
    private WebElement shayareeCom;

    @FindBy(css = "#smoothmenu1 ul li:nth-of-type(8) a")
    @CacheLookup
    private WebElement spring;

    @FindBy(css = "a[href='struts-2-tutorial']")
    @CacheLookup
    private WebElement struts2;

    @FindBy(css = "a[href='https://feedburner.google.com/fb/a/mailverify?uri=javatpointsonoo']")
    @CacheLookup
    private WebElement subscribeToGetEmailAlerts;

    @FindBy(css = "a[href='https://www.javatpoint.com/subscribe.jsp']")
    @CacheLookup
    private WebElement subscribeUs;

    @FindBy(css = "a[title='Tumblr']")
    @CacheLookup
    private WebElement tumbler;

    @FindBy(css = "a[title='Twitter']")
    @CacheLookup
    private WebElement twitter;

    @FindBy(css = "a[href='https://twitter.com/pagejavatpoint']")
    @CacheLookup
    private WebElement twitterPage;

    @FindBy(css = "a[href='https://www.wordcountee.com']")
    @CacheLookup
    private WebElement wordcounteeCom;

    @FindBy(css = "a[href='https://www.youtube.com/channel/UCUnYvQVCrJoFWZhKK3O2xLg']")
    @CacheLookup
    private WebElement youtube;

    public Koushik() {
    }

    public Koushik(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public Koushik(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public Koushik(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Android Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickAndroidLink() {
        android.click();
        return this;
    }

    /**
     * Click on Blog Page Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickBlogPageLink() {
        blogPage.click();
        return this;
    }

    /**
     * Click on Charactercountee.com Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickCharactercounteeComLink() {
        charactercounteeCom.click();
        return this;
    }

    /**
     * Click on Comment Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickCommentLink() {
        comment.click();
        return this;
    }

    /**
     * Click on Contact Us Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickContactUsLink() {
        contactUs.click();
        return this;
    }

    /**
     * Click on Core Java Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickCoreJavaLink() {
        coreJava.click();
        return this;
    }

    /**
     * Click on Deleting Email Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickDeletingEmailLink() {
        deletingEmail.click();
        return this;
    }

    /**
     * Click on Design Pattern Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickDesignPatternLink() {
        designPattern.click();
        return this;
    }

    /**
     * Click on Developed By Sss It Pvt Ltd Javatpoint Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickDevelopedBySssItPvtLtdLink() {
        developedBySssItPvtLtd.click();
        return this;
    }

    /**
     * Click on Download These Jar Files Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickDownloadTheseJarFilesLink() {
        downloadTheseJarFiles.click();
        return this;
    }

    /**
     * Click on Download This Example To Send Email With Attachment Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickDownloadThisExampleToSendEmailLink() {
        downloadThisExampleToSendEmail.click();
        return this;
    }

    /**
     * Set default value to Example Of Sending Attachment With Email In Java Javatpoint Text field.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickExampleOfSendingAttachmentWithEmail1Button() {
        return clickExampleOfSendingAttachmentWithEmail1Button(data.get("EXAMPLE_OF_SENDING_ATTACHMENT_WITH_EMAIL"));
    }

    /**
     * Click on Example Of Sending Attachment With Email In Java Javatpoint Button.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickExampleOfSendingAttachmentWithEmail1Button(String exampleOfSendingAttachmentWithEmailValue) {
        exampleOfSendingAttachmentWithEmail1.sendKeys(exampleOfSendingAttachmentWithEmailValue);
        return this;
    }

    /**
     * Click on Example Of Sending Attachment With Email In Java Javatpoint Button.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickExampleOfSendingAttachmentWithEmail2Button() {
        exampleOfSendingAttachmentWithEmail2.click();
        return this;
    }

    /**
     * Click on Facebook Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickFacebookLink() {
        facebook.click();
        return this;
    }

    /**
     * Click on Facebook Page Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickFacebookPageLink() {
        facebookPage.click();
        return this;
    }

    /**
     * Click on Forum Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickForumLink() {
        forum.click();
        return this;
    }

    /**
     * Click on Forwarding Email Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickForwardingEmailLink() {
        forwardingEmail.click();
        return this;
    }

    /**
     * Click on Framework7 Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickFramework7Link() {
        framework7.click();
        return this;
    }

    /**
     * Click on Google Page Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickGooglePageLink() {
        googlePage.click();
        return this;
    }

    /**
     * Click on Google Plus Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickGooglePlusLink() {
        googlePlus.click();
        return this;
    }

    /**
     * Click on Hibernate Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickHibernateLink() {
        hibernate.click();
        return this;
    }

    /**
     * Click on Hindi100.com Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickHindi100ComLink() {
        hindi100Com.click();
        return this;
    }

    /**
     * Click on Hindityping.com Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickHinditypingComLink() {
        hinditypingCom.click();
        return this;
    }

    /**
     * Click on Home Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickHomeLink() {
        home.click();
        return this;
    }

    /**
     * Click on Interview Q Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickInterviewQLink() {
        interviewQ.click();
        return this;
    }

    /**
     * Click on Java Mail Introduction Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickJavaMailIntroductionLink() {
        javaMailIntroduction.click();
        return this;
    }

    /**
     * Click on Javatpoint.com Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickJavatpointComLink() {
        javatpointCom.click();
        return this;
    }

    /**
     * Click on Javatpoint Logo Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickJavatpointLogo1Link() {
        javatpointLogo1.click();
        return this;
    }

    /**
     * Click on Javatpoint Logo Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickJavatpointLogo2Link() {
        javatpointLogo2.click();
        return this;
    }

    /**
     * Click on Jobandplacement.com Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickJobandplacementComLink() {
        jobandplacementCom.click();
        return this;
    }

    /**
     * Click on Jsp Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickJspLink() {
        jsp.click();
        return this;
    }

    /**
     * Click on Learn C Tutorial Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickLearnCTutorial1Link() {
        learnCTutorial1.click();
        return this;
    }

    /**
     * Click on Learn C Tutorial Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickLearnCTutorial2Link() {
        learnCTutorial2.click();
        return this;
    }

    /**
     * Click on Learn C Tutorial Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickLearnCTutorial3Link() {
        learnCTutorial3.click();
        return this;
    }

    /**
     * Click on Learn Css Tutorial Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickLearnCssTutorialLink() {
        learnCssTutorial.click();
        return this;
    }

    /**
     * Click on Learn Html Tutorial Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickLearnHtmlTutorialLink() {
        learnHtmlTutorial.click();
        return this;
    }

    /**
     * Click on Learn Java Tutorial Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickLearnJavaTutorialLink() {
        learnJavaTutorial.click();
        return this;
    }

    /**
     * Click on Learn Javascript Tutorial Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickLearnJavascriptTutorialLink() {
        learnJavascriptTutorial.click();
        return this;
    }

    /**
     * Click on Learn Jquery Tutorial Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickLearnJqueryTutorialLink() {
        learnJqueryTutorial.click();
        return this;
    }

    /**
     * Click on Learn Php Tutorial Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickLearnPhpTutorialLink() {
        learnPhpTutorial.click();
        return this;
    }

    /**
     * Click on Learn Spring Tutorial Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickLearnSpringTutorialLink() {
        learnSpringTutorial.click();
        return this;
    }

    /**
     * Click on Lyricsia.com Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickLyricsiaComLink() {
        lyricsiaCom.click();
        return this;
    }

    /**
     * Click on Mail Api Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickMailApiLink() {
        mailApi.click();
        return this;
    }

    /**
     * Click on Next Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickNextLink() {
        next.click();
        return this;
    }


    /**
     * Click on On Centos Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickOnCentosLink() {
        onCentos.click();
        return this;
    }

    /**
     * Click on On Mac Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickOnMacLink() {
        onMac.click();
        return this;
    }

    /**
     * Click on Phalcon Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickPhalconLink() {
        phalcon.click();
        return this;
    }

    /**
     * Click on Pinterest Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickPinterestLink() {
        pinterest.click();
        return this;
    }

    /**
     * Click on Prev Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickPrevLink() {
        prev.click();
        return this;
    }

    /**
     * Click on Prev Link.
     *
     * @return the Koushik class instance.
     */
   /* public Koushik clickPrevLink() {
        prev.click();
        return this;
    }*/

    /**
     * Click on Privacy Policy Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickPrivacyPolicyLink() {
        privacyPolicy.click();
        return this;
    }

    /**
     * Click on Projects Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickProjectsLink() {
        projects.click();
        return this;
    }

    /**
     * Click on Quiz Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickQuizLink() {
        quiz.click();
        return this;
    }

    /**
     * Click on Quoteperson.com Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickQuotepersonComLink() {
        quotepersonCom.click();
        return this;
    }

    /**
     * Click on Receiving Attachment Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickReceivingAttachmentLink() {
        receivingAttachment.click();
        return this;
    }

    /**
     * Click on Receiving Attachment With Email Using Java Mail Api Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickReceivingAttachmentWithEmailUsingJavaLink() {
        receivingAttachmentWithEmailUsingJava.click();
        return this;
    }

    /**
     * Click on Receiving Email Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickReceivingEmailLink() {
        receivingEmail.click();
        return this;
    }

    /**
     * Click on Rss Feed Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickRssFeedLink() {
        rssFeed.click();
        return this;
    }

    /**
     * Click on Sending Attachment Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickSendingAttachmentLink() {
        sendingAttachment.click();
        return this;
    }

    /**
     * Click on Sending Email By Gmail Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickSendingEmailByGmailLink() {
        sendingEmailByGmail.click();
        return this;
    }

    /**
     * Click on Sending Email Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickSendingEmailLink() {
        sendingEmail.click();
        return this;
    }

    /**
     * Click on Sending Html Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickSendingHtmlLink() {
        sendingHtml.click();
        return this;
    }

    /**
     * Click on Servlet Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickServletLink() {
        servlet.click();
        return this;
    }

    /**
     * Click on Shayaree.com Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickShayareeComLink() {
        shayareeCom.click();
        return this;
    }

    /**
     * Click on Spring Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickSpringLink() {
        spring.click();
        return this;
    }

    /**
     * Click on Struts2 Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickStruts2Link() {
        struts2.click();
        return this;
    }

    /**
     * Click on Subscribe To Get Email Alerts Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickSubscribeToGetEmailAlertsLink() {
        subscribeToGetEmailAlerts.click();
        return this;
    }

    /**
     * Click on Subscribe Us Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickSubscribeUsLink() {
        subscribeUs.click();
        return this;
    }

    /**
     * Click on Tumbler Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickTumblerLink() {
        tumbler.click();
        return this;
    }

    /**
     * Click on Twitter Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickTwitterLink() {
        twitter.click();
        return this;
    }

    /**
     * Click on Twitter Page Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickTwitterPageLink() {
        twitterPage.click();
        return this;
    }

    /**
     * Click on Wordcountee.com Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickWordcounteeComLink() {
        wordcounteeCom.click();
        return this;
    }

    /**
     * Click on Youtube Link.
     *
     * @return the Koushik class instance.
     */
    public Koushik clickYoutubeLink() {
        youtube.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the Koushik class instance.
     */
    public Koushik fill() {
        clickExampleOfSendingAttachmentWithEmail1Button();
        setExampleOfSendingAttachmentWithEmail3TextField();
        setClassSendattachmentPublicStaticVoidTextareaField();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the Koushik class instance.
     */
   /* public Koushik fillAndSubmit() {
        fill();
        return submit();
    }*/

    /**
     * Set default value to Class Sendattachment Public Static Void Mainstring Args String Tosonoojaiswal1987gmail Textarea field.
     *
     * @return the Koushik class instance.
     */
    public Koushik setClassSendattachmentPublicStaticVoidTextareaField() {
        return setClassSendattachmentPublicStaticVoidTextareaField(data.get("CLASS_SENDATTACHMENT_PUBLIC_STATIC_VOID"));
    }

    /**
     * Set value to Class Sendattachment Public Static Void Mainstring Args String Tosonoojaiswal1987gmail Textarea field.
     *
     * @return the Koushik class instance.
     */
    public Koushik setClassSendattachmentPublicStaticVoidTextareaField(String classSendattachmentPublicStaticVoidValue) {
        classSendattachmentPublicStaticVoid.sendKeys(classSendattachmentPublicStaticVoidValue);
        return this;
    }

    /**
     * Set default value to Example Of Sending Attachment With Email In Java Javatpoint Text field.
     *
     * @return the Koushik class instance.
     */
    public Koushik setExampleOfSendingAttachmentWithEmail3TextField() {
        return setExampleOfSendingAttachmentWithEmail3TextField(data.get("EXAMPLE_OF_SENDING_ATTACHMENT_WITH_EMAIL_3"));
    }

    /**
     * Set value to Example Of Sending Attachment With Email In Java Javatpoint Text field.
     *
     * @return the Koushik class instance.
     */
    public Koushik setExampleOfSendingAttachmentWithEmail3TextField(String exampleOfSendingAttachmentWithEmail3Value) {
        exampleOfSendingAttachmentWithEmail3.sendKeys(exampleOfSendingAttachmentWithEmail3Value);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the Koushik class instance.
     */
 /*   public Koushik submit() {
        clickButton();
        return this;
    }
*/
    /**
     * Verify that the page loaded completely.
     *
     * @return the Koushik class instance.
     */
    public Koushik verifyPageLoaded() {
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
     * @return the Koushik class instance.
     */
    public Koushik verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
