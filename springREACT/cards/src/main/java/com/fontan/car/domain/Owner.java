package com.fontan.car.domain;

import java.util.List;

import javax.persistence.CascadeType;

//Owner.java

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Owner {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long ownerid;
	private String firstname, lastname;
	public Owner() {}
	public Owner(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}
	@JsonIgnore
	@OneToMany(cascade=CascadeType.ALL, mappedBy=
			"owner")
	private List<Car> cars;

	//	@ManyToMany(cascade=CascadeType.PERSIST)
	//	@JoinTable(name="car_owner",
	//	joinColumns = { @JoinColumn(name="ownerid") },
	//	inverseJoinColumns = { @JoinColumn(name="id") })
	//	private Set<Car> cars = new HashSet<Car>();
	//	public Set<Car> getCars() {
	//	return cars;
	//	}
	//	public void setCars(Set<Car> cars) {
	//	this.cars = cars;
	//	}

	public long getOwnerid() {
		return ownerid;
	}
	public void setOwnerid(long ownerid) {
		this.ownerid = ownerid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	@Override
	public String toString() {
		return "Owner [ownerid=" + ownerid + ", firstname=" + firstname + ", lastname=" + lastname + "]";
	}

}
