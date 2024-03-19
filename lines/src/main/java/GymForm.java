import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Service;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/gymForm",loadOnStartup = 1)
public class GymForm extends HttpServlet {

    public GymForm() {
        System.out.println("no argument constracter created");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("servlet is created...");
        PrintWriter writer;
        String writer1 = req.getParameter("name");
        String writer2 = req.getParameter("email");
        String writer3 = req.getParameter("phone");
        String writer4 = req.getParameter("age");
        String writer5 = req.getParameter("gender");
        String writer6 = req.getParameter("membership");
        System.out.println(writer1+" "+writer2+" "+writer3+" "+writer4+" "+writer5+" "+writer6);

        resp.setContentType("text/plain");
        writer = resp.getWriter();
        writer.println("Gym Application in process...");

    }
}
