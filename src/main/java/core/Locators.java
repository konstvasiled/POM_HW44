package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Locators {
    @FindBy(how = How.XPATH, using = "//*[@id='id_f_title']")
    static WebElement title;
    @FindBy(how = How.XPATH, using="//*[@id='id_fname']")
    static WebElement fn_fld;
    @FindBy(how = How.XPATH, using="//*[@id='id_f_label_fn']")
    static WebElement fn_lb;
    @FindBy(how = How.XPATH, using="//*[@id='id_lname']")
    static WebElement ln_fld;
    @FindBy(how = How.XPATH, using="//*[@id='id_f_label_ln']")
    static WebElement ln_lb;
    @FindBy(how = How.XPATH, using = "//*[@id='id_f_label_ea']")
    static WebElement email_lb;
    @FindBy(how = How.XPATH, using = "//*[@id='id_email']")
    static WebElement email_fld;
    @FindBy(how = How.XPATH, using = "//*[@id='id_f_label_pn']")
    static WebElement phone_lb;
    @FindBy(how = How.XPATH, using = "//*[@id='id_phone']")
    static WebElement phone_fld;
    @FindBy(how = How.XPATH, using = "//*[@id='id_reset_button']")
    static WebElement reset;
    @FindBy(how = How.XPATH, using = "//*[@id='id_submit_button']")
    static WebElement submit;

    void initialize(WebDriver driver) {
        PageFactory.initElements(driver, Locators.class); }

    By quote = By.xpath("//*[@id='id_quotes']");
    By location = By.xpath("//*[@id='id_current_location']");
    By weather = By.xpath("//*[@id='id_weather_icon']");
    By gender = By.xpath("//*[@id='id_rb_label_g']");
    By gendermalelabel = By.xpath("//*[@id='id_rb_label_m']");
    By gendermaleoption = By.xpath("//*[@id='id_gender_female']");
    By genderfemalelabel = By.xpath("//*[@id='id_rb_label_f']");
    By genderfemaleoption = By.xpath("//*[@id='id_gender_female']");
    By statelabel = By.xpath("//*[@id='id_f_label_s']");
    By stateoptions = By.xpath("//*[@id='id_state']");
    By option_california = By.xpath("//*[@id='id_state']/child::option[6]");
    By terms = By.xpath("//*[@id='id_cb_label_t']");
    By temrscheckbox = By.xpath("//*[@id='id_terms']");
    By facebooklink = By.xpath("//*[@id='id_img_facebook']");
    By twitterlink = By.xpath("//*[@id='id_img_twitter']");
    By flickrlink = By.xpath("//*[@id='id_img_flickr']");
    By youtubelink = By.xpath("//*[@id='id_img_youtube']");
    By timestamp = By.xpath("//*[@id='timestamp']");
    By copyright = By.xpath("//*[@id='copyright']");
    By useragent = By.xpath("//*[@id='os_browser']");
    By errorline = By.xpath("//*[@id='ErrorLine']");
    By fn_error = By.xpath("//*[@id='fname_error']");
    By ln_error = By.xpath("//*[@id='lname_error']");
    By email_error = By.xpath("//*[@id='email_error']");
    By phone_error = By.xpath("//*[@id='phone_error']");
    By fn_error_img = By.xpath("//*[@id='fname_error']/child::img");
    By ln_error_img = By.xpath("//*[@id='lname_error']/child::img");
    By email_error_img = By.xpath("//*[@id='email_error']/child::img");
    By phone_error_img = By.xpath("//*[@id='phone_error']/child::img");
    By gender_fld = By.xpath("//*[@id='id_gender']");
    By back_button = By.xpath("//*[@id='id_back_button']");
}
