package com.mycodeyatra.tests

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.string.shouldContain
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

class Blog1_SetupTest : StringSpec({

    lateinit var driver: WebDriver

    beforeTest {
        // Initialize Chrome Driver before each test
        driver = ChromeDriver()
        driver.manage().window().maximize()
    }

    afterTest {
        // Quit the driver after each test
        driver.quit()
    }

    "Should navigate to MyCodeYatra and verify title" {
        driver.get("https://mycodeyatra.com/")
        
        val title = driver.title
        println("Page Title: $title")
        
        // Kotest assertion
        title shouldContain "MyCodeYatra"
    }
})
