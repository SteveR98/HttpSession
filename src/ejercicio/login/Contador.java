package ejercicio.login;

import java.io.IOException;
import javax.servlet.http.HttpSession; 

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Contador")
public class Contador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Contador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession sesion =  request.getSession(true);
		
		if (null!=sesion.getAttribute("contador"))
		{
			sesion.setAttribute("contador", (int)sesion.getAttribute("contador")+1);
            response.sendRedirect("Usuario.jsp");
		}
		else
		{
			sesion.setAttribute("contador", 0);
	         response.sendRedirect("Usuario.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}