package Interfaces;

import java.util.List;

import model.TblUsuariocl2;

public interface IUsuariocl2 {
	
	//declaremos los metodos
	public void RegistrarUsuario(TblUsuariocl2 usuario);	
	public List<TblUsuariocl2> ListadoUsuario();
	public TblUsuariocl2 validarUsuario(String vLogin, String vClave);
}
