
package componentes;
import javafx.scene.control.Button;

public class BotonesPersonalizados extends Button{
    public BotonesPersonalizados(String text){
        super(text);
        setId("boton");
        getStylesheets().add(getClass().getResource("/estilos/botonPersonalizado.css").toExternalForm());
    }
}
