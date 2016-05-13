package com.dountil.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dountil.model.Goal;

@Controller
public class GoalController {

	@RequestMapping(value="/addGoal", method = RequestMethod.GET)
	public String addGoal(Model model) {
		model.addAttribute("goal", new Goal());
		return "addGoal";
	}
}
