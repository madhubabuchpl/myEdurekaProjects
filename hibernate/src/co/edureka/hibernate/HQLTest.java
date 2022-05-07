package co.edureka.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import co.edureka.hibernate.entity.Student;
import co.edureka.hibernate.utils.HibernateUtils;

public class HQLTest {

	public static void main(String[] args) throws InterruptedException {
		Session session = HibernateUtils.getSession();
		
		//String hql = "from co.edureka.hibernate.entity.Student";
		//String hql = "from co.edureka.hibernate.entity.Student where studentName='Sunil Joseph'";
		//String hql = "from co.edureka.hibernate.entity.Student where studentName like 'S%'";
		//Query<Student> query = session.createQuery(hql, Student.class);
		
		/*
		//--- working with positional parameters --
		String hql = "from co.edureka.hibernate.entity.Student where studentId between ?0 and ?1"; 
		Query<Student> query = session.createQuery(hql, Student.class);
		query.setParameter(0, 1);
		query.setParameter(1, 7);
		*/
		
		//--- working with named parameters --
		String hql = "from co.edureka.hibernate.entity.Student where studentId between :minsid and :maxsid"; 
		Query<Student> query = session.createQuery(hql, Student.class);
		query.setParameter("minsid", 5);
		query.setParameter("maxsid", 9);
		
		List<Student> students = query.getResultList();
		for(Student st : students) {
			System.out.println(st);
			Thread.sleep(1000);
		}
		
		
		Transaction tx = session.beginTransaction();
		
		hql = "update co.edureka.hibernate.entity.Student set studentName='SUNIL' where studentId=1";
		Query q = session.createQuery(hql);
		int rowsUpdated = q.executeUpdate();
		
		tx.commit();
		System.out.println("No of Students updated = " + rowsUpdated);
		
		session.close();
	}

}
