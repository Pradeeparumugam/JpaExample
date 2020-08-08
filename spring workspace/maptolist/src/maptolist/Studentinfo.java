package maptolist;

public class Studentinfo {
	String rollno;
	int age;
	public Studentinfo(String rollno,int age) {
		this.rollno=rollno;
		this.age=age;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int hashCode() {
		int h=rollno.hashCode();
		return h;
	}
	@Override
	public boolean checkEquals(Object a) {
		if(a==this) {
			return true;
			
		}
		if(a==null || !(a instanceof studentinfo)) {
			return false;
			
		}
		Studentinfo st=(studentinfo)a;
		boolean result=this.rollno==(st.rollno);
		return result;
		
	}
}
