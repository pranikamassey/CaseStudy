package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.EmpDao;
import com.example.demo.models.Employee;

@Controller
public class MyController {
	@Autowired
	EmpDao dao;
	
	@RequestMapping("/login")
	public String loginPage()
	{
		return "login.html";
	}
	
	@RequestMapping("/verify")
	public String verify()
	{
			return "function.html";
	}
	
	@RequestMapping("/AddEmp")
	public String AddEmp(Employee e)
	{
			dao.save(e);
			return "AddEmp.html";
	}
	
	@RequestMapping("/search")
	public String search()
	{
			return "search.html";
	}
	
	@RequestMapping("/viewEdit")
	public String viewEdit()
	{
			return "viewEdit.html";
	}
	
	@RequestMapping("/compensation")
	public String compensation()
	{
			return "compensation.html";
	}
	
	@RequestMapping("/compensationHistory")
	public String compensationHistory()
	{
			return "compensationHistory.html";
	}
	
	@RequestMapping("/compensationBreakdown")
	public String compensationBreakdown()
	{
			return "compensationBreakdown.html";
	}
	
	@RequestMapping("/compensationEdit")
	public String compensationEdit()
	{
			return "compensationEdit.html";
	}
	


	

}
