package TestEntidades;

import java.util.List;

import Dao.ClassUsuarioCL2Imp;

import model.TblUsuariocl2;

public class TestEntidadUsuarioCL2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		// Instancias 
		TblUsuariocl2 usuario = new TblUsuariocl2();
		ClassUsuarioCL2Imp crud = new ClassUsuarioCL2Imp();
		
		/*
		// Insertar Usuario
		usuario.setUsuarioCL2("Tomas");
		usuario.setPasswordCL2("1234");
		crud.RegistrarUsuario(usuario);
		*/
		/*
		// Listar Usuario
		List<TblUsuariocl2> listadousuarios = crud.ListadoUsuario();
		
		for(TblUsuariocl2 listar:listadousuarios) {
	
		System.out.println(
				"codigo :"+listar.getIdusuarioCL2()+"\n"+
				"nombre :"+listar.getUsuarioCL2()+"\n"+
				"precioVenta :"+listar.getPasswordCL2()+"\n"+
				"--------------------------------------------"+
				"\n"
				);		
		} // fin del metodo principal ...
		*/
		
		// validar usuario
		usuario = crud.validarUsuario("Tomas", "1234");
		
		if (usuario != null) {
            System.out.print("usuario existe");
        } else {
            
        	System.out.print("usuario no existe");
        }
	}

}
