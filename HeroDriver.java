package onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HeroDriver {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("priya");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Hero hero1=new Hero();
		hero1.setId(1);
		hero1.setName("Salman Khan");
		hero1.setAge(50);
		
		
		Movie movie1=new Movie();
		movie1.setId(1);
		movie1.setName("Dabang");
		movie1.setCollection("60 cr");
		
		Movie movie2=new Movie();
		movie2.setId(2);
		movie2.setName("Bajarangi Bhaijaan");
		movie2.setCollection("70 cr");
		
		List<Movie> movies1= new ArrayList<Movie>();
		movies1.add(movie1);
		movies1.add(movie2);
		
		hero1.setMovies(movies1);
		
		Hero hero2=new Hero();
		hero2.setId(2);
		hero2.setName("Shahrukh Khan");
		hero2.setAge(60);
		
		Movie movie3=new Movie();
		movie3.setId(3);
		movie3.setName("Pathan");
		movie3.setCollection("60 cr");
		
		Movie movie4=new Movie();
		movie4.setId(4);
		movie4.setName("Chennai Express");
		movie4.setCollection("60 cr");
		
	    List<Movie> movies2= new ArrayList<Movie>();
		movies2.add(movie3);
		movies2.add(movie4);
		
		
		
		hero2.setMovies(movies2);
		
		et.begin();
		em.persist(hero1);
		em.persist(hero2);
		em.persist(movie1);
		em.persist(movie2);
		em.persist(movie3);
		em.persist(movie4);
		et.commit();
		
		System.out.println("Saved Data");
		
		
		
	}

}

