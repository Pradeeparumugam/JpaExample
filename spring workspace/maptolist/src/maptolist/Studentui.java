package maptolist;

//import normalprog.Students;
import java.util.*;


public class Studentui {
	Map<String,Studentinfo> map=new HashMap<>();
	Set<Integer> odd=new HashSet<>();
	Set<Integer> even=new HashSet<>();
	List<String> li=new ArrayList<>();
	public static void main(String args[]) {
		Studentui main=new Studentui();
		main.run();
	}
	
	public void run() {
		Studentinfo s1 = new Studentinfo("1", 20);
		Studentinfo s2 = new Studentinfo("2", 21);
		Studentinfo s3 = new Studentinfo("3", 23);
		Studentinfo s4 = new Studentinfo("4", 22);
		Studentinfo s5 = new Studentinfo("5", 23);
		Studentinfo s6 = new Studentinfo("6", 22);
		map.put("1",s1);
		map.put("2",s2);
		map.put("3",s3);
		map.put("4",s4);
		map.put("5",s5);
		map.put("6",s6);
		
		conversion(map);

	}
	public Object conversion(Map<String,Studentinfo> map) {
		Set<String> keys = map.keySet();
		//li=map.keySet()
		//List<String> l= map.keySet()
		//li.add(map.keySet());
		
		int i;
		int hash;
		String rno;
		for(String k:keys) {
			li.add(k);
			i=map.getAge(k);
			hash=k.hashCode();
			//checkEquals(k);
			rno=k;
			checkEquals(rno);
			if(i%2==0) {
				even.add(i);
			}
			else {
				odd.add(i);
			}
			return hash;
			
		}		
		return li;
		return odd;
		return even;
	}
}
