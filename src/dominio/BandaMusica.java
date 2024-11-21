package dominio;
import java.util.ArrayList;

public class BandaMusica {
    private String nombre;
    private ArrayList<Actuacion> listaActuaciones;

    public BandaMusica(String nombre){
        this.nombre = nombre;
        this.listaActuaciones = new ArrayList<Actuacion>();
    }

    public void annadirActuacion(Actuacion actuacion){
        listaActuaciones.add(actuacion);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("BANDA DE MÚSICA DE VILLAR DEL MONTE\n\n");
        for(Actuacion actuacion : listaActuaciones){
            sb.append(actuacion).append("\n");
        }
        return sb.toString();
    }
}
