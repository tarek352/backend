package spring.session.EvalCand.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.session.EvalCand.entities.Candidat;

@Repository("CandidatRepository")
public interface CandidatRepository  extends JpaRepository<Candidat, Integer> {

}
