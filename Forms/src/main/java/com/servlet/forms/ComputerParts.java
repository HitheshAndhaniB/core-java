package com.servlet.forms;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

@WebServlet(urlPatterns = "/ComputerParts" , loadOnStartup = 1)
public class ComputerParts extends HttpServlet {

    public ComputerParts(){
        System.out.println("No arguments Constraction created...");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Servlet created...");

        PrintWriter writer;
        String Brands = req.getParameter("Brands");
        String model = req.getParameter("model");
        String Color = req.getParameter("Color");
        String Type = req.getParameter("Type");
        String Ram = req.getParameter("Ram");
        String Harddisk = req.getParameter("Hard-disk");
        String Process = req.getParameter("Process");
        String Generation = req.getParameter("Generation");
        String Motherboard = req.getParameter("Mother-board");
        String CacheSize = req.getParameter("Cache-Size");
        String cost = req.getParameter("cost");
        String Quantity = req.getParameter("Quantity");
        String Total = req.getParameter("Total");
        System.out.println("Brands :"+Brands+" "+"Model :"+model+" "+"Color :"+Color+""+"Type :"+Type+" "+"Ram :"+Ram+" "+"Harddisk :"+Harddisk+" "+"Process :"+Process+" "+"Generation :"+Generation+" "+"Motherboard :"+Motherboard+" "+"CacheSize :"+CacheSize+" "+"Cost :"+cost+" "+"Quantity :"+Quantity+" "+"Total price"+Total);
        resp.setContentType("text/html");
        writer = resp.getWriter();
        double costCons = Integer.valueOf(cost);
        int Quantitycons = Integer.valueOf(Quantity);
        int result = (int) (costCons*Quantitycons);
        String totalCon = String.valueOf(result);
        Total = totalCon;
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
                "                    <a class=\"nav-link active\" aria-current=\"page\" href=\"ComputerParts.html\">Computer parts</a>\n" +
                "                </li>\n" +
                "                <li class=\"nav-item\">\n" +
                "                    <a class=\"nav-link active\" aria-current=\"page\" href=\"index.html\">Home</a>\n" +
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
        writer.println("<b>Total price :<b>"+totalCon);
        writer.println("</body>");

        writer.println("</html>");









    }
}
