package spring.session.EvalCand.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.session.EvalCand.entities.Reponses;

@Repository("ReponseRepository")
public interface ReponseRepository extends JpaRepository<Reponses,Integer>{

}
