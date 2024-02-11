package com.TrainReservation.service;

import java.util.List;
import com.TrainReservation.entity.Train;

public interface TrainService {

	
	List<Train> getAllTrains();
    void save(Train train);
	Train getTrainById(int id);
}





