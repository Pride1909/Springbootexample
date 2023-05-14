package manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Book {
	
	@Id
	private int id;
	private String title;
	private String noofpg;
	
	@ManyToMany
	private List<Author>Author;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getNoofpg() {
		return noofpg;
	}
	public void setNoofpg(String noofpg) {
		this.noofpg = noofpg;
	}
	public List<Author> getAuthor() {
		return Author;
	}
	public void setAuthor(List<Author> author) {
		Author = author;
	}
	

}
