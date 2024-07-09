package domain.models;

public class Usuario {

    private int id;
    private String username;
    private String password;
    private String email;

    public Usuario() {
    }

    public Usuario(int id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Usuario{" +
          "id=" + id +
          ", username='" + username + '\'' +
          ", password='" + password + '\'' +
          ", email='" + email + '\'' +
          '}';
    }
}
