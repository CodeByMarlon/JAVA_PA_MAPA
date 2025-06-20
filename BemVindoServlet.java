import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Mapeamento da URL do servlet
@WebServlet("/bemvindo")
public class BemVindoServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    // Método que trata requisições GET
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Define o tipo de conteúdo da resposta
        response.setContentType("text/html; charset=UTF-8");

        // Obtém o objeto para escrever a resposta
        PrintWriter out = response.getWriter();

        // Gera conteúdo HTML dinâmico
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head><title>Página de Boas-Vindas</title></head>");
        out.println("<body>");
        out.println("<h1>Bem-vindo à aplicação Servlet!</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}