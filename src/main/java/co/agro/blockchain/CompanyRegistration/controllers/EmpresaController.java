package co.agro.blockchain.CompanyRegistration.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import co.agro.blockchain.CompanyRegistration.model.Empresa;

public interface EmpresaController {

	
	public List<Empresa> getEmpresas();
	
	public Optional<Empresa> getEmpresaById(final String id);
	
	public ResponseEntity<?> addEmpresa(final Empresa empresa);
	
	public String deleteEmpresa(final String id);
	
	public String updateEmpresa(final Empresa empresa);
	
	public String test();
}
