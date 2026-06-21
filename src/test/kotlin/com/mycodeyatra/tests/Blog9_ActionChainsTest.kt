package com.mycodeyatra.tests

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.string.shouldContain
import org.openqa.selenium.By
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.interactions.Actions
import java.time.Duration

class Blog9_ActionChainsTest : StringSpec({
    lateinit var driver: WebDriver
    lateinit var actions: Actions

    beforeTest {
        val options = ChromeOptions().apply {
            addArguments("--headless=new")
            addArguments("--disable-gpu")
            addArguments("--window-size=1920,1080")
        }
        driver = ChromeDriver(options)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5))
        driver.manage().window().maximize()
        actions = Actions(driver)
    }

    afterTest {
        driver.quit()
    }

    "Should perform complex mouse and keyboard interactions using Actions class" {
        println("[INFO] Running com.mycodeyatra.tests.Blog9_ActionChainsTest")
        driver.get("https://practice.mycodeyatra.com/#/form-practice")
        println("Navigated to Form Practice Page.")

        // 1. MOUSE HOVER
        println("\n--- 1. MOUSE HOVER (moveToElement) ---")
        val submitBtn = driver.findElement(By.xpath("//button[text()='Submit Form']"))
        actions.moveToElement(submitBtn).perform()
        println("Successfully hovered over the Submit Button.")

        // 2. DOUBLE CLICK
        println("\n--- 2. DOUBLE CLICK ---")
        val clearBtn = driver.findElement(By.xpath("//button[text()='Clear']"))
        actions.doubleClick(clearBtn).perform()
        println("Successfully double-clicked the Clear Button.")

        // 3. RIGHT CLICK (Context Click)
        println("\n--- 3. RIGHT CLICK (contextClick) ---")
        val header = driver.findElement(By.tagName("h2"))
        actions.contextClick(header).perform()
        println("Successfully right-clicked the Form Header.")

        // 4. KEYBOARD ACTIONS (Chaining)
        println("\n--- 4. KEYBOARD ACTIONS ---")
        val fullNameInput = driver.findElement(By.name("fullName"))
        
        // Click into the input, hold SHIFT, type text (it will be uppercase), release SHIFT
        actions.click(fullNameInput)
            .keyDown(Keys.SHIFT)
            .sendKeys("actions class rocks")
            .keyUp(Keys.SHIFT)
            .perform()
            
        val enteredText = fullNameInput.getAttribute("value")
        println("Typed text using Keyboard Shift: $enteredText")
        
        enteredText shouldContain "ACTIONS CLASS ROCKS"
        println("\nActions script executed successfully!")
    }
})
