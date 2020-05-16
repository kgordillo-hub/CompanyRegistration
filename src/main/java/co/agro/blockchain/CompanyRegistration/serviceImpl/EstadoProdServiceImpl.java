package co.agro.blockchain.CompanyRegistration.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.agro.blockchain.CompanyRegistration.model.EstadoProducto;
import co.agro.blockchain.CompanyRegistration.repository.IEstadoProductoRepo;
import co.agro.blockchain.CompanyRegistration.service.EstadoProdService;
import co.agro.blockchain.CompanyRegistration.utils.Utils;

@Service
public class EstadoProdServiceImpl implements EstadoProdService {

	@Autowired
	IEstadoProductoRepo estadoProdRepo;

	@Override
	public List<EstadoProducto> getListaEstadosProducto() {
		return estadoProdRepo.findAll();
	}

	@Override
	public Optional<EstadoProducto> consultarEstadoProducto(final String id) {
		return estadoProdRepo.findById(id);
	}

	@Override
	public EstadoProducto agregarEstadoProducto(final EstadoProducto estadoProd) {
		if (estadoProd != null && !estadoProdRepo.findById(estadoProd.getIdEstadoProducto()).isPresent()) {
			return estadoProdRepo.save(estadoProd);
		}
		return new EstadoProducto();
	}

	@Override
	public Boolean deleteEstadoProducto(final String id) {
		if (estadoProdRepo.findById(id).isPresent()) {
			estadoProdRepo.deleteById(id);
			return true;
		}
		return false;
	}

	@Override
	public Boolean updateEstadoProducto(final EstadoProducto estadoProd) {
		final Optional<EstadoProducto> estadoProdTmp = estadoProdRepo.findById(estadoProd.getIdEstadoProducto());
		if (estadoProdTmp.isPresent()) {
			final EstadoProducto estadoProdRecordDb = estadoProdTmp.get();
			Utils.copyNonNullProperties(estadoProd, estadoProdRecordDb);
			estadoProdRepo.save(estadoProdRecordDb);
			return true;
		}
		return false;
	}

}
