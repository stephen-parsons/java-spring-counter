package com.stephen.counter.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class counterController {
	@RequestMapping("/your_server")
	public String counterSession(HttpSession session){
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 1);
		}
		else {
			session.setAttribute("count", (int) session.getAttribute("count") + 1);
		}
        return "counter.jsp";
    }
	@RequestMapping("/your_server/counter")
    public String counterPage() {
        return "counterPage.jsp";
    }
}
