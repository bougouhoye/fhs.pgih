package fhs.pgih.domaines;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class Executant implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idExecutant;
	private String codeExecutant;
	private String nomExecutant;
	private String prenomExecutant;
	private String sexeExecutant;
	private Date DateNaissanceExecutant;
	private String telephoneExecutant;
	private String adresseExecutant;
	private String titreExecutant;
	
	
	
}
