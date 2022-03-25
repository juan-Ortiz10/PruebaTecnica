package co.com.choucair.pruebatecnica.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SuccessPage extends PageObject {
 public static final Target SUCCESS_TEXT = Target.the("Text that indicate to us that the register was success").located(By.xpath("//div[@class='image-box-header']//h1"));
}
