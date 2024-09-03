package com.crud.revanth.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.crud.revanth.Model.StuModel;
import com.crud.revanth.Repository.StuRepo;

@Controller
public class StuController {
	@Autowired
	StuRepo sturepo;
	
	@RequestMapping("index")
	public String index() {
		return "index.jsp";
		
	}
	@RequestMapping("/addStudent")
	public String addStudent(@ModelAttribute StuModel stumodel) {
		sturepo.save(stumodel);
		return "index.jsp";
	}
	@RequestMapping("getStudent")
	public ModelAndView getStudent(@RequestParam int sid) {
		ModelAndView mv=new ModelAndView("display.jsp");
		StuModel stumodel=sturepo.findById(sid).orElse(new StuModel());
		mv.addObject("student",stumodel);
		return mv;
	}
	@RequestMapping("deleteStudent")
	public String deleteStudent(@RequestParam int sid) {
		StuModel stumodel=sturepo.findById(sid).orElse(null);
		if(stumodel != null) {
			sturepo.delete(stumodel);
		}
		return "index.jsp";
	}
}
