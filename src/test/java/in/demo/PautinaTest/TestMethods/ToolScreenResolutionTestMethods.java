package in.demo.PautinaTest.TestMethods;

import helpers.ActionHelper;
import helpers.WebDriverHelper;
import org.junit.jupiter.api.DisplayName;

import static internal_directory.InternalDirectory.ScreenResolutionPageList.*;

@DisplayName(value = "Проверка для инструмента определяющего размер экрана 'razresheniye-ekrana'")
public class ToolScreenResolutionTestMethods {
    @DisplayName("Проверка заголовка 'Какое разрешение у моего экрана?'")
    public static void testMethod_01() {
        //Запустить браузер
        WebDriverHelper.initWebDriver();
        //Нажать на кнопку 'Какое разрешение у моего экрана?'
        ActionHelper.getElementScreenResolutionPress();
        //Проверить заголовок 'Какое разрешение у моего экрана?'
        ActionHelper.getElementTitleScreenResolutionPage(SCREEN_RESOLUTION_TITLE);
    }

    @DisplayName("Проверка заголовка и значения 'Медиа разрешение'")
    public static void testMethod_02() {
        //Запустить браузер
        WebDriverHelper.initWebDriver();
        //Нажать на кнопку 'Какое разрешение у моего экрана?'
        ActionHelper.getElementScreenResolutionPress();
        //Проверить заголовок и значение 'Медиа разрешение'
        ActionHelper.getElementMediaResolutionTitlePage(MEDIA_RESOLUTION);
        ActionHelper.getElementMediaResolutionValue(MEDIA_RESOLUTION_TITLE);
    }

    @DisplayName("Проверка заголовка и значения 'Физическое разрешение'")
    public static void testMethod_03() {
        //Запустить браузер
        WebDriverHelper.initWebDriver();
        //Нажать на кнопку 'Какое разрешение у моего экрана?'
        ActionHelper.getElementScreenResolutionPress();
        //Проверить заголовок и значение 'Физическое разрешение'
        ActionHelper.getElementPhysicalResolutionTitle(PHYSICAL_RESOLUTION);
        ActionHelper.getElementPhysicalResolutionValue(PHYSICAL_RESOLUTION_TITLE);
    }

    @DisplayName("Проверка заголовка и значения 'Размер окна просмотра'")
    public static void testMethod_04() {
        //Запустить браузер
        WebDriverHelper.initWebDriver();
        //Нажать на кнопку 'Какое разрешение у моего экрана?'
        ActionHelper.getElementScreenResolutionPress();
        //Проверить заголовок и значение 'Размер окна просмотра'
        ActionHelper.getElementViewportSizeTitle(VIEWPORT_SIZE);
        ActionHelper.getElementViewportSizeValue(VIEWPORT_SIZE_TITLE);
    }

    @DisplayName("Проверка заголовка и значения 'Размер окна браузера'")
    public static void testMethod_05() {
        //Запустить браузер
        WebDriverHelper.initWebDriver();
        //Нажать на кнопку 'Какое разрешение у моего экрана?'
        ActionHelper.getElementScreenResolutionPress();
        //Проверить заголовок и значение 'Размер окна браузера'
        ActionHelper.getElementBrowserWindowSizeTitle(BROWSER_WINDOW_SIZE);
        ActionHelper.getElementBrowserWindowSizeValue(BROWSER_WINDOW_SIZE_TITLE);
    }
}
