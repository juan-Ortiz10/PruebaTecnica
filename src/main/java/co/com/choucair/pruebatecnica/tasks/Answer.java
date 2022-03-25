package co.com.choucair.pruebatecnica.tasks;

import co.com.choucair.pruebatecnica.userinterface.SuccessPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {

    public static Answer toThe() {
        return new Answer();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String nameCourse = Text.of(SuccessPage.SUCCESS_TEXT).viewedBy(actor).asString();
        return nameCourse.equals("Welcome to the world's largest community of freelance software testers!");
    }
}
