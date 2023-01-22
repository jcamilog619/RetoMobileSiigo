package co.com.certification.taks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.certification.userinterfaces.IniciarApp.*;

public class Ingresar implements Task {
    private String usuario;
    private String clave;


    public Ingresar(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    public static Ingresar con(String usuario, String clave) {
        return Tasks.instrumented(Ingresar.class, usuario, clave);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(usuario).into(CORREO));
        actor.attemptsTo(
                Click.on(BTN_CONTINUAR),
                Enter.theValue(clave).into(CLAVE_USUARIO),
                Click.on(BTN_CONTINUAR_LOGIN),
                WaitUntil.the(BTN_PERFIL, WebElementStateMatchers.isVisible()).forNoMoreThan(60).seconds(),
                Click.on(BTN_PERFIL));

    }
}
