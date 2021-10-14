package org.renova.model.repository;

import java.util.List;

import javax.management.loading.ClassLoaderRepository;

import org.renova.model.entity.Student;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends ClassLoaderRepository {
		
		public static List<Student> findBySoyad(String name) {
			return null;
		}
		public static List<Student> findAll() {
			return null;
		}

}


