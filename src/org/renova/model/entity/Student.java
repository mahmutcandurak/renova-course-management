package org.renova.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.renova.model.entity.base.BaseEntity;

@Entity
@Table(name = "STUDENT")
public class Student extends BaseEntity{
	
	private long id;
	private String name;
	private String surname;
	private String email;
	private String studentDetailId;
	

	@OneToMany(mappedBy = "Student" ,fetch = FetchType.EAGER)
	private StudentDetails studentDetails;
	
	private Student student;
	

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", length = 100, nullable = false)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name = "NAME", length = 100, nullable = false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name = "SURNAME", length = 100, nullable = false)
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	@Column(name = "EMAIL", length = 100, nullable = false)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Column(name = "STUDENT_DETAIL_ID", length = 100, nullable = false)
	public String getStudentDetailId() {
		return studentDetailId;
	}
	public void setStudentDetailId(String studentDetailId) {
		this.studentDetailId = studentDetailId;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", surname=" + surname + ", email=" + email
				+ ", studentDetailId=" + studentDetailId + ", student=" + student + "]";
	}
	@Override
	public String getUserString() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
