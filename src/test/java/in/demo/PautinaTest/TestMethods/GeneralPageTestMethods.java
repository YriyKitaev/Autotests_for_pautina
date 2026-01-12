package in.demo.PautinaTest.TestMethods;


import helpers.ActionHelper;
import helpers.TestData;
import helpers.WebDriverHelper;
import in.demo.PautinaTest.TestBase;
import org.junit.jupiter.api.DisplayName;

import static com.codeborne.selenide.Selenide.sleep;
import static internal_directory.InternalDirectory.CompareTheCodePageList.COMPARE_THE_CODE;
import static internal_directory.InternalDirectory.ContactsPageList.CONTACT_TITLE;
import static internal_directory.InternalDirectory.ConverterPageList.CONVERTER;
import static internal_directory.InternalDirectory.CssPageList.CSS_TITLE;
import static internal_directory.InternalDirectory.GeneralPageList.HTML_CSS_TITLE;
import static internal_directory.InternalDirectory.HtmlPageList.HTML_TITLE;
import static internal_directory.InternalDirectory.IconsPageList.ICON_TITLE;
import static internal_directory.InternalDirectory.ScreenResolutionPageList.SCREEN_RESOLUTION;
import static internal_directory.InternalDirectory.ToolsPageList.TOOL_TITLE;

@DisplayName(value = "Проверка начальной страницы сервиса")

public class GeneralPageTestMethods extends TestBase {

    @DisplayName("Проверка наличия текста 'Здесь вы можете найти документацию по HTML и CSS'")
    public static void testMethod_01() {
        //Запустить браузер
        WebDriverHelper.initWebDriver();
        //Подождать
        sleep(1000);
        //Проверить заголовок 'Здесь вы можете найти документацию по HTML и CSS'
        ActionHelper.getElementParagraphAssert(HTML_CSS_TITLE);
    }

    @DisplayName("Проверка проверка наличия и работы кнопки 'HTML'")
    public static void testMethod_02() {
        //Запустить браузер
        WebDriverHelper.initWebDriver();
        //Нажать на кнопку 'HTML'
        ActionHelper.getElementHtmlButtonPress();
        //Проверить заголовок 'HTML'
        ActionHelper.getElementHtmlTitleAssert(HTML_TITLE);
    }

    @DisplayName("Проверка проверка наличия и работы кнопки 'CSS'")
    public static void testMethod_03() {
        //Запустить браузер
        WebDriverHelper.initWebDriver();
        //Нажать на кнопку 'CSS'
        ActionHelper.getElementCssButtonPress();
        //Проверить заголовок 'CSS'
        ActionHelper.getElementCssTitleAssert(CSS_TITLE);
    }

    @DisplayName("Проверка наличия и работы поисковой строки")
    public static void testMethod_04() {
        //Запустить браузер
        WebDriverHelper.initWebDriver();
        //Ввести рандомный HTML тег
        ActionHelper.getElementSearchInputText(TestData.randomValueHtmlTag());
        //Выбрать искомый элемент
        ActionHelper.getElementResultPress();
        //Проверить заголовок 'HTML'
        ActionHelper.getElementHtmlFolderAssert(HTML_TITLE);
        //Нажать на лого (вернуться на главную страницу)
        ActionHelper.getElementLogoPress();
        //Ввести рандомный CSS селектор
        ActionHelper.getElementSearchInputText(TestData.randomValueCssSelector());
        //Выбрать искомый элемент
        ActionHelper.getElementResultPress();
        //Проверить заголовок 'CSS'
        ActionHelper.getElementCssFolderAssert(CSS_TITLE);
    }

    @DisplayName("Проверка наличия в футере инструмента 'Сравнить код' и переход к его странице")
    public static void testMethod_05() {
        //Запустить браузер
        WebDriverHelper.initWebDriver();
        //Нажать на кнопку 'Сравнить код'
        ActionHelper.getElementCompareTheCodePress();
        //Проверить заголовок 'Сравнить код онлайн'
        ActionHelper.getElementTitleCompareTheCodePage(COMPARE_THE_CODE);
    }

    @DisplayName("Проверка наличия в футере инструмента 'HTML символы в мнемоники' и переход к его странице")
    public static void testMethod_06() {
        //Запустить браузер
        WebDriverHelper.initWebDriver();
        //Нажать на кнопку 'HTML символы в мнемоники'
        ActionHelper.getElementConverterPress();
        //Проверить заголовок 'Конвертер символов в мнемоники'
        ActionHelper.getElementTitleConverterPage(CONVERTER);
    }

