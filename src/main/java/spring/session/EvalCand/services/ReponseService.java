package spring.session.EvalCand.services;

import java.util.List;

import spring.session.EvalCand.entities.*;



public interface ReponseService {
	
    public List<Reponses>getAll(); 
	
	public Reponses getId_reponses(Integer id);
	
	public void  AjouterReponses(Reponses Reponse);
	
	public void DeleteReponses(Reponses Reponse); 
	
}
