package co.agro.blockchain.CompanyRegistration.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import co.agro.blockchain.CompanyRegistration.model.EstadoProducto;

public interface EstadoProductoController {

	List<EstadoProducto> listarEstadosProducto();
	
	Optional<EstadoProducto> consultarEstadosProdById(final String idEstadoProd);
	
	ResponseEntity<?> agregarEstadoProducto(final EstadoProducto estadoProd);
	
	ResponseEntity<?> eliminarEstadoProducto(final String idEstadoProd);
	
	ResponseEntity<?> actualizarEstadoProducto(final EstadoProducto estadoProd);
}
