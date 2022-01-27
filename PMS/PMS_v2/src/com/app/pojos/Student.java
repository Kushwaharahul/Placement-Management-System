package com.app.pojos;

import java.io.Serializable;

import javax.persistence.*;

import java.util.List;

@Entity
@NamedQuery(name="Student.findAll", query="SELECT s FROM Student s")
public class Student implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private Double sscPercentage;
	private Double hscPercentage;
	private String email;
	private Double graduationPercentage;
	private String name;
	private String password;
	private String phoneNumber;
	private List<Result> results;
	private List<StudentResponse> studentResponses;

	public Student() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="roll_number")
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public Student(double sscPercentage, Double hscPercentage, String email,
			Double graduationPercentage, String name, String phoneNumber) {
		this.sscPercentage = sscPercentage;
		this.hscPercentage = hscPercentage;
		this.email = email;
		this.graduationPercentage = graduationPercentage;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	@Column(name="10th_percentage")
	public Double getSscPercentage() {
		return sscPercentage;
	}


	public void setSscPercentage(Double sscPercentage) {
		this.sscPercentage = sscPercentage;
	}

	@Column(name="12th_percentage")
	public Double getHscPercentage() {
		return hscPercentage;
	}


	public void setHscPercentage(Double hscPercentage) {
		this.hscPercentage = hscPercentage;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	@Column(name="graduation_percentage")
	public Double getGraduationPercentage() {
		return this.graduationPercentage;
	}

	public void setGraduationPercentage(Double graduationPercentage) {
		this.graduationPercentage = graduationPercentage;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	@Column(name="phone_number")
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	//bi-directional many-to-one association to Result
	@OneToMany(mappedBy="student")
	public List<Result> getResults() {
		return this.results;
	}

	public void setResults(List<Result> results) {
		this.results = results;
	}

	public Result addResult(Result result) {
		getResults().add(result);
		result.setStudent(this);

		return result;
	}

	public Result removeResult(Result result) {
		getResults().remove(result);
		result.setStudent(null);

		return result;
	}


	//bi-directional many-to-one association to StudentResponse
	@OneToMany(mappedBy="student")
	public List<StudentResponse> getStudentResponses() {
		return this.studentResponses;
	}

	public void setStudentResponses(List<StudentResponse> studentResponses) {
		this.studentResponses = studentResponses;
	}

	public StudentResponse addStudentRespons(StudentResponse studentRespons) {
		getStudentResponses().add(studentRespons);
		studentRespons.setStudent(this);

		return studentRespons;
	}

	public StudentResponse removeStudentRespons(StudentResponse studentRespons) {
		getStudentResponses().remove(studentRespons);
		studentRespons.setStudent(null);

		return studentRespons;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", sscPercentage=" + sscPercentage
				+ ", hscPercentage=" + hscPercentage + ", email=" + email
				+ ", graduationPercentage=" + graduationPercentage + ", name="
				+ name + ", password=" + password + ", phoneNumber="
				+ phoneNumber + "]";
	}

}