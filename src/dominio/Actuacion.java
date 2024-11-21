package dominio;

import java.time.LocalDate;
import java.util.ArrayList;

public class Actuacion {
    public LocalDate fecha;
    public ArrayList<Participante> listaParticipantes;

    public Actuacion(LocalDate fecha){
        this.fecha = fecha;
        this.listaParticipantes = new ArrayList<Participante>();
    }

    public void annadirParticipante(Participante participante){
        listaParticipantes.add(participante);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Fecha de actuación: " + fecha + "\n");
        for(Participante participante : listaParticipantes){
            sb.append(participante).append("\n");
        }
        return sb.toString();
    }
    
}
