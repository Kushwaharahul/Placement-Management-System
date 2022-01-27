package com.app.pojos;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="student_response")
@NamedQuery(name="StudentResponse.findAll", query="SELECT s FROM StudentResponse s")
public class StudentResponse implements Serializable {
	private static final long serialVersionUID = 1L;
	private int sNo;
	private String correctChoice;
	private Paper paper;
	private Student student;

	public StudentResponse() {
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


	@Column(name="correct_choice")
	public String getCorrectChoice() {
		return this.correctChoice;
	}

	public void setCorrectChoice(String correctChoice) {
		this.correctChoice = correctChoice;
	}


	//bi-directional many-to-one association to Paper
	@ManyToOne
	@JoinColumn(name="q_id")
	public Paper getPaper() {
		return this.paper;
	}

	public void setPaper(Paper paper) {
		this.paper = paper;
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