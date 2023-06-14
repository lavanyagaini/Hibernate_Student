package e1_hibernate1.student;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class studentCrud {

	// save the data to persistence method
	public void saveStudent(Student1 student1) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Lavanya");
		EntityManager manager = factory.createEntityManager();

		// send some data from application to database
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();

		manager.persist(student1);

		transaction.commit();

	}

	// find the object basedon find
	// select * from student1 where id=?----sql query ---retrieve the data based on
	// id
	public void studentfetchbyId(int id) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Lavanya");
		EntityManager manager = factory.createEntityManager();
		Student1 student1 = manager.find(Student1.class, id);
		System.out.println(student1);
	}

	// updatae the data based on id
	public void updateStudent(Student1 student1) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Lavanya");
		EntityManager manager = factory.createEntityManager();
		Student1 student = manager.find(Student1.class, student1.getId());
		if (student != null) {
			student.setId(student1.getId());
			student.setName(student1.getName());
			student.setPhone(student1.getPhone());
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.merge(student);
			transaction.commit();
		} else
			System.out.println("you dont have an object with the id");

	}

	// select * from student1
	public void retrieveallStudnts() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Lavanya");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createQuery("select a from Student1 a ");
		List<Student1> list = query.getResultList();
		System.out.println(list);

	}
}
