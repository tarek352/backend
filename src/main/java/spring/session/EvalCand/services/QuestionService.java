package spring.session.EvalCand.services;

import java.util.List;

import spring.session.EvalCand.entities.Questions;
import spring.session.EvalCand.entities.Reponses;

public interface QuestionService {
	public void AjoutQR(Questions Questions);
	public void deleteQR(Questions Questions);
	public Questions getId_Question(Integer id_Question);
//	public List<Reponses> getAll();	 
	public List<Questions> GetAll();
}
