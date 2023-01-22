package co.com.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ApplicationHomepage {
    public static final Target LOGIN_BUTTON = Target.the("Button login").
            located(By.id("org.wordpress.android:id/continue_with_wpcom_button"));
}
