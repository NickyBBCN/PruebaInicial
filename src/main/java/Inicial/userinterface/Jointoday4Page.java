package Inicial.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Jointoday4Page extends PageObject {
    public static  final Target STEP_BUTTON = Target.the("Button that complete Setup").located(By.xpath("//div[@class='d-none d-lg-block']//strong[contains(text(),'complete Setup')]"));
    public static  final Target  INPUT_CREATEPASSWORD = Target.the("where do where do we write the create password ").located(By.id("create password"));
    public static  final Target INPUT_CONFIRMPASSWORD = Target.the("where do where do we write the confirm passwordn").located(By.id("confirm password"));
    public static  final Target SELECT_STAYINFORMED = Target.the("where do we  select Stay informed").located(By.id("Stay Informed"));
    public static  final Target SELECT_READ = Target.the("where do we select the acceppt the uTest Terms of Use").located(By.id(" Code of Conduct"));
    public static  final Target SELECT_PRIVACITY = Target.the("where do we select the acceppt the Privacy").located(By.id("Privacy & Secutiry policy"));
    public static  final Target ENTER_BUTTON = Target.the("button to confirm complete Setup").located(By.xpath("//button[contains(@class,'btn btn-primary')]"));


}
