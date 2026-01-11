package in.demo.PautinaTest.Test;

import in.demo.PautinaTest.TestMethods.ContactsTestMethods;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

@DisplayName(value = "Проверка раздела 'Контактная форма'")
public class ContactsPageTest extends ContactsTestMethods {
    @Test
    @DisplayName("Проверка заголовка 'Контактная форма'")
    public void ContactsPageTest_01() {
        ContactsTestMethods.testMethod_01();
    }

    @Test
    @DisplayName("Проверка плейсхолдеров на форме ввода")
    public void ContactsPageTest_02() {
        ContactsTestMethods.testMethod_02();
    }

    @Test
    @DisplayName("Успешная отправка заполненной формы")
    public void ContactsPageTest_03() {
        ContactsTestMethods.testMethod_03();
    }

    @Test
    @DisplayName("Проверка валидации полей на форме")
    public void ContactsPageTest_04() {
        ContactsTestMethods.testMethod_04();
    }

    @Test
    @DisplayName("Проверка кнопки 'На главную'")
    public void ContactsPageTest_05() {
        ContactsTestMethods.testMethod_05();
    }
}