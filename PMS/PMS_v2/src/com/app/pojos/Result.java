package com.app.pojos;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@NamedQuery(name="Result.findAll", query="SELECT r FROM Result r")
public class Result implements Serializable {
	private static final long serialVersionUID = 1L;
	private int sNo;
	private Student student;

	public Result() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="s_no")
	public int getSNo() {
		return this.sNo;
	}

	public void setSNo(int sNo) {
		this.sNo = sNo;
	}


	//bi-directional many-to-one association to Student
	@ManyToOne
	@JoinColumn(name="s_id")
	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}