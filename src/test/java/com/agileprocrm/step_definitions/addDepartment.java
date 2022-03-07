package com.agileprocrm.step_definitions;

import com.agileprocrm.pages.LoginPage;
import com.agileprocrm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class addDepartment extends LoginPage {

    @When("user clicks on {string}")
    public void user_clicks_on() {
        loginAsHR();
        WebElement searchBox= Driver.get().findElement(By.id("search-textbox-input"));
        searchBox.sendKeys("Company Structure");
        WebElement companyStructure = Driver.get().findElement(By.id("pagetitle-menu"));
        companyStructure.click();
       // WebElement addDepartmentFrame = Driver.get().findElement(By.id("maininterfacebuttons-tmp-frame-top_menu_id_company"));
        //Driver.get().switchTo().frame(addDepartmentFrame);
        //addDepartmentFrame.click();

    }
    @When("user writes {string} in the box and clicks on {string}")
    public void user_writes_in_the_box_and_clicks_on(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user should be able to display the new department on the page")
    public void user_should_be_able_to_display_the_new_department_on_the_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
