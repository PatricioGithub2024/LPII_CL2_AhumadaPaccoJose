package TestEntidades;

import java.util.List;

import Dao.ClassProductoCL2Imp;
import model.TblProductocl2;

public class TestEntidadProductoCL2 {

	public static void main(String[] args) {
		// instancias
		TblProductocl2 prod = new TblProductocl2();
		ClassProductoCL2Imp crud = new ClassProductoCL2Imp();
		
		/*	// insertar
		prod.setNombreCL2("Aceitunas");
		prod.setPrecioventaCL2(4.50);
		prod.setPreciocompCL2(3.90);
		prod.setEstadoCL2("vigente");
		prod.setDescripCL2("oferta");
		
		crud.RegistrarProducto(prod);
		*/
	
		// listar
		
		List<TblProductocl2> listadoproductos = crud.ListadoProducto();
			
		for(TblProductocl2 listar:listadoproductos) {
	
		System.out.println(
				"codigo :"+listar.getIdproductoCL2()+"\n"+
				"nombre :"+listar.getNombreCL2()+"\n"+
				"precioVenta :"+listar.getPrecioventaCL2()+"\n"+
				"precioCompra :"+listar.getPreciocompCL2()+"\n"+
				"Estado :"+listar.getEstadoCL2() +"\n"+
				"Descripcion :"+listar.getDescripCL2()+"\n"+
				"--------------------------------------------"+
				"\n"
				);

	} // fin del metodo principal ...
		

	}

}
