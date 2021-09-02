package fi.syksy2021.Week2.Student.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import fi.syksy2021.Week2.Student.domain.Student;

@Controller
public class StudentController {
	
	ArrayList<Student> students =new ArrayList<>();

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String greetingForm(Model model) {
		model.addAttribute("student", new Student());
		return "hello";

}
}
