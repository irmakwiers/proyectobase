package stepdefinitions;
import co.com.choucair.certification.academy.tasks.Login;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Before;
import stepdefinitions.OpenUp;
import sun.security.util.PendingException;
import tasks.OpenUp;

@SuppressWarnings("ALL")
public class AcademyChoucairStepDefinition {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than brandon wants to learn automation at the academy Choucair$")
    public void thanBrandonWantsToLearnAutomationAtTheAcademyChoucair() throws Exception
    {
        throw new PendingException();

        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(),(Login.OnThePage()));

    }

    @When("^he search for the course (.*) on the choucair academy platform$")
    public void heSearchForTheCourseRecursosAutomatizaciónBancolombiaOnTheChoucairAcademyPlatform(String course) throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));
        throw new PendingException();


    }
    @Then("^he finds the course called resources Recursos Automatización Bancolombia$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizaciónBancolombia()throws Exception {

        throw new PendingException();

    }
}
