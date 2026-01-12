package in.demo.PautinaTest.TestMethods;

import helpers.ActionHelper;
import helpers.WebDriverHelper;
import org.junit.jupiter.api.DisplayName;

import static helpers.TestData.randomLongString;
import static helpers.TestData.randomMediumString;
import static internal_directory.InternalDirectory.CompareTheCodePageList.*;

@DisplayName(value = "Проверка для инструмента сравнения текста 'sravnit-kod'")
public class ToolCompareTheCodeTestMethods {

    @DisplayName("Проверка что в случае ввода разных текстов не выводится сообщение 'Тексты идентичны.'")
    public static void testMethod_01() {
        //Запустить браузер
        WebDriverHelper.initWebDriver();
        //Нажать на кнопку 'Сравнить код'
        ActionHelper.getElementCompareTheCodePress();
        //Ввести значение в поле 'Оригинальный текст'
        ActionHelper.getElementTextareaBaseTextInput(randomMediumString);
        //Ввести значение в поле 'Измененный текст'
        ActionHelper.getElementTextareaNewTextInput(randomLongString);
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
        ActionHelper.getElementTextareaBaseTextInput(randomLongString);
        //Ввести значение в поле 'Измененный текст'
        ActionHelper.getElementTextareaNewTextInput(randomLongString);
        //Нажать на кнопку 'Сравнить'
        ActionHelper.getElementCompareButtonPress();
        //Проверить сообщение 'Тексты идентичны'
        ActionHelper.getElementIdenticalTextTitle(IDENTICAL_TEXT_MESSAGE);
    }

    @DisplayName("Проверка заголовков 'Оригинальный текст' и 'Изменённый текст'")
    public static void testMethod_03() {
        //Запустить браузер
        WebDriverHelper.initWebDriver();
        //Нажать на кнопку 'Сравнить код'
        ActionHelper.getElementCompareTheCodePress();
        //Проверить заголовок 'Оригинальный текст'
        ActionHelper.getElementOriginalTextTitle(ORIGINAL_TEXT);
        //Проверить заголовок 'Изменённый текст'
        ActionHelper.getElementModifiedTextTitle(MODIFIED_TEXT);
    }
}