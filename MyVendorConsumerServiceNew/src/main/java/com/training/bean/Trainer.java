package com.training.bean;




//import javax.persistence.*;

import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

//@Entity
public class Trainer{ 
  //  @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
	private int trainercode;
    //@Column
	private String name;

	private String email;
	private long mobileno;
	private String password;
	private String skillset;
	public int getTrainercode() {
		return trainercode;
	}
	public void setTrainercode(int trainercode) {
		this.trainercode = trainercode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSkillset() {
		return skillset;
	}
	public void setSkillset(String skillset) {
		this.skillset = skillset;
	}
	@Override
	public String toString() {
		return "Trainer [trainercode=" + trainercode + ", name=" + name + ", email=" + email + ", mobileno=" + mobileno
				+ ", password=" + password + ", skillset=" + skillset + "]";
	}
	
	
	
	
}
