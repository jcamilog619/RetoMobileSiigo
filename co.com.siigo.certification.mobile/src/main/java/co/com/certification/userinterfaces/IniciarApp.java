package co.com.certification.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IniciarApp extends PageObject {
    public static final Target CORREO = Target.the("Enter the email")
            .located(By.id("org.wordpress.android:id/input"));

    public static final Target BTN_CONTINUAR = Target.the("Btn para continuar al correo")
            .located(By.id("org.wordpress.android:id/login_continue_button"));

    public static final Target CLAVE_USUARIO = Target.the("ingresar la clave")
            .located(By.id("org.wordpress.android:id/input"));

    public static final Target BTN_CONTINUAR_LOGIN = Target.the("Btn continuar login")
            .located(By.id("org.wordpress.android:id/bottom_button"));

    public static final Target QUESTION = Target.the("texto para comparar")
            .located(By.id("org.wordpress.android:id/me_display_name"));

    public static final Target BTN_PERFIL = Target.the("Btn  perfil")
            .located(By.id("org.wordpress.android:id/avatar"));

    public static final Target BTN_CERRAR = Target.the("Btn Cerrar login")
            .located(By.id("org.wordpress.android:id/me_login_logout_text_view"));

    public static final Target BTN_CERRAR_MODAL = Target.the("Btn Cerrar login")
            .located(By.id("android:id/button1"));


}
