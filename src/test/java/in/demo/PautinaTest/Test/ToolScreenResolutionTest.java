package in.demo.PautinaTest.Test;

import in.demo.PautinaTest.TestMethods.ToolScreenResolutionTestMethods;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

@DisplayName(value = "Проверка для инструмента определяющего размер экрана 'razresheniye-ekrana'")
public class ToolScreenResolutionTest extends ToolScreenResolutionTestMethods {
    @Test
    @DisplayName("Проверка заголовка 'Какое разрешение у моего экрана?'")
    public void ToolScreenResolutionTest_01() {
        ToolScreenResolutionTestMethods.testMethod_01();
    }

    @Test
    @DisplayName("Проверка заголовка и значения 'Медиа разрешение'")
    public void ToolScreenResolutionTest_02() {
        ToolScreenResolutionTestMethods.testMethod_02();
    }

    @Test
    @DisplayName("Проверка заголовка и значения 'Физическое разрешение'")
    public void ToolScreenResolutionTest_03() {
        ToolScreenResolutionTestMethods.testMethod_03();
    }

    @Test
    @DisplayName("Проверка заголовка и значения 'Размер окна просмотра'")
    public void ToolScreenResolutionTest_04() {
        ToolScreenResolutionTestMethods.testMethod_04();
    }

    @Test
    @DisplayName("Проверка заголовка и значения 'Размер окна браузера'")
    public void ToolScreenResolutionTest_05() {
        ToolScreenResolutionTestMethods.testMethod_05();
    }
}