package libraryjpa;

import javax.persistence.EntityManagerFactory;
import javax.persistence.*;
//@SpringBootApplication
public class BookMain {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu"); 
	
	public static void main(String args[]) {
		BookMain bm=new BookMain();
		bm.run();
	}
	public void run() {
	BookInfo b=new BookInfo(1,"name","author",22.2);
//	b.setId(3);
//	b.setName("aaa");
//	b.setAuthor("name");
//	b.setCost(22.5);
	
	     	EntityManager em = emf.createEntityManager(); 
	     	 
	     	em.getTransaction().begin(); 
	     	em.persist(b); 
	     	em.getTransaction().commit(); 
	     	System.out.println(b); 
	}


}
