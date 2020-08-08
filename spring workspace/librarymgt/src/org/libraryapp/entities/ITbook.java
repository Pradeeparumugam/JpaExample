package org.libraryapp.entities;

public class ITbook {
	String lang;
	double version;
	
	public ITbook(String lang,double version) {
		this.lang=lang;
		this.version=version;
	}
	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	

}
