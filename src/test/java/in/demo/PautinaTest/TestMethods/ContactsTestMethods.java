package in.demo.PautinaTest.TestMethods;

import helpers.ActionHelper;
import helpers.WebDriverHelper;
import org.junit.jupiter.api.DisplayName;

import static helpers.TestData.*;
import static internal_directory.InternalDirectory.ContactsPageList.*;
import static internal_directory.InternalDirectory.GeneralPageList.HTML_CSS_TITLE;

public class ContactsTestMethods {
    @DisplayName("Проверка раздела 'Контактная форма'")
    public static void testMethod_01() {
        //Запустить браузер
        WebDriverHelper.initWebDriver();
        //Нажать на вкладку 'Контакты'
        ActionHelper.getElementContactsTabPress();
        //Проверить заголовок 'Контакты'
        ActionHelper.getElementContactTitleAssert(CONTACT_TITLE);
    }

    @DisplayName("Проверка плейсхолдеров на форме ввода")
    public static void testMethod_02() {
        //Запустить браузер
        WebDriverHelper.initWebDriver();
        //Нажать на вкладку 'Контакты'
        ActionHelper.getElementContactsTabPress();
        //Проверить плейсхолдер 'Имя'
        ActionHelper.getElementPlaceholderName();
        //Проверить плейсхолдер 'Email'
        ActionHelper.getElementPlaceholderEmail();
        //Проверить плейсхолдер 'Тема'
        ActionHelper.getElementPlaceholderSubject();
        //Проверить плейсхолдер 'Сообщение'
        ActionHelper.getElementPlaceholderMessage();
    }

    @DisplayName("Успешная отправка заполненной формы")
    public static void testMethod_03() {
        //Запустить браузер
        WebDriverHelper.initWebDriver();
        //Нажать на вкладку 'Контакты'
        ActionHelper.getElementContactsTabPress();
        //Ввести значение в поле 'Имя'
        ActionHelper.getElementNameInputText(randomShortString);
        //Ввести значение в поле 'Email'
        ActionHelper.getElementEmailInputText(MAIL_TEST_ADDRESS);
        //Ввести значение в поле 'Тема'
        ActionHelper.getElementSubjectInputText(randomMediumString);
        //Ввести значение в поле 'Сообщение'
        ActionHelper.getElementMessageInputText(randomLongString);
        //Нажать на кнопку 'Отправить'
        ActionHelper.getElementSendButtonPress();
        //Проверить сообщение об успешной отправке 'Ваше сообщение отправлено, спасибо.'
        ActionHelper.getElementSuccessMessageTitle(SUCCESS_MESSAGE);
    }

    @DisplayName("Проверка валидации полей на форме")
    public static void testMethod_04() {
        //Запустить браузер
        WebDriverHelper.initWebDriver();
        //Нажать на вкладку 'Контакты'
        ActionHelper.getElementContactsTabPress();
        //Нажать на кнопку 'Отправить'
        ActionHelper.getElementSendButtonPress();
        //Проверить что форма не отправлена и отсутствует сообщение 'Ваше сообщение отправлено, спасибо.' т.к. ни одно поле на форме не заполнено
        ActionHelper.getElementAbsentSuccessMessageTitle();
        //Ввести значение в поле 'Имя'
        ActionHelper.getElementNameInputText(randomShortString);
        //Нажать на кнопку 'Отправить'
        ActionHelper.getElementSendButtonPress();
        //Проверить что форма не отправлена и отсутствует сообщение 'Ваше сообщение отправлено, спасибо.' т.к. заполнено только поле 'Имя'
        ActionHelper.getElementAbsentSuccessMessageTitle();
        //Ввести значение в поле 'Тема'
        ActionHelper.getElementSubjectInputText(randomMediumString);
        //Нажать на кнопку 'Отправить'
        ActionHelper.getElementSendButtonPress();
        //Проверить что форма не отправлена и отсутствует сообщение 'Ваше сообщение отправлено, спасибо.' т.к. заполнены только поля 'Имя', 'Email'
        ActionHelper.getElementAbsentSuccessMessageTitle();
        //Ввести значение в поле 'Email'
        ActionHelper.getElementEmailInputText(MAIL_TEST_ADDRESS);
        //Нажать на кнопку 'Отправить'
        ActionHelper.getElementSendButtonPress();
        //Проверить что форма не отправлена и отсутствует сообщение 'Ваше сообщение отправлено, спасибо.' т.к. заполнены только поля 'Имя', 'Email', 'Тема'
        ActionHelper.getElementAbsentSuccessMessageTitle();
        //Ввести значение в поле 'Сообщение'
        ActionHelper.getElementMessageInputText(randomLongString);
        //Нажать на кнопку 'Отправить'
        ActionHelper.getElementSendButtonPress();
        //Проверить сообщение об успешной отправке 'Ваше сообщение отправлено, спасибо.'
        ActionHelper.getElementSuccessMessageTitle(SUCCESS_MESSAGE);
    }

    @DisplayName("Проверка кнопки 'На главную'")
    public static void testMethod_05() {
        //Запустить браузер
        WebDriverHelper.initWebDriver();
        //Нажать на вкладку 'Контакты'
        ActionHelper.getElementContactsTabPress();
        //Ввести значение в поле 'Имя'
        ActionHelper.getElementNameInputText(randomShortString);
        //Ввести значение в поле 'Email'
        ActionHelper.getElementEmailInputText(MAIL_TEST_ADDRESS);
        //Ввести значение в поле 'Тема'
        ActionHelper.getElementSubjectInputText(randomMediumString);
        //Ввести значение в поле 'Сообщение'
        ActionHelper.getElementMessageInputText(randomLongString);
        //Нажать на кнопку 'Отправить'
        ActionHelper.getElementSendButtonPress();
        //Проверить сообщение об успешной отправке 'Ваше сообщение отправлено, спасибо.'
        ActionHelper.getElementSuccessMessageTitle(SUCCESS_MESSAGE);
        //Нажать на кнопку 'На главную'
        ActionHelper.getElementGoGeneralPageButtonPress();
        //Проверить заголовок 'Здесь вы можете найти документацию по HTML и CSS'
        ActionHelper.getElementParagraphAssert(HTML_CSS_TITLE);
    }
}
