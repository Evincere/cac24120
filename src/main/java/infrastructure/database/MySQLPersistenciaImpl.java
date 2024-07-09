package infrastructure.database;

import domain.models.Usuario;
import infrastructure.IPersistencia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MySQLPersistenciaImpl implements IPersistencia {

    private Connection conexion;

    public MySQLPersistenciaImpl() {
        this.conexion = DatabaseConnection.getConnection();
    }

    @Override
    public void saveUser(Usuario user) {
        String sql = "INSERT INTO users (username, password, email) VALUES (?,?,?)";

        try {
            PreparedStatement preparador = this.conexion.prepareStatement(sql);
            preparador.setString(1, user.getUsername());
            preparador.setString(2, user.getPassword());
            preparador.setString(3, user.getEmail());
            preparador.executeUpdate();
            preparador.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Usuario findByUsername(String username) {
        String sql = "SELECT * FROM users WHERE username = ?";

        try {
            PreparedStatement preparador = conexion.prepareStatement(sql);
            preparador.setString(1, username);

            ResultSet resultados = preparador.executeQuery();
            if(resultados.next()) {
                Usuario usuario = new Usuario();
                usuario.setId(resultados.getInt("id"));
                usuario.setUsername(resultados.getString("username"));
                usuario.setPassword(resultados.getString("password"));
                usuario.setEmail(resultados.getString("email"));
                return usuario;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return null;
    }
}
