package Inicial.tasks;

import Inicial.userinterface.Jointoday2Page;
import Inicial.userinterface.Jointoday3Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Jointoday3 implements Task {
    public static Jointoday3 OnThePage() {
        return Tasks.instrumented(Jointoday3.class);
    }
    private String computer;
    private String version;
    private String languaje;
    private String mobile;
    private String  model;
    private String operating;


    public Jointoday3(String computer, String version, String languaje, String mobile, String model, String operating) {
        this.computer = computer;
        this.version = version;
        this.languaje = languaje;
        this.mobile = mobile;
        this.model = model;
        this.operating = operating;
    }


    public static Jointoday3 onThePage(String computer, String version, String languaje, String mobile, String  model, String operating){
       return Tasks.instrumented(Jointoday3.class,computer,version,languaje,mobile,model,operating);
    }

    public static Performable the(int date) {
        return null;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(Jointoday3Page.STEP_BUTTON),
                Enter.theValue(computer).into(Jointoday3Page.SELECT_COMPUTER),
                Enter.theValue(version).into(Jointoday3Page.SELECT_VERSION),
                Enter.theValue(languaje).into(Jointoday3Page.SELECT_LANGUAJE),
                Enter.theValue(mobile).into(Jointoday3Page.SELECT_MOBILE),
                Enter.theValue(model).into(Jointoday3Page.SELECT_MODEL),
                Enter.theValue(operating).into(Jointoday3Page.SELECT_OPERATING),
                Click.on(Jointoday3Page.ENTER_BUTTON));
    }
}
