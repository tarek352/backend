package spring.session.EvalCand.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;



// import spring.session.EvalCand.entities.*;

@Entity 
public class Questions {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	 private int id_question;  
	private String payload;
	private String type; 
	 @OneToMany(fetch = FetchType.EAGER, mappedBy = "questions") 
	private List<Reponses> liste_rep = new ArrayList<Reponses>();

	public String getPayload() {
		return payload;
	}

	public void setPayload(String payload) {
		this.payload = payload;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	@JsonIgnore
	public List<Reponses> getListe_rep() {
		return liste_rep;
	}
	
	public void setListe_rep(List<Reponses> liste_rep) {
		this.liste_rep = liste_rep;
	}

	public int getId_question() {
		return id_question;
	}

	public void setId_question(int id_question) {
		this.id_question = id_question;
	} 
	public void setreponseListAddOne(Reponses reponse ) {
		this.liste_rep.add(reponse);
	}

	@Override
	public String toString() {
		return "Questions [id_question=" + id_question + ", payload=" + payload + ", type=" + type + ", liste_rep="
				+ liste_rep + "]";
	}
	
}
