package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_productocl2 database table.
 * 
 */
@Entity
@Table(name="tbl_productocl2")
@NamedQuery(name="TblProductocl2.findAll", query="SELECT t FROM TblProductocl2 t")
public class TblProductocl2 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idproductoCL2;

	private String descripCL2;

	private String estadoCL2;

	private String nombreCL2;

	private double preciocompCL2;

	private double precioventaCL2;

	public TblProductocl2() {
	}

	public int getIdproductoCL2() {
		return this.idproductoCL2;
	}

	public void setIdproductoCL2(int idproductoCL2) {
		this.idproductoCL2 = idproductoCL2;
	}

	public String getDescripCL2() {
		return this.descripCL2;
	}

	public void setDescripCL2(String descripCL2) {
		this.descripCL2 = descripCL2;
	}

	public String getEstadoCL2() {
		return this.estadoCL2;
	}

	public void setEstadoCL2(String estadoCL2) {
		this.estadoCL2 = estadoCL2;
	}

	public String getNombreCL2() {
		return this.nombreCL2;
	}

	public void setNombreCL2(String nombreCL2) {
		this.nombreCL2 = nombreCL2;
	}

	public double getPreciocompCL2() {
		return this.preciocompCL2;
	}

	public void setPreciocompCL2(double preciocompCL2) {
		this.preciocompCL2 = preciocompCL2;
	}

	public double getPrecioventaCL2() {
		return this.precioventaCL2;
	}

	public void setPrecioventaCL2(double precioventaCL2) {
		this.precioventaCL2 = precioventaCL2;
	}

}