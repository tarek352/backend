package spring.session.EvalCand.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import spring.session.EvalCand.entities.Questions;
import spring.session.EvalCand.entities.Reponses;
import spring.session.EvalCand.repositories.QuestionRepository;
import spring.session.EvalCand.repositories.ReponseRepository;
import spring.session.EvalCand.services.QuestionService;
import spring.session.EvalCand.services.DataService;
import spring.session.EvalCand.services.ReponseService;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/Questions")
public class QuestionController {
	@Autowired
	QuestionRepository questionrepository;
	@Autowired
	QuestionService questionservice;
	@Autowired
	ReponseRepository reponseRepository;	
	@Autowired
    ReponseService reponseService;
	
	@RequestMapping(path = "/add", method = RequestMethod.POST)
	public void saveQuestion(@RequestBody DataService data) {		
		System.out.println("*******************data*************************");
		System.out.println(data);
		System.out.println("*******************data*************************");
		questionrepository.save(data.q);
		int i = 0;
		for(i=0; i < data.r.length; i++)
		{
			data.r[i].questions = data.q;
			reponseRepository.save(data.r[i]);
		}
	}
	
	 @RequestMapping(path = "/delete/{id}", method = RequestMethod.DELETE)
	   	public void deleteQR(@PathVariable("id") Integer id ) {
	    	
		 Questions question = questionservice.getId_Question(id);
		 questionservice.deleteQR(question);	   		
	   	}
	 @RequestMapping(path = "/display", method = RequestMethod.GET)
		public List<Questions> GetAll() {
			System.out.println("here");
			return questionservice.GetAll();
		}

}
