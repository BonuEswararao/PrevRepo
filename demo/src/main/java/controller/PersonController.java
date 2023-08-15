package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Person;

@Controller
public class PersonController {

	@RequestMapping("/person")
	public String person(Model model) {
		Person p = new Person();
		p.setFirstName("Eswar");
		p.setLastName("Bonu");
		p.setAge(27);
		model.addAttribute("person", p);
		return "personview";
		
	}
	@RequestMapping("/person1")
	public String person1(Model model) {
	Person p1 = new Person();
	p1.setFirstName("Eswararao");
	p1.setLastName("Yadav");
	p1.setAge(28);
	model.addAttribute("person", p1);
	return "personview";
	}
	@ResponseBody
	@RequestMapping("/")
	String entry() {
		return "Eswar Spring Boot App";
	}

}
