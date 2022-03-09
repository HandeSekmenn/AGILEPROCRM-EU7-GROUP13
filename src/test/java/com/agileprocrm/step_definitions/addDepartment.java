package com.agileprocrm.step_definitions;

import com.agileprocrm.pages.LoginPage;
import com.agileprocrm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class addDepartment extends LoginPage {

    @When("user writes {string} in the box and clicks on {string}")
    public void user_writes_in_the_box_and_clicks_on(String string, String string2) {
        WebElement searchBox= Driver.get().findElement(By.id("search-textbox-input"));
        searchBox.sendKeys("Company Structure");
        WebElement companyStructure = Driver.get().findElement(By.id("pagetitle-menu"));
        companyStructure.click();
    }

    @Then("user should be able to display the company structure.")
    public void user_should_be_able_to_display_the_company_structure() {
        String actualURL=Driver.get().getCurrentUrl();
        String expectedURL="https://qa.agileprocrm.com/company/vis_structure.php";
        Assert.assertEquals(actualURL,expectedURL);
    }

    @When("user clicks on add department")
    public void user_clicks_on(String string) {
        WebElement addDepartment = Driver.get().findElement(By.className(".webform-small-button-text"));
        addDepartment.click();
    }

    @When("user writes {string} in the box and clicks on add")
    public void user_writes_in_the_box_and_clicks_on() {
    WebElement box=Driver.get().findElement(By.id("NAME"));
    box.sendKeys("department name");
    WebElement addButton = Driver.get().findElement(By.id("Add"));
    addButton.click();

    }

    @Then("user should be able to display the new department on the page")
    public void user_should_be_able_to_display_the_new_department_on_the_page() {

    //find in page ?
    }





}
