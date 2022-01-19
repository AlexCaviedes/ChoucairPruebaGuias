package tasks;

import userinterface.ChoucairLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    private String srtUser;
    private String srtPassword;

    public Login(String srtUser, String srtPassword) {
        this.srtUser = srtUser;
        this.srtPassword = srtPassword;
    }

    public static Login onThePage(String srtUser, String srtPassword) {
        return Tasks.instrumented(Login.class, srtUser, srtPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ChoucairLoginPage.Login_Button),
                Enter.theValue((srtUser)).into(ChoucairLoginPage.Input_Name),
                Enter.theValue((srtPassword)).into(ChoucairLoginPage.Input_Password),
        Click.on(ChoucairLoginPage.Button_Session)
        );
    }
}
