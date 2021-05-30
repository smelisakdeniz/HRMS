package kodlamaio.hrmsday6homework.business.abstracts;

import java.util.List;

import kodlamaio.hrmsday6homework.entities.concretes.JobPosition;

public interface JobPositionService {
	List<JobPosition> getAll();
}
