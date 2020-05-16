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

import co.agro.blockchain.CompanyRegistration.controllers.EmpresaController;
import co.agro.blockchain.CompanyRegistration.model.Empresa;
import co.agro.blockchain.CompanyRegistration.service.EmpresaService;

@RestController
public class EmpresaControllerImpl implements EmpresaController {

	@Autowired
	EmpresaService empresaService;

	@Override
	@RequestMapping(value = "/empresas", method = RequestMethod.GET, produces = "application/json")
	public List<Empresa> getEmpresas() {
		return empresaService.findAllEmpresas();
	}

	@Override
	@RequestMapping(value = "/empresas/{id}", method = RequestMethod.GET, produces = "application/json")
	public Optional<Empresa> getEmpresaById(@PathVariable String id) {
		return empresaService.findEmpresaById(id);
	}

	@Override
	@PostMapping(value = "/empresas/add")
	public ResponseEntity<?> addEmpresa(@RequestBody Empresa empresa) {
		final Empresa empresaRetorno= empresaService.saveEmpresa(empresa);
		if(empresaRetorno.getIdEmpresa()!=null) {
			return ResponseEntity.ok("Empresa agregada correctamente");
		}else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Empresa previamente creada");
		}
	}

	@Override
	@RequestMapping(value = "/empresas/delete/{id}", method = RequestMethod.GET, produces = "application/json")
	public String deleteEmpresa(@PathVariable String id) {
		return empresaService.deleteEmpresa(id);
	}

	@Override
	@PostMapping(value = "/empresas/update")
	public String updateEmpresa(@RequestBody Empresa empresa) {
		return empresaService.updateEmpresa(empresa);
	}

	@Override
	@RequestMapping(value = "/test", method = RequestMethod.GET, produces = "application/json")
	public String test() {
		return "Test done";
	}

}
