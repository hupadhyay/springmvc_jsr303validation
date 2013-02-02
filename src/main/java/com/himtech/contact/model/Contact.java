package com.himtech.contact.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author himanshu
 * 
 */
public class Contact {
	@NotEmpty(message = "First Name: Mandatory Field")
	private String firstName;

	@NotEmpty(message = "Last Name: Mandatory Field")
	private String lastName;

	@NotEmpty(message = "Email: Mandatory Field!")
	private String email;

	@NotEmpty(message = "Mandatory Field!")
	@Size(max=10, min=10, message = "Can hold only 10 digits!")
	private String telephone;

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * @param telephone
	 *            the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Override
	public String toString() {
		return "Name: " + firstName + " " + lastName + ", Email: " + email;
	}
}
