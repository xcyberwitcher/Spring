package com.subodh.springwebapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.subodh.springwebapp.appconstant.AppConstant;
import com.subodh.springwebapp.dto.RegisterDto;
import com.subodh.springwebapp.entity.RegisterEntity;
import com.subodh.springwebapp.service.RegisterService;
//@Controller   //to create of class  
//@ResponseBody //convert java to json
@RestController //combination of controller and ResponseBody
@RequestMapping(value = AppConstant.FORWARDS_SLASH)
public class RegisterRestController {
   @Autowired
	private RegisterService registerService;
         
   
        @GetMapping(value = AppConstant.GET_ALL_REGISTER_DETAILS)//
		public @ResponseBody List<RegisterEntity> getRegisterDetails(){
			List<RegisterEntity> registerList = registerService.findAll();
			return registerList;
		}
        @PostMapping(value = AppConstant.SAVE_REGISTER)
        public void saveRegisterDetails(@RequestBody RegisterDto registerDto) {
    		registerService.processRegisterDetails(registerDto);
        }
        
        @GetMapping(value = AppConstant.FIND_BY_NAME)
	    public @ResponseBody RegisterEntity findByName(@PathVariable ("username") String name)
	    {
	    System.out.println(name);
	    RegisterEntity register = registerService.findByName(name);
	    System.out.println(register);
	    return register;
	    }
        @GetMapping(value = AppConstant.GET_BY_NAME)
	    public @ResponseBody RegisterEntity getByName(@RequestHeader("name") String name)
	    {
	    System.out.println(name);
	    return registerService.findByName(name);
	    }
	    
}