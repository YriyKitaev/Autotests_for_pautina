package in.demo.PautinaTest.TestMethods;

import helpers.ActionHelper;
import helpers.TestData;
import helpers.WebDriverHelper;
import helpers.XpathHelpers;
import org.junit.jupiter.api.DisplayName;

import static com.codeborne.selenide.Condition.*;
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
        //Ввести наименование иконки (avito)
        ActionHelper.getInputIconText("avito");
        //Проверяем что файл существует
        XpathHelpers.getIconPage.getAvitoIcon.should(exist);
        //Проверяем что кнопка видна и кликабельна
        XpathHelpers.getIconPage.getAvitoIcon.shouldBe(visible, enabled);
    }

    @DisplayName("Проверка содержимого на странице с иконкой")
    public static void testMethod_03() {
        //Запустить браузер
        WebDriverHelper.initWebDriver();
        //Нажать на вкладку 'Иконки'
        ActionHelper.getElementIconsTabPress();
        //Кликнуть на рандомную иконку
        TestData.clickRandomElement();
        //Кликнуть на кнопку 'Скачать'
        ActionHelper.getDownloadButtonPress();
        //Кликнуть на кнопку 'Скопировать'
        ActionHelper.getCopyButtonPress();
        //Проверить сообщение 'Иконка скопирована в буфер обмена'
        ActionHelper.getElementSuccessCopyMessageIconPage(SUCCESS_COPY_MESSAGE);
        sleep(1000);
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
        //Нажать на кнопку 'Скачать' в тултипе при наведении на иконку
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
        //Нажать на кнопку 'Скопировать' в тултипе при наведении на иконку
        ActionHelper.getCopyIconButtonPress();
        //Проверить сообщение 'Иконка скопирована в буфер обмена'
        ActionHelper.getElementSuccessCopyMessageIconPage(SUCCESS_COPY_MESSAGE);
        sleep(1000);
    }
}