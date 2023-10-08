import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class LoginServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();
        String role=request.getParameter("role");
        if(role.equals("admin"))
        {
            RequestDispatcher rd=request.getRequestDispatcher("/AdminServlet");
            rd.forward(request, response);
        }
        if(role.equals("staff"))
        {
            RequestDispatcher rd=request.getRequestDispatcher("/StaffServlet");
            rd.forward(request, response);
        }
        else
        {
          RequestDispatcher rd=request.getRequestDispatcher("/StudentServlet");
            rd.forward(request, response);  
        }
//        String name=request.getParameter("fname");
//        HttpSession session=request.getSession();  
//        session.setAttribute("name",name);
//        out.print("Welcome, "+name);  
               
    }

    
    
}
