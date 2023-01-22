package co.com.certification.taks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.certification.userinterfaces.ApplicationHomepage.LOGIN_BUTTON;

public class IngresarA implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LOGIN_BUTTON));
    }

    public static IngresarA wordpressApp(){
        return Tasks.instrumented(IngresarA.class);
    }
}
