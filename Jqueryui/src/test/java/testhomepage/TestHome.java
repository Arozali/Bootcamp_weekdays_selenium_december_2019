package testhomepage;

import home.pageobject.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class TestHome extends HomePage {

    public void getInitElements() throws InterruptedException{
        PageFactory.initElements( driver, HomePage.class );

    }
//    @Test(priority = 1)
//    public void tsetDemos() throws InterruptedException {
//        getInitElements();
//        sleepFor( 2 );
//        xpathClick( demosXpath );
//        sleepFor( 4 );
//    }
//    @Test(priority = 2)
//    public void testSearchBox() throws InterruptedException {
//        getInitElements();
//        sleepFor( 1 );
//        getSearchBox();
//        sleepFor( 2 );
//    }
//   @Test(priority = 3)
//    public void testInputBox() throws InterruptedException {
//        sleepFor( 2 );
//        getInputBoX();
//
//        sleepFor(4);
//    }
//      @Test(priority = 4)
//     public static void doMouseHover() throws InterruptedException {
//        sleepFor( 2 );
//        getMouseHover();
//        sleepFor( 3 );
//      }
//    @Test
//    public  void TestIframeRadio() throws InterruptedException {
//        getInitElements();
//        sleepFor( 2 );
//        iframeRadio();
//        sleepFor( 4 );
//    }
//       @Test
//       public void testimage() throws InterruptedException {
//           scrollUpDown( 50 );
//           Image();
//           wait( 3 ); }
//
//        @Test
//        public static void getText() throws InterruptedException {
//            gettextelement();
//            sleepFor(  2);
//        }
//
//        @Test    // get text on console
//    public static void TestwebElementName() throws InterruptedException {
//            webElementName();
//            Thread.sleep( 2000 );
//        }
      @Test
     public static void TestScreenshot() throws InterruptedException {
          doScreenshot();
          sleepFor( 3 );
      }


}
