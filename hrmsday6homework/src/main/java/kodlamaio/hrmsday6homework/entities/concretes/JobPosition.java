package kodlamaio.hrmsday6homework.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="job_positions")
public class JobPosition {
	@Id
	@GeneratedValue
	@Column(name="job_positions_id")
	private int id;
	
	@Column(name="pasition_name")
	private String positionName;
	
	
	public JobPosition(int id, String positionName) {
		super();
		this.id = id;
		this.positionName = positionName;
	}
	
}
