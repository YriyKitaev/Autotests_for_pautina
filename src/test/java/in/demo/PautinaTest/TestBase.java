package in.demo.PautinaTest;

import com.codeborne.selenide.Configuration;
import helpers.WebDriverHelper;
import internal_directory.InternalDirectory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class TestBase {
    @BeforeEach
    @DisplayName("Pre and baseUrl")
    public void beforeEach() {
        Configuration.browserSize = "1920x1080";
        Configuration.browser = "chrome";
        open(InternalDirectory.UrlList.START);
    }

    @AfterAll
    @DisplayName("Close Browser")
    public static void afterAll() {
        closeWebDriver();
    }
}
