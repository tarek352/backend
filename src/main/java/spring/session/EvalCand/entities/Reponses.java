package spring.session.EvalCand.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;



// import spring.session.EvalCand.entities.*;


@Entity  
public class Reponses {
	@Id  
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private int id_reponses; 
	private String reponse;
    private Boolean correct;
    @ManyToOne(cascade = CascadeType.ALL) 
    @JoinColumn(name = "id_question")
    public Questions questions; 
    
    public Reponses() {
    	super();
    }
    public Reponses(int id_reponses, String reponse, Boolean correct,Questions questions) {
    	
    	this.setId_reponses(id_reponses);
    	this.reponse=reponse; 
    	this.correct=correct;
    	this.questions = questions;    
    }
    
	public String getReponse() {
		return reponse;
	}
	public void setReponse(String reponse) {
		this.reponse = reponse;
	}
	public Boolean getCorrect() {
		return correct;
	}
	public void setCorrect(Boolean correct) {
		this.correct = correct;
	}
	public int getId_reponses() {
		return id_reponses;
	}
	public void setId_reponses(int id_reponses) {
		this.id_reponses = id_reponses;
	}
	@JsonIgnore
	public Questions getid_question() {
		return this.questions;
	}

	public void setid_question(Questions id_question) {
		this.questions = id_question;
	}
}
