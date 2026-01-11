package in.demo.PautinaTest.Test;

import in.demo.PautinaTest.TestMethods.GeneralPageTestMethods;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

@DisplayName(value = "Проверка начальной страницы")
public class GeneralPageTest extends GeneralPageTestMethods {

    @Test
    @DisplayName("Проверка что на начальной странице присутствует текст 'Здесь вы можете найти документацию по HTML и CSS'")
    public void GeneralPageTest_01() {
        GeneralPageTestMethods.testMethod_01();
    }

    @Test
    @DisplayName("Проверка наличия и работы кнопки 'HTML'")
    public void GeneralPageTest_02() {
        GeneralPageTestMethods.testMethod_02();
    }

    @Test
    @DisplayName("Проверка наличия и работы кнопки 'CSS'")
    public void GeneralPageTest_03() {
        GeneralPageTestMethods.testMethod_03();
    }

    @Test
    @DisplayName("Проверка наличия и работы поисковой строки")
    public void GeneralPageTest_04() {
        GeneralPageTestMethods.testMethod_04();
    }

    @Test
    @DisplayName("Проверка наличия в футере инструмента 'Сравнить код' и переход к его странице")
    public void GeneralPageTest_05() {
        GeneralPageTestMethods.testMethod_05();
    }

    @Test
    @DisplayName("Проверка наличия в футере инструмента 'HTML символы в мнемоники' и переход к его странице")
    public void GeneralPageTest_06() {
        GeneralPageTestMethods.testMethod_06();
    }

    @Test
    @DisplayName("Проверка наличия в футере инструмента 'Какое разрешение у моего экрана?' и переход к его странице")
    public void GeneralPageTest_07() {
        GeneralPageTestMethods.testMethod_07();
    }

    @Test
    @DisplayName("Проверка наличия и работы лого в хэдере")
    public void GeneralPageTest_08() {
        GeneralPageTestMethods.testMethod_08();
    }

    @Test
    @DisplayName("Негативная проверка поисковой строки")
    public void GeneralPageTest_09() {
        GeneralPageTestMethods.testMethod_09();
    }

    @Test
    @DisplayName("Проверка наличия и работы вкладки HTML' в хэдере")
    public void GeneralPageTest_10() {
        GeneralPageTestMethods.testMethod_10();
    }

    @Test
    @DisplayName("Проверка наличия и работы вкладки 'CSS' в хэдере")
    public void GeneralPageTest_11() {
        GeneralPageTestMethods.testMethod_11();
    }

    @Test
    @DisplayName("Проверка наличия и работы вкладки 'Инструменты' в хэдере")
    public void GeneralPageTest_12() {
        GeneralPageTestMethods.testMethod_12();
    }

    @Test
    @DisplayName("Проверка наличия и работы вкладки 'Иконки' в хэдере")
    public void GeneralPageTest_13() {
        GeneralPageTestMethods.testMethod_13();
    }

    @Test
    @DisplayName("Проверка наличия и работы вкладки 'Контакты' в хэдере")
    public void GeneralPageTest_14() {
        GeneralPageTestMethods.testMethod_14();
    }
}