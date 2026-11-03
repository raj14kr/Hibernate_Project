package org.jsp.onetomanyuni;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity

public class Dept {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
private  int deptno;
private  String dname;
private  String loc;

@OneToMany(cascade=CascadeType.ALL)
private List<Emp> emps;

public List<Emp> getEmps() {
	return emps;
}
public void setEmps(List<Emp> emps) {
	this.emps = emps;
}
public int getDeptno() {
	return deptno;
}
public void setDeptno(int deptno) {
	this.deptno = deptno;
}
public String getDname() {
	return dname;
}
public void setDname(String dname) {
	this.dname = dname;
}
public String getLoc() {
	return loc;
}
public void setLoc(String loc) {
	this.loc = loc;
}
@Override
public String toString() {
	return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
}


}
