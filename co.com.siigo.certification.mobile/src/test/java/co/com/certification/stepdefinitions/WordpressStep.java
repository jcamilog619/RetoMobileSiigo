package co.com.certification.stepdefinitions;

import co.com.certification.questions.LaRespuesta;
import co.com.certification.taks.Ingresar;
import co.com.certification.taks.IngresarA;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class WordpressStep {
    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que el (.*) ingreso al portal de wordpress$")
    public void queElUsuarioIngresoAlPortalDeWordpress(String usuario) {
        OnStage.theActorCalled(usuario).wasAbleTo(IngresarA.wordpressApp());
    }

    @Cuando("^se realiza el login con su usuario \"([^\"]*)\" y clave \"([^\"]*)\"$")
    public void seRealizaElLoginConSuUsuarioyClave(String usuario, String clave) {
        theActorInTheSpotlight().attemptsTo(Ingresar.con(usuario,clave));
    }
    @Entonces("^se vizualizara exitosamente el acceso con (.*)$")
    public void seVizualizaraExitosamenteElAccesocon(String palabra) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(LaRespuesta.es(palabra)));
    }

}
