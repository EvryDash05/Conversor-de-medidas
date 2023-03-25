
package logica;
import igu.Generacion;
import javafx.application.Application;
import javafx.stage.Stage;

//Ejecución del programa
public class ProyectoDos extends Application{

    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage){
        Generacion ejecutar = new Generacion();
        ejecutar.start(primaryStage);
    }
    
}
