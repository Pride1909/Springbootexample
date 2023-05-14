package manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeDriver {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("priya");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Employee employee1=new Employee();
		employee1.setId(1);
		employee1.setName("priya");
		employee1.setAge(20);
		
		Employee employee2=new Employee();
		employee2.setId(2);
		employee2.setName("pooja");
		employee2.setAge(21);
		
		Employee employee3=new Employee();
		employee3.setId(3);
		employee3.setName("rima");
		employee3.setAge(22);
		
		Company company=new Company ();
		company.setId(1);
		company.setName("wipro");
		company.setLocation("Pune");
		
		
		employee1.setCompany(company);
		employee2.setCompany(company);
		employee3.setCompany(company);
		
		
		et.begin();
		em.persist(company);
		em.persist(employee1);
		em.persist(employee2);
		em.persist(employee3);
		et.commit();
		
		
	}

}
