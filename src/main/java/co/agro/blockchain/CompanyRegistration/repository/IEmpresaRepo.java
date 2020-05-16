package co.agro.blockchain.CompanyRegistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.agro.blockchain.CompanyRegistration.model.Empresa;

public interface IEmpresaRepo extends JpaRepository<Empresa, String>{

	
}
