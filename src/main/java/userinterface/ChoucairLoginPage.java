package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.annotations.findby.By;


public class ChoucairLoginPage extends PageObject {
    public static final Target Login_Button = Target.the("Este boton abre el modal de registro")
            .located(By.xpath("//*[@id='nav-menu']/ul[2]/li/a/strong"));
    public static final Target Input_Name = Target.the("Campo para escribir el nombre de usuario")
            .located(By.id("username"));
    public static final Target Input_Password = Target.the("Campo para escribir la contraseña del usuario")
            .located(By.id("password"));
    public static final Target Button_Session = Target.the("Boton para iniciar session")
            .located(By.xpath("//*[@id='Ingresar']/div/div/div[2]/div[2]/form/div[3]/button"));
}
