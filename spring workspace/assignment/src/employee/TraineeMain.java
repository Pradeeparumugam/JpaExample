package employee;

import java.util.*;

public class TraineeMain {
	
	Map<Integer,Trainee> map=new HashMap<>();
	Set<CSTrainee> set1= new HashSet<>();
	Set<ECETrainee> set2=new HashSet<>();
	
	public static void main(String args[]) {
		
		TraineeMain main=new TraineeMain();
		
		
		
		 main.run();
	}
		public void run() {
		
		Trainee cs1=new CSTrainee(3,"name3",3);
		Trainee cs2=new CSTrainee(4,"name4",4);
		Trainee ece1=new ECETrainee(5,"name5","device1");
		Trainee ece2=new ECETrainee(6,"name6","device2");
		map.put(cs1.getId(),cs1);
		map.put(cs2.getId(),cs2);
		map.put(ece1.getId(),ece1);
		map.put(ece2.getId(),ece2);
		//set1.add(cs1);
		//set1.add(cs2);
		//set2.add(ece1);
		//set2.add(ece2);
		
		displayAll();
		equalshash();
		}
		
	public void displayAll() {
		
		for(Trainee trainee:map.values()) {
		
		boolean bool=trainee instanceof CSTrainee; 
		if(bool) {
			set1.add(bool);
			
			System.out.println(bool.getId()+bool.getName()+bool.getLang());
			}
		else {
			set2.add(bool);
		}
		}
		public void equalshash() {
			Set<Integer> keys=map.keySet();
			for(Integer k:keys) {
				int i=hashCode();
				return i;	
				checkEqual(k);
			}
		}
	}
	 
}
