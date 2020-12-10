import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class AppiumDriverConfig {

    public final AppiumDriver driver;
    public final String APK_PATH = "/home/daniellygj/Documents/git/Lab-VI/PI - Projeto Integrador/src/main/resources/vantec(entrega3).apk";

    public AppiumDriverConfig() throws MalformedURLException {
        File apk = new File(APK_PATH);
        DesiredCapabilities config = new DesiredCapabilities();
        config.setCapability(MobileCapabilityType.APP, apk.getAbsolutePath());
        config.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        config.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

        URL connectionUrl = new URL("http://127.0.0.1:4723/wd/hub");
        this.driver = new AppiumDriver<>(connectionUrl, config);
    }
}
