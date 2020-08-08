package employee;

public class CSTrainee  extends Trainee{
	int lang;
	CSTrainee(int id,String name,int lang){
		super(id, name);
		this.lang=lang;
		
	}
	public int getLang() {
		return lang;
	}
	public void setLang(int lang) {
		this.lang = lang;
	}
	

}
