package com.TrainReservation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.TrainReservation.entity.Train;
import com.TrainReservation.repository.TrainRepository;
import com.TrainReservation.service.TrainService;

@Service
	public class TrainServiceimpl implements TrainService {

	    private final TrainRepository tRepo;

	    @Autowired
	    public TrainServiceimpl(TrainRepository tRepo) {
	        this.tRepo = tRepo;
	    }
	    public void save(Train t) {
	        tRepo.save(t);
	    }

		@Override
		public List<Train> getAllTrains() {
			return getAllTrains();
		}
		@Override
		public Train getTrainById(int id) {		
			return null;
		}
	}

