package co.agro.blockchain.CompanyRegistration.service;

import java.util.List;
import java.util.Optional;

import co.agro.blockchain.CompanyRegistration.model.EstadoProducto;

public interface EstadoProdService {

	List<EstadoProducto> getListaEstadosProducto();
	
	Optional<EstadoProducto> consultarEstadoProducto(String id);
	
	EstadoProducto agregarEstadoProducto(final EstadoProducto estadoProd);
	
	Boolean deleteEstadoProducto(final String id);
	
	Boolean updateEstadoProducto(final EstadoProducto estadoProd);
	
}
