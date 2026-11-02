package org.jsp.onetoonebi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Aadharcard {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private long number;
private String address;
private String dob;
@OneToOne(mappedBy="card")
private User user;

public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public long getNumber() {
	return number;
}
public void setNumber(long number) {
	this.number = number;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
@Override
public String toString() {
	return "Aadharcard [id=" + id + ", number=" + number + ", address=" + address + ", dob=" + dob + "]";
}

}
