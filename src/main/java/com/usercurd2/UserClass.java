package com.usercurd2;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserClass {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userid;
	private String firstname;
	private String lastname;
	private Integer age;
	private String distric;
	
}
	
//	public String getFirstname() {
//		return firstname;
//	}
//	public void setFirstname(String firstname) {
//		this.firstname = firstname;
//	}
//	public String getLastname() {
//		return lastname;
//	}
//	public void setLastname(String lastname) {
//		this.lastname = lastname;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public String getDistric() {
//		return distric;
//	}
//	public void setDistric(String distric) {
//		this.distric = distric;
//	}
//	
//	
//	
//	public UserClass(String firstname, String lastname, int age, String distric) {
//		super();
//		this.firstname = firstname;
//		this.lastname = lastname;
//		this.age = age;
//		this.distric = distric;
//	}
//	
//	@Override
//	public String toString() {
//		return "UserClass [firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + ", distric=" + distric
//				+ "]";
//	}
//	
	
