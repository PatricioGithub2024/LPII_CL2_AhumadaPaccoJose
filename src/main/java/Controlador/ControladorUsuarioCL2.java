package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.ClassUsuarioCL2Imp;
import model.TblUsuariocl2;

/**
 * Servlet implementation class ControladorUsuarioCL2
 */
public class ControladorUsuarioCL2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorUsuarioCL2() {
        super();
        // TODO Auto-generated constructor stub
    } 	//fin del constructor...

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}	// fin del metodo doGet

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		 String login = request.getParameter("usuario");
	     String clave = request.getParameter("password");

	     //instancias
	     TblUsuariocl2 usu = new TblUsuariocl2();
	     ClassUsuarioCL2Imp crud = new ClassUsuarioCL2Imp();
	     
	     usu = crud.validarUsuario(login, clave);

	        if (usu != null) {
	            
	            request.setAttribute("mensaje", "Credenciales correctas");
	            request.getRequestDispatcher("/MenuUsuario.jsp").forward(request, response);
	        } else {
	            
	            request.setAttribute("mensaje", "Credenciales incorrectas");
	            request.getRequestDispatcher("/LoginUsuarios.jsp").forward(request, response);
	        }
		
	} 	//fin del metodo doPost

}	// fin de la clase ...
