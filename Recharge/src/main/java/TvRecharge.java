import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/TvRecharge",loadOnStartup = 1)
public class TvRecharge extends HttpServlet {
    public TvRecharge(){
        System.out.println("No argument constracter created...");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Servlet created...");
        PrintWriter writer;
        String CustomerId =req.getParameter("Customer-ID");
        String Vender =req.getParameter("Vender");
        String Amount =req.getParameter("Amount");
        String Type =req.getParameter("Type");
        String Accept =req.getParameter("Accept");
        System.out.println("Customer-ID :"+CustomerId+" "+"Vender :" +Vender+" "+"Amount :"+Amount+" "+"Type :"+Type+"Accept :"+Accept);
        resp.setContentType("text/html");
        writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<title>Html page</title>");
        writer.println("<head>");
        writer.println("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
        writer.println("</head>");
        writer.println("<nav  class=\"navbar navbar-expand-lg navbar-light bg-light\">\n" +
                "    <div class=\"container-fluid\">\n" +
                "        <a class=\"navbar-brand\" href=\"#\">Navbar</a>\n" +
                "        <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n" +
                "            <span class=\"navbar-toggler-icon\"></span>\n" +
                "        </button>\n" +
                "        <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n" +
                "            <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n" +
                "                <li class=\"nav-item\">\n" +
                "                    <a class=\"nav-link active\" aria-current=\"page\" href=\"TvRecharge.html\">TvRecharge Forms</a>\n" +
                "                </li>\n" +
                "                <li class=\"nav-item\">\n" +
                "                    <a class=\"nav-link active\" aria-current=\"page\" href=\"index.html\">Home Page</a>\n" +
                "                </li>\n" +
                "            </ul>\n" +
                "            <form class=\"d-flex\">\n" +
                "                <input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n" +
                "                <button class=\"btn btn-outline-success\" type=\"submit\">Search</button>\n" +
                "            </form>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</nav>");
        writer.println("<body>");
        writer.println("<b>Tv Recharge form under process...</b>");
        writer.println("<b>Tv Recharge form under process...</b>");

        writer.println("</body>");
        writer.println("</html>");


    }
}
