package dao;

import config.ConexionDB;
import modelo.Usuario;
import java.sql.*;

public class UsuarioDAO {

    Connection con = ConexionDB.conectar();

    public void crearTabla(){
        try{
            Statement st = con.createStatement();
            st.execute("""
            CREATE TABLE IF NOT EXISTS usuario(
            id INTEGER PRIMARY KEY AUTOINCREMENT,
            nombre TEXT,
            correo TEXT
            )
            """);
        }catch(Exception e){System.out.println(e);}
    }

    public void insertar(Usuario u){
        try{
            PreparedStatement ps=con.prepareStatement(
            "INSERT INTO usuario(nombre,correo) VALUES(?,?)");
            ps.setString(1,u.getNombre());
            ps.setString(2,u.getCorreo());
            ps.executeUpdate();
            System.out.println("Insertado");
        }catch(Exception e){System.out.println(e);}
    }

    public void listar(){
        try{
            ResultSet rs=con.createStatement().executeQuery("SELECT * FROM usuario");
            while(rs.next()){
                System.out.println(rs.getInt("id")+" "+rs.getString("nombre")+" "+rs.getString("correo"));
            }
        }catch(Exception e){System.out.println(e);}
    }

    public void actualizar(int id,String nombre,String correo){
        try{
            PreparedStatement ps=con.prepareStatement(
            "UPDATE usuario SET nombre=?,correo=? WHERE id=?");
            ps.setString(1,nombre);
            ps.setString(2,correo);
            ps.setInt(3,id);
            ps.executeUpdate();
        }catch(Exception e){System.out.println(e);}
    }

    public void eliminar(int id){
        try{
            PreparedStatement ps=con.prepareStatement("DELETE FROM usuario WHERE id=?");
            ps.setInt(1,id);
            ps.executeUpdate();
        }catch(Exception e){System.out.println(e);}
    }
}