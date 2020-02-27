package home.webelement;


import common.WebAPI;
import org.openqa.selenium.By;

public class WebElementHomePage extends WebAPI {
    public static final String demosXpath = "//a[contains(text(),'Demos')]";
    public static final String searchBox = "//input[@placeholder='Search']";
    public static final String inputBox = "//input[@placeholder='Search']";
    //mousehover
    public static final String ContributeXpath = "//a[contains(text(),'Contribute')]";

    public static final String checkboxControlgroup = "//a[contains(text(),'Controlgroup')]";

    public static final String iframexpath = "//iframe[@class='demo-frame']";
    public static final String standard = "/html[1]/body[1]/div[1]/fieldset[1]/div[1]/label[1]/span[1]";
    public static final String ximage = "//li[2]//a[1]//img[1]";
    public static final String topbarmenu ="//ul[@id='menu-top']";
    public static final String barmenu   = "//ul[@class='links l_tinynav1']";
    public static final String screenshot ="//p[@class='intro']";
}