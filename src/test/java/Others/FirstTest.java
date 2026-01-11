//Тест сайта https://demo.automationtesting.in/ регистрация на сайте

package Others;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    @Test
    public void FirstTest() throws InterruptedException {
        //Спотоб как указать путь к вебдрайверу
        //System.setProperty("webdriver.chrome.driver", "/Users/yriykitaev/Downloads/chromedriver-mac-arm64/chromedriver");

        //Запуск вебдрайвера (тут у меня сохранена актуальная версия хромдрайвера)
        WebDriver driver = new ChromeDriver();

        //Раскрыть окно браузера на максимум
        driver.manage().window().maximize();

        //Переход на сайт
        driver.get("https://demo.automationtesting.in/");

        WebElement moveButton = driver.findElement(By.xpath("//img[@id=\"enterimg\"]"));
        moveButton.click();

        WebElement firstName = driver.findElement(By.xpath("//input[@ng-model=\"FirstName\"]"));
        firstName.sendKeys("MyFirstName");

        WebElement LastName = driver.findElement(By.xpath("//input[@ng-model=\"LastName\"]"));
        LastName.sendKeys("LastName");

        WebElement Address = driver.findElement(By.xpath("//input[@ng-model=\"EmailAdress\"]"));
        Address.sendKeys("kldjfh@skdjfh.yr");

        WebElement Phone = driver.findElement(By.xpath("//input[@ng-model=\"Phone\"]"));
        Phone.sendKeys("89795938475");

        WebElement Gender = driver.findElement(By.xpath("//input[@value=\"Male\"]"));
        Gender.click();

        //Кликаем в дропдаун и выбираем значение из списка по наименованию
        WebElement Country = driver.findElement(By.xpath("//span[@class=\"select2-selection__arrow\"]"));
        Country.click();
        WebElement CountrySelect = driver.findElement(By.xpath("//li[text()='Netherlands']"));
        CountrySelect.click();

        WebElement submitbButton = driver.findElement(By.xpath("//button[@id=\"submitbtn\"]"));
        submitbButton.click();

        //Остановка выполнения текущего потока на определённый период времени
        Thread.sleep(3000);

        //Выключаем драйвер
        driver.quit();

    }
}
