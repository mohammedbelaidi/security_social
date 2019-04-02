package dz.univ_bechar.service.repository;





import org.springframework.data.repository.CrudRepository;

//import java.util.List;

import dz.univ_bechar.service.entity.AtenstationNember;

public interface SocialRepository extends CrudRepository<AtenstationNember,Long>{

	/*public AtenstationNember save(AtenstationNember entity);
	public AtenstationNember update(AtenstationNember entity);
	public Iterable<AtenstationNember> viewList ();
	public AtenstationNember findOne(Long nss);
	public String delete(Long nss);
	*/
}
