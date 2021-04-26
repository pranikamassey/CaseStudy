package com.example.demo.models;


import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Employee {
	    @Id
	    private int eid;
	    private String firstName;
	    private String middleName;
	    private String lastName; 
	    private Date birthDate; 
	    private String postition;
		public int getEid() {
			return eid;
		}
		public void setEid(int eid) {
			this.eid = eid;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getMiddleName() {
			return middleName;
		}
		public void setMiddleName(String middleName) {
			this.middleName = middleName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public Date getBirthDate() {
			return birthDate;
		}
		public void setBirthDate(Date birthDate) {
			this.birthDate = birthDate;
		}
		public String getPostition() {
			return postition;
		}
		public void setPostition(String postition) {
			this.postition = postition;
		} 
	    
}
