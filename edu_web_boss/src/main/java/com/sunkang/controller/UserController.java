package com.sunkang.controller;


import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sunkang.facade.common.entity.PageData;
import com.sunkang.facade.common.entity.ReturnData;
import com.sunkang.facade.entity.User;
import com.sunkang.facade.service.UserService;
/**
 * 
 * @ClassName: UserController 
 * @Description: 用户控制器
 * @author: sunkang
 * @date: 2017-3-30 下午2:59:36
 */
@Controller
public class UserController {
	
	private static Logger logger=Logger.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	/**
	 * @Title: toUserList 
	 * @Description: 用户管理界面
	 * @return
	 * @return: ModelAndView
	 */
	@RequestMapping("toUserList")
	public ModelAndView toUserList(){
		ModelAndView modelAndView=new ModelAndView("user_list");
//		List<User> list=userServic.findUserAll();
//		for(User user :list){
//			System.out.println(user.toString());
//		}
		return modelAndView;
	}
	
	/**
	 * 分页查询user
	 * @param userNo
	 * @param page
	 * @param rows
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="selectUser",method=RequestMethod.GET,produces = "text/html;charset=UTF-8")
	public String selectUser(User user,HttpServletResponse pos){
		//设置起始数据数据
		user.setStartSize((user.getPage()-1)*user.getRows());
		List<User> users=userService.selectUser(user);
		Integer total=userService.countUser(user);
		PageData pageData=new PageData();
		pageData.setTotal(total);
		pageData.setRows(users);
		
		ObjectMapper objectMapper=new ObjectMapper();
		String usersJson=null;
		try {
			usersJson = objectMapper.writeValueAsString(pageData);
		} catch (JsonProcessingException e) {
			logger.error(e);
		}
		System.out.println(usersJson);
		return usersJson;
	}
	
	/**
	 * 跳转到用户新增修改页面
	 * @param user
	 * @return
	 */
	@RequestMapping(value="addUser")
	public ModelAndView addUser(User user){
		ModelAndView modelAndView=new ModelAndView("user_add");
		user=userService.selectUserById(user.getId());
		modelAndView.addObject("user", user);
		return modelAndView;
	}
	
	/**
	 * 新增修改用户
	 * @param user
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="saveUser")
	public ReturnData saveUser(User user){
//		ObjectMapper objectMapper=new ObjectMapper();
//		String usersJson=null;
//		try {
//			return objectMapper .writeValueAsString(new ReturnData(true,"保存成功！")) ;
//		} catch (JsonProcessingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		return new ReturnData("success","保存成功！");
	}
}
