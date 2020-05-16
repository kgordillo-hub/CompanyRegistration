package co.agro.blockchain.CompanyRegistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.agro.blockchain.CompanyRegistration.model.EstadoProducto;

public interface IEstadoProductoRepo extends JpaRepository<EstadoProducto, String>{

}
