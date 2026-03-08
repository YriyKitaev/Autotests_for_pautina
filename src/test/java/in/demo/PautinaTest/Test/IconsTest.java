package in.demo.PautinaTest.Test;

import in.demo.PautinaTest.TestMethods.IconsTestMethods;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;


@DisplayName(value = "Проверка раздела 'Иконки'")
public class IconsTest extends IconsTestMethods {

    @Test
    @DisplayName("Проверка заголовка 'SVG иконки'")
    public void iconsTest_01() {
        IconsTestMethods.testMethod_01();
    }

    @Test
    @DisplayName("Проверка поисковой строки (поиск иконок)")
    public void iconsTest_02() {
        IconsTestMethods.testMethod_02();
    }

    @Test
    @DisplayName("Проверка содержимого на странице с иконкой")
    public void iconsTest_03() {
        IconsTestMethods.testMethod_03();
    }

    @Test
    @DisplayName("Проверка раздела 'Правила пользования иконками'")
    public void iconsTest_04() {
        IconsTestMethods.testMethod_04();
    }

    @Test
    @DisplayName("Проверка работы кнопки 'Скачать' в тултипе при наведении на иконку")
    public void iconsTest_05() {
        IconsTestMethods.testMethod_05();
    }

    @Test
    @DisplayName("Проверка работы кнопки 'Скопировать' в тултипе при наведении на иконку")
    public void iconsTest_06() {
        IconsTestMethods.testMethod_06();
    }
}