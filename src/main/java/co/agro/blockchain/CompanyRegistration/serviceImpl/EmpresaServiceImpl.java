package co.agro.blockchain.CompanyRegistration.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.agro.blockchain.CompanyRegistration.model.Empresa;
import co.agro.blockchain.CompanyRegistration.repository.IEmpresaRepo;
import co.agro.blockchain.CompanyRegistration.service.EmpresaService;
import co.agro.blockchain.CompanyRegistration.utils.Utils;

@Service
public class EmpresaServiceImpl implements EmpresaService {

	@Autowired
	IEmpresaRepo empresaRepo;

	@Override
	public List<Empresa> findAllEmpresas() {
		return empresaRepo.findAll();
	}

	@Override
	public Optional<Empresa> findEmpresaById(final String id) {
		Optional<Empresa> empresa = empresaRepo.findById(id);
		return empresa;
	}

	@Override
	public Empresa saveEmpresa(final Empresa empresaNew) {
		if (empresaNew != null) {
			if (!empresaRepo.findById(empresaNew.getIdEmpresa()).isPresent()) {
				return empresaRepo.save(empresaNew);
			}
		}
		return new Empresa();
	}

	@Override
	public String deleteEmpresa(final String id) {
		if (empresaRepo.findById(id).isPresent()) {
			empresaRepo.deleteById(id);
			return "Empresa con ID '" + id + "' eliminada correctamente.";
		}
		return "No se puede eliminar el registro porque la empresa con ID '" + id + "' no existe";
	}

	@Override
	public String updateEmpresa(final Empresa empresaNew) {
		final Optional<Empresa> empDatabaseOptional = empresaRepo.findById(empresaNew.getIdEmpresa());
		if (empDatabaseOptional.isPresent()) {
			final Empresa empresaRecordDb = empDatabaseOptional.get();
			Utils.copyNonNullProperties(empresaNew, empresaRecordDb);
			empresaRepo.save(empresaRecordDb);
			return "Empresa con ID '" + empresaNew.getIdEmpresa() + "', correctamente modificado";
		}
		return "Error al modificar la empresa con ID '" + empresaNew.getIdEmpresa()
				+ "', posiblemente no existe en la base de datos.";
	}


}
