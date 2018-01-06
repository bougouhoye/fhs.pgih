package fhs.pgih.domaines.consultation;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import fhs.pgih.domaines.Executant;
import fhs.pgih.domaines.Patient;
import lombok.Data;

@Data
@Entity
public class Consultation implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private Long idConsultation;
	
	private String motifConsultation;
	
	private Consultation antecedent;
	
	private String histoireDeLaMaladie;
	
	private Date dateConsultation;
	
	private Patient patient;
	
	private List<Executant> executants;
	
	private ExamenClinique examenClinique;
	
	private ExamenGenerale examenGenerale;
	
	
}
