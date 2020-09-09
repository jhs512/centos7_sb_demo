package com.example.sbs.demo.controller.usr;

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
		return articleDao.getAllCount() + "개!!";
	}
}
