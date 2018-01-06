package fhs.pgih.domaines.consultation;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import fhs.pgih.domaines.consultation.examen.ExamenParAppareil;
import fhs.pgih.domaines.consultation.examen.ExamenSignesGeneraux;
import lombok.Data;
@Data
@Entity
public class ExamenClinique implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idExamenClinique;
	
	private ExamenSignesGeneraux examenSignesGeneraux;
	private ExamenParAppareil examenParAppareil;	

}
