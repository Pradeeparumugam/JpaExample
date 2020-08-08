package employee;

public class Trainee {
	private int id;
	private String name;
	Trainee(int id,String name){
		this.id=id;
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int hashCode() {
		int hash=k.hashCode();
		return hash;
	}
	public boolean checkEqual(Object ob) {
		if(ob==this) {
			return true;
		}
		if(ob==null || !(ob instanceof Trainee)) {
			return false;
		}
		Trainee t=(Trainee)ob;
		boolean result=this.id==(t.id);
		return true;
	}
	
	

}
