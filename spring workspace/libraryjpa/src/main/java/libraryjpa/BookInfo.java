package libraryjpa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="jpalibrary")
public class BookInfo {
	
	
		@Id
		private int id;
		private String name;
		private String author;
		private double cost;
		public BookInfo(int id,String name,String author,double cost) {
			this.id = id;
			this.name = name;
			this.author = author;
			this.cost = cost;
			
		}
		public synchronized int getId() {
			return id;
		}
		public synchronized void setId(int id) {
			this.id = id;
		}
		public synchronized String getName() {
			return name;
		}
		public synchronized void setName(String name) {
			this.name = name;
		}
		public synchronized String getAuthor() {
			return author;
		}
		public synchronized void setAuthor(String author) {
			this.author = author;
		}
		public synchronized double getCost() {
			return cost;
		}
		public synchronized void setCost(double cost) {
			this.cost = cost;
		}
		@Override
		public int hashCode() {
			
			return id;
		}
		/*@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Book other = (Book) obj;
			if (id != other.id)
				return false;
			return true;
		}*/
		
		

	}

