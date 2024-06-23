package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.ClassProductoCL2Imp;
import model.TblProductocl2;

/**
 * Servlet implementation class ControladorProductoCL2
 */
public class ControladorProductoCL2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorProductoCL2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
			TblProductocl2 producto = new TblProductocl2();
			ClassProductoCL2Imp crud = new ClassProductoCL2Imp();
			List<TblProductocl2> listadoproductos=crud.ListadoProducto();
		//invocamos el listado  de productos para la vista
		request.setAttribute("listadodeproductos",listadoproductos);
		//redireccionamos
		request.getRequestDispatcher("/ListadoDeProductos.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		//recuperamos los valores del formulario...
				String idpro=request.getParameter("idproducto");
				String nombrepro=request.getParameter("nombre");
				String precioven=request.getParameter("precioVen");
				String preciocom=request.getParameter("precioCom");		
				String estad=request.getParameter("estado");
				String descrip=request.getParameter("descripcion");
						
				//instanciar las respectivas entidades...
				TblProductocl2 producto=new TblProductocl2();
				ClassProductoCL2Imp crud=new ClassProductoCL2Imp();
				//asignamos valores
				producto.setNombreCL2(nombrepro);
				producto.setPrecioventaCL2(Double.parseDouble(precioven));
				producto.setPreciocompCL2(Double.parseDouble(preciocom));
				producto.setEstadoCL2(estad);
				producto.setDescripCL2(descrip);
				 
				//invocamos el metodo registrar...
				crud.RegistrarProducto(producto);
				//actualizador listado de clientes
				List<TblProductocl2> listadoproductos = crud.ListadoProducto();
				//invocamos el listado  de productos para la vista
				request.setAttribute("listadodeproductos",listadoproductos);
				//redireccionamos
				request.getRequestDispatcher("/ListadoDeProductos.jsp").forward(request, response);
	}

}
