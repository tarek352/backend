package spring.session.EvalCand.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.session.EvalCand.entities.Reponses;
import spring.session.EvalCand.repositories.ReponseRepository;





@Service("ReponseService")
public class ReponseServicelmpl implements ReponseService{ 
	@PersistenceContext
	EntityManager em ;
	
	@Autowired
	ReponseRepository Reponserepository;
	
	@Override
	public void AjouterReponses(Reponses Reponse) {
		// TODO Auto-generated method stub
		Reponserepository.save(Reponse);	
	}
	@Override
	@Transactional
	public void DeleteReponses(Reponses Reponse) {
		em.remove(Reponse);
	}
	@Override
	public List<Reponses> getAll() {
		// TODO Auto-generated method stub
		return Reponserepository.findAll();
	}
	@Override
	public Reponses getId_reponses(Integer id) {
		// TODO Auto-generated method stub
		return Reponserepository.getOne(id); 
	}
}
