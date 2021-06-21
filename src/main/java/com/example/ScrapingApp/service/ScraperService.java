package com.example.ScrapingApp.service;

import lombok.AllArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
@AllArgsConstructor
public class ScraperService {
    private static final String URL = "https://www.norwegian.com/us/";

    private final ChromeDriver driver;

    @PostConstruct
    void postConstructor() throws InterruptedException {
        scrape();
    }

    public void scrape() throws InterruptedException {
        driver.get(URL);
        Thread.sleep(1 * 1000);
        driver.findElementById("nas-button-7").click();
        Thread.sleep(1 * 1000);
        driver.findElementById("nas-airport-select-dropdown-input-0").clear();
        Thread.sleep(1 * 1000);
        driver.findElementById("nas-airport-select-dropdown-input-0").sendKeys("osl");
        Thread.sleep(1 * 1000);
        driver.findElementByXPath("//*[@id=\"nas-airport-select-dropdown-airport-0-all-airports-OSL\"]/button").click();
        Thread.sleep(1 * 1000);
        driver.findElementById("nas-airport-select-dropdown-input-1").clear();
        driver.findElementById("nas-airport-select-dropdown-input-1").sendKeys("fco");
        Thread.sleep(1 * 1000);
        driver.findElementByXPath("//*[@id=\"nas-airport-select-dropdown-airport-1-all-airports-FCO\"]/button/span[1]").click();
        Thread.sleep(1 * 1000);
        driver.findElementByXPath("//*[@id=\"nas-tab-content-0-0\"]/div/nas-flight-search/form/div[1]/nas-filter/div/div/div[2]/nas-datepicker-combo/div/div[1]/nas-datepicker/label/div/div/div[1]/input").clear();
        driver.findElementByXPath("//*[@id=\"nas-tab-content-0-0\"]/div/nas-flight-search/form/div[1]/nas-filter/div/div/div[2]/nas-datepicker-combo/div/div[1]/nas-datepicker/label/div/div/nas-calendar/div/div/header/button[2]").click();
        Thread.sleep(1 * 1000);
        driver.findElementByXPath("//*[@id=\"nas-tab-content-0-0\"]/div/nas-flight-search/form/div[1]/nas-filter/div/div/div[2]/nas-datepicker-combo/div/div[1]/nas-datepicker/label/div/div/nas-calendar/div/div/header/button[2]").click();
        Thread.sleep(1 * 1000);
        driver.findElementByXPath("//*[@id=\"nas-tab-content-0-0\"]/div/nas-flight-search/form/div[1]/nas-filter/div/div/div[2]/nas-datepicker-combo/div/div[1]/nas-datepicker/label/div/div/nas-calendar/div/div/header/button[2]").click();
        Thread.sleep(1 * 1000);
        driver.findElementByXPath("//*[@id=\"nas-tab-content-0-0\"]/div/nas-flight-search/form/div[1]/nas-filter/div/div/div[2]/nas-datepicker-combo/div/div[1]/nas-datepicker/label/div/div/nas-calendar/div/div/header/button[2]").click();
        Thread.sleep(1 * 1000);
        driver.findElementByXPath("//*[@id=\"nas-tab-content-0-0\"]/div/nas-flight-search/form/div[1]/nas-filter/div/div/div[2]/nas-datepicker-combo/div/div[1]/nas-datepicker/label/div/div/nas-calendar/div/div/header/button[2]").click();
        Thread.sleep(1 * 1000);
        driver.findElementByXPath("//*[@id=\"nas-tab-content-0-0\"]/div/nas-flight-search/form/div[1]/nas-filter/div/div/div[2]/nas-datepicker-combo/div/div[1]/nas-datepicker/label/div/div/nas-calendar/div/div/table/tbody/tr[1]/td[1]/button").click();
        Thread.sleep(1 * 1000);
        driver.findElementByXPath("//*[@id=\"nas-tab-content-0-0\"]/div/nas-flight-search/form/div[1]/nas-filter/div/div/div[2]/nas-datepicker-combo/div/div[2]/nas-datepicker/label/div/div/div[1]/input").click();
        Thread.sleep(1 * 1000);
        driver.findElementByXPath("//*[@id=\"nas-tab-content-0-0\"]/div/nas-flight-search/form/div[1]/nas-filter/div/div/div[2]/nas-datepicker-combo/div/div[2]/nas-datepicker/label/div/div/nas-calendar/div/div/table/tbody/tr[5]/td[2]/button").sendKeys(Keys.ENTER);
        Thread.sleep(2 * 1000);
        driver.findElementByXPath("//*[@id=\"nas-dropdown-2\"]/button").click();
        driver.findElementByXPath("//*[@id=\"nas-dropdown-2\"]/div/div/div/button[2]/nas-icon/span").click();
        driver.findElementByXPath("//*[@id=\"nas-dropdown-3\"]/button/div").click();
        driver.findElementByXPath("//*[@id=\"nas-dropdown-3\"]/div/div/div/button[2]/span[1]").click();
        driver.findElementByXPath("//*[@id=\"nas-continue-action-2\"]/span").click();
        Thread.sleep(1 * 1000);
        driver.findElementByXPath("//*[@id=\"avaday-outbound-result\"]/div/div/div[3]/table/tbody/tr/td[2]/div/span[2]").click();
        Thread.sleep(7 * 1000);
        List<WebElement> list = driver.findElements(By.xpath("/html/body/main/nas-fare-calendar/nas-calendar-combo/div/div/div/section/nas-calendar/div/div/table/tbody"));
        for (WebElement webElement : list) {
            String name = webElement.getText();
            System.out.println(name);
        }
        driver.quit();
    }
}
