//Тест https://ya.ru/ проверка авторизации

package Others;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class Thirdtest {

    @Test
    public void Thirdtest() throws InterruptedException {
        //Запуск вебдрайвера (тут у меня сохранена актуальная версия хромдрайвера)
        WebDriver driver = new ChromeDriver();
        //Раскрыть окно браузера на максимум
        driver.manage().window().maximize();
        //Переход на сайт
        driver.get("https://ya.ru/");
        WebElement enterButton = driver.findElement(By.xpath("//a[@data-statlog=\"2headline.enter\"]"));
        enterButton.click();

        Thread.sleep(2000);

        // Найти элемент по локатору (например, ID, XPath, CSS-селектор)
        WebElement element = driver.findElement(By.xpath("//div[text()=\"Чтобы войти или зарегистрироваться\"]"));
        // Получить текст элемента
        String elementText = element.getText();
        // Проверить, содержит ли текст ожидаемый текст
        assertTrue("Element text does not contain expected text", elementText.contains("Чтобы войти или зарегистрироваться"));
        //Тут отправляем сообщение в консоль работает или нет
        if (elementText.equals("Чтобы войти или зарегистрироваться")) {
            System.out.print("Ура, работает!!!");
        } else {
            System.out.print("Попробоуй по другому");
        };

        WebElement otherButton = driver.findElement(By.xpath("//a[@id=\"passp:exp-register\"]"));
        otherButton.click();

        Thread.sleep(2000);

        WebElement mailReg = driver.findElement(By.xpath("(//button[@class=\"RegistrationButtonPopup-itemButton\"])[3]"));
        mailReg.click();

        Thread.sleep(2000);

        WebElement mail = driver.findElement(By.xpath("//input[@id=\"passp-field-login\"]"));
        mail.sendKeys("KitaevYriy@yandex.ru");

        WebElement loginButton = driver.findElement(By.xpath("//button[@id=\"passp:sign-in\"]"));
        loginButton.click();

        //Thread.sleep(2000);

        // Найти элемент по локатору (например, ID, XPath, CSS-селектор)
        //WebElement elementToo = driver.findElement(By.xpath("//span[@class=\"TitleWithDeviceList\"]"));
        // Получить текст элемента
        //String elementTooText = elementToo.getText();
        // Проверить, содержит ли текст ожидаемый текст
        //assertTrue("Element text does not contain expected text", elementText.contains("Выберите такую картинку в "));



        driver.quit();
    }
}
