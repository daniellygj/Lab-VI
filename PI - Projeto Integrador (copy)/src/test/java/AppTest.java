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
        List<MobileElement> input = (List<MobileElement>) driverConfig.driver.findElementsByClassName("android.widget.EditText");
        assertEquals(input.get(0).getText(), "nome ou senha incorreto");
    }

    @Test
    public void login_shouldSucceed() throws MalformedURLException, InterruptedException {
        AppiumDriverConfig driverConfig = new AppiumDriverConfig();
        loginMotorista(driverConfig);
        List<MobileElement> textView = (List<MobileElement>) driverConfig.driver.findElementsByClassName("android.widget.TextView");
        assertEquals(textView.get(0).getText(), "Fabiano Sabha");
    }

    @Test
    public void searchGroup_shouldSucceed() throws MalformedURLException, InterruptedException {
        AppiumDriverConfig driverConfig = new AppiumDriverConfig();
        loginMotorista(driverConfig);
        List<MobileElement> button = button = (List<MobileElement>) driverConfig.driver.findElementsByClassName("android.widget.Button");
        button.get(2).click();
        Thread.sleep(2000);
        List<MobileElement> input = (List<MobileElement>) driverConfig.driver.findElementsByClassName("android.widget.EditText");
        input.get(1).setValue("Fatec - Noite");
        button = (List<MobileElement>) driverConfig.driver.findElementsByClassName("android.widget.Button");
        Thread.sleep(2000);
        button.get(2).click();
        List<MobileElement> textView = (List<MobileElement>) driverConfig.driver.findElementsByClassName("android.widget.EditText");
        assertEquals(textView.get(1).getText(), "Fatec - Noite");
    }
//
//    @Test
//    public void viewTripDetails_shouldSuccseed() throws MalformedURLException, InterruptedException {
//        loginMotorista()
//    }

    private void loginMotorista(AppiumDriverConfig driverConfig) throws MalformedURLException, InterruptedException {
        Thread.sleep(2000);
        List<MobileElement> button = (List<MobileElement>) driverConfig.driver.findElementsByClassName("android.widget.Button");
        button.get(0).click();
        Thread.sleep(1000);
        button = (List<MobileElement>) driverConfig.driver.findElementsByClassName("android.widget.Button");
        button.get(0).click();
        Thread.sleep(1000);
        button.get(1).click();
        Thread.sleep(2000);
    }
}
