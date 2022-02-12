package Inicial.tasks;

import Inicial.userinterface.Jointoday1Page;
import Inicial.userinterface.Jointoday2Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Jointoday2 implements Task {

    public static Jointoday2 OnThePage() {
        return Tasks.instrumented(Jointoday2.class);
    }
    private String city;
    private String postal;
    private String country;

    public Jointoday2(String city, String postal, String country) {
        this.city = city;
        this.postal = postal;
        this.country = country;
    }

    public static Jointoday2 onThePage(String firstname, String lastname, String email, String date){
        return Tasks.instrumented(Jointoday2.class,firstname,lastname,email,date);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(Jointoday2Page.DEVICES_BUTTON),
                Enter.theValue(city).into(Jointoday2Page.INPUT_CITY),
                Enter.theValue(postal).into(Jointoday2Page.INPUT_POSTAL),
                Enter.theValue(country).into(Jointoday2Page.SELECT_COUNTRY),
                Click.on(Jointoday2Page.ENTER_BUTTON));
    }
}