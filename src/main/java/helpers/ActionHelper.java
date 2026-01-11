package helpers;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class ActionHelper {

    //Проверить заголовок 'Здесь вы можете найти документацию по HTML и CSS'
    public static void getElementParagraphAssert(String textTitle) {
        XpathHelpers.getGeneralPage.getElementParagraph.shouldHave(text(textTitle));
    }

    //Проверить сообщение поисковой строки 'По вашему запросу результатов не найдено.' при не валидном запросе
    public static void getElementNotFoundMessageAssert(String textTitle) {
        XpathHelpers.getGeneralPage.getElementNotFoundMessage.shouldHave(text(textTitle));
    }

    //Нажать на кнопку 'HTML'
    public static void getElementHtmlButtonPress() {
        XpathHelpers.getGeneralPage.getElementHtmlButton.click();
    }

    //Проверить заголовок 'HTML'
    public static void getElementHtmlTitleAssert(String textTitle) {
        XpathHelpers.getHtmlPage.getElementHtmlTitle.shouldHave(text(textTitle));
    }

    //Нажать на кнопку 'CSS'
    public static void getElementCssButtonPress() {
        XpathHelpers.getGeneralPage.getElementCssButton.click();
    }

    //Проверить заголовок 'CSS'
    public static void getElementCssTitleAssert(String textTitle) {
        XpathHelpers.getCssPage.getElementCsslTitle.shouldHave(text(textTitle));
    }

    //Ввести значение в строку поиска
    public static void getElementSearchInputText(String text) {
        XpathHelpers.getGeneralPage.getElementSearchInput.setValue(text);
    }

    //Выбрать искомый элемент
    public static void getElementResultPress() {
        XpathHelpers.getGeneralPage.getElementResult.click();
    }

    //Проверить заголовок вкладки 'HTML'
    public static void getElementHtmlFolderAssert(String textTitle) {
        XpathHelpers.getHtmlPage.getElementHtmlTab.shouldHave(text(textTitle));
    }

    //Проверить заголовок вкладки 'CSS'
    public static void getElementCssFolderAssert(String textTitle) {
        XpathHelpers.getCssPage.getElementCssTab.shouldHave(text(textTitle));
    }

    //Проверить заголовок вкладки 'Инструменты'
    public static void getElementToolTitleAssert(String textTitle) {
        XpathHelpers.getToolsPage.getElementToolTab.shouldHave(text(textTitle));
    }

    //Проверить заголовок вкладки 'Иконки'
    public static void getElementIconTitleAssert(String textTitle) {
        XpathHelpers.getIconPage.getElementIconTitle.shouldHave(text(textTitle));
    }

    //Проверить заголовок вкладки 'Контакты'
    public static void getElementContactTitleAssert(String textTitle) {
        XpathHelpers.getContactPage.getElementContactTitle.shouldHave(text(textTitle));
    }

    //Нажать на лого
    public static void getElementLogoPress() {
        XpathHelpers.getGeneralPage.getElementLogo.click();
    }

    //Нажать на кнопку 'Сравнить код'
    public static void getElementCompareTheCodePress() {
        XpathHelpers.getToolsPage.getElementCompareTheCode.click();
    }

    //Нажать на кнопку 'HTML символы в мнемоники'
    public static void getElementConverterPress() {
        XpathHelpers.getToolsPage.getElementConverter.click();
    }

    //Нажать на кнопку 'Какое разрешение у моего экрана?'
    public static void getElementScreenResolutionPress() {
        XpathHelpers.getToolsPage.getElementScreenResolution.click();
    }

    //Проверить заголовок 'Сравнить код онлайн'
    public static void getElementTitleCompareTheCodePage(String textTitle) {
        XpathHelpers.getCompareTheCodePage.getElementTitle.shouldHave(text(textTitle));
    }

    //Проверить заголовок 'Конвертер символов в мнемоники'
    public static void getElementTitleConverterPage(String textTitle) {
        XpathHelpers.getConverterPage.getElementTitle.shouldHave(text(textTitle));
    }

    //Проверить заголовок 'Какое разрешение у моего экрана?'
    public static void getElementTitleScreenResolutionPage(String textTitle) {
        XpathHelpers.getScreenResolutionPage.getElementTitle.shouldHave(text(textTitle));
    }

    //Нажать на вкладку 'HTML'
    public static void getElementHtmlTabPress() {
        XpathHelpers.getGeneralPage.getElementHtmlTab.click();
    }

    //Нажать на вкладку 'CSS'
    public static void getElementCssTabPress() {
        XpathHelpers.getGeneralPage.getElementCssTab.click();
    }

    //Нажать на вкладку 'Инструменты'
    public static void getElementToolsTabPress() {
        XpathHelpers.getGeneralPage.getElementToolsTab.click();
    }

    //Нажать на вкладку 'Иконки'
    public static void getElementIconsTabPress() {
        XpathHelpers.getGeneralPage.getElementIconsTab.click();
    }

    //Нажать на вкладку 'Контакты'
    public static void getElementContactsTabPress() {
        XpathHelpers.getGeneralPage.getElementContactsTab.click();
    }

    //Проверить плейсхолдер 'Имя' в разделе 'Контакты'
    public static void getElementPlaceholderName() {
        XpathHelpers.getContactPage.getElementInputName.shouldHave(attribute("placeholder", "Имя"));
    }

    //Проверить плейсхолдер 'Email' в разделе 'Контакты'
    public static void getElementPlaceholderEmail() {
        XpathHelpers.getContactPage.getElementInputEmail.shouldHave(attribute("placeholder", "Email"));
    }

    //Проверить плейсхолдер 'Тема' в разделе 'Контакты'
    public static void getElementPlaceholderSubject() {
        XpathHelpers.getContactPage.getElementInputSubject.shouldHave(attribute("placeholder", "Тема"));
    }

    //Проверить плейсхолдер 'Сообщение' в разделе 'Контакты'
    public static void getElementPlaceholderMessage() {
        XpathHelpers.getContactPage.getElementTextareaMessage.shouldHave(attribute("placeholder", "Сообщение"));
    }

    //Ввести значение в поле 'Имя' в разделе 'Контакты'
    public static void getElementNameInputText(String text) {
        XpathHelpers.getContactPage.getElementInputName.setValue(text);
    }

    //Ввести значение в поле 'Email' в разделе 'Контакты'
    public static void getElementEmailInputText(String text) {
        XpathHelpers.getContactPage.getElementInputEmail.setValue(text);
    }

    //Ввести значение в поле 'Тема' в разделе 'Контакты'
    public static void getElementSubjectInputText(String text) {
        XpathHelpers.getContactPage.getElementInputSubject.setValue(text);
    }

    //Ввести значение в поле 'Сообщение' в разделе 'Контакты'
    public static void getElementMessageInputText(String text) {
        XpathHelpers.getContactPage.getElementTextareaMessage.setValue(text);
    }

    //Нажать на кнопку 'Отправить'
    public static void getElementSendButtonPress() {
        XpathHelpers.getContactPage.getElementSendButton.click();
    }

    //Проверить сообщение об успешной отправке 'Ваше сообщение отправлено, спасибо.'
    public static void getElementSuccessMessageTitle(String textTitle) {
        XpathHelpers.getContactPage.getElementSuccessMessage.shouldHave(text(textTitle));
    }

    //Проверить отсутствие сообщения об успешной отправке 'Ваше сообщение отправлено, спасибо.'
    public static void getElementAbsentSuccessMessageTitle() {
        $(XpathHelpers.getContactPage.getElementSuccessMessage).shouldNot(visible);
    }

    //Нажать на кнопку 'На главную'
    public static void getElementGoGeneralPageButtonPress() {
        XpathHelpers.getContactPage.getElementGoGeneralPageButton.click();
    }

    //Проверить заголовок поля 'Оригинальный текст'
    public static void getElementOriginalTextTitle(String textTitle) {
        XpathHelpers.getCompareTheCodePage.getElementOriginalText.shouldHave(text(textTitle));
    }

    //Проверить заголовок поля 'Измененный текст'
    public static void getElementModifiedTextTitle(String textTitle) {
        XpathHelpers.getCompareTheCodePage.getElementModifiedText.shouldHave(text(textTitle));
    }

    //Ввести значение в поле 'Оригинальный текст'
    public static void getElementTextareaBaseTextInput(String text) {
        XpathHelpers.getCompareTheCodePage.getElementTextareaBaseText.setValue(text);
    }

    //Ввести значение в поле 'Измененный текст'
    public static void getElementTextareaNewTextInput(String text) {
        XpathHelpers.getCompareTheCodePage.getElementTextareaNewText.setValue(text);
    }

    //Нажать на кнопку 'Сравнить'
    public static void getElementCompareButtonPress() {
        XpathHelpers.getCompareTheCodePage.getElementCompareButton.click();
    }

    //Проверить сообщение 'Тексты идентичны.'
    public static void getElementIdenticalTextTitle(String textTitle) {
        XpathHelpers.getCompareTheCodePage.getElementIdenticalText.shouldHave(text(textTitle));
    }

    //Проверить отсутствие сообщения 'Тексты идентичны.'
    public static void getElementAbsentIdenticalTextTitle() {
        $(XpathHelpers.getCompareTheCodePage.getElementIdenticalText).shouldNot(visible);
    }
}