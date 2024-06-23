package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_usuariocl2 database table.
 * 
 */
@Entity
@Table(name="tbl_usuariocl2")
@NamedQuery(name="TblUsuariocl2.findAll", query="SELECT t FROM TblUsuariocl2 t")
public class TblUsuariocl2 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idusuarioCL2;

	private String passwordCL2;

	private String usuarioCL2;

	public TblUsuariocl2() {
	}

	public int getIdusuarioCL2() {
		return this.idusuarioCL2;
	}

	public void setIdusuarioCL2(int idusuarioCL2) {
		this.idusuarioCL2 = idusuarioCL2;
	}

	public String getPasswordCL2() {
		return this.passwordCL2;
	}

	public void setPasswordCL2(String passwordCL2) {
		this.passwordCL2 = passwordCL2;
	}

	public String getUsuarioCL2() {
		return this.usuarioCL2;
	}

	public void setUsuarioCL2(String usuarioCL2) {
		this.usuarioCL2 = usuarioCL2;
	}

}