package Inicial.tasks;

import Inicial.userinterface.Jointoday3Page;
import Inicial.userinterface.Jointoday4Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Jointoday4 implements Task {

    private String createpass;
    private String confirmpass;
    private String aceptstay;
    private String aceptutest;
    private String  aceptpolity;
    public Jointoday4(String createpass, String confirmpass, String aceptstay, String aceptutest, String aceptpolity) {
        this.createpass = createpass;
        this.confirmpass = confirmpass;
        this.aceptstay = aceptstay;
        this.aceptutest = aceptutest;
        this.aceptpolity = aceptpolity;
    }
    public static Jointoday4 OnThePage(String confirmpass, String aceptstay, String createpass, String aceptutest, String aceptpolity) {
        return Tasks.instrumented(Jointoday4.class,confirmpass,aceptstay,createpass,aceptutest,aceptpolity);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(Jointoday4Page.STEP_BUTTON),
                Enter.theValue(createpass).into(Jointoday4Page.INPUT_CREATEPASSWORD),
                Enter.theValue(confirmpass).into(Jointoday4Page.INPUT_CONFIRMPASSWORD),
                Enter.theValue(aceptstay).into(Jointoday4Page.SELECT_STAYINFORMED),
                Enter.theValue(aceptutest).into(Jointoday4Page.SELECT_READ),
                Enter.theValue(aceptpolity).into(Jointoday4Page.SELECT_PRIVACITY),
                Click.on(Jointoday4Page.ENTER_BUTTON));
    }
}
