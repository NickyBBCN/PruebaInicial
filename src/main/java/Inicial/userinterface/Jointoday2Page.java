package Inicial.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Jointoday2Page {
    public static  final Target DEVICES_BUTTON = Target.the("Next Devices").located(By.xpath("//div[@class='d-none d-lg-block']//strong[contains(text(),'Next:Devices')]"));
    public static  final Target INPUT_CITY = Target.the("where do we write the City").located(By.id("City"));
    public static  final Target INPUT_POSTAL = Target.the("where do we write the Postal Code").located(By.id("Postal Code"));
    public static  final Target SELECT_COUNTRY = Target.the("where do we select Country").located(By.id("Country"));
    public static  final Target ENTER_BUTTON = Target.the("button to confirm Next:Devices").located(By.xpath("//button[contains(@class,'btn btn-primary')]"));

}
