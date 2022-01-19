package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.SearchCoursePage;

public class Search implements Task {

    private String srtCourse;

    public Search(String srtCourse) {
        this.srtCourse = srtCourse;
    }


    public static Search the(String srtCourse) {
        return Tasks.instrumented(Search.class, srtCourse);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SearchCoursePage.Button_UC),
                Enter.theValue(srtCourse).into(SearchCoursePage.INPUT_COURSE),
                Click.on(SearchCoursePage.BUTTON_GO),
                Click.on(SearchCoursePage.SELECT_COURSE)
        );
    }
}
