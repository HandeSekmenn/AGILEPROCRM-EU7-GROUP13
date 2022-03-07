package com.agileprocrm.step_definitions;

import com.agileprocrm.pages.LoginPage;
import com.agileprocrm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class findEmployees extends LoginPage {

        @When("user writes {string} in searchbox and hits the enter")
    public void user_writes_in_searchbox_and_hits_the_enter(String string) throws InterruptedException {
        loginAsHR();
        WebElement searchBox= Driver.get().findElement(By.id("search-textbox-input"));
        searchBox.sendKeys("employees");
        Thread.sleep(2500);
        WebElement abc = Driver.get().findElement(By.className("search-title-top-item-link"));
       abc.click();
        // searchBox.sendKeys(Keys.ENTER);

    }

    @Then("the user should be navigated to the company employees page")
    public void the_user_should_nbe_navigated_to_the_company_employees_page() {
        String actualTitle = Driver.get().getCurrentUrl();
        String expectedTitle = "https://qa.agileprocrm.com/company/vis_structure.php";
        Assert.assertEquals(expectedTitle,actualTitle);

    }

    @When("user clicks on find employee")
    public void user_clicks_on_find_employee() {

        WebElement findemployeesFrame = Driver.get().findElement(By.id("maininterfacebuttons-tmp-frame-top_menu_id_company"));
        Driver.get().switchTo().frame(findemployeesFrame);
        Driver.get().findElement(By.className("webform-small-button-text")).click();

        //BURAYA TEKRAR BAK

    }

    @Then("the user should be able to display the find employee page")
    public void the_user_should_be_able_to_display_the_find_employee_page() {
        String actualURL = Driver.get().getCurrentUrl();
        String expectedURL = "https://qa.agileprocrm.com/company/index.php";
        Assert.assertEquals(expectedURL,actualURL);
    }

    @When("the user write {string} to the search box on the page and hits the enter")
    public void the_user_write_to_the_search_box_on_the_page_and_hits_the_enter(String string) {
        WebElement writeEmployeeName = Driver.get().findElement(By.id("user-fio"));
        writeEmployeeName.sendKeys("Murad");
        writeEmployeeName.sendKeys(Keys.ENTER);

    }

    @Then("the user should be able to display {string}")
    public void the_user_should_be_able_to_display(String string) {
        String actualURL = Driver.get().getCurrentUrl();
        String expectedURL = "https://qa.agileprocrm.com/company/?show_user=active&current_filter=adv&company_search_FIO=Murad&set_filter_company_search=Y";
        Assert.assertEquals(expectedURL,actualURL);

    }



}
