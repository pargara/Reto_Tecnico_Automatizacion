package stepdefinitions;

import com.utest.tasks.Login;
import com.utest.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class uTestStepDefinitions {

    @Before
    public void setStage () { OnStage.setTheStage(new OnlineCast()); }

    @Given("^than sebastian visit utes$")
    public void thanSebastianVisitUtes() {
        // Realmente no es WasAbleTo...(Login.onThePage) Seria WasAbleTo...SignUp.onThePage
        OnStage.theActorCalled("Sebastian").wasAbleTo(OpenUp.thePage());
    }

    @When("^He fill all the fields$")
    public void heFillAllTheFields() {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.onThePage());
    }

    @Then("^he is a user of utest$")
    public void heIsAUserOfUtest() {
        // Write code here that turns the phrase above into concrete actions
    }

}
