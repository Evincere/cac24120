package infrastructure;

import domain.models.Usuario;

public interface IPersistencia {

    void saveUser(Usuario user);
    Usuario findByUsername(String username);
}
