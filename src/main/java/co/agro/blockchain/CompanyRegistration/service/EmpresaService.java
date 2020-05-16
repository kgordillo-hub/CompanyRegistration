package co.agro.blockchain.CompanyRegistration.service;

import java.util.List;
import java.util.Optional;

import co.agro.blockchain.CompanyRegistration.model.Empresa;

public interface EmpresaService {

	List<Empresa> findAllEmpresas();

	Optional<Empresa> findEmpresaById(final String id);

	Empresa saveEmpresa(final Empresa empresaNew);

	String deleteEmpresa(final String id);

	String updateEmpresa(final Empresa empresaNew);
}
