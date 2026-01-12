package helpers;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.open;
import static internal_directory.InternalDirectory.UrlList.START;

public class WebDriverHelper {

    public static void initWebDriver() {
        Configuration.browserSize = "1920x1080";
        Configuration.browser = "chrome";
        open(START);
    }
}