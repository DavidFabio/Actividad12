package dominio;

public class MusicoSocio extends Participante {
    public String nombre;
    public String instrumento;
    public int id;

    public MusicoSocio(String nombre, String instrumento, int id){
        this.nombre = nombre;
        this.instrumento = instrumento;
        this.id = id;
    }
    
    @Override
    public String toString(){
        return nombre+instrumento+id;
    }
}
