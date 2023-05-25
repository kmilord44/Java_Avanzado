import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class proyecto extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");

        switch (action) {
            case "whatsapp":
                req.getRequestDispatcher("views/whatsapp.jsp").forward(req, resp);
                break;
            case "facebook":
                req.getRequestDispatcher("views/facebook.jsp").forward(req, resp);
                break;
            case "indexfb":
                req.getRequestDispatcher("views/indexfb.jsp").forward(req, resp);
                break;
            case "indexwh":
                req.getRequestDispatcher("views/indexwh.jsp").forward(req, resp);
                break;
            case "index":
                req.getRequestDispatcher("index.jsp").forward(req, resp);
                break;
            case "registrofb":
                req.getRequestDispatcher("views/registrofb.jsp").forward(req, resp);
                break;
            case "registrowh":
                req.getRequestDispatcher("views/registrowh.jsp").forward(req, resp);
                break;
            case "chatfa":
                req.getRequestDispatcher("views/chatface.jsp").forward(req, resp);
                break;

            default:
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String enviar = req.getParameter("enviar");
        switch (enviar) {
            case "iniciofb":
                String usuario = "camilo";
                String contrasena = "messi";
                String usuario1 = req.getParameter("usuario");
                String contrasena1 = req.getParameter("contrasena");
                if (usuario1.equals(usuario) && contrasena1.equals(contrasena)) {
                    req.getRequestDispatcher("views/facebook.jsp").forward(req, resp);
                } else {
                    req.getRequestDispatcher("views/indexfb.jsp").forward(req, resp);
                }
                break;

              case "iniciowh":
                String usuariow = "suarez";
                String contrasenaw = "cr7god";
                String usuariow1 = req.getParameter("usuario1");
                String contrasenaw1 = req.getParameter("contrasena1");
                if (usuariow1.equals(usuariow) && contrasenaw1.equals(contrasenaw)) {
                    req.getRequestDispatcher("views/whatsapp.jsp").forward(req, resp);
                } else {
                    req.getRequestDispatcher("views/indexwh.jsp").forward(req, resp);
                }
                break;

            default:
                break;
        }
    }

    
}