package in.demo.PautinaTest.TestMethods;

import helpers.ActionHelper;
import helpers.TestData;
import helpers.WebDriverHelper;
import org.junit.jupiter.api.DisplayName;

import static com.codeborne.selenide.Selenide.sleep;
import static internal_directory.InternalDirectory.IconsPageList.*;

@DisplayName(value = "Проверка для инструмента сравнения текста 'sravnit-kod'")
public class IconsTestMethods {

    @DisplayName("Проверка заголовка 'SVG иконки'")
    public static void testMethod_01() {
        //Запустить браузер
        WebDriverHelper.initWebDriver();
        //Нажать на вкладку 'Иконки'
        ActionHelper.getElementIconsTabPress();
        //Проверить заголовок 'Иконки'
        ActionHelper.getElementIconTitleAssert(ICON_TITLE);
    }

    @DisplayName("Проверка поиска иконок")
    public static void testMethod_02() {
        //Запустить браузер
        WebDriverHelper.initWebDriver();
        //Нажать на вкладку 'Иконки'
        ActionHelper.getElementIconsTabPress();
    }

    @DisplayName("Проверка содержимого на странице с иконкой")
    public static void testMethod_03() {
        //Запустить браузер
        WebDriverHelper.initWebDriver();
        //Нажать на вкладку 'Иконки'
        ActionHelper.getElementIconsTabPress();
    }

    @DisplayName("Проверка раздела 'Правила пользования иконками'")
    public static void testMethod_04() {
        //Запустить браузер
        WebDriverHelper.initWebDriver();
        //Нажать на вкладку 'Иконки'
        ActionHelper.getElementIconsTabPress();
        //Нажать на кнопку 'Правила пользования иконками'
        ActionHelper.getElementIconsUseRulesPress();
        //Проверить заголовок 'Как можно использовать иконки?'
        ActionHelper.getElementHowUseIconTitleAssert(HOW_USE_ICON);
    }

    @DisplayName("Проверка работы кнопки 'Скачать' в тултипе при наведении на иконку")
    public static void testMethod_05() {
        //Запустить браузер
        WebDriverHelper.initWebDriver();
        //Нажать на вкладку 'Иконки'
        ActionHelper.getElementIconsTabPress();
        //Навести курсор на рандомную иконку
        TestData.hoverRandomElement();
        ActionHelper.getDownloadIconButtonPress();
        sleep(2000);
    }

    @DisplayName("Проверка работы кнопки 'Скопировать' в тултипе при наведении на иконку")
    public static void testMethod_06() {
        //Запустить браузер
        WebDriverHelper.initWebDriver();
        //Нажать на вкладку 'Иконки'
        ActionHelper.getElementIconsTabPress();
        //Навести курсор на рандомную иконку
        TestData.hoverRandomElement();
        sleep(1000);
        ActionHelper.getCopyIconButtonPress();
        ActionHelper.getElementSuccessCopyMessageIconPage(SUCCESS_COPY_MESSAGE);
        sleep(1000);
    }
}