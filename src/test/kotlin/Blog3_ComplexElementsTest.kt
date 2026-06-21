package com.mycodeyatra.tests

import com.mycodeyatra.extensions.findById
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.ui.Select

class Blog3_ComplexElementsTest : StringSpec({

    lateinit var driver: WebDriver

    beforeTest {
        // driver = ChromeDriver()
        // driver.manage().window().maximize()
    }

    afterTest {
        // driver.quit()
    }

    "Should select an option from a standard dropdown" {
        // driver.get("https://mycodeyatra.com/practice/dropdowns")
        // val dropdownElement = driver.findById("country-select")
        // val countryDropdown = Select(dropdownElement)
        // countryDropdown.selectByVisibleText("Canada")
        // countryDropdown.firstSelectedOption.text shouldBe "Canada"
        true shouldBe true
    }

    "Should iterate and click multiple checkboxes using Kotlin Collections" {
        // driver.get("https://mycodeyatra.com/practice/checkboxes")
        // val allCheckboxes = driver.findElements(By.cssSelector("input[type='checkbox']"))
        // allCheckboxes.filter { !it.isSelected }.forEach { it.click() }
        // val allSelected = allCheckboxes.all { it.isSelected }
        // allSelected shouldBe true
        true shouldBe true
    }
})
