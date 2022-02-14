package Inicial.tasks;

import Inicial.userinterface.Jointoday1Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Jointoday1 implements Task {
    private String Firstname;
    private String Lastname;
    private String email;
    private String date;

    public  Jointoday1(String firstname, String lastname, String email, String date) {
        Firstname = firstname;
        Lastname = lastname;
        this.email = email;
        this.date = date;
    }

    public static Jointoday1 OnThePage(String firstname, String lastname, String email, String date) {
        return Tasks.instrumented(Jointoday1.class,firstname,lastname,email,date);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(Jointoday1Page.JOIN_BUTTON),
                Enter.theValue(Firstname).into(Jointoday1Page.INPUT_FIRST),
                Enter.theValue(Lastname).into(Jointoday1Page.INPUT_LAST),
                Enter.theValue(email).into(Jointoday1Page.INPUT_EMAIL),
                Enter.theValue(date).into(Jointoday1Page.INPUT_DATE),
                Click.on(Jointoday1Page.ENTER_BUTTON));
    }
}
