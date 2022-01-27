package com.app.pojos;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="options")
@NamedQuery(name="Option.findAll", query="SELECT o FROM Option o")
public class Option implements Serializable {
	private static final long serialVersionUID = 1L;
	private int serialNumber;
	private String a;
	private String b;
	private String c;
	private String d;
	private Paper paper;

	public Option() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="serial_number")
	public int getSerialNumber() {
		return this.serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}


	public String getA() {
		return this.a;
	}

	public void setA(String a) {
		this.a = a;
	}


	public String getB() {
		return this.b;
	}

	public void setB(String b) {
		this.b = b;
	}


	public String getC() {
		return this.c;
	}

	public void setC(String c) {
		this.c = c;
	}


	public String getD() {
		return this.d;
	}

	public void setD(String d) {
		this.d = d;
	}


	//bi-directional many-to-one association to Paper
	@ManyToOne
	@JoinColumn(name="question_id")
	public Paper getPaper() {
		return this.paper;
	}

	public void setPaper(Paper paper) {
		this.paper = paper;
	}

}