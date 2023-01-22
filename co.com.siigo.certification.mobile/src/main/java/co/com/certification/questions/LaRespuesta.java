package co.com.certification.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.certification.userinterfaces.IniciarApp.*;

public class LaRespuesta implements Question <Boolean>  {

    private  String palabra;

    public LaRespuesta(String palabra) {
        this.palabra = palabra;
    }

    public static LaRespuesta es(String word) {
        return new LaRespuesta(word);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        WaitUntil.the(QUESTION, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds();
        String wordCompare = Text.of(QUESTION).viewedBy(actor).asString();
        if (palabra.equals(wordCompare)){
            result = true;
            actor.attemptsTo(
                    Click.on(BTN_CERRAR),
                    Click.on(BTN_CERRAR_MODAL));
        }else {
            result = false;
        }
        return result;
    }

}
