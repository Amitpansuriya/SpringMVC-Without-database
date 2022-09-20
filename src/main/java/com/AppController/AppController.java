package com.AppController;


import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.entities.AddMvcApp;

@Controller
public class AppController {
	@Autowired
	ServletContext context;

	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("home")
	public String home(Model m) {
		
		String str="home";
		m.addAttribute("page", str);
		List<AddMvcApp> list=(List<AddMvcApp>)context.getAttribute("list");
		m.addAttribute("AddMvcApp",list);
		return "home";
	}
	
	@RequestMapping("Add")
	public String Add(Model m) {
		
		AddMvcApp t=new AddMvcApp();
		m.addAttribute("page", "Add");
		m.addAttribute("AddMvcApp", t);
		return "home";
	}
	@RequestMapping(value="saveApp",method=RequestMethod.POST )
	public String saveApp(@ModelAttribute("AddMvcApp") AddMvcApp t, Model m) {
		System.out.println(t);
		t.setMvcdate(new Date());
		context.getAttribute("list");
		List<AddMvcApp> list=(List<AddMvcApp>)context.getAttribute("list");
		list.add(t);
		m.addAttribute("msg","successfully added......");
		return "home";
		
	}
}
