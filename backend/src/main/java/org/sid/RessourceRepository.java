package org.sid;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RessourceRepository extends JpaRepository<Ressource, Long> {
	public List<Ressource> findByNomContains(String nom);
}