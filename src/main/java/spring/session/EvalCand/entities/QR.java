package spring.session.EvalCand.entities;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
public class QR {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id_QR;
	private String Titre;
	private String Question;
	private String remarque;
	private String Reponse;
	private String ReponseCandidat;
	@ManyToOne
	private Evaluation evaluation;
		
	
	public Evaluation getEvaluation() {
		return evaluation;
	}

	public void setEvaluation(Evaluation evaluation) {
		this.evaluation = evaluation;
	}

	public QR(int id_QR, String titre, String question, String remarque, String reponse, String reponseCandidat,
			Evaluation evaluation) {
		super();
		Id_QR = id_QR;
		Titre = titre;
		Question = question;
		this.remarque = remarque;
		Reponse = reponse;
		ReponseCandidat = reponseCandidat;
//		this.evaluation = evaluation;
	}

	public int getId_QR() {
		return Id_QR;
	}

	public void setId_QR(int id_QR) {
		Id_QR = id_QR;
	}


	public String getTitre() {
		return Titre;
	}


	public void setTitre(String titre) {
		Titre = titre;
	}


	public String getQuestion() {
		return Question;
	}


	public void setQuestion(String question) {
		Question = question;
	}


	public String getRemarque() {
		return remarque;
	}


	public void setRemarque(String remarque) {
		this.remarque = remarque;
	}


	public String getReponse() {
		return Reponse;
	}


	public void setReponse(String reponse) {
		Reponse = reponse;
	}


	public String getReponseCandidat() {
		return ReponseCandidat;
	}


	public void setReponseCandidat(String reponseCandidat) {
		ReponseCandidat = reponseCandidat;
	}

	@Override
	public String toString() {
		return "QR [Id_QR=" + Id_QR + ", Titre=" + Titre + ", Question=" + Question + ", remarque=" + remarque
				+ ", Reponse=" + Reponse + ", ReponseCandidat=" + ReponseCandidat + "]";
	}

		
	
	
}
