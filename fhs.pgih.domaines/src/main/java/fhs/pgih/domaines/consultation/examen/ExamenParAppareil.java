package fhs.pgih.domaines.consultation.examen;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class ExamenParAppareil implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idExamenParAppareil;
	
	private Long inspection;
	private Long palpation;
	private Long percussion;
	private Long auscultation;
	
	
}
