package com.dxctraining.entities;

@Entity
public class Iteminfo {
	
	@Id 
	 @GeneratedValue 
	private int id;
	private String name;
	public Iteminfo(int id,String name) {
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

	@Override
	public int hashCode() {
		
		return id;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Iteminfo other = (Iteminfo) obj;
		if (id != other.id)
			return false;
		return true;
	}
}
