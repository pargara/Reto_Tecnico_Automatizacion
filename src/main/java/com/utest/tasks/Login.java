package com.utest.tasks;

import com.utest.userinterface.UTestLoginPage;
import com.utest.userinterface.UTestPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;
public class Login implements Task {
    public static Login onThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(UTestLoginPage.LOGIN_BUTTON),
                Enter.theValue("Sebastian").into(UTestLoginPage.INPUT_FNAME),
                Enter.theValue("Guevara").into(UTestLoginPage.INPUT_LNAME),
                Enter.theValue("sebastian@example.com").into(UTestLoginPage.INPUT_EMAIL),
                Enter.theValue("March").into(UTestLoginPage.SELECT_MONTH),
                Enter.theValue("3").into(UTestLoginPage.SELECT_DAY),
                Enter.theValue("2003").into(UTestLoginPage.SELECT_YEAR),
                Click.on(UTestLoginPage.SUBMIT_BUTTON),
                Click.on(UTestLoginPage.BUTTON_DEVICES),
                Enter.theValue("contraseña").into(UTestLoginPage.INPUT_PASSWORD),
                Enter.theValue("contraseña").into(UTestLoginPage.INPUT_CONFIRM_PASSWORD),
                Click.on(UTestLoginPage.SUBMIT_BUTTON)
        );
    }
}
