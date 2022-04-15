package com.assignment.boot.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.boot.model.Center;
import com.assignment.boot.repository.CenterRepository;

@Service
public class CenterService {
	@Autowired
	CenterRepository repository;
	
	public List<Center> getAll(){
		return (List<Center>)repository.findAll();
	}
	
	public List<Center> getByPincode(int pincode){
		List<Center> centerList = (List<Center>)repository.findAll();
		return centerList.stream().filter(center -> center.getPincode()==pincode).collect(Collectors.toList());
	}
	
	public List<Center> getByDistrict(String district){
		List<Center> centerList = (List<Center>)repository.findAll();
		return centerList.stream().filter(center -> center.getDistrict().equals(district)).collect(Collectors.toList());
	}
	
	public void addCenterList(List<Center> centerList) {
		repository.saveAll(centerList);
	}
	public void addCenter(Center center) {
		repository.save(center);
	}
	
}
