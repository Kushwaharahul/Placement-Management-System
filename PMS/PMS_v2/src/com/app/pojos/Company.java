package com.app.pojos;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

@Entity
@NamedQuery(name="Company.findAll", query="SELECT c FROM Company c")
public class Company implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private double sscPercentage;
	private double hscPercentage;
	private String description;
	private String email;
	private double graduationPercentage;
	private String name;
	private double package_;
	private String password;
	private String phoneNumber;
	private String profile;
	private String status;
	private List<DriveDate> driveDates;

	public Company() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name="10th_percentage")
	public double getSscPercentage() {
		return sscPercentage;
	}


	public void setSscPercentage(double sscPercentage) {
		this.sscPercentage = sscPercentage;
	}


	@Column(name="12th_percentage")
	public double getHscPercentage() {
		return hscPercentage;
	}


	public void setHscPercentage(double hscPercentage) {
		this.hscPercentage = hscPercentage;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	@Column(name="graduation_percentage")
	public double getGraduationPercentage() {
		return this.graduationPercentage;
	}

	public void setGraduationPercentage(double graduationPercentage) {
		this.graduationPercentage = graduationPercentage;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Column(name="package")
	public double getPackage_() {
		return this.package_;
	}

	public void setPackage_(double package_) {
		this.package_ = package_;
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


	public String getProfile() {
		return this.profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}


	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	//bi-directional many-to-one association to DriveDate
	@OneToMany(mappedBy="company")
	public List<DriveDate> getDriveDates() {
		return this.driveDates;
	}

	public void setDriveDates(List<DriveDate> driveDates) {
		this.driveDates = driveDates;
	}

	public DriveDate addDriveDate(DriveDate driveDate) {
		getDriveDates().add(driveDate);
		driveDate.setCompany(this);

		return driveDate;
	}

	public DriveDate removeDriveDate(DriveDate driveDate) {
		getDriveDates().remove(driveDate);
		driveDate.setCompany(null);

		return driveDate;
	}


	@Override
	public String toString() {
		return "Company [id=" + id + ", sscPercentage=" + sscPercentage
				+ ", hscPercentage=" + hscPercentage + ", description="
				+ description + ", email=" + email + ", graduationPercentage="
				+ graduationPercentage + ", name=" + name + ", package_="
				+ package_ + ", password=" + password + ", phoneNumber="
				+ phoneNumber + ", profile=" + profile + ", status=" + status
				+ "]";
	}
	
	
}