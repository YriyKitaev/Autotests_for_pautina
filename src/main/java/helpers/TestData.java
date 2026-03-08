package helpers;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import internal_directory.InternalDirectory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class TestData {
    public static String randomShortString = TestData.getRandomString(10);;
    public static String randomMediumString = TestData.getRandomString(50);;
    public static String randomLongString = TestData.getRandomString(200);

    /**
     Получить рандомный HTML тэг
     **/
    public static String randomValueHtmlTag() {
        List<String> valuesHtml = Arrays.asList("div", "address", "span", "main", "textarea");
        Random random = new Random();
        int randomIndex = random.nextInt(valuesHtml.size());
        return valuesHtml.get(randomIndex);
    }

    /**
     Получить рандомное CSS свойство
     **/
    public static String randomValueCssSelector() {
        List<String> valuesCss = Arrays.asList("padding-top", "margin-bottom", "max-height", "border-radius", "z-index");
        Random random = new Random();
        int randomIndex = random.nextInt(valuesCss.size());
        return valuesCss.get(randomIndex);
    }

    /**
     * Наводим курсор на рандомную иконку
     */
    public static void hoverRandomElement() {
        // Находим все элементы по селектору
        ElementsCollection elements = Selenide.elements(By.xpath("//section[@class='mini-icons']/a"));
        // Генерируем случайный индекс
        Random random = new Random();
        int randomIndex = random.nextInt(elements.size());
        // Получаем случайный элемент и наводим курсор
        elements.get(randomIndex).hover();
    }


    /**
     Сгенерировать рандомную строку
     **/
    public static String getRandomString(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(chars.length());
            sb.append(chars.charAt(index));
        }
        return sb.toString();
    }

    /**
     Негативная проверка поисковой строки на главной странице
     **/
    public static void checkSearchBar() {
        ActionHelper.getElementSearchInputText(randomShortString);
        ActionHelper.getElementNotFoundMessageAssert(InternalDirectory.GeneralPageList.NO_RESULTS_WERE_FOUND);
        XpathHelpers.getGeneralPage.getElementSearchInput.clear();
        ActionHelper.getElementSearchInputText(randomMediumString);
        ActionHelper.getElementNotFoundMessageAssert(InternalDirectory.GeneralPageList.NO_RESULTS_WERE_FOUND);
        XpathHelpers.getGeneralPage.getElementSearchInput.clear();
        ActionHelper.getElementSearchInputText(randomLongString);
        ActionHelper.getElementNotFoundMessageAssert(InternalDirectory.GeneralPageList.NO_RESULTS_WERE_FOUND);
        XpathHelpers.getGeneralPage.getElementSearchInput.clear();
        ActionHelper.getElementSearchInputText("  ");
        ActionHelper.getElementNotFoundMessageAssert(InternalDirectory.GeneralPageList.NO_RESULTS_WERE_FOUND);
        XpathHelpers.getGeneralPage.getElementSearchInput.clear();
        ActionHelper.getElementSearchInputText("!№%:,.;()_+=-");
        ActionHelper.getElementNotFoundMessageAssert(InternalDirectory.GeneralPageList.NO_RESULTS_WERE_FOUND);
        XpathHelpers.getGeneralPage.getElementSearchInput.clear();
        ActionHelper.getElementSearchInputText("0.1");
        ActionHelper.getElementNotFoundMessageAssert(InternalDirectory.GeneralPageList.NO_RESULTS_WERE_FOUND);
        XpathHelpers.getGeneralPage.getElementSearchInput.clear();
        ActionHelper.getElementSearchInputText("div ");
        ActionHelper.getElementNotFoundMessageAssert(InternalDirectory.GeneralPageList.NO_RESULTS_WERE_FOUND);
        XpathHelpers.getGeneralPage.getElementSearchInput.clear();
    }
}
