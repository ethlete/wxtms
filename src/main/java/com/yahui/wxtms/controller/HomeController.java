package com.yahui.wxtms.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yahui.wxtms.domain.manage.TmsUser;
import com.yahui.wxtms.service.TmsUserService;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	private HttpServletRequest request;
	
	@Autowired TmsUserService tmsUserService;
	
	@GetMapping
	public ModelAndView home() {
		if(request.getSession(false) == null)
			return new ModelAndView("login");
		return new ModelAndView("index");
	}
	
	@PostMapping("/login")
	public ModelAndView login(@ModelAttribute TmsUser user) {
		if(tmsUserService.verifyUser(user) != null) {
			request.getSession().setAttribute("user", user);
			return new ModelAndView("index", "user", user);
		}
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("user", user);
		result.put("verified", false);
		return new ModelAndView("login", "result", result);
		
	}

}