    @DisplayName("Проверка наличия в футере инструмента 'Какое разрешение у моего экрана?' и переход к его странице")
    public static void testMethod_07() {
        //Запустить браузер
        WebDriverHelper.initWebDriver();
        //Нажать на кнопку 'Какое разрешение у моего экрана?'
        ActionHelper.getElementScreenResolutionPress();
        //Проверить заголовок 'Какое разрешение у моего экрана?'
        ActionHelper.getElementTitleScreenResolutionPage(SCREEN_RESOLUTION);

    }

    @DisplayName("Проверка наличия и работы лого в хэдере")
    public static void testMethod_08() {
        //Запустить браузер
        WebDriverHelper.initWebDriver();
        //Нажать на кнопку 'Сравнить код'
        ActionHelper.getElementCompareTheCodePress();
        //Нажать на лого (вернуться на главную страницу)
        ActionHelper.getElementLogoPress();
        //Проверить заголовок 'Здесь вы можете найти документацию по HTML и CSS'
        ActionHelper.getElementParagraphAssert(HTML_CSS_TITLE);
    }

    @DisplayName("Негативная проверка поисковой строки")
    public static void testMethod_09() {
        //Запустить браузер
        WebDriverHelper.initWebDriver();
        //Негативная проверка поисковой строки
        TestData.checkSearchBar();
    }

    @DisplayName("Проверка наличия и работы вкладки HTML' в хэдере")
    public static void testMethod_10() {
        //Запустить браузер
        WebDriverHelper.initWebDriver();
        //Нажать на вкладку 'HTML'
        ActionHelper.getElementHtmlTabPress();
        //Проверить заголовок 'HTML'
        ActionHelper.getElementHtmlTitleAssert(HTML_TITLE);
    }

    @DisplayName("Проверка наличия и работы вкладки 'CSS' в хэдере")
    public static void testMethod_11() {
        //Запустить браузер
        WebDriverHelper.initWebDriver();
        //Нажать на вкладку 'CSS'
        ActionHelper.getElementCssTabPress();
        //Проверить заголовок 'CSS'
        ActionHelper.getElementCssTitleAssert(CSS_TITLE);
    }

    @DisplayName("Проверка наличия и работы вкладки 'Инструменты' в хэдере")
    public static void testMethod_12() {
        //Запустить браузер
        WebDriverHelper.initWebDriver();
        //Нажать на вкладку 'Инструменты'
        ActionHelper.getElementToolsTabPress();
        //Проверить заголовок 'Инструменты'
        ActionHelper.getElementToolTitleAssert(TOOL_TITLE);
    }

    @DisplayName("Проверка наличия и работы вкладки 'Иконки' в хэдере")
    public static void testMethod_13() {
        //Запустить браузер
        WebDriverHelper.initWebDriver();
        //Нажать на вкладку 'Иконки'
        ActionHelper.getElementIconsTabPress();
        //Проверить заголовок 'Иконки'
        ActionHelper.getElementIconTitleAssert(ICON_TITLE);
    }

    @DisplayName("Проверка наличия и работы вкладки 'Контакты' в хэдере")
    public static void testMethod_14() {
        //Запустить браузер
        WebDriverHelper.initWebDriver();
        //Нажать на вкладку 'Контакты'
        ActionHelper.getElementContactsTabPress();
        //Проверить заголовок 'Контакты'
        ActionHelper.getElementContactTitleAssert(CONTACT_TITLE);
    }
}













//        //Подождать (сек)
//        try {
//                Thread.sleep(1000); // пауза 2000 мс = 2 секунды
//        } catch (InterruptedException e) {
//        e.printStackTrace();
//        }

////Ретро тест через драйвер
//@DisplayName("Проверка проверка наличия и работы кнопки 'CSS'")
//public static void testMethod_03() {
//    //Запустить вебдрайвер, раскрыть окно браузера на максимум, перейти на нужный сайт
//    WebDriver driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get(InternalDirectory.GeneralUrl.START);
//    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//
//    //Найти и нажать на кнопку 'CSS'
//    WebElement CssButton = driver.findElement(By.xpath(XpathHelpers.getGeneralPage.getElementCssButton));
//    String CssButtonText = CssButton.getText();
//    assertTrue("Элемент отсутствует", CssButtonText.contains(InternalDirectory.GeneralPageList.CSS));
//    CssButton.click();
//
//    //Ожидаем когда элемент появится на странице
//    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XpathHelpers.getCssPage.getElementCssTitle)));
//    WebElement CssTitle = driver.findElement(By.xpath(XpathHelpers.getCssPage.getElementCssTitle));
//    String CssTitleText = CssTitle.getText();
//    assertTrue("Элемент отсутствует", CssTitleText.contains(InternalDirectory.GeneralPageList.CSS));
//
//    driver.quit();
//}