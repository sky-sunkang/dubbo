package com.sunkang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
/**
 * 首页的控制器
 * @author sunkang
 *
 */
@Controller
public class IndexController {
	
	/**
	 * 跳转到首页
	 * @return
	 */
	@RequestMapping(value="index")
	public ModelAndView toIndex(){
		ModelAndView modelAndView=new ModelAndView("index");
		return modelAndView;
	}
}
