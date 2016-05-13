package com.dountil.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dountil.model.Exercise;

@Controller
public class MinutesController {

	@RequestMapping(value = "addMinutes")
	public String addMinutes(@ModelAttribute("exercise") Exercise exercise){
		System.out.println(String.format("excersice: %s", exercise.getMinutes()));
		return "redirect:addMoreMinutes.html";
	}
	
	@RequestMapping(value = "addMoreMinutes")
	public String addMoreMinutes(@ModelAttribute("exercise") Exercise exercise){
		System.out.println(String.format("excersicing: %s", exercise.getMinutes()));
		return "addMinutes";
	}
}
