package org.renova.model.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.renova.model.entity.base.BaseEntity;

@Entity
@Table(name = "COURSE")
public class Course extends BaseEntity {

	private long id;
	private String title;
	private long StudentId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Student student;
	
	@JoinColumn(name ="id")
	private Student student1;
	
	private Course course;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name = "TITLE", length = 100, nullable = false)
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Column(name = "STUDENT_ID", nullable = false)
	public long getStudentId() {
		return StudentId;
	}
	public void setStudentId(long studentId) {
		StudentId = studentId;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", StudentId=" + StudentId + ", course=" + course + "]";
	}
	@Override
	public String getUserString() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
}
