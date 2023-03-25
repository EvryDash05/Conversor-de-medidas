
package igu;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

//Generacion de la interfaz
public class Generacion extends Application{
    
    @Override
    public void start(Stage primaryStage){       
        
        FlowPane root = new FlowPane();
        
        //Se crea un objeto interfaz 
        Interfaz interfaz = new Interfaz();
        root.getChildren().add(interfaz.getContenedorTarjetas());
        root.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(root, 800, 300);
        scene.getStylesheets().add("estilos/botonPersonalizado.css");
        
        primaryStage.setScene(scene);
        primaryStage.setTitle("CONVERSOR DE UNIDADES");
        primaryStage.show();
    }
   
}
