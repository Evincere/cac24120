package services;

import domain.models.Usuario;
import infrastructure.IPersistencia;
import infrastructure.database.MySQLPersistenciaImpl;

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

}
