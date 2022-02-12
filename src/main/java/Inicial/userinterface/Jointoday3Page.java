package Inicial.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Jointoday3Page extends PageObject {

    public static  final Target STEP_BUTTON = Target.the("Button that Next Last Step").located(By.xpath("//div[@class='d-none d-lg-block']//strong[contains(text(),'next:Last Step')]"));
    public static  final Target SELECT_COMPUTER = Target.the("where do we select computer").located(By.id("computer"));
    public static  final Target SELECT_VERSION = Target.the("where do we  select version").located(By.id("version"));
    public static  final Target SELECT_LANGUAJE = Target.the("where do we  select Language").located(By.id("Language"));
    public static  final Target SELECT_MOBILE = Target.the("where do we select the Mobile Device").located(By.id(" Mobile Device"));
    public static  final Target SELECT_MODEL = Target.the("where do we select Model").located(By.id("Model"));
    public static  final Target SELECT_OPERATING = Target.the("where do we slect operating").located(By.id("Operating"));
    public static  final Target ENTER_BUTTON = Target.the("button to confirm Next:Last Step").located(By.xpath("//button[contains(@class,'btn btn-primary')]"));

}
