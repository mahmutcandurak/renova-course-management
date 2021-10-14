package org.renova.model.entity.base;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import javax.persistence.Transient;

@MappedSuperclass
public abstract class BaseEntity implements Serializable {

	private static final long serialVersionUID = 8846154623540307907L;
	
	private long id;
	
	@Id
	@Column(name = "ID", insertable = false, updatable = false, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	/* Entity Methods */
	@Transient
	public abstract String getUserString();
	
}
