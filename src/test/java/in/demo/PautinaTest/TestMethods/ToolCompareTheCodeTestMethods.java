package in.demo.PautinaTest.TestMethods;

import helpers.ActionHelper;
import helpers.TestData;
import helpers.WebDriverHelper;
import internal_directory.InternalDirectory;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;

import java.util.List;

import static org.junit.Assert.assertTrue;

@DisplayName(value = "Проверка для инструмента сравнения текста 'sravnit-kod'")
public class ToolCompareTheCodeTestMethods {

    @DisplayName("Проверка что в случае ввода разных текстов не выводится сообщение 'Тексты идентичны.'")
    public static void testMethod_01() {
        //Запустить браузер
        WebDriverHelper.initWebDriver();
        //Нажать на кнопку 'Сравнить код'
        ActionHelper.getElementCompareTheCodePress();
        //Ввести значение в поле 'Оригинальный текст'
        ActionHelper.getElementTextareaBaseTextInput(TestData.randomMediumString);
        //Ввести значение в поле 'Измененный текст'
        ActionHelper.getElementTextareaNewTextInput(TestData.randomLongString);
        //Нажать на кнопку 'Сравнить'
        ActionHelper.getElementCompareButtonPress();
        //Проверить отсутствие сообщения 'Тексты идентичны.'
        ActionHelper.getElementAbsentIdenticalTextTitle();
    }

    @DisplayName("Проверка что в случае ввода идентичных текстов выводится сообщение 'Тексты идентичны.'")
    public static void testMethod_02() {
        //Запустить браузер
        WebDriverHelper.initWebDriver();
        //Нажать на кнопку 'Сравнить код'
        ActionHelper.getElementCompareTheCodePress();
        //Ввести значение в поле 'Оригинальный текст'
        ActionHelper.getElementTextareaBaseTextInput(TestData.randomLongString);
        //Ввести значение в поле 'Измененный текст'
        ActionHelper.getElementTextareaNewTextInput(TestData.randomLongString);
        //Нажать на кнопку 'Сравнить'
        ActionHelper.getElementCompareButtonPress();
        //Проверить сообщение 'Тексты идентичны'
        ActionHelper.getElementIdenticalTextTitle(InternalDirectory.CompareTheCodePageList.IDENTICAL_TEXT_MESSAGE);
    }

    @DisplayName("Проверка заголовков 'Оригинальный текст' и 'Изменённый текст'")
    public static void testMethod_03() {
        //Запустить браузер
        WebDriverHelper.initWebDriver();
        //Нажать на кнопку 'Сравнить код'
        ActionHelper.getElementCompareTheCodePress();
        //Проверить заголовок 'Оригинальный текст'
        ActionHelper.getElementOriginalTextTitle(InternalDirectory.CompareTheCodePageList.ORIGINAL_TEXT);
        //Проверить заголовок 'Изменённый текст'
        ActionHelper.getElementModifiedTextTitle(InternalDirectory.CompareTheCodePageList.MODIFIED_TEXT);
    }
}