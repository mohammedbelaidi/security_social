package dz.univ_bechar.service.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AtenstationNember {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long nember;
	 private String name;
	 private String famelyName;
	 private Date date_of_birth;
	public AtenstationNember(String name, String famelyName, String date_of_birth) {
		
		this.name = name;
		this.famelyName = famelyName;
		this.date_of_birth = Date.valueOf(date_of_birth);
	}
	public AtenstationNember() {
	}
	 
	 
	 

}
