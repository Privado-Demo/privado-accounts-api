package ai.privado.demo.accounts.service.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserProfileD {
	private String id;
	@JsonProperty("first_name")
	private String firstName;
	@JsonProperty("last_name")
	private String lastName;
	private String email;
	private String phone;
	private String password;
	private String dob;
	private String panCardNumber;
	private String aadhaarNumber;

	private String ssn; 

     public String getSSN() {
		return ssn;
       }


       public String setSSN(String ssn) {
		this.ssn = ssn;
       }

	public String getPanCardNumber() {
		return panCardNumber;
	}

	public String setPanCardNumber(String panCardNumber) {
		this.panCardNumber = panCardNumber;
	} 

	public String getAadhaarNumber() {
             return aadhaarNumber;
	}

	public String setAadhaarNumber(String aadhaarNumber) {
             this.aadhaarNumber = aadhaarNumber;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

}
