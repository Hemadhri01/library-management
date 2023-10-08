
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AdminServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();
        String name=request.getParameter("fname");
//        HttpSession session=request.getSession();  
//        session.setAttribute("name",name);
//        out.print("Welcome, "+name); 
         out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet StaffServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<a href='staffmgmt.html'>Staff Management</a><br>");
            out.println("<a href='studmgmt.html'>Student Management</a><br>");
            out.println("<a href='bookmgmt.html'>Book Management</a><br>");
            out.println("</body>");
            out.println("</html>");
    }
}

    

    