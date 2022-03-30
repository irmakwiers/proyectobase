package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Targets.Target;
import org.openqa.Selenium.By;

import java.lang.annotation.Target;


public class SearchCoursePage extends PageObject  {
    public static final Target BUTTON_UC = Target.the( universidad "selecciona la universidad choucair ")
            .located(By.xpath("//div[@id='universidad']//strong"));
    public static final Target INPUT_COURSE  = Target.the(curso "Buscar el curso")
            .located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO  = Target.the(buscar "Da click para buscar el curso")
            .located(By.id("//button [@class='btn btn -secondary']"));
    public static final Target SELECT_COURSE   = Target.the(seleccionar "Da click para seleccionar el curso")
            .located(By.xpath("//h4[contains(text(),'Recursos automatización Bancolombia')]"));
}
