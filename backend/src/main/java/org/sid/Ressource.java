package org.sid;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//http://localhost:8080/ressource
//http://localhost:8080/ressource?size=2&page=0

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ressource {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private Date dateAchat;
	private float prix;
	private float note;
	
}