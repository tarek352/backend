package spring.session.EvalCand.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import spring.session.EvalCand.entities.Coach;
import spring.session.EvalCand.entities.QR;
import spring.session.EvalCand.repositories.QRRepository;
import spring.session.EvalCand.services.QRService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/quiz")
public class quizController {
	@Autowired
	QRRepository qrRepository;

	@Autowired
	QRService QRService;
	
	@RequestMapping(path = "/add", method = RequestMethod.POST)
	public void addCoach(@RequestBody QR QR) {
		QRService.AjoutQR(QR ); 
	}
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void deleteQR(@PathVariable("id") Integer id) {

		QR QR = QRService.getId_QR(id);
		QRService.deleteQR(QR);
 	}

}
