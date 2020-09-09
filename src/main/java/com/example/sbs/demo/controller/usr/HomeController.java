package com.example.sbs.demo.controller.usr;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.sbs.demo.dao.ArticleDao;

@Controller
public class HomeController {
	@Autowired
	private ArticleDao articleDao;

	@RequestMapping("/")
	@ResponseBody
	public String showMain() {
		return articleDao.getAllCount() + "개 입니다.";
	}

	@RequestMapping("/doSetSessionA")
	@ResponseBody
	public String doSetSessionA(HttpSession session) {
		session.setAttribute("a", 10);

		return "세션설정완료";
	}

	@RequestMapping("/getSessionA")
	@ResponseBody
	public int getSessionA(HttpSession session) {
		return (int) session.getAttribute("a");
	}
}
