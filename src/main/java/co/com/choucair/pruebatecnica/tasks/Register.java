package co.com.choucair.pruebatecnica.tasks;

import co.com.choucair.pruebatecnica.userinterface.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Register implements Task {

    private String nombre, apellido, correo, mes, contrasena;
    private int dia, anio;

    public Register(String nombre, String apellido, String correo, String contrasena, String mes, int dia, int anio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasena = contrasena;
        this.mes = mes;
        this.dia = dia;
        this.anio = anio;
    }

    public static Register onThePage(String nombre, String apellido, String correo, String mes, int dia, int anio, String contrasena) {
        return Tasks.instrumented(Register.class, nombre, apellido, correo, contrasena, mes, dia, anio);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RegisterPage.LOGIN_BUTTON));
        try {
            Thread.sleep(15000);
            actor.attemptsTo(Enter.theValue(nombre).into(RegisterPage.INPUT_FIRSTNAME));
            Thread.sleep(2000);
            actor.attemptsTo(Enter.theValue(apellido).into(RegisterPage.INPUT_LASTNAME));
            Thread.sleep(2000);
            actor.attemptsTo(Enter.theValue(correo).into(RegisterPage.INPUT_EMAIL));
            Thread.sleep(2000);
            actor.attemptsTo(SelectFromOptions.byVisibleText(mes).from(RegisterPage.INPUT_MONTH));
            Thread.sleep(2000);
            actor.attemptsTo(SelectFromOptions.byVisibleText(String.valueOf(dia)).from(RegisterPage.INPUT_DAY));
            Thread.sleep(2000);
            actor.attemptsTo(SelectFromOptions.byVisibleText(String.valueOf(anio)).from(RegisterPage.INPUT_YEAR));
            Thread.sleep(2000);
            actor.attemptsTo(Click.on(RegisterPage.NEXT_BUTTON));
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(Click.on(RegisterPage.NEXT_BUTTON1),
                Click.on(RegisterPage.NEXT_BUTTON2),
                Enter.theValue(contrasena).into(RegisterPage.INPUT_PASSWORD),
                Enter.theValue(contrasena).into(RegisterPage.INPUT_PASSWORD2),
                Click.on(RegisterPage.INPUT_TYC),
                Click.on(RegisterPage.INPUT_PYS),
                Click.on(RegisterPage.REGISTER_BUTTON));
    }
}
