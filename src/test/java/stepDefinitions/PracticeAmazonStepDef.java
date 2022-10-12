package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.PracticeAmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class PracticeAmazonStepDef {
    PracticeAmazonPage practiceAmazonPage=new PracticeAmazonPage();

    //Faker faker=new Faker();

    @Given("kullanici Amazon web sitesine gider")
    public void kullaniciAmazonWebSitesineGider() {
        Driver.getDriver().get(ConfigReader.getProperty("amznUrl"));
    }

    @When("sign in butonuna tiklar")
    public void signInButonunaTiklar() {
        practiceAmazonPage.signinButton.click();

    }

    @And("faker kullanarak e-posta gonderir")
    public void fakerKullanarakEPostaGonderir() {

       // practiceAmazonPage.emailBox.sendKeys(faker.internet().emailAddress());
        practiceAmazonPage.emailBox.sendKeys(Faker.instance().internet().emailAddress());

    }

    @And("gonderdigi e-postanin ekran goruntusunu alir")
    public void gonderdigiEPostaninEkranGoruntusunuAlir() throws IOException {
        ReusableMethods.getScreenshotWebElement("FakeEmail",practiceAmazonPage.emailBox);
    }

    @And("continiue'a tiklar")
    public void continiueATiklar() {
        practiceAmazonPage.continiueButton.click();
    }

    @Then("There was a problem mesajini dogrular")
    public void there_was_a_problem_mesajini_dogrular() {
        String expectedText ="There was a problem";
        String actualText = practiceAmazonPage.problemMessage.getText();
        Assert.assertEquals("Problem Mesaji Esit Degil",expectedText,actualText);
    }
    @Then("Need help e tiklar")
    public void need_help_e_tiklar() {
        practiceAmazonPage.needHelp.click();
    }
    @Then("forgot your password e tiklar")
    public void forgot_your_password_e_tiklar() {
        practiceAmazonPage.forgotPasswordLink.click();
    }
    @Then("Password assistance metnini dogrular")
    public void password_assistance_metnini_dogrular() {
        Assert.assertTrue(practiceAmazonPage.passwordAssistanceText.isDisplayed());
    }
    @Then("Geri gider")
    public void geri_gider() {
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();
    }
    @Then("Create your account butonuna tiklar")
    public void create_your_account_butonuna_tiklar() {
        practiceAmazonPage.createYourAccountButton.click();
    }
    @Then("Create account metnini dogrular")
    public void create_account_metnini_dogrular() {
        Assert.assertTrue("Create Account Text Icermiyor",practiceAmazonPage.createAccountText.getText().contains("Create account"));
    }
    @Then("sayfayisini kapatir")
    public void sayfayisini_kapatir() {
        Driver.closeDriver();
    }

    @And("websayfasini kapatir")
    public void websayfasiniKapatir() {
        Driver.quitDriver();
    }
}
