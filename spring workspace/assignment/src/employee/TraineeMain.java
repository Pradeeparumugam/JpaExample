package employee;

import java.util.*;

public class TraineeMain {
	
	Map<Integer,Trainee> map=new HashMap<>();
	Set<CSTrainee> cstrainee= new HashSet<>();
	Set<ECETrainee> ecetrainee=new HashSet<>();
	
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
		}
		
	public void displayAll() {
		
		for(Trainee trainee:map.values()) {
		
		boolean bool=trainee instanceof CSTrainee; 
		if(bool) {
			CSTrainee trainee1=(CSTrainee)trainee;
			cstrainee.add(trainee1);
			
			System.out.println(trainee1.getId()+" "+trainee1.getName()+" "+trainee1.getLang());
			}
		else {
			
			ECETrainee trainee1=(ECETrainee)trainee;
			ecetrainee.add(trainee1);
			System.out.println(trainee1.getId()+" "+trainee1.getName()+" "+trainee1.getDevice());
			
		}
		}
		
	}
	 
}
