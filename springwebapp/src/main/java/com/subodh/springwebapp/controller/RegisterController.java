package com.subodh.springwebapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.subodh.springwebapp.appconstant.AppConstant;
import com.subodh.springwebapp.dto.RegisterDto;
import com.subodh.springwebapp.service.RegisterService;

@Component

@RequestMapping(value = AppConstant.FORWARDS_SLASH)

public class RegisterController {
	@Autowired
	private RegisterService registerService;
	public RegisterController() {
    	System.out.println(this.getClass().getSimpleName()+ "Controller ");
    }
//	@RequestMapping("/registration")
//    public String display(@RequestParam("name") String name,
//    		@RequestParam("email") String email,
//    		@RequestParam("contact") String contact,
//    		@RequestParam("city") String city,
//    		@RequestParam("country") String country,
//    		@RequestParam("pincode") String pincode
//    		) {
//		System.out.println(name+" " +email+" " +contact+" " +city+
//				" " +country+" " +pincode );
//    	System.out.println("reached display method");
//    	return "display.jsp";
//    }
	//@PostMapping(value = AppConstant.REGISTER_INFO)
	@RequestMapping(value=AppConstant.SAVE_REGISTER_DETAILS) //request ur url
    public ModelAndView saveRegisterDetails(RegisterDto registerDto) {
		System.out.println(registerDto);
		registerService.processRegisterDetails(registerDto);
    	return new ModelAndView ("display.jsp");
    }
	 
}
