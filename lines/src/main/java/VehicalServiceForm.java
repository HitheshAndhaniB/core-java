import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/vehicalServiceForm",loadOnStartup = 1)
public class VehicalServiceForm extends HttpServlet {

    public VehicalServiceForm(){
        System.out.println("no argument constracter created in vehicalServiceForm....");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter writer;
        String writer1 = req.getParameter("date");
        String writer2 = req.getParameter("mileage");
        String writer3 = req.getParameter("techname");
        String writer4 = req.getParameter("service");
        String writer5 = req.getParameter("cname");
        String writer6 = req.getParameter("email");
        String writer7 = req.getParameter("phone");
        System.out.println(writer1+" "+writer2+" "+writer3+" "+writer4+" "+writer5+" "+writer6+" "+writer7);
        resp.setContentType("text/plain");
        writer = resp.getWriter();
        writer.println("vehical Application in process...");


    }
}
