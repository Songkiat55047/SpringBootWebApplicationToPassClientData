package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class WebController {
	
	@RequestMapping("/view")
	public String view(HttpServletRequest req) {
		String viewPage = req.getParameter("viewPage");
		HttpSession session = req.getSession();
		session.setAttribute("viewPage", viewPage);
		return "view";
	}

}
