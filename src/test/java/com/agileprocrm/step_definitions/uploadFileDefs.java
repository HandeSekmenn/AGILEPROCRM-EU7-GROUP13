package com.agileprocrm.step_definitions;

import com.agileprocrm.pages.LoginPage;
import com.agileprocrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class uploadFileDefs extends LoginPage {

    WebDriver driver;

    @Given("the user is on the home page")
    public void the_user_is_on_the_home_page() {
        loginAsHelpDesk();

    }


    @When("the user clicks on send message box, the box should be enabled")
    public void the_user_clicks_on_send_message_box_the_box_should_be_enabled(io.cucumber.datatable.DataTable dataTable) {

        Driver.get().findElement(By.xpath("//*[@id=\"microoPostFormLHE_blogPostForm_inner\"]/span[1]")).click();

    }

    @Then("user clicks on send file button")
    public void user_clicks_on_send_file_button() {
        Driver.get().findElement(By.id("bx-b-uploadfile-blogPostForm")).click();
        Driver.get().findElement(By.className("diskuf-uploader")).click();




    }


}
