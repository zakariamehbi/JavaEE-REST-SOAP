package org.sid;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@WebService
public class RessourceSoapService {
	@Autowired
	private RessourceRepository ressourceRepository;

	@WebMethod(operationName = "listRessources")
	public List<Ressource> list() {
		return ressourceRepository.findAll();
	}

	@WebMethod
	public Ressource getOne(@WebParam(name = "id") Long id) {
		return ressourceRepository.findById(id).get();
	}
}
