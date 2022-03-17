package com.senpiper.liv2train.trainingcenter.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senpiper.liv2train.exception.handler.EmailAlreadyRegisterException;
import com.senpiper.liv2train.trainingcenter.model.TrainingCenter;
import com.senpiper.liv2train.trainingcenter.repository.TrainingCenterRepository;


@Service
public class TrainingCenterService implements TrainingCenterServiceInterface {
	
	@Autowired
	TrainingCenterRepository trainingRepo ;
	
	public TrainingCenter createCenter(TrainingCenter trainingCenter) {
		Optional<TrainingCenter> registered = trainingRepo.findById(trainingCenter.getContactEmail());
		//Checking if we have a new email for registration !
		if(registered.isEmpty()) {
			return trainingRepo.save(trainingCenter);
		}
		else {throw new EmailAlreadyRegisterException(); }		
	}
	public List<TrainingCenter> getCenters(){
		return trainingRepo.findAll();
		
	}
}

