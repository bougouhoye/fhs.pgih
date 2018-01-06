package fhs.pgih.domaines;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import fhs.pgih.domaines.consultation.Consultation;
import lombok.Data;

@Entity
@Data
public class Patient implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idPatient;
	
	private String nomPatient;
	
	private String prenomPatient;
	
	private String sexePatient;
	
	private Date DateDeNaissancePatient;
	
	private String professionPatient;
	
	private String etatCivilPatient;
	
	private String telephonePatient;
	
	private String adressePatient;
	
	private List<Consultation> consultations;
	
}
