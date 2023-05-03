package com.subodh.springwebapp.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.subodh.springwebapp.dto.RegisterDto;
import com.subodh.springwebapp.entity.RegisterEntity;
import com.subodh.springwebapp.repository.RegisterRepository;
@Component
public class RegisterService {
    
	@Autowired
    private ModelMapper modelMapper;
     
    @Autowired
    private RegisterRepository registerRepository;
     
	public void processRegisterDetails(RegisterDto registerDto) {
	RegisterEntity register = modelMapper.map(registerDto, RegisterEntity.class);
	registerRepository.save(register);
	}
    public List<RegisterEntity> findAll(){
    	return registerRepository.findAll();
    }
	public RegisterEntity findByName(String name) {
		// TODO Auto-generated method stub
		return registerRepository.findByName(name);
	}
	

}
