package fhs.pgih.domaines.consultation.examen;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import fhs.pgih.domaines.consultation.examen.enumerations.Anorexie;
import fhs.pgih.domaines.consultation.examen.enumerations.Asthenie;
import fhs.pgih.domaines.consultation.examen.enumerations.VuePatient;
import lombok.Data;
@Data
@Entity
public class ExamenSignesGeneraux implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idExamenSignesGeneraux;
	private String température;
	private String tensionArterielle;
	private Long poids;
	private Long taille;
	private Long frequenceRespiratoire;
	private String amaigrissement;
	private Anorexie anorexie;	
	private Asthenie asthenie;
	private VuePatient vuePatient;
}
