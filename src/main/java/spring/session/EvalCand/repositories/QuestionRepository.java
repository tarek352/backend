package spring.session.EvalCand.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.session.EvalCand.entities.*;

@Repository("QuestionRepository")
public interface QuestionRepository extends JpaRepository<Questions,Integer>{

}
