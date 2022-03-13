package com.senpiper.liv2train.trainingcenter.service;

import java.util.List;

import com.senpiper.liv2train.trainingcenter.model.TrainingCenter;

public interface TrainingCenterServiceInterface {
	
	public TrainingCenter createCenter(TrainingCenter trainingCenter) ;
	public List<TrainingCenter> getCenters();

}
