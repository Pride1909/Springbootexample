package onetomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Hero {
	
	@Id
	private int id;
	private String name;
	private int age;
	
	@OneToMany
	private List<Movie>movies;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<Movie> getMovies() {
		return movies;
	}
	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}
	

}
