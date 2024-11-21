package dominio;


public class Director extends Participante{
    public String nombre;

    public Director(String nombre){
        this.nombre = nombre;
    }

    @Override
    public String toString(){
        return nombre + ", director";
    }
}
