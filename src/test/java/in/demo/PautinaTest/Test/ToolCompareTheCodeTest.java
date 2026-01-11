package in.demo.PautinaTest.Test;

import in.demo.PautinaTest.TestMethods.ToolCompareTheCodeTestMethods;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;


@DisplayName(value = "Проверка страницы инструмента сравнения текста 'sravnit-kod'")
public class ToolCompareTheCodeTest extends ToolCompareTheCodeTestMethods {

    @Test
    @DisplayName("Проверка что в случае ввода идентичных текстов выводится сообщение 'Тексты идентичны.'")
    public void toolCompareTheCodeTest_01() {
        ToolCompareTheCodeTestMethods.testMethod_01();
    }

    @Test
    @DisplayName("Проверка что в случае ввода разных текстов отсутствует сообщение 'Тексты идентичны.'")
    public void toolCompareTheCodeTest_02() {
        ToolCompareTheCodeTestMethods.testMethod_02();}

    @Test
    @DisplayName("Проверка заголовков 'Оригинальный текст' и 'Изменённый текст'")
    public void toolCompareTheCodeTest_03() {
        ToolCompareTheCodeTestMethods.testMethod_03();}

//    @Test
//    @DisplayName("Проверка что в случае ввода разных текстов отсутствует сообщение 'Тексты идентичны.'")
//    public void toolCompareTheCodeTest_04() {
//        ToolCompareTheCodeTestMethods.testMethod_04();}
}