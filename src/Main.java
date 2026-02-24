import dao.UsuarioDAO;
import modelo.Usuario;

public class Main {
    public static void main(String[] args) {

        UsuarioDAO dao = new UsuarioDAO();

        dao.crearTabla();

        dao.insertar(new Usuario("Juan","juan@gmail.com"));
        dao.listar();

        dao.actualizar(1,"Juan Diego","nuevo@gmail.com");
        dao.listar();

        dao.eliminar(1);
        dao.listar();
    }
}