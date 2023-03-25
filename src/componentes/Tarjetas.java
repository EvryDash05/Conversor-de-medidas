
package componentes;
import static java.lang.Math.pow;
import java.math.BigDecimal;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;

public class Tarjetas extends VBox {
    VBox tarjeta;
    TextField entryNumber;
    ChoiceBox<String> opciones;
    ChoiceBox<String> opciones2;
    Label resultLabel;
    
    public Tarjetas (String unidad){
        
        Label unidadLabel = new Label(unidad);
        
        Label texto = new Label("Quiero convertir");
        
        opciones = new ChoiceBox<>();
        
        entryNumber = new TextField("0");

        Label texto_a = new Label("A:");
        
        opciones2 = new ChoiceBox<>();
        
        resultLabel = new Label(" ");
        
        Border border = new Border(new javafx.scene.layout.BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, new CornerRadii(5), new BorderWidths(2)));
        setBorder(border);
        
        getChildren().addAll(unidadLabel, entryNumber, opciones,
                texto, texto_a, opciones2, resultLabel);
        setSpacing(10);
        setAlignment(Pos.CENTER);
        setPadding(new Insets(10));
    }
    
    public VBox getTarjeta(){
        return tarjeta;
    }
    
    public void agregarOpciones(String opcion1, String opcion2, String opcion3){
        this.opciones.getItems().addAll(opcion1, opcion2, opcion3);
        this.opciones.getValue();
    }
    
    public void agregarOpciones2(String opcion1, String opcion2, String opcion3){
        this.opciones2.getItems().addAll(opcion1, opcion2, opcion3);
        this.opciones2.getValue();
    }
    
    public void eventLongitud(){
        Double numero = Double.valueOf(entryNumber.getText());
        String seleccion = opciones.getValue();
        String seleccion2 = opciones2.getValue();
        if(numero >= 0){
            switch (seleccion){
                case "Centimetro":
                    switch (seleccion2){
                        case "Pulgada":
                            final Double pulgadas = 0.3937007874;
                            String resultadoPulgadas = String.valueOf(numero * pulgadas);
                            resultLabel.setText(resultadoPulgadas);
                            break;
                        case "Milla":
                            final Double millas = 6.21371 * Math.pow(10.0, -6.0);
                            String resultMillas = String.valueOf(millas * numero);
                            resultLabel.setText(resultMillas);
                            break;
                        case "Nanometro":
                            final double nanometro = 10000000;
                            String resultNanometro = String.valueOf(numero * nanometro);
                            resultLabel.setText(resultNanometro);
                            break;
                    }
                    break;
                case "Metros":
                    numero = numero * 100;
                    switch (seleccion2){
                        case "Pulgada":
                            final Double pulgadas = 0.3937007874;
                            String resultadoPulgadas = String.valueOf(numero * pulgadas);
                            resultLabel.setText(resultadoPulgadas);
                            break;
                        case "Milla":
                            final Double millas = 6.21371 * Math.pow(10.0, -6.0);
                            String resultMillas = String.valueOf(millas * numero);
                            resultLabel.setText(resultMillas);
                            break;
                        case "Nanometro":
                            final double nanometro = 10000000;
                            String resultNanometro = String.valueOf(numero * nanometro);
                            resultLabel.setText(resultNanometro);
                            break;
                    }
                case "Milimetros":
                    numero = numero * 0.10;
                    switch (seleccion2){
                        case "Pulgada":
                            final Double pulgadas = 0.3937007874;
                            String resultadoPulgadas = String.valueOf(numero * pulgadas);
                            resultLabel.setText(resultadoPulgadas);
                            break;
                        case "Milla":
                            final Double millas = 6.21371 * Math.pow(10.0, -6.0);
                            String resultMillas = String.valueOf(millas * numero);
                            resultLabel.setText(resultMillas);
                            break;
                        case "Nanometro":
                            final double nanometro = 10000000;
                            String resultNanometro = String.valueOf(numero * nanometro);
                            resultLabel.setText(resultNanometro);
                            break;
                    }      
            }                      
        } 
    }
    
    public void eventVolumen(){
        Double numero = Double.valueOf(entryNumber.getText());
        String seleccion = opciones.getValue();
        String seleccion2 = opciones2.getValue();
        if(numero >= 0){
            switch (seleccion){
                case "Litro (l)":
                    switch (seleccion2){
                        case "Galon (gal)":
                            final Double galones = 0.264172052;
                            String resultadoGalones = String.valueOf(numero * galones);
                            resultLabel.setText(resultadoGalones);
                            break;
                        case "Onza":
                            final Double onzas = 33.814;
                            String resultOnzas = String.valueOf(Math.round(numero * onzas));
                            resultLabel.setText(resultOnzas);
                            break;
                        case "Centimetro cúbico":
                            final double cmCubico = 1000;
                            String resultNanometro = String.valueOf(Math.round(numero * cmCubico));
                            resultLabel.setText(resultNanometro);
                            break;
                    }
                    break;
                case "Mililitro (ml)":
                    numero = numero * 1000;
                    switch (seleccion2){
                        case "Galon (gal)":
                            final Double galones = 0.000264172052;
                            String resultadoPulgadas = String.valueOf(numero * galones);
                            resultLabel.setText(resultadoPulgadas);
                            break;
                        case "Onza":
                            final Double onzas = 0.033814;
                            String resultOnzas = String.valueOf(Math.round(numero * onzas));
                            resultLabel.setText(resultOnzas);
                            break;
                        case "Centimetro cúbico":
                            final double cmCubico = 1000;
                            String resultcmCubico = String.valueOf(Math.round(numero * cmCubico));
                            resultLabel.setText(resultcmCubico);
                            break;
                    }
                case "Centilitro":
                    numero = numero * 0.1;
                        case "Galon (gal)":
                            final Double galones = 0.000264172052;
                            String resultadoGalones = String.valueOf(numero * galones);
                            resultLabel.setText(resultadoGalones);
                            break;
                        case "Onza":
                            final Double onzas = 0.033814;
                            String resultOnzas = String.valueOf(Math.round(numero * onzas));
                            resultLabel.setText(resultOnzas);
                            break;
                        case "Centimetro cúbico":
                            final double cmCubico = 1000;
                            String resultcmCubico = String.valueOf(Math.round(numero * cmCubico));
                            resultLabel.setText(resultcmCubico);
                            break;

            }                      
        } 
    }
    
    public void eventMasa(){
        Double numero = Double.valueOf(entryNumber.getText());
        String seleccion = opciones.getValue();
        String seleccion2 = opciones2.getValue();
        if(numero >= 0){
            switch (seleccion){
                case "Kilogramo (Kg)":
                    switch (seleccion2){
                        case "Libra":
                            final Double libra =  2.20462;
                            String resultLibra = String.valueOf(numero * libra);
                            resultLabel.setText(resultLibra);
                            break;
                        case "Grano":
                            double resultado = (numero * 15432.358) / 0.00006479891;
                            String resultGrano = String.valueOf(resultado);
                            resultLabel.setText(resultGrano);
                            break;
                        case "Hectogramo":
                            final double hectoGramo = 10;
                            String resultHectogramo = String.valueOf(Math.round(numero * hectoGramo));
                            resultLabel.setText(resultHectogramo);
                            break;
                    }
                    break;
                case "Gramo (g)":
                    switch (seleccion2){
                        case "Libra":
                            final Double libra =  453.59237;
                            String resultLibra = String.valueOf(numero / libra);
                            resultLabel.setText(resultLibra);
                            break;
                        case "Grano":
                            final double grano = 15.432358;
                            String resultGrano = String.valueOf(numero * grano);
                            resultLabel.setText(resultGrano);
                            break;
                        case "Hectogramo":
                            final double hectoGramo = 100;
                            String resultHectogramo = String.valueOf(Math.round(numero / hectoGramo));
                            resultLabel.setText(resultHectogramo);
                            break;
                    }
                case "Miligramos":
                    switch (seleccion2){
                        case "Libra":
                            final Double libra =  453592.37;
                            String resultLibra = String.valueOf(numero / libra);
                            resultLabel.setText(resultLibra);
                            break;
                        case "Grano":
                            final double grano =  0.0154324;
                            String resultGrano = String.valueOf(numero * grano);
                            resultLabel.setText(resultGrano);
                            break;
                        case "Hectogramo":
                            final double hectoGramo = 10000;
                            String resultHectogramo = String.valueOf(Math.round(numero / hectoGramo));
                            resultLabel.setText(resultHectogramo);
                            break;
                    }
                        

            }                      
        } 
    }
    
    public void eventArea(){
        Double numero = Double.valueOf(entryNumber.getText());
        String seleccion = opciones.getValue();
        String seleccion2 = opciones2.getValue();
        if(numero >= 0){
            switch (seleccion){
                case "Kilometro (Km)":
                    switch (seleccion2){
                        case "Yarda cuadrada":
                            final int yarda = 1196000;
                            String resultYarda = String.valueOf(numero * yarda);
                            resultLabel.setText(resultYarda);
                            break;
                        case "Pulgada cuadrada":
                            final double pulgada = 15500000000L;
                            String resultPulgada = String.valueOf(numero * pulgada);
                            resultLabel.setText(resultPulgada);
                            break;
                        case "Pie cuadrado":
                            final double pie = 10764000;
                            String resultPieCuadrado = String.valueOf(numero * pie);
                            resultLabel.setText(resultPieCuadrado);
                            break;
                    }
                case "Metro cuadrado":
                    switch (seleccion2){
                        case "Yarda cuadrada":
                            final double yarda = 1.19599;
                            String resultYarda = String.valueOf(numero * yarda);
                            resultLabel.setText(resultYarda);
                            break;
                        case "Pulgada cuadrada":
                            final double pulgada = 1550.0031;
                            String resultPulgada = String.valueOf(numero * pulgada);
                            resultLabel.setText(resultPulgada);
                            break;
                        case "Pie cuadrado":
                            final double pie = 10.76391;
                            String resultPieCuadrado = String.valueOf(numero * pie);
                            resultLabel.setText(resultPieCuadrado);
                            break;
                    }
                case "Hectarea":
                    switch (seleccion2){
                        case "Yarda cuadrada":
                            final double yarda = 11959.9005;
                            String resultYarda = String.valueOf(numero * yarda);
                            resultLabel.setText(resultYarda);
                            break;
                        case "Pulgada cuadrada":
                            final double pulgada = 15500031.000062;
                            String resultPulgada = String.valueOf(numero * pulgada);
                            resultLabel.setText(resultPulgada);
                            break;
                        case "Pie cuadrado":
                            final double pie = 107639.104167097;
                            String resultPieCuadrado = String.valueOf(numero * pie);
                            resultLabel.setText(resultPieCuadrado);
                            break;
                    }
                
            }
        }
    }
    
    
    
    public TextField getEntry(){
        return entryNumber;
    }
}
