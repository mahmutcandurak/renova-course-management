package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import utility.*;
import org.junit.jupiter.api.Test;
import org.renova.model.entity.*;
import org.renova.model.entity.base.BaseEntity;
import org.renova.*;
import org.renova.model.service.StudentService;

class TestCourse {

	private static Session session;

	@Test
	void test() {
		session = HibernateUtility.getSessionFactory().openSession();
		System.out.println("Session: " + session);
		System.out.println("List of students:");
		loadStudent();
		course();
		getStudent();
		
		Student student = new Student();
		StudentDetails studentDetails = new StudentDetails();
		int id = (int) student.getId();
		System.out.println(studentDetails.getFaculty());
		
		
		
	}

	@SuppressWarnings("unchecked")
	private ArrayList<? extends BaseEntity> selectEntityList(String entityName) {
		return (ArrayList<BaseEntity>) session.createQuery("FROM " + entityName).list();
	}

	public static void loadStudent() {
		Criteria criteria = session.createCriteria(Student.class).addOrder(Order.asc("id")).setFirstResult(0)
				.setMaxResults(10);
		ArrayList<Student> studentList = (ArrayList<Student>) criteria.list();
		for (Student student : studentList) {
			System.out.println(student.getName() + " " + student.getSurname() );
		}
	}

	public static void getStudent() {
		int theid1 = 2;
		Student tempStudent = session.get(Student.class, theid1);
		System.out.println(tempStudent);
	}

	public static void course() {

		Course course = new Course();
		int theId = 3;
		int theCourseId = 4;
		Student tempStudent = session.get(Student.class, theId);
		Course tempCourse = session.get(Course.class, theCourseId);
		((Criteria) tempStudent).add((Criterion) tempCourse);
		System.out.println(course.getStudentId());

	}

}
