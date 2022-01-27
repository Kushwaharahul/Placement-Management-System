package com.app.pojos;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


@Entity
@NamedQuery(name="Paper.findAll", query="SELECT p FROM Paper p")
public class Paper implements Serializable {
	private static final long serialVersionUID = 1L;
	private int sNo;
	private String correctChoice;
	private String question;
	private List<Option> options;
	private List<StudentResponse> studentResponses;

	public Paper() {
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


	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}


	//bi-directional many-to-one association to Option
	@OneToMany(mappedBy="paper")
	public List<Option> getOptions() {
		return this.options;
	}

	public void setOptions(List<Option> options) {
		this.options = options;
	}

	public Option addOption(Option option) {
		getOptions().add(option);
		option.setPaper(this);

		return option;
	}

	public Option removeOption(Option option) {
		getOptions().remove(option);
		option.setPaper(null);

		return option;
	}


	//bi-directional many-to-one association to StudentResponse
	@OneToMany(mappedBy="paper")
	public List<StudentResponse> getStudentResponses() {
		return this.studentResponses;
	}

	public void setStudentResponses(List<StudentResponse> studentResponses) {
		this.studentResponses = studentResponses;
	}

	public StudentResponse addStudentRespons(StudentResponse studentRespons) {
		getStudentResponses().add(studentRespons);
		studentRespons.setPaper(this);

		return studentRespons;
	}

	public StudentResponse removeStudentRespons(StudentResponse studentRespons) {
		getStudentResponses().remove(studentRespons);
		studentRespons.setPaper(null);

		return studentRespons;
	}

}