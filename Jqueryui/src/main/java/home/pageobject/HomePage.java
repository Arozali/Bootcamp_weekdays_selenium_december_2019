package home.pageobject;

import home.webelement.WebElementHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends WebElementHomePage {

    @FindBy(how = How.XPATH, using = WebElementHomePage.demosXpath)
    public static WebElement clickDemosxpath;

    public static String doClickDemosXpath() {
        return demosXpath;
    }

    @FindBy(how = How.XPATH, using = searchBox)
    public static WebElement SearchBox;

    public static WebElement setSearchBox() {
        return SearchBox;
    }

    public static void getSearchBox() {
        setSearchBox().click();
    }

    public static void getInputBoX() {
        driver.findElement( By.xpath( inputBox ) ).sendKeys( "Aroz" );
    }

    public static void getMouseHover() {
        Actions action = new Actions( driver );
        WebElement element = driver.findElement( By.xpath( ContributeXpath ) );
        action.moveToElement( element ).perform();
    }

    @FindBy(how = How.XPATH, using = WebElementHomePage.checkboxControlgroup)
    public static WebElement CheckBoxControlgroup;

    public static WebElement SetControlgroup() {
        return CheckBoxControlgroup;
    }

    public static WebElement iframexpath;

    public static WebElement setIframeXpath() {
        return iframexpath;
    }

    public static WebElement standard;

    public static WebElement setStandard() {
        return standard;
    }

    public static void iframeRadio() throws InterruptedException {
        SetControlgroup().click();
        setIframeXpath();
        sleepFor( 2 );
        setStandard().click();
    }

    public static void Image() {
        driver.findElement( By.xpath( ximage ) ).isSelected();
    }

    public static void gettextelement() {
        driver.findElement( By.xpath( topbarmenu ) ).getTagName();
        System.out.println( topbarmenu );
    }

    public static void webElementName() {
        WebElement BarMenu = driver.findElement( By.xpath( barmenu ) );
        System.out.println( BarMenu.getText() );
    }
    public static void doScreenshot(){
        TakesScreenshot scrShot =((TakesScreenshot)driver);
    }

}




