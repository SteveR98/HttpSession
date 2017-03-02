package ejercicio.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Registrarse
 */
@WebServlet("/Registrarse")
public class Registrarse extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registrarse() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        String action=(request.getPathInfo()!=null?request.getPathInfo():"");
        
        HttpSession sesion = request.getSession();
        
        if(action.equals("/out"))
        {
            sesion.invalidate();
            response.sendRedirect("Menu.jsp");
        }
        else
        {
        	 sesion.invalidate();
             response.sendRedirect("Menu.jsp");
        }
        
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession sesion = request.getSession();
        String usu=null;
        usu = request.getParameter("user");
        sesion.setAttribute("contador", 0);
        
        if(sesion.getAttribute("user") == null)
        {
            
            sesion.setAttribute("user", usu);
            
            response.sendRedirect("Usuario.jsp");

        }
        else
        {
        	sesion.invalidate();
            response.sendRedirect("Menu.jsp");
        }
	}

}