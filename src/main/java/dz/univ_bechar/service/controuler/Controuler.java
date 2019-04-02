package dz.univ_bechar.service.controuler;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

import com.fasterxml.jackson.annotation.JsonFormat;

import dz.univ_bechar.service.SocialSecurityApplication;
import dz.univ_bechar.service.entity.AtenstationNember;
import dz.univ_bechar.service.repository.SocialRepository;

@Controller
@RequestMapping(path ="/")
public class Controuler {
	@Autowired
	SocialRepository dao;
	@PersistenceContext
	private EntityManager em;
	@RequestMapping(path = "add",method = RequestMethod.POST)
	public @ResponseBody Object save(@RequestParam(name = "name") String name ,@RequestParam(name = "famlyname") String fname,@RequestParam(name = "date") String date) {

		AtenstationNember a = new AtenstationNember(name, fname, date);
		dao.save(a);
		//SocialSecurityApplication.fich.save(a);
		
		return a;

	
	}
	
	@RequestMapping(path = "update",method = RequestMethod.POST)
	public @ResponseBody Object update(@RequestParam(name = "name") String name ,@RequestParam(name = "famlyname") String fname,@RequestParam(name = "date") String date) {

		AtenstationNember a = new AtenstationNember(name, fname, date);
		//dao.
		//SocialSecurityApplication.fich.update(a);
		
		return a;

	
	}
	
	@RequestMapping(path = "delete",method = RequestMethod.DELETE)
	public @ResponseBody String delete(@RequestParam(name = "nss") Long nss) {
		dao.deleteById(nss);
		//SocialSecurityApplication.fich.delete(nss);
		return new String("deleted !!");
	}
	@RequestMapping(path = "list",method = RequestMethod.GET,produces = "Application/Json")
	public @ResponseBody Iterable<AtenstationNember> list(){
		List<AtenstationNember> i = (List<AtenstationNember>) dao.findAll();
		for (AtenstationNember element : i) {
			System.out.println(element.toString()+"\n");
		}
		return i;
	}
	
	
	
	
	
	
	
	
	
	
	
}
