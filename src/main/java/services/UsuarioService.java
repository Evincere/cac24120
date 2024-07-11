package services;

import domain.models.Usuario;
import infrastructure.IPersistencia;
import infrastructure.database.MySQLPersistenciaImpl;
import java.util.ArrayList;

public class UsuarioService implements IPersistencia {


    private IPersistencia persistencia = new MySQLPersistenciaImpl();

    @Override
    public void saveUser(Usuario user) {
        persistencia.saveUser(user);
    }

    @Override
    public Usuario findByUsername(String username) {
        return persistencia.findByUsername(username);
    }

    @Override
    public ArrayList<Usuario> getAllUsers() {
        return persistencia.getAllUsers();
    }

    @Override
    public void deleteUser(int id) {
        persistencia.deleteUser(id);
    }

}
