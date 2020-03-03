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
import spring.session.EvalCand.repositories.ReponseRepository;
import spring.session.EvalCand.services.ReponseService;
import spring.session.EvalCand.services.QuestionService; 



@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/Reponse")
public class ReponseController {
	@Autowired
	ReponseRepository reponseRepository;
	
	@Autowired
   ReponseService reponseService;
	@Autowired
   QuestionService QuestionService;
	
	
	
	@RequestMapping(path = "/all", method = RequestMethod.GET)
	public List<Reponses> getAll() {
		System.out.println("here");

		return reponseService.getAll();
	}
//	@CrossOrigin(origins = "*")
//	@RequestMapping(path = "/add/{questionid}", method = RequestMethod.POST)
//	public void saveReponse(@RequestBody Reponses reponse, @PathVariable("questionid") Integer id) {
//
//		System.out.println("here");
//		Questions Questions = QuestionService.getId_Question(id);
//		System.out.println(Questions);
//
//		System.err.println("ksjdn" + Questions);
//
//		Questions.setreponseListAddOne(reponse);// affecter post -> user : master->slave
//		QuestionService.AjoutQR(Questions); //
//
//		Reponses.setid_question(Questions);// affecter user -> post : slave -> master   
//		reponseService.AjouterReponses(reponse);  
//
//	}
	
	@RequestMapping(path = "/addReponse", method = RequestMethod.GET)
	public void AjouterReponses(Reponses reponse) {
		reponseRepository.save(reponse);
	}
	
	@RequestMapping(path = "/delete/{id}", method = RequestMethod.DELETE)
	public void DeleteReponses(@PathVariable("id") Integer id) {
		Reponses reponse = reponseService.getId_reponses(id);

		System.out.println(reponse);
		reponseService.DeleteReponses(reponse);
	}
}
