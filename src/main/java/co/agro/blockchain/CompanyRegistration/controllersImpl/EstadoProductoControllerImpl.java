package co.agro.blockchain.CompanyRegistration.controllersImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.agro.blockchain.CompanyRegistration.controllers.EstadoProductoController;
import co.agro.blockchain.CompanyRegistration.model.EstadoProducto;
import co.agro.blockchain.CompanyRegistration.service.EstadoProdService;

@RestController
public class EstadoProductoControllerImpl implements EstadoProductoController {

	@Autowired
	EstadoProdService estadoProdService;

	@Override
	@RequestMapping(value = "/estadosProducto", method = RequestMethod.GET, produces = "application/json")
	public List<EstadoProducto> listarEstadosProducto() {
		return estadoProdService.getListaEstadosProducto();
	}

	@Override
	@RequestMapping(value = "/estadosProducto/{idEstadoProd}", method = RequestMethod.GET, produces = "application/json")
	public Optional<EstadoProducto> consultarEstadosProdById(@PathVariable final String idEstadoProd) {
		return estadoProdService.consultarEstadoProducto(idEstadoProd);
	}

	@Override
	@PostMapping(value = "/estadosProducto/add")
	public ResponseEntity<?> agregarEstadoProducto(@RequestBody final EstadoProducto estadoProd) {
		final EstadoProducto estadoProducto = estadoProdService.agregarEstadoProducto(estadoProd);
		if (estadoProducto.getIdEstadoProducto() != null) {
			return ResponseEntity.ok("Estado de producto agregado correctamente");
		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Estado de producto previamente creado");
		}
	}

	@Override
	@RequestMapping(value = "/estadosProducto/delete/{idEstadoProd}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<?> eliminarEstadoProducto(@PathVariable final String idEstadoProd) {
		if (estadoProdService.deleteEstadoProducto(idEstadoProd)) {
			return ResponseEntity.ok("Estado de producto correctamente eliminado");
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST)
				.body("Estado de producto no se ha eliminado, puede que no exista");
	}

	@Override
	@PostMapping(value = "/estadosProducto/update")
	public ResponseEntity<?> actualizarEstadoProducto(@RequestBody final EstadoProducto estadoProd) {
		if (estadoProdService.updateEstadoProducto(estadoProd)) {
			return ResponseEntity.ok("Estado de producto correctamente actualizado.");
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST)
				.body("Estado de producto no se ha actualizado, puede que no exista");
	}

}
