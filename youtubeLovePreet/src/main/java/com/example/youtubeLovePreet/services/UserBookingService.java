package com.example.youtubeLovePreet.services;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.example.youtubeLovePreet.entites.Ticket;
import com.example.youtubeLovePreet.entites.Train;
import com.example.youtubeLovePreet.entites.User;
import com.example.youtubeLovePreet.util.UserServiceUtil;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class UserBookingService {
	
	private User user;
	
	private static final String USER_PATH="app/src/main/java/com.example.youtubeLovePreet.localDB/localDB/user.json";
	
	private ObjectMapper objMapper=new ObjectMapper();
	
	private List<User> userList;
	
	public UserBookingService(User user) throws IOException {
		this.user=user;
		loadUsers();
	}
	
	public UserBookingService() throws IOException {
		loadUsers();
	}
	
	public List<User> loadUsers() throws IOException{
		File users=new File(USER_PATH);
		return userList=objMapper.readValue(users,new TypeReference<List<User>>(){});

	}
	
	public boolean loginUser() {
		Optional<User> foundUser=userList.stream().filter(user1 ->{
			return user1.getName().equalsIgnoreCase(user.getName()) && UserServiceUtil.checkPassword(user.getPassword(),user1.getHashedPassword());}).findFirst();
		return foundUser.isPresent();
	}
	
	public Boolean signUp(User user1) {
		try {
			userList.add(user1);
			saveUserListToFile();
			return Boolean.TRUE;
		}
		catch(IOException e){
			return Boolean.FALSE;
		}
	}
	
	private void saveUserListToFile() throws IOException{
		File usersFile=new File(USER_PATH);
		objMapper.writeValue(usersFile, userList);
	}
	
	public Boolean cancelBooking(String ticketId) {
		try {
			List<Ticket> newTickets=user.getTicketsBooked().stream().filter(ticket1 -> ticket1.getTicketId()!=ticketId).collect(Collectors.toList());
			user.setTicketsBooked(newTickets);
			saveUserListToFile();
			return Boolean.TRUE;
		}
		catch(IOException e) {
			return Boolean.FALSE;
		}

		
	}
	
	  public void fetchBookings(){
	        Optional<User> userFetched = userList.stream().filter(user1 -> {
	            return user1.getName().equals(user.getName()) && UserServiceUtil.checkPassword(user.getPassword(), user1.getHashedPassword());
	        }).findFirst();
	        if(userFetched.isPresent()){
	            userFetched.get().printTickets();
	        }
	    }
	  
	  public List<Train> getTrains(String source, String destination){
	      try{
	          TrainService trainService = new TrainService();
	          return trainService.searchTrains(source, destination);
	      }catch(IOException ex){
	          return new ArrayList<>();
	      }
	  }
	  public List<List<Integer>> fetchSeats(Train train){
	          return train.getSeats();
	    }
	  public Boolean bookTrainSeat(Train train, int row, int seat) {
	        try{
	            TrainService trainService = new TrainService();
	            List<List<Integer>> seats = train.getSeats();
	            if (row >= 0 && row < seats.size() && seat >= 0 && seat < seats.get(row).size()) {
	                if (seats.get(row).get(seat) == 0) {
	                    seats.get(row).set(seat, 1);
	                    train.setSeats(seats);
	                    trainService.addTrain(train);
	                    return true; // Booking successful
	                } else {
	                    return false; // Seat is already booked
	                }
	            } else {
	                return false; // Invalid row or seat index
	            }
	        }catch (IOException ex){
	            return Boolean.FALSE;
	        }
	    }
	
}
