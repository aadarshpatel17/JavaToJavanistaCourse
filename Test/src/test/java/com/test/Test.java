package com.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class Test {

    public static void main(String[] args) {
        InternetExplorerOptions ieOptions = new InternetExplorerOptions();
        WebDriverManager.iedriver().browserVersion("11.0").setup();
        WebDriver driver = new InternetExplorerDriver(ieOptions);

        driver.get("https://www.amazon.com");
        driver.quit();
        System.out.println("success!");

    }

}
