package com.app.pojos;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="drive_date")
@NamedQuery(name="DriveDate.findAll", query="SELECT d FROM DriveDate d")
public class DriveDate implements Serializable {
	private static final long serialVersionUID = 1L;
	private Date date_Slot;
	private byte flag;
	private Company company;

	public DriveDate() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Temporal(TemporalType.DATE)
	public Date getDate_Slot() {
		return this.date_Slot;
	}

	public void setDate_Slot(Date date_Slot) {
		this.date_Slot = date_Slot;
	}


	public byte getFlag() {
		return this.flag;
	}

	public void setFlag(byte flag) {
		this.flag = flag;
	}


	//bi-directional many-to-one association to Company
	@ManyToOne
	@JoinColumn(name="c_id")
	public Company getCompany() {
		return this.company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

}