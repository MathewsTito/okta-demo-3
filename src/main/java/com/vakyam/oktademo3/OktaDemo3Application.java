package com.vakyam.oktademo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
@Controller
public class OktaDemo3Application {

	public static void main(String[] args) {
		SpringApplication.run(OktaDemo3Application.class, args);
	}

	@RequestMapping(value="/index", method= RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		return mav;
	}

}
