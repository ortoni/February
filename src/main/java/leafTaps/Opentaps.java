package leafTaps;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Opentaps {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "#label a")
    @CacheLookup
    private WebElement docsWiki;

    @FindBy(css = "#label a")
    @CacheLookup
    private WebElement ecommerce;

    @FindBy(css = "input.decorativeSubmit")
    @CacheLookup
    private WebElement login;

    private final String pageLoadedText = "Opentaps Open Source ERP + CRM";

    private final String pageUrl = "/opentaps/control/main";

    @FindBy(id = "password")
    @CacheLookup
    private WebElement password;

    @FindBy(id = "username")
    @CacheLookup
    private WebElement username;

    public Opentaps() {
    }

    public Opentaps(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public Opentaps(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public Opentaps(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Docs Wiki Link.
     *
     * @return the Opentaps class instance.
     */
    public Opentaps clickDocsWikiLink() {
        docsWiki.click();
        return this;
    }

    /**
     * Click on Ecommerce Link.
     *
     * @return the Opentaps class instance.
     */
    public Opentaps clickEcommerceLink() {
        ecommerce.click();
        return this;
    }

    /**
     * Click on Login Button.
     *
     * @return the Opentaps class instance.
     */
    public Opentaps clickLoginButton() {
        login.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the Opentaps class instance.
     */
    public Opentaps fill() {
        setUsernameTextField();
        setPasswordPasswordField();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the Opentaps class instance.
     */
    public Opentaps fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set default value to Password Password field.
     *
     * @return the Opentaps class instance.
     */
    public Opentaps setPasswordPasswordField() {
        return setPasswordPasswordField(data.get("PASSWORD"));
    }

    /**
     * Set value to Password Password field.
     *
     * @return the Opentaps class instance.
     */
    public Opentaps setPasswordPasswordField(String passwordValue) {
        password.sendKeys(passwordValue);
        return this;
    }

    /**
     * Set default value to Username Text field.
     *
     * @return the Opentaps class instance.
     */
    public Opentaps setUsernameTextField() {
        return setUsernameTextField(data.get("USERNAME"));
    }

    /**
     * Set value to Username Text field.
     *
     * @return the Opentaps class instance.
     */
    public Opentaps setUsernameTextField(String usernameValue) {
        username.sendKeys(usernameValue);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the Opentaps class instance.
     */
    public Opentaps submit() {
        clickLoginButton();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the Opentaps class instance.
     */
    public Opentaps verifyPageLoaded() {
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
     * @return the Opentaps class instance.
     */
    public Opentaps verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
