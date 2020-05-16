package co.agro.blockchain.CompanyRegistration.model;

import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Table(name="ESTADO_PRODUCTO", schema = "AGRO_CHAIN_PLATFORM")
public class EstadoProducto {
	
	@Id
	@Column(name = "ID_ESTADO_PRODUCTO")
	private String idEstadoProducto;
	@Column(name = "DESCRIPCION")
	private String descripcion;
	
	public EstadoProducto() {
		//Constructor basico
	}

	public String getIdEstadoProducto() {
		return idEstadoProducto;
	}

	public void setIdEstadoProducto(String idEstadoProducto) {
		this.idEstadoProducto = idEstadoProducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
