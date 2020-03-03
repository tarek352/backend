package spring.session.EvalCand.services;

import org.springframework.stereotype.Service;

import spring.session.EvalCand.entities.Questions;
import spring.session.EvalCand.entities.Reponses;
import spring.session.EvalCand.repositories.QuestionRepository;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository; 

@Service("QuestionService") 
public class QuestionServicelmpl implements QuestionService { 
	@Autowired
	QuestionRepository questionrepository;   
	@Override
	public List <Questions> GetAll() { 
		// TODO Auto-generated method stub
		List <Questions> Q = questionrepository.findAll();
		System.out.println(Q);
		return Q;
	}
	@Override
	public Questions getId_Question(Integer id_Question) {
		// TODO Auto-generated method stub
		return questionrepository.getOne(id_Question);
	}

	@Override
	public void  AjoutQR(Questions Questions) {
		// TODO Auto-generated method stub 
		 
	}

	@Override
	public void deleteQR(Questions Questions) { 
		// TODO Auto-generated method stub
		
	}
}