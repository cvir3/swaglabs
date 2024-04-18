package webTest;
import org.testng.annotations.*;
import utilities.baseClass;
import webFunction.loginModule;
import webFunction.productPage;
public class testRunner extends baseClass {
    @Test
    public void login() throws InterruptedException{
        loginModule lm = new loginModule(webDriver);
        productPage pp = new productPage(webDriver);
        lm.login();
        pp.porduct();
        webDriver.quit();
    }
}
