package co.com.choucair.pruebatecnica.stepdefinitions;

import co.com.choucair.pruebatecnica.model.UserData;
import co.com.choucair.pruebatecnica.tasks.Answer;
import co.com.choucair.pruebatecnica.tasks.OpenUp;
import co.com.choucair.pruebatecnica.tasks.Register;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.List;

public class UtestStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that someone search for the Utest page in internet$")
    public void thatSomeoneSearchForTheUtestPageInInternet() {
        OnStage.theActorCalled("someone").wasAbleTo(OpenUp.thePage());
    }

    @When("^he/she wants to register at the Utest Page$")
    public void heSheWantsToRegisterAtTheUtestPage(List<UserData> userData) {
        OnStage.theActorInTheSpotlight().attemptsTo(Register.onThePage(userData.get(0).getNombre(), userData.get(0).getApellido(), userData.get(0).getCorreo(),
                userData.get(0).getMes(), userData.get(0).getDia(), userData.get(0).getAnio(), userData.get(0).getContrasena()));
    }

    @Then("^he/she joins to the Utest community$")
    public void heSheJoinsToTheUtestCommunity() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe()));
    }
}
