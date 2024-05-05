package com.example.youtubeLovePreet.services;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.example.youtubeLovePreet.entites.Train;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TrainService {

	List<Train> trainList;
	private String TRAIN_PATH="app/src/main/java/com.example.youtubeLovePreet.localDB/localDB/train.json";
	ObjectMapper objMapper=new ObjectMapper();
	
	
	public TrainService() throws IOException {
		loadTrains();
	}
	
	private List<Train> loadTrains() throws IOException {
		File file=new File(TRAIN_PATH);
		return trainList=objMapper.readValue(file, new TypeReference<List<Train>>(){});
	}
	
	public List<Train> searchTrains(String source,String destination){
		return trainList.stream().filter(train -> validTrain(train,source,destination)).collect(Collectors.toList());
	}
	
	private boolean validTrain(Train train,String source,String destination) {
		List<String> stationOrder =train.getStations();
		
		int indexSource=stationOrder.indexOf(source.toLowerCase());
		int indexDestination=stationOrder.indexOf(destination.toLowerCase());
		
		return 	indexSource!=-1 && indexDestination!=-1 && indexSource<indexDestination;
	}
	
	 public void addTrain(Train newTrain) {
	        // Check if a train with the same trainId already exists
	        Optional<Train> existingTrain = trainList.stream()
	                .filter(train -> train.getTrainId().equalsIgnoreCase(newTrain.getTrainId()))
	                .findFirst();

	        if (existingTrain.isPresent()) {
	            // If a train with the same trainId exists, update it instead of adding a new one
	            updateTrain(newTrain);
	        } else {
	            // Otherwise, add the new train to the list
	            trainList.add(newTrain);
	            saveTrainListToFile();
	        }
	    }
	 
	 public void updateTrain(Train updatedTrain) {
	        // Find the index of the train with the same trainId
	        OptionalInt index = IntStream.range(0, trainList.size())
	                .filter(i -> trainList.get(i).getTrainId().equalsIgnoreCase(updatedTrain.getTrainId()))
	                .findFirst();

	        if (index.isPresent()) {
	            // If found, replace the existing train with the updated one
	            trainList.set(index.getAsInt(), updatedTrain);
	            saveTrainListToFile();
	        } else {
	            // If not found, treat it as adding a new train
	            addTrain(updatedTrain);
	        }
	    }
	 
	 private void saveTrainListToFile() {
	        try {
	            objMapper.writeValue(new File(TRAIN_PATH), trainList);
	        } catch (IOException e) {
	            e.printStackTrace(); // Handle the exception based on your application's requirements
	        }
	    }
	
	
}
