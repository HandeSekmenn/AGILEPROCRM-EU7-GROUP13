package com.agileprocrm.step_definitions;

import com.agileprocrm.pages.LoginPage;
import com.agileprocrm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class employeeAlphabetical extends LoginPage {

    @When("the user clicks on {string}")
    public void the_user_clicks_on(String string) {
        WebElement searchAlphabet=Driver.get().findElement(By.id("filter-but-ABC"));
        searchAlphabet.click();
    }

    @Then("the letter filters should appear on the page")
    public void the_letter_filters_should_appear_on_the_page() {
        Driver.get().findElement(By.id("employee-ABC-block")).isEnabled();
    }

    @When("the user clicks on the letter B")
    public void the_user_clicks_on_the_letter_B() {
        WebElement letterB= Driver.get().findElement(By.xpath("//*[@id=\"popup-window-content-employee-ABC-block\"]/div/a[13]"));
        letterB.click();
    }

    @Then("the user should display the {string} employee")
    public void the_user_should_display_the_employee(String string) {
        String actualURL = Driver.get().getCurrentUrl();
        String expectedURL = "https://qa.agileprocrm.com/company/?set_filter_company_search=Y&company_search_LAST_NAME=B%25&show_user=active";
        Assert.assertEquals(expectedURL,actualURL);
    }
}
