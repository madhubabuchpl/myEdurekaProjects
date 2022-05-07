package co.edureka.hibernate;

import org.hibernate.Session;

import co.edureka.hibernate.entity.Student;
import co.edureka.hibernate.utils.HibernateUtils;

public class SearchStudent1 {

	public static void main(String[] args) {
		Session session = HibernateUtils.getSession();
		
		Student st = new Student();
		System.out.println(st);
		
		try {
			session.load(st, 1);
		}catch(Exception ex) {
			System.out.println(ex);
		}
		
		System.out.println(st);
		session.close();
	}

}
