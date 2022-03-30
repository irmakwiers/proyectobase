package stepdefinitions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import userinterface.SearchCoursePage;

public class Search implements Task {
private String course ;

    public Search(String course) {
        this.course= course;

    }

    public static Object the(String course) {
        return Tasks.instrumented(Search.class);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("selecciona la universidad choucair  ").into(SearchCoursePage.BUTTON_UC),
                Enter.theValue("Buscar el curso ").into(SearchCoursePage.INPUT_COURSE),
                Enter.theValue("Da click para buscar el curso") Click.on(SearchCoursePage.BUTTON_GO),
                Enter.theValue("Da click para seleccionar el curso").into(SearchCoursePage.SELECT_COURSE)

        );
    }
}
