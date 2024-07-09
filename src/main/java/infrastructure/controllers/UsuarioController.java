package infrastructure.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import domain.models.Usuario;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import services.UsuarioService;

@WebServlet("/users")
public class UsuarioController extends HttpServlet {

    private ObjectMapper mapper;
    private UsuarioService service;

    public UsuarioController() {
        this.mapper = new ObjectMapper();
        this.service = new UsuarioService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
        String username= req.getParameter("username");

        if(username != null) {
            Usuario usuario = service.findByUsername(username);
            if(usuario != null) {
                resp.setStatus(200);
                resp.setContentType("application/json");
                resp.setCharacterEncoding("UTF-8");

                resp.getWriter().write(mapper.writeValueAsString(usuario));
            } else {
                resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
                resp.getWriter().write("Usuario no encontrado");
            }

        }


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
        Usuario usuario = mapper.readValue(req.getInputStream(), Usuario.class);
        service.saveUser(usuario);

        resp.setStatus(HttpServletResponse.SC_OK);
    }
}
