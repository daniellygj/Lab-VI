import io.appium.java_client.MobileElement;
import org.junit.Test;

import java.net.MalformedURLException;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class AppTest {

    @Test
    public void login_shouldFail() throws MalformedURLException, InterruptedException {
        AppiumDriverConfig driverConfig = new AppiumDriverConfig();
        Thread.sleep(2000);
        List<MobileElement> button = (List<MobileElement>) driverConfig.driver.findElementsByClassName("android.widget.Button");
        button.get(0).click();
        Thread.sleep(1000);
        button = (List<MobileElement>) driverConfig.driver.findElementsByClassName("android.widget.Button");
        button.get(1).click();
        Thread.sleep(5000);
        List<MobileElement> input = (List<MobileElement>) driverConfig.driver.findElementsByClassName("android.widget.EditText");
        assertEquals(input.get(0).getText(), "nome ou senha incorreto");
    }

    @Test
    public void login_shouldSucceed() throws MalformedURLException, InterruptedException {
        AppiumDriverConfig driverConfig = new AppiumDriverConfig();
        Thread.sleep(2000);
        List<MobileElement> button = (List<MobileElement>) driverConfig.driver.findElementsByClassName("android.widget.Button");
        button.get(0).click();
        Thread.sleep(1000);
        button = (List<MobileElement>) driverConfig.driver.findElementsByClassName("android.widget.Button");
        button.get(0).click();
        Thread.sleep(1000);
        button.get(1).click();
        Thread.sleep(2000);
        List<MobileElement> textView = (List<MobileElement>) driverConfig.driver.findElementsByClassName("android.widget.TextView");
        assertEquals(textView.get(0).getText(), "Fabiano Sabha");
    }

    @Test
    public void searchGroup_shouldSucceed() throws MalformedURLException, InterruptedException {
        AppiumDriverConfig driverConfig = new AppiumDriverConfig();
        Thread.sleep(2000);
        List<MobileElement> button = (List<MobileElement>) driverConfig.driver.findElementsByClassName("android.widget.Button");
        button.get(0).click();
        Thread.sleep(1000);
        button = (List<MobileElement>) driverConfig.driver.findElementsByClassName("android.widget.Button");
        button.get(0).click();
        Thread.sleep(2000);
        button.get(1).click();
        Thread.sleep(2000);
        button = (List<MobileElement>) driverConfig.driver.findElementsByClassName("android.widget.Button");
        button.get(2).click();
        Thread.sleep(2000);
        button = (List<MobileElement>) driverConfig.driver.findElementsByClassName("android.widget.Button");
        button.get(2).click();
        Thread.sleep(3000);
        List<MobileElement> input = (List<MobileElement>) driverConfig.driver.findElementsByClassName("android.widget.EditText");
        Thread.sleep(1000);
        input.get(0).setValue("Fatec - Noite");
        button = (List<MobileElement>) driverConfig.driver.findElementsByClassName("android.widget.Button");
        button.get(0).click();
        List<MobileElement> textView = (List<MobileElement>) driverConfig.driver.findElementsByClassName("android.widget.EditText");
        assertEquals(textView.get(1).getText(), "Fatec - Noite");
    }

    @Test
    public void sendMessage_shouldSucceed() throws InterruptedException, MalformedURLException {
        AppiumDriverConfig driverConfig = new AppiumDriverConfig();
        Thread.sleep(2000);
        List<MobileElement> button = (List<MobileElement>) driverConfig.driver.findElementsByClassName("android.widget.Button");
        button.get(0).click();
        Thread.sleep(1000);
        button = (List<MobileElement>) driverConfig.driver.findElementsByClassName("android.widget.Button");
        button.get(0).click();
        Thread.sleep(1000);
        button.get(1).click();
        Thread.sleep(2000);
        button = (List<MobileElement>) driverConfig.driver.findElementsByClassName("android.widget.Button");
        button.get(3).click();
        Thread.sleep(8000);
        List<MobileElement> input = (List<MobileElement>) driverConfig.driver.findElementsByClassName("android.widget.EditText");
        input.get(1).setValue("Sofrêncio");
        input = (List<MobileElement>) driverConfig.driver.findElementsByClassName("android.widget.EditText");
        input.get(2).setValue("Te espero as 10");
        List<MobileElement> textView = (List<MobileElement>) driverConfig.driver.findElementsByClassName("android.widget.TextView");
        assertEquals("Te espero as 10", textView.get(1).getText());
    }
}
