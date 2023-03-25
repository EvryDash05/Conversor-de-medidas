
package igu;
import componentes.Tarjetas;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class Interfaz {
    static HBox contenedorTarjetas;
    
    public Interfaz(){
        contenedorTarjetas = new HBox();
        
        Tarjetas tar_longitudes = new Tarjetas("LONGITUDES");
        tar_longitudes.agregarOpciones("Centimetro", "Metros", "Milimetros");
        tar_longitudes.agregarOpciones2("Pulgada", "Milla", "Nanometro");
        tar_longitudes.getEntry().setOnKeyReleased(event -> {
           try{
                tar_longitudes.eventLongitud();
           } catch(NumberFormatException e){
               tar_longitudes.getEntry();
           }
        });
        
        Tarjetas tar_volumen = new Tarjetas("VOLUMEN");
        tar_volumen.agregarOpciones("Litro (l)", "Mililitro (ml)", "Centilitro");
        tar_volumen.agregarOpciones2("Galon (gal)", "Onza", "Centimetro cúbico");
        tar_volumen.getEntry().setOnKeyReleased(event -> {
            try{
                tar_volumen.eventVolumen();
            } catch(NumberFormatException e){
                tar_volumen.getEntry();
            }
        });
        
        
        Tarjetas tar_masa = new Tarjetas("MASA");
        tar_masa.agregarOpciones("Kilogramo (Kg)", "Gramo (g)", "Miligramos");
        tar_masa.agregarOpciones2("Libra", "Grano", "Hectogramo");
        tar_masa.getEntry().setOnKeyReleased(event ->{
            try{
                tar_masa.eventMasa();
            } catch(NumberFormatException e){
                
            }
        });
        
        
        Tarjetas tar_area = new Tarjetas("ÁREA");
        tar_area.agregarOpciones("Kilometro (Km)", "Metro cuadrado", "Hectarea");
        tar_area.agregarOpciones2("Yarda cuadrada", "Pulgada cuadrada", "Pie cuadrado");
        tar_area.getEntry().setOnKeyReleased(event ->{
            try{
                tar_area.eventArea();
            } catch(NumberFormatException e){
                
            }
        });
        
        
        
        contenedorTarjetas.getChildren().addAll(
                tar_longitudes, tar_volumen, tar_masa, tar_area
        );
        contenedorTarjetas.setSpacing(10);
        contenedorTarjetas.setAlignment(Pos.CENTER);
    }
    
    public HBox getContenedorTarjetas(){
        return contenedorTarjetas;
    }
}
