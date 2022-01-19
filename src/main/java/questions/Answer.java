package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.SearchCoursePage;

public class Answer implements Question<Boolean> {

    private String srtCourse;

    public Answer(String srtCourse) {
        this.srtCourse = srtCourse;
    }


    public static Answer toThe(String srtCourse) {
        return new Answer(srtCourse);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameCourse= Text.of(SearchCoursePage.NAME_COURSE).viewedBy(actor).asString();
        if(srtCourse.equals(nameCourse)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}
