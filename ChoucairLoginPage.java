package userinterface;

import java.lang.annotation.Target;

public class ChoucairLoginPage  extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the(login "button that shows us the form to login")
            .located(By.xpath("//div[@class='d-none d-lg-block']//strong[contains(text(), 'Ingresar')]"));
    public static final Target INPUT_USER  = Target.the(user"where do we write the user")
            .located(By.id("username"));
    public static final Target INPUT_PASSWORD   = Target.the(password "where do we write the password")
            .located(By.id("password"));
    public static final Target ENTER_BUTTON   = Target.the(enter "button to confirm login")
            .located(By.xpath("//button[contains(@class,'btn btn-primary ')]"));


}
