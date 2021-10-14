package org.renova.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import org.renova.model.entity.base.BaseEntity;

@Entity
@Table(name = "STUDENT_DETAIL")
public class StudentDetails extends BaseEntity {

	private long id;
	private String faculty;
	private String hobby;
	

	@JoinColumn(name = "student_detail_id")
	private Student student;
	
	public Student getStudent() {
	        return student;
	    }

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", length = 50, nullable = false)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name = "FACULTY", length = 50, nullable = false)
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	
	@Column(name = "HOBBY", length = 50, nullable = false)
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	
	@Override
	public String toString() {
		return "StudentDetails [id=" + id + ", faculty=" + faculty + ", hobby=" + hobby + "]";
	}
	@Override
	public String getUserString() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
}


