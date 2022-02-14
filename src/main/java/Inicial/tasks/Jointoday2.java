package Inicial.tasks;

import Inicial.userinterface.Jointoday2Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Jointoday2 implements Task {

    private String city;
    private String postal;
    private String country;



    public static Jointoday2 OnThePage(String city, String postal, String country) {
        return Tasks.instrumented(Jointoday2.class,city,postal,country);
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