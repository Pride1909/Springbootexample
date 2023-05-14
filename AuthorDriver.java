package manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AuthorDriver {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("priya");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Author author1=new Author();
		author1.setId(1);
		author1.setName("Robin Sharma");
		author1.setAwards("10000");
		
		Author author2=new Author();
		author2.setId(2);
		author2.setName("Robert kiyosaki");
		author2.setAwards("20000");
		
		Author author3=new Author();
		author3.setId(3);
		author3.setName("Vanamali Mataji");
		author3.setAwards("30000");
		
		List<Author>author=new ArrayList<Author>();
		author.add(author1);
		author.add(author2);
		author.add(author3);
		
		Book book1=new Book();
		book1.setId(1);
		book1.setTitle("MegaLiving");
		book1.setNoofpg("10000");
		
		Book book2=new Book();
		book2.setId(2);
		book2.setTitle("Rich Dad Poor Dad");
		book2.setNoofpg("10000");
		
		Book book3=new Book();
		book3.setId(3);
		book3.setTitle("Krishna");
		book3.setNoofpg("10000");
		
		List<Book>book=new ArrayList<Book>();
		book.add(book1);
		book.add(book2);
		book.add(book3);
		
		book1.setAuthor(author);
		book2.setAuthor(author);
		book3.setAuthor(author);
		
		author1.setBook(book);
		author2.setBook(book);
		author3.setBook(book);
		
		et.begin();
		em.persist(author1);
		em.persist(author2);
		em.persist(author3);
		em.persist(book1);
		em.persist(book2);
		em.persist(book3);
		et.commit();
		
		System.out.println("Book & author added");
	}

}
