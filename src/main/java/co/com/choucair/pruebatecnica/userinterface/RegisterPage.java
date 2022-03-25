package co.com.choucair.pruebatecnica.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterPage extends PageObject {

    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form of the login").located(By.xpath(
            "//div[@class='unauthenticated-nav-bar__links navbar-right hidden-sm hidden-xs']//a[contains(text(),'Join Today')]"));
    public static final Target INPUT_FIRSTNAME = Target.the("where do we write the first name").located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("where do we write the last name").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("where do we write the email").located(By.id("email"));
    public static final Target INPUT_MONTH = Target.the("where do we write the month of birth").located(By.id("birthMonth"));
    public static final Target INPUT_DAY = Target.the("where do we write the day of birth").located(By.id("birthDay"));
    public static final Target INPUT_YEAR = Target.the("where do we write the year of birth").located(By.id("birthYear"));
    public static final Target NEXT_BUTTON = Target.the("button that allow us to continue the registration steps ").located(By.xpath(
            "//div[@class='form-group col-xs-12 text-right']//span[contains(text(),'Next: Location')]"));
    public static final Target NEXT_BUTTON1 = Target.the("button that allow us to continue the registration steps ").located(By.xpath(
            "//div[@class='pull-right next-step']//span[contains(text(),'Next: Devices')]"));
    public static final Target NEXT_BUTTON2 = Target.the("button that allow us to continue the registration steps ").located(By.xpath(
            "//div[@class='pull-right next-step']//span[contains(text(),'Next: Last Step')]"));
    public static final Target INPUT_PASSWORD = Target.the("where do we write the password").located(By.id("password"));
    public static final Target INPUT_PASSWORD2 = Target.the("where do we write the password").located(By.id("confirmPassword"));
    public static final Target INPUT_TYC = Target.the("checkbox for accept uTest Terms of Use and the uTest Code of Conduct").located(By.id("termOfUse"));
    public static final Target INPUT_PYS = Target.the("checkbox for accept Privacy & Security Policy").located(By.id("privacySetting"));
    public static final Target REGISTER_BUTTON = Target.the("button that register us in the Utest page").located(By.id("laddaBtn"));
}
