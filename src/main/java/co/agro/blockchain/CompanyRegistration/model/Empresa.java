package co.agro.blockchain.CompanyRegistration.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPRESA", schema = "AGRO_CHAIN_PLATFORM")
public class Empresa {

	
	@Id
	@Column(name="ID_EMPRESA")
	private String idEmpresa;
	@Column(name ="NOMBRE_EMPRESA")
	private String nombreEmpresa;
	@Column(name="RAZON_SOCIAL_EMPRESA")
	private String razonSocialEmpresa;
	@Column(name="DIRECCION_PRINCIPAL")
	private String direccionPrincipal;
	@Column(name="PRIVATE_KEY")
	private String privateKey;
	@Column(name="PUBLIC_KEY")
	private String publicKey;
	
	public Empresa() {
		//constructor principal
	}

	public String getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(String idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getRazonSocialEmpresa() {
		return razonSocialEmpresa;
	}

	public void setRazonSocialEmpresa(String razonSocialEmpresa) {
		this.razonSocialEmpresa = razonSocialEmpresa;
	}

	public String getDireccionPrincipal() {
		return direccionPrincipal;
	}

	public void setDireccionPrincipal(String direccionPrincipal) {
		this.direccionPrincipal = direccionPrincipal;
	}

	public String getPrivateKey() {
		return privateKey;
	}

	public void setPrivateKey(String privateKey) {
		this.privateKey = privateKey;
	}

	public String getPublicKey() {
		return publicKey;
	}

	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}

}
