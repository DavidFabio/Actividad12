package dominio;

import java.math.BigDecimal;

public class MusicoRefuerzo extends Participante {
    public String nombre;
    public String instrumento;
    public BigDecimal precio;

    public MusicoRefuerzo(String nombre, String instrumento, BigDecimal precio){
        this.nombre = nombre;
        this.instrumento = instrumento;
        this.precio = precio;
    }

    @Override
    public String toString(){
        return nombre + ", " + instrumento + ", número de socio: " + precio;
    }
}
