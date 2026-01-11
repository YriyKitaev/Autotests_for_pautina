package helpers;

import com.codeborne.selenide.Configuration;
import internal_directory.InternalDirectory;

import static com.codeborne.selenide.Selenide.open;

public class WebDriverHelper {

    public static void initWebDriver() {
        Configuration.browserSize = "1920x1080";
        Configuration.browser = "chrome";
        open(InternalDirectory.UrlList.START);
    }
}