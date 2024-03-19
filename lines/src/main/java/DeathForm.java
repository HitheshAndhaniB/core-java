import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/deathForm",loadOnStartup = 1)
public class DeathForm  extends HttpServlet {

    public DeathForm() {
        System.out.println("DeathForm no argument constracter created");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("servlet is created...");
        PrintWriter writer;
        String writer1 = req.getParameter("name");
        String writer5 = req.getParameter("age");
        String writer2 = req.getParameter("address");
        String writer3 = req.getParameter("adhar");
        String writer4 = req.getParameter("cause");
        System.out.println(writer1+" "+writer2+" "+writer3+" "+writer4+" "+writer5);
        resp.setContentType("text/plain");
        writer = resp.getWriter();
        writer.println("Death Application in process...");



    }
}
