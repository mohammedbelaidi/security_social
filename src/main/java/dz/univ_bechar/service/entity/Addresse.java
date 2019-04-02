package dz.univ_bechar.service.entity;





import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;





@Entity
@Embeddable
public class Addresse {


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String willaye;
	private String rue;
	private int code_postal;
	private String town;

	public Addresse() {
		
	}
	public Addresse( String willaye, String rue, String code_postal, String town) {
		super();
		this.willaye = willaye;
		this.rue = rue;
		this.code_postal = Integer.valueOf(code_postal);
		this.town = town;
	}
	public Integer getIdaddress() {
		return id;
	}
	public void setIdaddress(Integer idaddress) {
		this.id = idaddress;
	}
	public String getWillaye() {
		return willaye;
	}
	public void setWillaye(String willaye) {
		this.willaye = willaye;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public int getCode_postal() {
		return code_postal;
	}
	public void setCode_postal(String code_postal) {
		this.code_postal = Integer.valueOf(code_postal);;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	
	

}
