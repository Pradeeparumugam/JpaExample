package normalprog;

import java.util.*;


public class Student {
	public static void main(String args[]) {
		Student s=new Student();
		s.fun();
	}
	/*
	 * Main method should have maximum 2-3 lines  
1) from Set of all students, Get List of students having age >21 
 
 Student{
rollno:string ,
age int

}
	 */
	public void fun() {
		Set<Student1> set= new HashSet<>();
		Student1 s1=new Student1("111",20);
		Student1 s2=new Student1("112",21); 
		Student1 s3=new Student1("113",23);
		Student1 s4=new Student1("114",22);
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		
		/*display();
	}
		public void display() {*/
			
			Iterator<Student1> iterator=set.iterator();
			while(iterator.hasNext()) {
				Student1 stud=iterator.next();
				int i=stud.getAge();
				if(i>=21) {
					System.out.println(i);
				}
			}
			
			
	}

}
