package com.ty.hospital_app.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Encounter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;
	private String reason;
	private String dateofjoin;
	private String ddischarge;
	@OneToMany(mappedBy = "encounter")
	private List<Observation> obs;
	@ManyToOne
	@JoinColumn
	private Person persons;
	@ManyToOne
	@JoinColumn
	private Branch branch;
	@OneToMany(mappedBy = "encounters")
	private List<MedOrder> order;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getDateofjoin() {
		return dateofjoin;
	}

	public void setDateofjoin(String dateofjoin) {
		this.dateofjoin = dateofjoin;
	}

	public String getDdischarge() {
		return ddischarge;
	}

	public void setDdischarge(String ddischarge) {
		this.ddischarge = ddischarge;
	}

	public List<Observation> getObs() {
		return obs;
	}

	public void setObs(List<Observation> obs) {
		this.obs = obs;
	}

	public Person getPersons() {
		return persons;
	}

	public void setPersons(Person persons) {
		this.persons = persons;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public List<MedOrder> getOrder() {
		return order;
	}

	public void setOrder(List<MedOrder> order) {
		this.order = order;
	}

}
