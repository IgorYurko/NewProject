package com.messaging_service.controllers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.messaging_service.model.Posts;
import com.messaging_service.model.Users;
import com.messaging_service.service.IPostsService;
import com.messaging_service.service.IUsersService;
import com.messaging_service.service.impl.PostsServiceImpl;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = Logger.getLogger(HomeController.class);
	
	@Autowired
	private IPostsService posts;
	
	@Autowired
	private IUsersService users;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.debug("Welcome home! The client locale is {}.");
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", date );
		
		SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy H:mm:ss");
		
		model.addAttribute("format", format);
		
//		List<Posts> res = posts.findAll();
		
//		List<Users> res = users.findAll();

		List<Posts> allPosts = posts.findAll();
		
		model.addAttribute("allPosts", allPosts);
		
		return "home";
	}
	
}
