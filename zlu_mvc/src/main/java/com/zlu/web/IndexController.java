package com.zlu.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class IndexController  {

@GetMapping("/index1")
@ResponseBody
public String index1(){
	return "success";
}

	@GetMapping("/index2")
	@ResponseBody
	public String index2(){
		return "success";
	}
}
