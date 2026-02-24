package modelo;

public class Usuario {
    private int id;
    private String nombre;
    private String correo;

    public Usuario(String nombre,String correo){
        this.nombre=nombre;
        this.correo=correo;
    }

    public int getId(){return id;}
    public void setId(int id){this.id=id;}

    public String getNombre(){return nombre;}
    public String getCorreo(){return correo;}
}