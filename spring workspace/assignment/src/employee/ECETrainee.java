package employee;

public class ECETrainee extends Trainee{
	String device;
	ECETrainee(int id,String name,String device)
	{
		super(id,name);
		this.device=device;
	}
	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}
	

}
