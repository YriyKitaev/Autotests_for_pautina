package helpers;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class XpathHelpers {

    /**
     Xpath элементы начальной страницы
     **/
    public static final class getGeneralPage {
        public static final SelenideElement getElementParagraph = $(By.xpath("//p[contains(@class, 'documentation-search__intro')]"));
        public static final SelenideElement getElementHtmlButton = $(By.xpath("//a[contains(@class, 'documentation__button-html')]"));
        public static final SelenideElement getElementCssButton = $(By.xpath("//a[contains(@class, 'documentation__button-css')]"));
        public static final SelenideElement getElementSearchInput = $(By.xpath("//input[contains(@class, 'documentation-search__input')]"));
        public static final SelenideElement getElementResult = $(By.xpath("//a[contains(@class, 'documentation-search__tag-link')]"));
        public static final SelenideElement getElementLogo = $(By.xpath("//a[contains(@class, 'logo')]"));
        public static final SelenideElement getElementNotFoundMessage = $(By.xpath("//div[contains(@class, 'documentation-search__no-results')]"));
        public static final SelenideElement getElementHtmlTab = $(By.xpath("//a[@class='navbar__item' and text()='HTML']"));
        public static final SelenideElement getElementCssTab = $(By.xpath("//a[@class='navbar__item' and text()='CSS']"));
        public static final SelenideElement getElementToolsTab = $(By.xpath("//a[@class='navbar__item' and text()='Инструменты']"));
        public static final SelenideElement getElementIconsTab = $(By.xpath("//a[@class='navbar__item' and text()='Иконки']"));
        public static final SelenideElement getElementContactsTab = $(By.xpath("//a[@class='navbar__item' and text()='Контакты']"));
    }

    /**
     Xpath элементы страницы 'HTML'
     **/
    public static final class getHtmlPage {
        public static final SelenideElement getElementHtmlTitle = $(By.xpath("//h1[@class='docs-overview__heading' and text()='HTML']"));
        public static final SelenideElement getElementHtmlTab = $(By.xpath("//span[(@itemprop='name') and (text()='HTML')]"));
    }

    /**
     Xpath элементы страницы 'CSS'
     **/
    public static final class getCssPage {
        public static final SelenideElement getElementCsslTitle = $(By.xpath("//h1[@class='docs-overview__heading' and text()='CSS']"));
        public static final SelenideElement getElementCssTab = $(By.xpath("//span[(@itemprop='name') and (text()='CSS')]"));
    }

    /**
     Xpath элементы страницы 'Инструменты'
     **/
    public static final class getToolsPage {
        public static final SelenideElement getElementCompareTheCode = $(By.xpath("//a[contains(@href, '/sravnit-kod/')]"));
        public static final SelenideElement getElementConverter = $(By.xpath("//a[contains(@href, '/konverter/')]"));
        public static final SelenideElement getElementScreenResolution = $(By.xpath("//a[contains(@href, '/razresheniye-ekrana/')]"));
        public static final SelenideElement getElementToolTab = $(By.xpath("//span[(@itemprop='name') and (text()='Инструменты')]"));
    }

    /**
     Xpath элементы страницы 'Сравнить код'
     **/
    public static final class getCompareTheCodePage {
        public static final SelenideElement getElementTitle = $(By.xpath("//span[contains(text(), 'Сравнить код онлайн')]"));
        public static final SelenideElement getElementOriginalText = $(By.xpath("//h2[contains(text(), 'Оригинальный текст')]"));
        public static final SelenideElement getElementModifiedText = $(By.xpath("//h2[contains(text(), 'Изменённый текст')]"));
        public static final SelenideElement getElementTextareaBaseText = $(By.xpath("//textarea[contains(@id, 'baseText')]"));
        public static final SelenideElement getElementTextareaNewText = $(By.xpath("//textarea[contains(@id, 'newText')]"));
        public static final SelenideElement getElementCompareButton = $(By.xpath("//button[contains(@class, 'code-diff__button-compare')]"));
        public static final SelenideElement getElementIdenticalText = $(By.xpath("//div[contains(@class, 'message__identical')]"));
    }

    /**
     Xpath элементы страницы 'HTML символы в мнемоники'
     **/
    public static final class getConverterPage {
        public static final SelenideElement getElementTitle = $(By.xpath("//span[contains(text(), 'Конвертер символов в мнемоники')]"));
    }

    /**
     Xpath элементы страницы 'Какое разрешение у моего экрана?'
     **/
    public static final class getScreenResolutionPage {
        public static final SelenideElement getElementTitle = $(By.xpath("//h1[contains(@class, 'resolution__header')]"));
        public static final SelenideElement getElementMediaResolutionTitle = $(By.xpath("//div[contains(@class, 'resolution__media')]/span[contains(@class, 'resolution__label')]"));
        public static final SelenideElement getElementPhysicalResolutionTitle = $(By.xpath("//div[contains(@class, 'resolution__physical')]/span[contains(@class, 'resolution__label')]"));
        public static final SelenideElement getElementViewportSizeTitle = $(By.xpath("//div[contains(@class, 'resolution__viewport')]/span[contains(@class, 'resolution__label')]"));
        public static final SelenideElement getElementBrowserWindowSizeTitle = $(By.xpath("//div[contains(@class, 'resolution__browser')]/span[contains(@class, 'resolution__label')]"));
        public static final SelenideElement getElementMediaResolutionValue = $(By.xpath("//div[contains(@class, 'resolution__media')]/span[contains(@class, 'resolution__value')]"));
        public static final SelenideElement getElementPhysicalResolutionValue = $(By.xpath("//div[contains(@class, 'resolution__physical')]/span[contains(@class, 'resolution__value')]"));
        public static final SelenideElement getElementViewportSizeValue = $(By.xpath("//div[contains(@class, 'resolution__viewport')]/span[contains(@class, 'resolution__value')]"));
        public static final SelenideElement getElementBrowserWindowSizeValue = $(By.xpath("//div[contains(@class, 'resolution__browser')]/span[contains(@class, 'resolution__value')]"));
    }

    /**
     Xpath элементы страницы 'Иконки'
     **/
    public static final class getIconPage {
        public static final SelenideElement getElementIconTitle = $(By.xpath("//h1[@class='icons__header' and text()='SVG иконки']"));
        public static final SelenideElement getElementIconUseRulesTab = $(By.xpath("//a[@class='icons-licence__link' and text()='Правила пользования иконками']"));
        public static final SelenideElement getElementHowUseIconTab = $(By.xpath("//h1[@class='icons__header' and text()='Как можно использовать иконки?']"));
        public static final SelenideElement getSectionIcon = $(By.xpath("//section[@class='mini-icons']"));
        public static final SelenideElement getElementIcon = $(By.xpath("//section[@class='mini-icons']/a"));
        public static final SelenideElement getDownloadIconButton = $(By.xpath("//a[@class='mini-icons__download-icon']"));
        public static final SelenideElement getCopyIconButton = $(By.xpath("//a[@class='mini-icons__copy-icon']"));
        public static final SelenideElement getElementSuccessCopyMessage = $(By.xpath("//div[@class='copy-success copy-success--shown']"));
    }

    /**
     Xpath элементы страницы 'Контакты'
     **/
    public static final class getContactPage {
        public static final SelenideElement getElementContactTitle = $(By.xpath("//h2[contains(text(), 'Контактная форма')]"));
        public static final SelenideElement getElementInputName = $(By.xpath("//input[contains(@name, 'name')]"));
        public static final SelenideElement getElementInputEmail = $(By.xpath("//input[contains(@name, 'email')]"));
        public static final SelenideElement getElementInputSubject = $(By.xpath("//input[contains(@name, 'subject')]"));
        public static final SelenideElement getElementTextareaMessage = $(By.xpath("//textarea[contains(@name, 'message')]"));
        public static final SelenideElement getElementSendButton = $(By.xpath("//button[contains(@id, 'contact-submit')]"));
        public static final SelenideElement getElementSuccessMessage = $(By.xpath("//div[contains(@class, 'container')]/p"));
        public static final SelenideElement getElementGoGeneralPageButton = $(By.xpath("//a[contains(text(), 'На главную')]"));
    }
}