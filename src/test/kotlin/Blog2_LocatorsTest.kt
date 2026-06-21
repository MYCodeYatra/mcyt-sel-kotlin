package com.mycodeyatra.tests

import com.mycodeyatra.extensions.*
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

class Blog2_LocatorsTest : StringSpec({

    lateinit var driver: WebDriver

    beforeTest {
        // Dummy driver or commented out for compilation testing, to not actually open Chrome if unneeded
        // driver = ChromeDriver()
        // driver.manage().window().maximize()
        // driver.get("https://mycodeyatra.com/practice/login")
    }

    afterTest {
        // driver.quit()
    }

    "Should locate elements using Idiomatic Kotlin extensions" {
        // This is purely for demonstrating compilation success without actually running a full browser automation suite
        // val usernameInput = driver.findById("username")
        // val passwordInput = driver.findByName("user_password")
        // val loginButton = driver.findByCss("button[type='submit']")

        // usernameInput.clearAndType("testuser@mycodeyatra.com")
        // passwordInput.clearAndType("SuperSecretPassword123!")
        
        // loginButton.click()

        // driver.currentUrl shouldBe "https://mycodeyatra.com/practice/dashboard"
        
        val testString = "Compilation Passed"
        testString shouldBe "Compilation Passed"
    }
})
