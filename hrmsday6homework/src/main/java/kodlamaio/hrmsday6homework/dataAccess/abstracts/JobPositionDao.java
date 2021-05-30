package kodlamaio.hrmsday6homework.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrmsday6homework.entities.concretes.JobPosition;


public interface JobPositionDao extends JpaRepository<JobPosition,Integer> {

}
